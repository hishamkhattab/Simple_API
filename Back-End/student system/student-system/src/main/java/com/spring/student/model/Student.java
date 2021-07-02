package com.spring.student.model;


import com.spring.student.model.enums.Gender;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;


@Entity(name = "student")
public class Student {


    @Id                                            //will give the ID , id characteristics (unique, primary key, ..etc)
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //to make the ID auto increment
    @Column(name = "id")
    private long id;


    @Column(name = "full_name")
    private String fullName;

    @Column(name = "gender")
    private Gender gender;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "age")
    private String age;

    @Column(name = "address")
    private String address;

    @CreationTimestamp
    @Column(name = "dateCreated")
    private Date dateCreated;

    @UpdateTimestamp
    @Column(name = "dateUpdated")
    private Date dateUpdated;

}
