package com;

import java.util.*;  
public class MapExample {  
public static void main(String[] args) {  
    Map map=new HashMap();    
    map.put(1,"Vaishu");  
    map.put(5,"usha");  
    map.put(2,"shyam");  
    map.put(6,"shiva");
    map.put(9,"venkat");
    Set set=map.entrySet();  
    Iterator itr=set.iterator();  
    while(itr.hasNext()){   
        Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());  
    }  
}  
}  