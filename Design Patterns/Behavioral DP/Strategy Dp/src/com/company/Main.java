package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSub());
        System.out.println("20 - 12 = " + context.executeStrategy(20, 12));

        context = new Context(new OperationMul());
        System.out.println("32 * 25 = " + context.executeStrategy(32, 25));
    }
}
