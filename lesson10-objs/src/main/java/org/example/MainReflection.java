package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainReflection {

    public static void main(String[] args) throws Exception {

        User user = new User("alex", 15);

        Class<? extends User> userClass = user.getClass();

        Method[] declaredMethods = userClass.getDeclaredMethods();

        for (Method method : declaredMethods) {

            System.out.println(method.getName());

        }

        System.out.println("-----");

        Field[] declaredFields = userClass.getDeclaredFields();

        for (Field field : declaredFields) {
            System.out.println(field.getName());
        }


        Field fieldAge = userClass.getDeclaredField("age");
        fieldAge.setAccessible(true);
        fieldAge.set(user, 30);

        System.out.println(user);

        System.out.println(userClass.getSimpleName());

    }

}
