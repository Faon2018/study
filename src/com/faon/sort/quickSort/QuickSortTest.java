package com.faon.sort.quickSort;

public class QuickSortTest {

    public  int array[]=new int[15];
    public QuickSortTest(){
        for (int i = 0; i < 15; i++) {
            array[i]= (int) (Math.random()*100+1);
        }
        for (int t:array) {
            System.out.println(t);
        }
    }

    public  void  sort(int [] arr,int start,int end){
        //选取基准为最后一个数
        int key=arr[end];
        //从左开始寻找大于key的数，记录下角标
        int left=start;
        //从右开始寻找小于key的数，记录下角标
        int right=end-1;
        //从左开始查找的开始位置
        int left_start=0;
        //从右开始查找的开始位置
        int right_start=end-1;
        int change;
        while (left<right){
            for (int i = left_start; i < end ; i++) {
                if (arr[i]>key){
                    left=i;
                    //每次查询到时，将开始位置设置，提高效率
                    left_start=i+1;
                    break;
                }
            }
            for (int j = right_start; j >=0 ; j--) {
                if (arr[j]<key){
                    right=j;
                    //每次查询到时，将开始位置设置，提高效率
                    right_start=j-1;
                    break;
                }
            }
            change=arr[left];
            arr[left]=arr[right];
            arr[right]=change;
        }
        System.out.println("============================");
        System.out.println("left:"+left);
        System.out.println("right:"+right);
        change=arr[right];
        arr[right]=key;
        arr[end]=change;
        System.out.println("------------------------------");
        for (int c:arr) {
            System.out.println(c);
        }
        System.out.println("left:"+left);
        System.out.println("right:"+right);
//        sort(arr,0,left);
//        sort(arr,left+1,end);
    }
    public static void main(String[] args) {
        QuickSortTest quickSortTest = new QuickSortTest();
        quickSortTest.sort(quickSortTest.array,0,quickSortTest.array.length-1);
        for (int i:quickSortTest.array) {
            System.out.println(i);
        }
    }
}
