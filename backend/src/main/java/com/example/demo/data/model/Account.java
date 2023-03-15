package com.example.demo.data.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "account")
public class Account {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "account")
    private String account;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "age")
    private Integer age;
}
