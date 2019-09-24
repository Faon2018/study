package com.faon.sort.insertSort;


import com.faon.util.Util;

public class Test {
    int [] a;
    public  Test(int length){
        if (length<=0){
            System.out.println("数组元素个数不能小于0");
            return;
        }
        a=new int[length];
        for (int i = 0; i <length; i++) {
            a[i] = (int)(Math.random() * 100) + 1;
        }
    }
    /**
     * 插入排序:将序列的第一个数据看成是一个有序的子序列，然后从第二个记录逐个向该有序的子序列进行有序的插入，直至整个序列有序
     */
    public void  sort_1(){
        for (int i = 1; i < a.length; i++) {
           if (a[i]<a[i-1]){
               for (int j = 0; j <= i-1 ; j++) {
                   if (a[i]<a[j]){
                       int b=a[i];
                       for (int k = i-1; k > j-1 ; k--) {
                           a[k+1]=a[k];
                       }
                       a[j]=b;
                   }
               }
           }
        }
        Util.printArray(a);
    }

    public static void main(String[] args) {
        Test test = new Test(10);
        Util.printArray(test.a);
        System.out.println("-----------");
        test.sort_1();
    }

}
