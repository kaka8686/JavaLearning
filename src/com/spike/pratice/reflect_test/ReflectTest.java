package com.spike.pratice.reflect_test;

import java.io.File;
import java.lang.reflect.Field;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class ReflectTest {

	public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射给name和age字段赋值:
		Class c = p.getClass();
		Field f = c.getDeclaredField("name");
		f.setAccessible(true);
		f.set(p,name);
		f = c.getDeclaredField("age");
		f.setAccessible(true);
		f.set(p,age);


		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
	}
}



//public class Main {
//
//	public static void main(String[] args) throws Exception {
//		Person p = new Person("Xiao Ming");
//		System.out.println(p.getName()); // "Xiao Ming"
//		Class c = p.getClass();
//		Field f = c.getDeclaredField("name");
//		f.setAccessible(true);
//		f.set(p, "Xiao Hong");
//		System.out.println(p.getName()); // "Xiao Hong"
//	}
//}

//class Person {
//	private String name;
//
//	public Person(String name) {
//		this.name = name;
//	}
//
//	public String getName() {
//		return this.name;
//	}
//}
