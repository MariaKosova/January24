package built_in_intefaces_homework2401;

import java.util.function.*;

public class Main{

    public static void main(String[] args) {

        //  используя стандартные интерфейсы, написать такие лямбды:
        // 1. конкатинировать  a и b   и получить ab
        // 2.  если длина строки 3 вернуть true
        // 3.  если длина строки четная вернуть true  иначе false
        // 4. вернуть строку в верхнем регистре
        // 5. если длина строки 4 вернуть 4 звездочки иначе вернуть строку без изменений

        System.out.println("Concatinate: ");
        BiFunction<Integer, Integer,String> concate = (a,b)->Integer.toString(a) +b;
        System.out.println(concate.apply(2,4));

        int c = 3;
        System.out.println("Check, if length of string is equal to " + (c) +":");
        Predicate<String>isEqual = s -> s.length()==c;

        System.out.println(isEqual.test("abc"));
        System.out.println(isEqual.test("abcd"));

        System.out.println("Check, if length of string is even");
        Predicate<String> isEven = s -> s.length() % 2 == 0;
        System.out.println(isEven.test("abc"));
        System.out.println(isEven.test("abcd"));

        UnaryOperator<String> modify = s -> s.toUpperCase();
        System.out.println(modify.apply("abcDe"));

        UnaryOperator <String> toChange = s -> s.length() == 4 ? "****":s;
        System.out.println(toChange.apply("ab"));
        System.out.println(toChange.apply("abcd"));

        Consumer <String> forPrinting  = s -> System.out.println("!" + s + "!");
        forPrinting.accept("Hello!");

        Supplier<String> toPrint = () -> "Hello World";
        System.out.println(toPrint.get());

    }


}
