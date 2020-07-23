package com.spike.iotest.class1;

/**
 * 复制多级文件夹
 * 需求：
 *      把“E:\\ITCAST" 复制到F盘目录下
 * 思路
 *      1、创建数据源File对象，路径是E:\\itcast
 *      2、创建目的地File对象，路径是F:\\
 *      3、写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
 *      4、判断数据源File是否是目录
 *          是：
 *              A: 在目的地下创建和数据源File名称一样的目录
 *              B：获取数据源File下所有的文件或者目录的File数组
 *              C：遍历该File数组，得到每一个File对象
 *              D：把该File作为数据源File对象，递归调用复制文件夹的方法
 *          不是：说明是文件，直接复制，用字节流
 */
public class FileDemo3 {
    public static void main(String[] args) {

        
    }
}
