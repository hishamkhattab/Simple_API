package com.spring.student.model;


import com.spring.student.model.enums.Gender;

import javax.xml.crypto.Data;

public class Student {

    private int id;
    private String fullName;
    private String age;
    private Gender gender;
    private String phoneNumber;
    private String address;

    private Data dataCreated;
    private Data dataUpdated;

}
