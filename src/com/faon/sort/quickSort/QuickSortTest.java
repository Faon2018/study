package com.faon.sort.quickSort;

import com.faon.util.Util;

/**
 * 31  91  24  17  83  84  6  71 40 25 73
 * 31  25  24  17  83  84  6  71 40 91 73
 * 31  25  24  17  40  84  6  71 83 91 73
 * 31  25  24  17  40  71  6  84 83 91 73 7 6
 * 31  25  24  17  40  71  6  73 83 91 84


 */
public class QuickSortTest {

    public  int array[]=new int[11];
    public QuickSortTest(){
        for (int i = 0; i < 11; i++) {
            array[i]= (int) (Math.random()*30+1);

        }
//        array[0]=31;
//        array[1]=91;
//        array[2]=24;
//        array[3]=17;
//        array[4]=83;
//        array[5]=84;
//        array[6]=6;
//        array[7]=71;
//        array[8]=40;
//        array[9]=25;
//        array[10]=73;
//        Util.printArray(array);
    }

    public  void  sort(int[] arr,int low,int high){
        int i,j,temp,t;
        if (low>high){
            return;
        }
        //选取基准为最后一个数
        temp=arr[low];
        //从左开始寻找大于key的数，记录下角标
         i=low;
        //从右开始寻找小于key的数，记录下角标
         j=high;


        while (i<j){

            //从右开始，大于基准则往左移，直至找出小于基准为止,j的循环必须写在i的前面，因为要判断i<j
            while (temp<=arr[j] && i<j){
                j--;
            }

            //从左开始，小于基准则往右移，直至找出大于基准为止
            while (temp>=arr[i] && i<j){
                i++;
            }


            if (i<j){
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }

        }

        arr[low]=arr[i];
        arr[i]=temp;

        sort(arr,low,j-1);
        sort(arr,j+1,high);


    }

    public static void main(String[] args) {
            QuickSortTest quickSortTest = new QuickSortTest();
            quickSortTest.sort(quickSortTest.array,0,quickSortTest.array.length-1);
            boolean flag=false;
            for (int i=0;i<quickSortTest.array.length-1;i++){
                if (quickSortTest.array[i]>quickSortTest.array[i+1]){
                    flag=true;
                    return;
                }
            }
            if (flag){
                System.out.println("算法出错");
            }else {
                System.out.println("正确");
            }


    }
}
