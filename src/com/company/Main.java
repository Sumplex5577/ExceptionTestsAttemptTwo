package com.company;

public class Main {

    //1    public static void main(String[] args) throws Throwable {
//2  public static void main(String[] args) throws String {
//3 public static void main(String[] args) {
//3   try {
//3 } catch (Throwable t) {}
//4public static void main(String[] args) {
//4try {
//4 } catch (String s) {}
//4    }
//4}
//5public static void main(String[] args) {
//    // Error - потомок Throwable
//    throw new Error();
//}
//}
//6public static void main(String[] args) {
//    throw new String("Hello!");
//}
//}
//7public static void main(String[] args) {
//    throw null;
//}
//}
//8public static void main(String[] args) {
//    Error ref = new Error(); // создаем экземпляр
//    throw ref;               // "бросаем" его
//}
//}
//9public static void main(String[] args) {
//    f(null);
//}
//    public static void f(NullPointerException e) {
//        try {
//            throw e;
//        } catch (NullPointerException npe) {
//            f(npe);
//        }
//    }
//}
//10public static void main(String[] args) {
//    System.out.println("sout");
//    throw new Error();
//}
//}
//11public static void main(String[] args) {
//    System.err.println("sout");
//    throw new Error();
//}
//}
//12public double sqr( double arg){ // надо double
//    return arg * arg;           // double * double - это double
//        }
//    }
//13public double sqr(double arg) { // надо double
//    int k = 1;                  // есть int
//    return k;                   // можно неявно преобразовать int в double
//}
//}
//14public double sqr(double arg) { // надо double
//    int k = 1;                  // есть int
//    return (double) k;          // явное преобразование int в double
//}
//}
//15public static double sqr(double arg) {
//    return "hello!";
//}
//}
// 16   public static double sqr(double arg) {
//    }
//}
//
    public static double sqr(double arg) {
        if (System.currentTimeMillis() % 2 == 0) {
            return arg * arg; // если currentTimeMillis() - четное число, то все ОК
        }
        // а если нечетное, что нам возвращать?
    }
}
