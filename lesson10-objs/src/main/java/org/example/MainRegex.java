package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegex {

    public static void main(String[] args) {

//        String email = "2edhwjehdgwe@dd.com";
//
//        String text = "abasdadA";
//
//        Pattern pattern = Pattern.compile("\\d[a-zA-Z]*@[a-zA-Z]+.[a-zA-Z]{1,3}");
//
//        Matcher matcher = pattern.matcher(email);
//
//        System.out.println(matcher.matches());

//        String phone = "+375-(33)-\"1234567\"";
//
//        Pattern pattern = Pattern.compile("[+]375-\\((29|33|44)\\)-\"\\d{7}\"");
//        Matcher matcher = pattern.matcher(phone);
//        System.out.println(matcher.matches());

//        String text = "Hello;World;!!!";
//
//        Pattern pattern = Pattern.compile("[a-zA-Z]+;");
//        Matcher matcher = pattern.matcher(text);
//
//       while (matcher.find()) {
//           System.out.println(matcher.group());
//       }

        String text = "shdhjasdosnadkjad";
        Pattern pattern = Pattern.compile("[a-zA-Z]+[o0][a-zA-Z]+");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());

        // grey gray

    }

}
