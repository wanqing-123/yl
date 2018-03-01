package com.ayalamih.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * com.ayalamih.example
 *
 * int compare(Object o1, Object o2)返回一个基本类型整型
 * 1. 如果按照升序排序
 * 则o1小于o2, 返回-1(负数), 相等返回0, o1大于o2返回1(正数)
 * 1. 如果按照降序排序
 * 则o1小于o2, 返回1(正数), 相等返回0, o1大于o2返回-1(负数)
 * @author ayalamih.
 * @date 2:48 PM, 07/02/2018
 * @contact 31007354@qq.com
 */
public class ComparatorExample {

    public static void main(String[] args) {
        IntComparator intComparator = new IntComparator();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(199);
        nums.add(8923);
        nums.add(209);
        Collections.sort(nums, intComparator);
        nums.add(90);
        Collections.sort(nums, intComparator);
        System.out.println(nums);
    }

    private static class IntComparator implements Comparator<Integer> {
        public int compare(Integer o1, Integer o2) {
            if (o1.intValue() < o2.intValue()) {
                return -1;
            }
            if (o1 == o2) {
                return 0;
            }
            return 1;
        }
    }
}
