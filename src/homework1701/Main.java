package homework1701;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Дана Map<String, String> map, написать метод, который вернет Мап, такую, что если в
        // исходной map есть ключи ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b. Если нет, ничего не менять.

        //Примеры:
        //mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
        //mapAB({"a": "Hi"}) → {"a": "Hi"}
        //mapAB({"b": "There"}) → {"b": "There"}

        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");

        System.out.println(map);

        //  Map<String,String> map = Map<String,String> originalMap;

        Map<String, String> newMap = new HashMap<>();
        public static void combineKeys (Map<String, String> map){
        // Map<String, String> newMap = new HashMap<>();
        for (String key : map.keySet()) {
            if (map.containsKey("a")) {
                if (map.containsKey("b")) {
                    String valueA = map.get("a");
                    String valueB = map.get("b");
                    System.out.println(newMap.put("ab", valueA + valueB));

                }
            }
        }

    }
}

}

