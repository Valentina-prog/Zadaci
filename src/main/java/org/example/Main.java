package org.example;

public class Main {
    public static void main(String[] args) {
        //zadaca 1
        String origStr = "Welcome to (Programming Java.)";
        System.out.println(origStr);

        //get the substring between '(' and ')'
        int start = origStr.indexOf("(");
        int end = origStr.indexOf(")");

        String outStr = origStr.substring(start + 1,end);
        System.out.println(outStr);
        String pStr = "--------------";
        System.out.println(pStr);

        //zadaca 2
        String str1 = "Listening music";
        String str2 = "Listening music";

        boolean result = str1.equals(str2);
        System.out.println(result);
        String nStr = "--------------";
        System.out.println(nStr);

        //zadaca 3
        String x = "What are you doing?";
        System.out.println(x);

        System.out.println("Number of words = " + x.split(" ") .length);
        String cStr = "--------------";
        System.out.println(cStr);

        //zadaca 4
        String myStr1 = "Now I see ";
        System.out.println(myStr1);

        String myStr2 = "how much I'm stupid.";
        System.out.println(myStr2);

        //method and result of concatination
        String myStr3 = myStr1.concat(myStr2);
        System.out.println(myStr3);








    }
}