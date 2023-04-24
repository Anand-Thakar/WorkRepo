package com.sdm.hw.ivr;


import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        String s = stringBuilder.append(StringUtils.rightPad("200", 7, " "))
                .append(StringUtils.leftPad("1234567", 10, " "))
                .append(StringUtils.rightPad(" ", 7))
                .append(StringUtils.rightPad(" ", 4))
                .append("\n").toString();

        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);


    }
}
