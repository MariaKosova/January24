package our_arraylist;

public class Main {
        public static void main(String[] args) {
            OurList<Integer> ourList = new OurArrayList<>();
            ourList.append(2);
            OurList<Integer>ourList1 = new OurArrayList<>();
            ourList1.append(3);
            ourList1.remove(1);
            ourList1.removeById(4);
            System.out.println(ourList1);
            OurList<Integer> ourList2= new OurArrayList<>();
            ourList2.removeById(1);
            ourList2.append(2);


        }
    }

