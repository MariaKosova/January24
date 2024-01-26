package streams_homework2501;
import java.util.List;

public class Main {

    //Написать метод, принимающий лист имен, в котором некоторые имена повторяются
    // и печатающий имена из листа без печати повторений.
    // При решении использовать Stream API

    public static void main(String[] args) {

    List<String>names = List.of("Peter", "Pavel", "Ann","Mary", "Ann", "Peter", "George", "Mike", "George");
            getListOfUniqueNames(names);

    }
public static void getListOfUniqueNames (List<String>names) {
    names.stream();
    names.stream().distinct().forEach( System.out:: println);

}
}
