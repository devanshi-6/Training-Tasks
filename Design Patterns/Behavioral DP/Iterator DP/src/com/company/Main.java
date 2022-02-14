package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Names names = new Names();

        for(Iterator itr = names.getIterator(); itr.hasNext();){
            String name = (String)itr.next();
            System.out.println("Name : " + name);
        }
    }
}
