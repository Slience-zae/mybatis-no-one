package com.perfect.common.utils;

import org.springframework.cglib.beans.BeanMap;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ReflectUtils {

    private final static String nameFrefix = "set";
    /**
     * 将实体映射成map:方法one
     * @param o
     * @param <T>
     * @return
     */
    public static <T> Map<String,Object> beanToMap(T o){
        Map<String,Object> rtnMap = new HashMap<>();
        if(o != null){
            BeanMap beanMap = BeanMap.create(o);
            for(Object key:beanMap.keySet()){
                rtnMap.put(key+"",beanMap.get(key));
            }
        }
        return rtnMap;
    }

    /**
     * 将实体映射为map：方法two
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> Map<String,Object> beanTrandMap(T obj){
        Map<String,Object> rtnMap = new HashMap<>();
        if(obj != null){
            Class<?> aClass = obj.getClass();
            Field[] declaredFields = aClass.getDeclaredFields();//获取了所有的属性名数组
            //存放所有的属性名
            String [] fileName = new String[declaredFields.length];
            for(int i =  0;i<declaredFields.length;i++){
                fileName[i] = declaredFields[i].getName();
            }
            for(int j = 0;j<fileName.length;j++){
                rtnMap.put(fileName[j],getFieldValueByName(fileName[j],obj));
            }
        }
        return rtnMap;
    }
    /**
     * 将List<T>映射成List<Map<String,Object>>>
     */
    public static <T> List<Map<String,Object>> beanListToMapList(List<T> o){
        List<Map<String,Object>> rtnList = new ArrayList<>();
        if(o!=null){
            for(T bean:o){
                Map<String,Object> newMap = new HashMap<>();
                BeanMap beanMap = BeanMap.create(bean);
                for(Object key:beanMap.keySet()){
                    newMap.put(key+"",beanMap.get(key));
                }
                rtnList.add(newMap);
            }
        }
        return rtnList;
    }

    /**
     * 将Map映射成实体
     *
     */
    public <T>  T mapConvertBean(Map<String, Object> map, T obj) throws Exception {
        /*
         * Class类是反射的入口 一般获得一个Class对象有三种途径 1.类属性方式，如String.class
         * 2.对象的getClass方法加载，如new String().getClass().
         * 3.forName方法加载，如Class.forName("java.lang.String") 用于动态加载 比如加载驱动
         * 这里我传入一个Object对象,所以我用的是第2种
         */
        Class classz = obj.getClass();
        // 得到传入实体类所有的方法(getXxx setXxx ...)
        // Method[] declaredMethods = classz.getDeclaredMethods();

        // 判断map集合参数不能为null
        if (!map.isEmpty()) {
            for (Map.Entry<String, Object> keyValue : map.entrySet()) {
                // 得到map键值
                String propertyName = keyValue.getKey();
                // 得到map-value值
                Object value = keyValue.getValue();
                // 得到回属性名
                Field field = getClassField(classz, propertyName);

                if (field != null) {
                    // 获取属性类型
                    Class<?> fieldType = field.getType();
                    value  = convertValType(value, fieldType);
                    Method method = null;
                    // 得到属性set方法名
                    String setMethodName = convertKey(propertyName);
                    //得到方法
                    method = classz.getMethod(setMethodName, field.getType());
                    //判断是否能够执行（这个可以不要）
                    if (!method.isAccessible()) {
                        method.setAccessible(true);
                    }
                    method.invoke(obj, value);
                }
            }
        }
        return obj;
    }

    /**
     * 得到属性名
     *
     * @param clazz
     *            类
     * @param fieldName
     *            属性名
     * @return
     */
    private  Field getClassField(Class<?> clazz, String fieldName) {
        // 传入类是Object类型或者是null直接return
        if (clazz == null || Object.class.getName().equals(clazz.getName())) {
            return null;
        }
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.getName().equals(fieldName)) {
                return field;
            }
        }

        Class<?> superClass = clazz.getSuperclass();
        if (superClass != null) {// 简单的递归一下
            return getClassField(superClass, fieldName);
        }
        return null;
    }

    /**
     * 将Object类型的值，转换成bean对象属性里对应的类型值
     *
     * @param value  Object对象值
     * @param fieldType 属性的类型
     * @return 转换后的值
     */
    private  Object convertValType(Object value, Class<?> fieldType) {
        Object retVal = null;
        if(value == null){
            return null;
        }else if ("".equals(value.toString().trim())){
            return null;
        }

        if (Long.class.getName().equals(fieldType.getName()) || long.class.getName().equals(fieldType.getName())) {
            retVal = Long.parseLong(value.toString());
        } else if (Integer.class.getName().equals(fieldType.getName())
                || int.class.getName().equals(fieldType.getName())) {
            retVal = Integer.parseInt(value.toString());
        } else if (Float.class.getName().equals(fieldType.getName())
                || float.class.getName().equals(fieldType.getName())) {
            retVal = Float.parseFloat(value.toString());
        } else if (Double.class.getName().equals(fieldType.getName())
                || double.class.getName().equals(fieldType.getName())) {
            retVal = Double.parseDouble(value.toString());
        } else if (Boolean.class.getName().equals(fieldType.getName())
                || boolean.class.getName().equals(fieldType.getName())) {
            retVal = Boolean.parseBoolean(value.toString());
        } else if (Character.class.getName().equals(fieldType.getName())
                || char.class.getName().equals(fieldType.getName())) {
            retVal = value;
        } else if(Date.class.getName().equals(fieldType.getName())){
            retVal = strConvertDate(value.toString());
        } else if(String.class.getName().equals(fieldType.getName())){
            retVal = value+"";
        }else if(Timestamp.class.getName().equals(fieldType.getName())){
            retVal = Timestamp.valueOf(value.toString());
        }else if(BigDecimal.class.getName().equals(fieldType.getName())){
            retVal = new BigDecimal(value.toString());
        }
        return retVal;
    }


    /**
     * String类型转Date
     * @param
     * @return
     */
    public  Date strConvertDate(String dateStr){
        Date parse = null;
        if(dateStr != null) {
            SimpleDateFormat format = null;
            if (dateStr.length()<="2000-00-00".length()){
                format = new SimpleDateFormat("yyyy-MM-dd");
            }else{
                format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            }
            if (!"".equals(dateStr)) {
                try {
                    parse = format.parse(dateStr);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        return parse;
    }

    /**
     * 注意：转化map集合的key 例如 属性名 xXxx(tNode)类型
     *
     * @return
     */
    public  String convertKey(String propertyName) {
        // 将属性名第一个字母大写然后进行拼接
        String setMethodName = nameFrefix.concat(propertyName.substring(0, 1).toUpperCase().concat(propertyName.substring(1)));
        return setMethodName;
    }

    /* 根据属性名获取属性值
     * */
    private static Object getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[] {});
            Object value = method.invoke(o, new Object[] {});
            return value;
        } catch (Exception e) {

            return null;
        }
    }
    /**
     * 获取属性名数组
     * */
    private static String[] getFiledName(Object o){
        Field[] fields=o.getClass().getDeclaredFields();
        String[] fieldNames=new String[fields.length];
        for(int i=0;i<fields.length;i++){
//            System.out.println(fields[i].getType());
            fieldNames[i]=fields[i].getName();
        }
        return fieldNames;
    }

    /**
     * entity转化为map
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> Map<String,Object> entityToMap(T obj){
        Map<String,Object> rtnMap = new HashMap<>();
        if(obj!=null){
            Class<?> aClass = obj.getClass();
            Field[] declaredFields = aClass.getDeclaredFields();
            for(Field field:declaredFields){
                field.setAccessible(true);
                try {
                    rtnMap.put(field.getName(),field.get(obj));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return rtnMap;
    }
}
