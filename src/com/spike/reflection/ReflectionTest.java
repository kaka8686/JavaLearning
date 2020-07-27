package com.spike.reflection;

import java.util.*;
import java.lang.reflect.*;

public class ReflectionTest {

    public static void main(String[] args) {
        // read class from command line args or user input
        String name;
        if (args.length > 0) name = args[0];
        else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e,g java.util.Date): ");
            name = in.next();
        }

        try {
            // print class name and superclass name (if != Object)
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) System.out.println(modifiers + " ");
            System.out.println("class " + name);

            if (supercl != null && supercl != Object.class) System.out.println(" extends " + supercl.getName());


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}