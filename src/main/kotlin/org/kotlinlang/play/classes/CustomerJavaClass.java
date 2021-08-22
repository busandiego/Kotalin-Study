package org.kotlinlang.play.classes;

public class CustomerJavaClass {

    TestClass testJavaClass;
    public CustomerJavaClass() {

    }


    public static void main(String[] args) {

        CustomerJavaClass customerJavaClass = new CustomerJavaClass();

        if (customerJavaClass == null) {
            System.out.println("null");
        } else {
            System.out.println("non null");
        }

        if (customerJavaClass.testJavaClass == null) {
            System.out.println("null");
        } else {
            System.out.println("non null");
        }

    }

    public class TestClass {

    }
}
