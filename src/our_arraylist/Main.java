package our_arraylist;

public class Main {
        public static void main(String[] args) {
            OurList<Integer> ourList = new OurArrayList<>();
            ourList.append(2);
            OurList<Integer>ourList1 = new OurArrayList<>();
            ourList1.append(1);
            ourList1.append(2);
            ourList1.append(3);
            ourList1.append(4);
            ourList1.append(5);
            System.out.println( "Print list 1: " + ourList1);
            ourList1.remove(1);
            ourList1.removeById(4);
            System.out.println("Print list 1 with changes: "+ ourList1);

           OurList<Integer> ourList2= new OurArrayList<>();
           ourList2.append(1);
           ourList2.append(2);
           ourList2.append(3);
           ourList2.append(4);
           ourList2.append(5);
           ourList2.append(6);
           System.out.println("Print list 2 " + ourList2);
            ourList2.removeById(1);
            ourList2.append(7);
            System.out.println("Print list 2 with changes: " + ourList2);


        }
    }

