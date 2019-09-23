package com.faon.collection.arrayList;

import java.util.ArrayList;

public class ArrayListTest {
    ArrayList<String> arrayList=new ArrayList<>();

    public ArrayListTest(){
        arrayList.add("apple");
        arrayList.add("grape");
        arrayList.add("banana");
        arrayList.add("pear");
    }
    /**
     *  返回集合中的最大的和最小的元素
     */
    public  void  findExtremeValue(){
        String smallString =  arrayList.get(0);
        String bigString = arrayList.get(0);
        for (int i=1;i<arrayList.size();i++){
            String s = arrayList.get(i);
            if (s.compareTo(bigString)>0){
                bigString=s;
            }
            if (smallString.compareTo(s)>0){
                smallString=s;
            }
        }
        System.out.println("smallString:"+smallString+"\n"+"bigString:"+bigString);
    }

    /**
     * 将集合进行排序，并将排序后的结果打印在控制台上
     */
    public  void  sortElement(){
        int size=arrayList.size();
        for (int i=0;i<size-1;i++){
            for (int n=i+1;n<size;n++){
                if (arrayList.get(n).compareTo(arrayList.get(i))>0){
                    String len;
                    len=arrayList.get(i);
                    arrayList.set(i,arrayList.get(n));
                    arrayList.set(n,len);
                }
            }
        }
        for (String str:arrayList) {
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        ArrayListTest arrayListTest = new ArrayListTest();
//        arrayListTest.findExtremeValue();
        arrayListTest.sortElement();
    }
}
