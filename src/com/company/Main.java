package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 2,b = 3,c = 4,n = 3;
        if (n > 2 && (Math.pow(a, n) + Math.pow(b, n)) == Math.pow(c, n)){
            System.out.println("Holy smokes, Fermat was wrong!");
        } else{
            System.out.println("No, that doesn’t work.");
        }
    }
}
