package org.example;

import java.io.*;

public class MainSerDes {

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/sergey/user.dat"))) {

            Object o = ois.readObject();

            System.out.println(o.toString());

//            if (o instanceof User) {
//                User user = (User) o;
//
//                System.out.println(user.getName());
//                System.out.println(user.getAge());
//            }

        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }


//        User user = new User("alex", 30, new Adress("central"));
//
//        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("/Users/sergey/user.dat"))) {
//
//            os.writeObject(user);
//
//        } catch (IOException exc) {
//            System.out.println("Exception: " + exc.getMessage());
//        }

    }

}
