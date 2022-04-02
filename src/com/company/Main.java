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
// 17  public static double sqr(double arg) {
//        if (System.currentTimeMillis() % 2 == 0) {
//            return arg * arg; // если currentTimeMillis() - четное число, то все ОК
//        }
//        // а если нечетное, что нам возвращать?
//    }
//}
// 18  public static void main(String[] args) {
//        double d = sqr(10.0); // ну, и чему равно d?
//        System.out.println(d);
//    }
//    public static double sqr(double arg) {
//        // nothing
//    }
//}
// 19   public static double sqr(double arg) {
//        while (true); // Удивительно, но КОМПИЛИРУЕТСЯ!
//    }
//}
// 20   public static void main(String[] args) {
//        double d = sqr(10.0);  // sqr - навсегда "повиснет", и
//        System.out.println(d); // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
//    }
//    public static double sqr(double arg) {
//        while (true); // Вот тут мы на века "повисли"
//    }
//}
// 21  public static double sqr(double arg) {
//        if (System.currentTimeMillis() % 2 == 0) {
//            return arg * arg; // ну ладно, вот твой double
//        } else {
//            while (true);     // а тут "виснем" навсегда
//        }
//    }
//}
// 22    public static double sqr(double arg) {
//        throw new RuntimeException();
//    }
//}
// 23  public static double sqr(double arg) {// согласно объявлению метода ты должен вернуть double
//        long time = System.currentTimeMillis();
//        if (time % 2 == 0) {
//            return arg * arg;             // ок, вот твой double
//        } else if (time % 2 == 1) {
//            {
//                while (true) ;                 // не, я решил "повиснуть"
//            } else{
//                throw new RuntimeException(); // или бросить исключение
//            }
//        }
//    }
//}
// 24  public static void main(String[] args) {
//        // sqr - "сломается" (из него "выскочит" исключение),
//        double d = sqr(10.0);  // выполнение метода main() прервется в этой строчке и
//        // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
//        System.out.println(d); // и печатать нам ничего не придется!
//    }
//    public static double sqr(double arg) {
//        throw new RuntimeException(); // "бросаем" исключение
//    }
//}
//25    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            // у вас плохие аргументы, извините
//        } else {
//            return width * height;
//        }
//    }
//26    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            System.out.println("Bad ...");
//        }
//        return width * height;
//    }
//27    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            return -1; // специальное "неправильное" значение площади
//        }
//        return width * height;
//    }
//28    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            System.exit(0);
//        }
//        return width * height;
//    }
//}
//29    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
//        }
//        return width * height;
//    }
//30    public static void main(String[] args) {
//        // Пример: ОПЕРАТОР ПОСЛЕДОВАТЕЛЬНОСТИ
//        int x = 42;    // первый шаг
//        int y = x * x; // второй шаг
//        x = x * y;     // третий шаг
//
//    }
//}
// 31   public static void main(String[] args) {
//        // Пример: ОПЕРАТОР ВЕТВЛЕНИЯ
//        if (args.length > 2) { //первый шаг
//            // второй шаг или тут
//
//        } else {
//            // или тут
//
//        }
//        // третий шаг
//
//    }
//}
    public static void main(String[] args) {
        // Пример: ОПЕРАТОР ЦИКЛА do..while
        int x = 1;
        do {

        } while (x++ < 10);

    }
}




























