package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите строку содержащую верный IP-адрес");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Pattern P = Pattern.compile("\\b([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\b");
        Matcher m = P.matcher(str);
        if (m.find()){
            System.out.println("Корректный IP-адрес: " + m.group());
        }
        else {
            System.out.println("IP-адрес в строке не корректен");
        }
    }
}
