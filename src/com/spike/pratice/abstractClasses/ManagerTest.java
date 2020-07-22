package com.spike.abstractClasses;

public class ManagerTest {

    public static void main(String[] args) {

        Manager boss = new Manager("Jack", 30000, 2008, 11, 23);
        boss.setBonus(20000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Kevin", 10000, 2012, 5, 15);
        staff[2] = new Employee("Marry", 12000, 2011, 6, 1);


        for (Employee e: staff) {
            System.out.println(e.getName() + "的薪水是：" + e.getSalary() + "；入职时间是：" + e.getHireDay());
        }


    }
}





