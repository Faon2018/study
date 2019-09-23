package com.faon.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class HashSetTest {
    HashSet<Object> hashSet = new HashSet<Object>();

    /**
     * 生成10个1到20之间的不重复的随机数
     */
    public  void  getRandom(){
        boolean flag=true;
        while (flag) {
           if (hashSet.size() < 10) {
               hashSet.add(new Random().nextInt(20)+1);
           } else {
               flag = false;
           }
        }
        Iterator<Object> iterator=hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    /**
     * 从键盘获取一行输入字符串，要求去除重复字符。
     *
     */
    public void  repeatChar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a string");
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();
        for (char c:chars){
            hashSet.add(c);
        }
        for (Object obj:hashSet){
            System.out.println((char)obj);
        }
    }
    public static void main(String[] args) {
        HashSetTest hashSetTest=new HashSetTest();
        hashSetTest.getRandom();
//        hashSetTest.repeatChar();
    }

}
