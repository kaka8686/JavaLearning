package com.spike.coco;



public class test implements empInterface {

    private final String NAME;

    public test(String name) {
        NAME = name;
    }



    public static void main(String[] args) {
//        ok:
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.println("i=" + i + ",j=" + j);
//                if (j == 5) {
//                    break ok;
//                }
//
//            }
//        }


//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(2, map.getOrDefault(map.get(2), 0) + 1);
//        map.put(2, map.getOrDefault(map.get(2), 0) + 1);
//        System.out.println(map.get(2));

//        LocalDate date = LocalDate.now();
//        int day1 = date.getDayOfYear();
//        int day2 = date.getDayOfMonth();
//        DayOfWeek day3 = date.getDayOfWeek();
//        int day4 = day3.getValue();
//        System.out.println("day1:" + day1 + " day2:" + day2 + " day3:" + day4);



    }

    @Override
    public String testfunc(int i) {
        return "hello";
    }
}
