package com.faon.proto;

import com.google.protobuf.InvalidProtocolBufferException;


import java.io.FileNotFoundException;

public class ProtoTest {
    public static void main(String[] args) throws InvalidProtocolBufferException, FileNotFoundException {
        StudentInfo.Student student = StudentInfo.Student.newBuilder().setName("张三").setAge(25).setAddress("深圳").build();


        StudentInfo.Student student1 = StudentInfo.Student.parseFrom(student.toByteArray());

        System.out.println(student1);
        System.out.println(student1.getAge());
        System.out.println(student1.getName());
        System.out.println(student1.getAddress());

    }
}
