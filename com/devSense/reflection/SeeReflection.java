package com.devSense.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SeeReflection {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Company company = new Company("Facebook");
        System.out.println("Company name is: " + company.getName());

        //Change the name of the company
        Field nameField = Company.class.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(company,"Meta");

        System.out.println("Company name is: " + company.getName());

        //Invoke the private displayName method
        Method objectMethod = Company.class.getDeclaredMethod("displayName");
        objectMethod.setAccessible(true);
        var invoke = objectMethod.invoke(company);


    }
}



