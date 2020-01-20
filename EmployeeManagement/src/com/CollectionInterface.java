package com;
import java.util.*;
public class CollectionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractList <String> e=new ArrayList<String>();
e.add("a");
e.add("b");
e.add("c");
System.out.println(e);

AbstractList <String> e1=new ArrayList<String>();
e1.add("e");
e1.add("f");
e1.add("g");
e.addAll(e1);
System.out.println(e);
e.removeAll(e1);
System.out.println(e);
e.remove(1);
System.out.println(e);
e.remove("a");
System.out.println(e);
e.clear();
System.out.println(e);
	}

}
