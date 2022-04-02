package com.company;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

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
//32    public static void main(String[] args) {
//        // Пример: ОПЕРАТОР ЦИКЛА do..while
//        int x = 1;
//        do {
//
//        } while (x++ < 10);
//
//    }
//}
//33    public static void main(String[] args) {
//        System.err.println("#1.in");
//        f(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println("#1.out"); // вернулись
//    } // выходим из текущего фрейма, кончились инструкции
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   #2.out");  //вернулись
//    } // выходим из текущего фрейма, кончились инструкции
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   .   #3.out"); // вернулись
//    } // выходим из текущего фрейма, кончились инструкции
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.RETURN");
//            return; // выходим из текущего фрейма по 'return'
//        }
//        System.err.println(".   .   .   #4.out"); // ПРОПУСКАЕМ
//    }
//}
//34    public static void main(String[] args) {
//        System.err.println("#1.in");
//        f(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println("#1.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   #2.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   .   #3.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.THROW");
//            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
//        }
//        System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
//    }
//}
//35    public static void main(String[] args) {
//        System.err.println("#1.in");
//        try {
//            f(); // создаем фрейм, помещаем в стек, передаем в него управление
//        } catch (Error e) { // "перехватили" "летящее" исключение
//            System.err.println("#1.CATCH");  // и работаем
//        }
//        System.err.println("#1.out");  // работаем дальше
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   #2.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   .   #3.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.THROW");
//            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
//        }
//        System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
//    }
//}
// 36   public static void main(String[] args) {
//        System.err.println("#1.in");
//        f(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println("#1.out"); // вернулись и работаем
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        try {
//            g(); // создаем фрейм, помещаем в стек, передаем в него управление
//        } catch (Error e) { // "перехватили" "летящее" исключение
//            System.err.println(".   #2.CATCH");  // и работаем
//        }
//        System.err.println(".   #2.out");  // работаем дальше
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   .   #3.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.THROW");
//            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
//        }
//        System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
//    }
//}
// 37   public static void main(String[] args) {
//        System.err.println("#1.in");
//        f(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println("#1.out"); // вернулись и работаем
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   #2.out"); // вернулись и работаем
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        try {
//            h(); // создаем фрейм, помещаем в стек, передаем в него управление
//        } catch (Error e) { // "перехватили" "летящее" исключение
//            System.err.println(".   .   #3.CATCH");  // и работаем
//        }
//        System.err.println(".   .   #3.out");  // работаем дальше
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.THROW");
//            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
//        }
//        System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
//    }
//}
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (Exception e) { // catch по Exception ПЕРЕХВАТЫВАЕТ RuntimeException
//            System.err.print(" 2");
//        }
//        System.err.println(" 3");
//    }
//}
// 38   public static void main(String[] args) {
//        try {
//            throw new RuntimeException();
//        } catch (Exception e) {
//            if (e instanceof RuntimeException) {
//                RuntimeException re = (RuntimeException) e;
//                System.err.print("Это RuntimeException на самом деле!!!");
//            } else {
//                System.err.print("В каком смысле не RuntimeException???");
//            }
//        }
//    }
//}
// 39   public static void main(String[] args) throws Exception { // пока игнорируйте 'throws'
//        try {
//            System.err.print(" 0");
//            if (true) {throw new Exception();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {
//            System.err.print(" 2");
//        }
//        System.err.print(" 3");
//    }
//}
//40    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new Error();}
//            System.err.print(" 1");
//        } catch (Exception e) {
//            System.err.print(" 2");
//        }
//        System.err.print(" 3");
//    }
//}
// 41   public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {     // перехватили RuntimeException
//            System.err.print(" 2");
//            if (true) {throw new Error();} // но бросили Error
//        }
//        System.err.println(" 3");          // пропускаем - уже летит Error
//    }
//}
//42    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) { // перехватили RuntimeException
//            System.err.print(" 2");
//            if (true) {throw e;}       // и бросили ВТОРОЙ раз ЕГО ЖЕ
//        }
//        System.err.println(" 3");      // пропускаем - опять летит RuntimeException
//    }
//}
// 43   public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {     // перехватили RuntimeException
//            System.err.print(" 2");
//            if (true) {throw new Error();} // и бросили новый Error
//        } catch (Error e) { // хотя есть cath по Error "ниже", но мы в него не попадаем
//            System.err.print(" 3");
//        }
//        System.err.println(" 4");
//    }
//}
// 44   public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) { // перехватили RuntimeException
//            System.err.print(" 2.1");
//            try {
//                System.err.print(" 2.2");
//                if (true) {throw new Error();} // и бросили новый Error
//                System.err.print(" 2.3");
//            } catch (Throwable t) {            // перехватили Error
//                System.err.print(" 2.4");
//            }
//            System.err.print(" 2.5");
//        } catch (Error e) { // хотя есть cath по Error "ниже", но мы в него не попадаем
//            System.err.print(" 3");
//        }
//        System.err.println(" 4");
//    }
//}
// 45   public static void main(String[] args) {
//        try {
//        } catch (Exception e) {
//        } catch (RuntimeException e) {
//        }
//    }
//}
// 46   public static void main(String[] args) {
//        try {
//        } catch (Error e) {
//        } catch (RuntimeException e) {
//        }
//    }
//}
// 47   public static void main(String[] args) {
//        try {
//            throw new Exception();
//        } catch (RuntimeException e) {
//            System.err.println("catch RuntimeException");
//        } catch (Exception e) {
//            System.err.println("catch Exception");
//        } catch (Throwable e) {
//            System.err.println("catch Throwable");
//        }
//        System.err.println("next statement");
//    }
//}
// 48    public static void main(String[] args) {
//        try {
//            Throwable t = new Exception(); // ссылка типа Throwable указывает на объект типа Exception
//            throw t;
//        } catch (RuntimeException e) {
//            System.err.println("catch RuntimeException");
//        } catch (Exception e) {
//            System.err.println("catch Exception");
//        } catch (Throwable e) {
//            System.err.println("catch Throwable");
//        }
//        System.err.println("next statement");
//    }
//}
//49    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//        } finally {
//            System.err.println("finally");
//        }
//    }
//}
// 50   public static void main(String[] args) {
//        try {
//            throw new RuntimeException();
//        } finally {
//            System.err.println("finally");
//        }
//    }
//}
// 51   public static void main(String[] args) {
//        try {
//            return;
//        } finally {
//            System.err.println("finally");
//        }
//    }
//}
// 52   public static void main(String[] args) {
//        try {
//            System.exit(42);
//        } finally {
//            System.err.println("finally");
//        }
//    }
//}
// 53   public static void main(String[] args) {
//        try {
//            Runtime.getRuntime().exit(42);
//        } finally {
//            System.err.println("finally");
//        }
//    }
//}
// 54   public static void main(String[] args) {
//        try {
//            Runtime.getRuntime().halt(42);
//        } finally {
//            System.err.println("finally");
//        }
//    }
//}
// 55   public static void main(String[] args) {
//        try {
//            System.err.println("try");
//            if (true) {throw new RuntimeException();}
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }
//}
// 56   public static void main(String[] args) {
//        try {
//            System.err.println("try");
//            throw new RuntimeException();
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }
//}
// 57   public static void main(String[] args) {
//        try {
//            System.err.println("try");
//            if (true) {return;}
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }
//}
// 58    public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            return 0;
//        } finally {
//            return 1;
//        }
//    }
//}
// 59   public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            throw new RuntimeException();
//        } finally {
//            return 1;
//        }
//    }
//}
// 60   public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            return 0;
//        } finally {
//            throw new RuntimeException();
//        }
//    }
//}
// 61  public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            throw new Error();
//        } finally {
//            throw new RuntimeException();
//        }
//    }
//}
// 62   public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        long rnd = System.currentTimeMillis();
//        boolean finished = false;
//        try {
//            if (rnd % 3 == 0) {
//                throw new Error();
//            } else if (rnd % 3 == 1) {
//                throw new RuntimeException();
//            } else {
//                // nothing
//            }
//            finished = true;
//        } finally {
//            if (finished) {
//                // не было исключений
//            } else {
//                // было исключение, но какое?
//            }
//        }
//    }
//}
// 63   public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            // nothing
//            System.err.print(" 1");
//        } catch(Error e) {
//            System.err.print(" 2");
//        } finally {
//            System.err.print(" 3");
//        }
//        System.err.print(" 4");
//    }
//}
//  64  public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new Error();}
//            System.err.print(" 1");
//        } catch(Error e) {
//            System.err.print(" 2");
//        } finally {
//            System.err.print(" 3");
//        }
//        System.err.print(" 4");
//    }
//}
// 65   public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch(Error e) {
//            System.err.print(" 2");
//        } finally {
//            System.err.print(" 3");
//        }
//        System.err.print(" 4");
//    }
//}
// 66   public static void main(String[] args) {
//        if (args.length > 1) {
//            if (args.length > 2) {
//                if (args.length > 3) {
//
//                }
//            }
//        }
//    }
//}
// 67   public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; i++) {
//                for (int k = 0; k < 10; k++) {
//
//                }
//            }
//        }
//    }
//}
// 68   public static void main(String[] args) {
//        try {
//            try {
//                try {
//
//                } catch (Exception e) {
//                } finally {}
//            } catch (Exception e) {
//            } finally {}
//        } catch (Exception e) {
//        } finally {}
//    }
//}
// 69   public static void main(String[] args) {
//        throw new Exception(); // тут ошибка компиляции
//    }
//}
// 70   public static void main(String[] args) throws IOException {
//        throw new Exception(); // тут ошибка компиляции
//    }
//}
// 71   public static void main(String[] args) throws Exception { // предупреждаем о Exception
//        throw new Exception(); // и кидаем Exception
//    }
//}
// 72   public static void main(String[] args) throws Throwable { // предупреждаем "целом" Throwable
//        throw new Exception();
//    }
//}
//
// 73   public static void main(String[] args) throws Exception { // пугаем
//        // но ничего не бросаем
//    }
//}
// 74   public static void main(String[] args) {
//        f(); // тут ошибка компиляции
//    }
//
//    public static void f() throws Exception {
//    }
//}
//75    // они пугают целым Throwable
//    public static void main(String[] args) throws Throwable {
//        f();
//    }
//    // хотя мы пугали всего-лишь Exception
//    public static void f() throws Exception {
//    }
//}
// 76   public static void main(String[] args) {
//        f();
//    }
//    public static void f() throws RuntimeException {
//    }
//}
// 77   public static void main(String[] args) throws EOFException, FileNotFoundException {
//        if (System.currentTimeMillis() % 2 == 0) {
//            throw new EOFException();
//        } else {
//            throw new FileNotFoundException();
//        }
//    }
//}
//    // пугаем ОБОИМИ исключениями
//  78  public static void main(String[] args) throws EOFException, FileNotFoundException {
//        f0();
//        f1();
//    }
//
//    public static void f0() throws EOFException {
//        public static void f1 () throws FileNotFoundException
//    }
//}
//
// 79   public static void main(String[] args) throws IOException {
//        if (System.currentTimeMillis() % 2 == 0) {
//            throw new EOFException();
//        } else {
//            throw new FileNotFoundException();
//        }
//    }
//}
// 80   public static void main(String[] args) throws IOException {
//        f0();
//        f1();
//    }
//    public static void f0() throws EOFException {...}
//    public static void f1() throws FileNotFoundException {...}
//}
//
//
// 81   public static void main(String[] args) throws IOException, InterruptedException {
//        f0();
//        f1();
//        f2();
//    }
//    public static void f0() throws EOFException {...}
//    public static void f1() throws FileNotFoundException {...}
//    public static void f2() throws InterruptedException {...}
//}
// 82   public static void main(String[] args) {
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            // ...
//        }
//    }
//}
//  83  public static void main(String[] args) {
//        try {
//            throw new Exception();
//        } catch (Throwable e) {
//            // ...
//        }
//    }
//}
// 84   public static void main(String[] args) {
//        try {
//            throw new Throwable();
//        } catch (Exception e) {
//            // ...
//        }
//    }
//}
//  85  public static void main(String[] args) {
//        try {
//            throw new Exception();
//        } catch (Error e) {
//            // ...
//        }
//    }
//}
// 86   public static void main(String[] args) throws FileNotFoundException {
//        try {
//            if (System.currentTimeMillis() % 2 == 0) {
//                throw new EOFException();
//            } else {
//                throw new FileNotFoundException();
//            }
//        } catch (EOFException e) {
//            // ...
//        }
//    }
//}
//  87  public static void main(String[] args) throws Exception {
//        Throwable t = new Exception(); // и лететь будет Exception
//        throw t; // но тут ошибка компиляции
//    }
//}
//  88  public static void main(String[] args) throws Exception {
//        Object ref = "Hello!";  // ref указывает на строку
//        char c = ref.charAt(0); // но тут ошибка компиляции
//    }
//}
//  89  public static void f0(Throwable t) throws Exception {
//        throw t;
//    }
//    public static void f1(Object ref){
//        char c = ref.charAt(0);
//    }
//}
//  90  public static void main(String[] args) throws Exception {
//        try {
//            Throwable t = new Exception(); // и лететь будет Exception
//            throw t; // но тут ошибка компиляции
//        } catch (Exception e) {
//            System.out.println("Перехвачено!");
//        }
//    }
//}
    public static void main(String[] args) throws Throwable {
        try {
            Throwable t = new Exception(); // а лететь будет Exception
            throw t;
        } catch (Exception e) { // и мы перехватим Exception
            System.out.println("Перехвачено!");
        }
    }
}






