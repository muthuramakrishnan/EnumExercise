package com.muthu.weekdays;

public class Main {
    public static void charToNumber(char c){
        final byte LOWERCASE_A = 96;
        System.out.printf("%c = %d %n", c, Integer.valueOf(c) - LOWERCASE_A);
    }
    public static void main(String[] args) {
        //Exercise 1
        for(Weekdays weekday : Weekdays.values()){
            System.out.println(weekday);
        }

        //2
        for(Weekdays weekday : Weekdays.values()){
            System.out.printf("We eat %s on %s%n", weekday.getMeal(), weekday);
        }

        //character to number
        char myChar = 'a';
        for(int i=1; i<=26; i++){
            charToNumber(myChar++);
        }
    }
}
