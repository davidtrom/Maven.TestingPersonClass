package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    /*@Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        String expected = "5' 11";

        // When
        person.setHeight(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }*/
    @Test
    public void testConstructorWithNewAttributes() {
        // Given
        Integer expectedAge = 37;
        String expectedName = "David";
        String expectedHairColor = "brown";
        String expectedEyeColor = "green";
        String expectedGender = "male";
        Double expectedShoeSize = 11.5;
        String expectedHeight = "5' 11''";


        // When
        Person person = new Person(expectedName, expectedAge, expectedHairColor, expectedEyeColor, expectedGender, expectedShoeSize, expectedHeight);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualHairColor = person.getHairColor();
        String actualEyeColor = person.getEyeColor();
        String actualGender = person.getGender();
        Double actualShoeSize = person.getShoeSize();
        String actualHeight = person.getHeight();


        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedShoeSize, actualShoeSize);
        Assert.assertEquals(expectedHeight, actualHeight);
    }

    @Test
    public void testSetHairColor() {
        // Given
        Person person = new Person();
        String expected = "brown";

        // When
        person.setHairColor(expected);

        // Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor() {
        // Given
        Person person = new Person();
        String expected = "green";

        // When
        person.setEyeColor(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetGender() {
        // Given
        Person person = new Person();
        String expected = "male";

        // When
        person.setGender(expected);

        // Then
        String actual = person.getGender();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetShoeSize() {
        // Given
        Person person = new Person();
        Double expected = 11.5;

        // When
        person.setShoeSize(expected);

        // Then
        Double actual = person.getShoeSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        String  expected = "5' 11''";

        // When
        person.setHeight(expected);

        // Then
        String actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

}