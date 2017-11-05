package pl.sdacademy.java7krkr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz ciąg");
        String camel = scanner.nextLine();
        int words =1;
        for (int i = 0; i <camel.length() ; i++) {
            if (Character.isUpperCase(camel.charAt(i))){
                words+=1;
            }
        }
        System.out.println(camel+" "+words);

        }
    }

