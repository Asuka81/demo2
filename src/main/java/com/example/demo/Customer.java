package com.example.demo;


import org.springframework.stereotype.Repository;

@Repository
public class Customer {
    private String ID;
    private String name;
    private boolean sex;
    private int age;

    public Customer() {
        this.ID = "";
        this.name = null;
        this.sex = false;
        this.age = 0;
    }

    public Customer(String ID, String n, boolean s, int a){

        this.ID = ID;
        this.name = n;
        this.sex = s;
        if (a < 0){
            a = 0;
        }
        this.age = a;
    }

    public Customer(String ID, String n, String s, int a){

        boolean sex = false;
        if (s.equals("male")){
            sex = true;
        }
        else{
            sex = false;
        }
        this.ID = ID;
        this.name = n;
        this.sex = sex;
        if (a < 0){
            a = 0;
        }
        this.age = a;
    }





    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public boolean isSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


