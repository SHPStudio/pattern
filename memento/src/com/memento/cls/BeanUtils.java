package com.memento.cls;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * Created by Shape on 2017/7/31.
 * 备忘录工具类
 * 通过反射的形式把对象的状态信息转换为map和从map中获取信息赋值给对象
 */
public class BeanUtils {
    //把bean的所有的属性以及他的值放到hashmap中
    public static HashMap<String,Object> backupProp(Object bean)
    {
        HashMap<String,Object> result=new HashMap<String,Object>();
        //通过反射获取类的信息并把值放到map中
        try{
            //获得bean的描述
            BeanInfo beanInfo= Introspector.getBeanInfo(bean.getClass());
            //获得属性描述
            PropertyDescriptor[] descriptors=beanInfo.getPropertyDescriptors();
            //遍历所有的属性
            for(PropertyDescriptor pd:descriptors)
            {
                //获取属性的名称
                String fieldName=pd.getName();
                //获取读取属性的方法
                Method getter=pd.getReadMethod();
                //读取值
                Object fieldValue=getter.invoke(bean,new Object[]{});
                if(!fieldName.equalsIgnoreCase("class"))
                {
                    //如果符合要求放入到map中
                    result.put(fieldName,fieldValue);
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
    //把map中的状态信息赋值给bean对象
    public static void restoreProp(Object bean,HashMap<String,Object> propMap)
    {
        //通过反射获取类的信息并把值放到map中
        try{
            //获得bean的描述
            BeanInfo beanInfo= Introspector.getBeanInfo(bean.getClass());
            //获得属性描述
            PropertyDescriptor[] descriptors=beanInfo.getPropertyDescriptors();
            //遍历所有的属性
            for(PropertyDescriptor pd:descriptors)
            {
                //获取属性的名称
                String fieldName=pd.getName();
               //看map中是否有这个key的值
                if(propMap.containsKey(fieldName))
                {
                    //如果有就把这个值赋值给bean对象
                    Method setter=pd.getWriteMethod();
                    setter.invoke(bean,new Object[]{propMap.get(fieldName)});
                }
            }
        }catch (Exception e)
        {

            e.printStackTrace();
        }
    }
}
