package com.rohit.dsa;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
public class IntegerToRoman {

    public static void main(String[] args) {
        int num = 91;
        String romanNum = getRomanNumber(num);
        System.out.println("Roman number -> " + romanNum);
    }

    static String getRomanNumber(int num) {
        StringBuilder sb = new StringBuilder("");
        Map<Integer, String> intToRomanMap = new LinkedHashMap<>();
        intToRomanMap.put(1000, "M");
        intToRomanMap.put(900, "CM");
        intToRomanMap.put(500, "D");
        intToRomanMap.put(400, "CD");
        intToRomanMap.put(100, "C");
        intToRomanMap.put(90, "XC");
        intToRomanMap.put(50, "L");
        intToRomanMap.put(40, "XL");
        intToRomanMap.put(10, "X");
        intToRomanMap.put(9, "IX");
        intToRomanMap.put(5, "V");
        intToRomanMap.put(4, "IV");
        intToRomanMap.put(1, "I");

        for (Map.Entry<Integer, String> entry : intToRomanMap.entrySet()) {
           Integer key = entry.getKey();
            int count = num / key;
            while(count > 0) {
                sb.append(intToRomanMap.get(key));
                count--;
            }
            num = num % key;
        }

        return sb.toString();
    }
}
