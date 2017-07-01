package com.shp.prototype;

import java.util.*;


/**
 * Created by Shape on 2017/7/1.
 *缓存Shape
 */
public class ShapeCache {
    //Hashtable与Hashmap的区别
    /*HashMap和Hashtable都实现了Map接口，但决定用哪一个之前先要弄清楚它们之间的分别。主要的区别有：线程安全性，同步(synchronization)，以及速度。
    HashMap几乎可以等价于Hashtable，除了HashMap是非synchronized的，并可以接受null(HashMap可以接受为null的键值(key)和值(value)，而Hashtable则不行)。
    HashMap是非synchronized，而Hashtable是synchronized，这意味着Hashtable是线程安全的，多个线程可以共享一个Hashtable；而如果没有正确的同步的话，多个线程是不能共享HashMap的。Java 5提供了ConcurrentHashMap，它是HashTable的替代，比HashTable的扩展性更好。
    另一个区别是HashMap的迭代器(Iterator)是fail-fast迭代器，而Hashtable的enumerator迭代器不是fail-fast的。所以当有其它线程改变了HashMap的结构（增加或者移除元素），将会抛出ConcurrentModificationException，但迭代器本身的remove()方法移除元素则不会抛出ConcurrentModificationException异常。但这并不是一个一定发生的行为，要看JVM。这条同样也是Enumeration和Iterator的区别。
    由于Hashtable是线程安全的也是synchronized，所以在单线程环境下它比HashMap要慢。如果你不需要同步，只需要单一线程，那么使用HashMap性能要好过Hashtable。
    HashMap不能保证随着时间的推移Map中的元素次序是不变的。*/
    private static Hashtable<String,Shape> shapeMap=new Hashtable<String,Shape>();
    //获得对象
    public static Shape getShape(String shapeId)
    {
        Shape cacheShape=shapeMap.get(shapeId);
        return (Shape)cacheShape.clone();
    }
    //缓存对象
    public static void loadCache(){
        Circle circle=new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);
        Rectangle rectangle=new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);
        Squar squar=new Squar();
        squar.setId("3");
        shapeMap.put(squar.getId(),rectangle);
    }
}
