package main;

import test.Test;



public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.mul(3, 5));
        System.out.println(test.div(3, 5));
        System.out.println(test.sub(3, 5));
        System.out.println(test.sum(3, 5));
    }
}
