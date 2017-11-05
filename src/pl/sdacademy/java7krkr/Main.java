package pl.sdacademy.java7krkr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz ciąg camelCase");
        String camel = scanner.nextLine();
        int words =0;
        if(camel.isEmpty()||Character.isUpperCase(camel.charAt(0))){
            System.out.println("to nie jest camelCase");
            return;
        }
        for (int i = 0; i <camel.length() ; i++) {
            if(i==0){
                words++;
            }
            if(Character.isDigit(camel.charAt(i))){
                System.out.println("ciąg nie może zawierać cyfr");
                return;
            }
            if (Character.isUpperCase(camel.charAt(i))){
                words+=1;
            }
        }
        System.out.println(camel+" "+words);

        }
    }

