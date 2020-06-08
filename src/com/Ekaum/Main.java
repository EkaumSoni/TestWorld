package com.Ekaum;

public class Main {
    public static void main(String[] args) {

        TotalImage();

    }
    public static void top(){
        System.out.println("#================#");
    }
    public static void layer1(){
        System.out.println("|      <><>      |");
    }
    public static void layer2(){
        System.out.println("|    <>....<>    |");
    }
    public static void layer3(){
        System.out.println("|  <>........<>  |");
    }
    public static void layer4(){
        System.out.println("|<>............<>|");

    }
    public static void TotalImage(){
        top();
        layer1();
        layer2();
        layer3();
        layer4();
        layer4();
        layer3();
        layer2();
        layer1();
        top();
    }
}
