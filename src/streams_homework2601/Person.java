package streams_homework2601;

public class Person {
   // Пусть есть класс Person с полями имя и возраст. Написать метод,
   // принимающий список Person и
   // возвращающий мапу, где возраст является ключом, а лист людей этого возраста значением

    private String name;
    private int age;
    public Person( String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
