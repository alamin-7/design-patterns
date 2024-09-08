package com.spring;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Book book = new Book("Life", "Alamin", "abc", new Topics("hh", "ph"));

        Book clonedBook = (Book) book.clone();

        System.out.println("original object:"+book.toString()+" cloned object: "+clonedBook.toString());

        clonedBook.getTopics().setHistory("hhhhh");


        System.out.println("original object:"+book.toString()+" cloned object: "+clonedBook.toString());
    }
}