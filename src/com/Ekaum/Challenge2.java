package com.Ekaum;

public class Challenge2 {
    public static void main(String[] args) {
        line();
        top();
        bottom();
        line();
        bottom();
        top();
        line();
    }

    public static void line() {
        System.out.print("+");
        for (int dash = 0; dash < 9; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void top() {
        for (int Line = 0; Line < 4; Line++) {
            System.out.print("|");
            for (int Spaces = 0; Spaces < Line * -1 + 4; Spaces++) {
                System.out.print(" ");
            }
            for (int slash = 0; slash < Line; slash++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int backslash = 0; backslash < Line; backslash++) {
                System.out.print("\\");
            }
            for (int Spaces = 0; Spaces < Line * -1 + 4; Spaces++) {
                System.out.print(" ");

            }
            System.out.println("|");
        }
    }

    public static void bottom() {
        for (int Line = 0; Line < 4; Line++) {
            System.out.print("|");
            for (int Space = 0; Space < Line + 1; Space++) {
                System.out.print(" ");
            }
            for (int backlash = 1; backlash < Line * -1 + 4; backlash++) {
                System.out.print("\\");

            }
            System.out.print("*");
            for (int slash = 1; slash < Line * -1 + 4; slash++) {
                System.out.print("/");
            }
            for (int Space = 0; Space < Line + 1; Space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}


