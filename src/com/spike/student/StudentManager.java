package com.spike.student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    public static void main(String[] args) {
	// write your code here
        // 通过输出的方式显示管理界面
        // 通过scanner的方式录入输入选项
        // 通过循环的方式来实现循环输出主界面

        ArrayList<Student> studentsList = new ArrayList<>();

        while (true) {
            System.out.println("-----------欢迎来到学生管理系统----------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 查看所有学生");
            System.out.println("4 修改学生");
            System.out.println("5 退出");
            System.out.print("请输入选项：");

            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine();

            switch (number) {
                case "1":
//                    System.out.println("1 添加学生");
                    addStudent(studentsList);
                    System.out.println("添加成功");
                    break;
                case "2":
//                    System.out.println("2 删除学生");
                    delStudents(studentsList);
                    break;
                case "3":
//                    System.out.println("3 查看所有学生");
                    findAllStudents(studentsList);
                    break;
                case "4":
//                    System.out.println("4 修改学生");
                    changeStudents(studentsList);
                    break;
                case "5":
                    System.out.println("5 谢谢使用");
                    System.exit(0);
//                break;
            }

        }
    }

    private static void changeStudents(ArrayList<Student> array) {
        if (array.size() > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入要修改信息学生的学号：");
            String sid = sc.nextLine();
            int tag = 0;

            for (int i = 0; i < array.size(); i++) {
                if (sid.equals(array.get(i).getSid())) {
                    System.out.print("请输入要修改的学生姓名：");
                    String name = sc.nextLine();
                    System.out.print("请输入要修改的学生年龄：");
                    String age = sc.nextLine();
                    System.out.print("请输入要修改的学的住址：");
                    String address = sc.nextLine();

                    array.get(i).setName(name);
                    array.get(i).setAge(age);
                    array.get(i).setAddress(address);

                    tag = 1;
                }
            }

            if (tag == 0 ) {
                System.out.println("没有该学生信息");
            } else {
                System.out.println("学生信息修改完成");
            }
        } else {
            System.out.println("现在还没有学生信息");
        }
    }

    private static void delStudents(ArrayList<Student> array) {
        if (array.size() > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入要删除学生的学号：");
            String sid = sc.nextLine();
            String name = "";
            int tag = 0;

            for (int i=0; i < array.size(); i++) {
                if (sid.equals(array.get(i).getSid())) {
                    name = array.get(i).getName();
                    array.remove(i);
                    tag = 1;
                    break;
                }
            }

            if (tag == 1) {
                System.out.println("删除" + name + "学生信息成功");
            } else {
                System.out.println("没有该学生信息");
            }


        } else {
            System.out.println("现在还没有学生信息");
        }
    }

    private static void findAllStudents(ArrayList<Student> array) {
        if (array.size() > 0) {
            System.out.println("学号\t\t姓名\t\t年龄\t\t住址");
            for (int i = 0; i < array.size(); i++) {
                System.out.println(array.get(i).getSid() + "\t\t" + array.get(i).getName() + "\t\t"
                        + array.get(i).getAge() + "\t\t" + array.get(i).getAddress());
            }
        } else {
            System.out.println("目前没有学生信息，请先添加");
        }
    }


    private static void addStudent(ArrayList<Student> array) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入学号：");
        String sid = sc.nextLine();
        System.out.print("请输入姓名：");
        String name = sc.nextLine();
        System.out.print("请输入年龄：");
        String age = sc.nextLine();
        System.out.print("请输入住址：");
        String address = sc.nextLine();

        student.setSid(sid);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);

        array.add(student);

    }
}
