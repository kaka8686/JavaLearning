package com.spike.StringTest;

import java.util.StringJoiner;

public class StringJoinerSelect {

    public static void main(String[] args) {

        // 请使用StringJoiner构造一个SELECT语句：
        String[] fields = {"name", "position", "salary"};
        String table = "employee";
        String select = buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");

    }

    static String buildSelectSql(String table, String[] fields) {
        // TODO:
        StringJoiner sj = new StringJoiner(", ","SELECT ", " FROM " + table);
        for (String field : fields) {
            sj.add(field);
        }
        return sj.toString();
    }

    Integer a;
}
