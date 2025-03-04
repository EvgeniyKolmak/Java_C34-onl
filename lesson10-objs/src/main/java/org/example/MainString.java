package org.example;

public class MainString {
    public static void main(String[] args) {

        String text = "Hello World";

//        System.out.println(text.length());
//        System.out.println(text.toUpperCase());
//        System.out.println(text.toLowerCase());
//        System.out.println(text.trim());
//        String empty = "   ";
//        System.out.println(empty.isEmpty());
//        System.out.println(empty.isBlank());
//        System.out.println(text.startsWith("   Hello"));
//        System.out.println(text.endsWith(" World  "));
//        System.out.println(text.contains("llo"));
//        System.out.println(text.indexOf("ellod"));
//        System.out.println(text.replace("o ", "O_"));
//        System.out.println(text.substring(2, text.length()));

//        String text2 = text.repeat(2);
//        System.out.println(text2);

//        String text2 = "abc;cde;efg";
//
//        String[] split = text2.split(";");
//
//        System.out.println(Arrays.toString(split));
//        String concat = text.concat("!!!");
//        text = text + "!!!";
//
//        System.out.println(text);

//        String join = String.join("+", "abc", "cde", "efg");
//        System.out.println(join);

//        String alex = String.format("This is user with name = %s, secondname = %s", "Alex", "Family");
//        System.out.println(alex);

        StringBuffer builder = new StringBuffer();
        builder.append("Hello");
        builder.append(" ");
        builder.append("World");
        builder.replace(0, 2, "MY Greate");
        builder.reverse();

        String result = builder.toString();

        System.out.println(result);

    }

}