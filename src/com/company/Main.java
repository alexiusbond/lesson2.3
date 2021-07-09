package com.company;

public class Main {

    public static void printPhrases() { // невозвращаемый метод без входящих параметров
        System.out.println("Java");
        System.out.println("Geektech");
        test();
    }

    public static void main(String[] args) {
        System.out.println("Program starts");
        printPhrases();
        printPhrases();
        addition(3, 5, "Hello");
        addition(10, 2, "Hi");
        addition(30, 15, "Me"); // при вызове метода передаваемые данные называются аргументами
        int resultOfMultiplication = multiply(4, 7);
        System.out.println(resultOfMultiplication);
        // 5 * 9 + 8 * 3 - 6 * 7 = 45 + 24 - 42 = 27
        System.out.println(multiply(5, 9) + multiply(8, 3) - multiply(6, 7));
        System.out.println(concat(6.7, '!'));
        System.out.println(concat(77.99, 'r') + " extra");
        System.out.println("Program ends");
    }

    public static String concat(double digit, char symbol) {
        return digit + " " + symbol;
    }

    public static int multiply(int num1, int num2) {// возвращаемый метод с входящими параметрами
        int result = num1 * num2;
        return result;
    }
        // Привет учитель
    public static void addition(int num1, int num2, String word) {// невозвращаемый метод с входящими параметрами
        System.out.println(num1 + num2);
        System.out.println(word);
    }

    public static void test() { // невозвращаемый метод без входящих параметров
        int a = 8;
        System.out.println(a * 2);
    }
}
