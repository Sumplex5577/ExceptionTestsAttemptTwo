package com.company;

public class Main {

//1 public static void main(String[] args) throws Throwable {
//2  public static void main(String[] args) throws String {
//3 public static void main(String[] args) {
//3   try {
//3 } catch (Throwable t) {}
//4public static void main(String[] args) {
//4try {
//4 } catch (String s) {}
//4    }
//4}
public static void main(String[] args) {
    // Error - потомок Throwable
    throw new Error();
}
}

