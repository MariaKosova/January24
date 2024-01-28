package streams_homework2601;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    // Пусть есть класс Person с полями имя и возраст. Написать метод,
    // принимающий список Person и
    // возвращающий мапу, где возраст является ключом, а лист людей этого возраста значением


    public static void main(String[] args) {

        Person person1 = new Person("Peter", 23);
        Person person2 = new Person("Nick", 7);
        Person person3 = new Person("George", 29);
        Person person4 = new Person ("Mary", 12);

        List<Person> personList = Arrays.asList(person1, person2, person3, person4);
        Map<Integer, String> newListMap = ageKey(personList);
        System.out.println(newListMap);
        System.out.println();
        System.out.println("Total age of people, who are more than 18 years old are: "
                + countSumOfAge(personList));
        System.out.println(writeAPhrase(personList));


    }

    public static Map<Integer, String> ageKey(List<Person> personList) {

        return personList.stream().collect(Collectors.toMap(
                Person::getAge,
                Person::getName));

    }

    //Есть тот же класс Person с полями String name, int age.
    //
    //Написать метод,принимающий список Person и возвращающий
    // суммарный возраст тех, кто старше 18 лет
    //Написать метод,принимающий список Person и возвращающий имена тех,
    // кто старше 18 лет в виде такой строки:
    //"At the moment John and Ann and Bill are of legal age "
    //( имена и текст могут быть любыми, по вашему выбору,
    // структура предложения должна сохраняться)


    public static int  countSumOfAge(List<Person> personList) {
       return personList.stream().filter(person -> person.getAge() > 18)
                .map(Person::getAge)
                .reduce(0, Integer::sum);
    }



  public static String writeAPhrase (List<Person> personList){

       return personList.stream().filter(person -> person.getAge()>18)
               .map (Person ::getName)
                .collect(Collectors.joining(" and "," At the moment ",
                        " are of legal age"));

    }

}






