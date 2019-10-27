package com.zipcodewilmington.person;

import javax.swing.*;
import java.util.Date;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String hairColor;
    private String eyeColor;
    private String gender;
    private Double shoeSize;
    private String height;


    public Person() {
        this.name="";
        this.age=Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String hairColor, String eyeColor, String gender, Double shoeSize, String height) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.gender = gender;
        this.shoeSize=shoeSize;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }

    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }

    public void setGender (String gender){
        this.gender = gender;
    }

    public void setShoeSize (Double shoeSize)
    {
        this.shoeSize = shoeSize;
    }

    public void setHeight (String height)
    {
        this.height = height;
    }

    public String getHeight () {return this.height;}

    public String getGender () {return this.gender;}

    public String getHairColor () {return this.hairColor;}

    public String getEyeColor () {return this.eyeColor;}

    public Double getShoeSize ()   {return this.shoeSize;}

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
