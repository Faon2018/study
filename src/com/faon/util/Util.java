package com.faon.util;


import java.lang.reflect.Array;

public class Util {
    public  static void  printArray(int[] arr){
       if (arr.length==0){
           System.out.println("the array is empty");
           return;
       }
       for (Object ob:arr){
           System.out.println(ob);
       }
    }



}
