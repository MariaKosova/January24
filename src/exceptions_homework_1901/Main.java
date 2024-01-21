package exceptions_homework_1901;

public class Main {
    //Поймать исключение (с выводом на экран его типа),которое возникает
    // при выполнении следующего кода int a = 40/0

    //Поймать исключение (с выводом на экран его типа),
    // которое возникает при выполнении следующего кода
    //String s =null;
   // String m = s.toLowerCase()

   // Поймать исключение (с выводом на экран его типа),которое возникает
   // при выполнении следующего кода
   // int[] m = new int[2]
  //  m[8]=5
   public static void main(String[] args) {
       int n1 = 40;
       int n2 = 0;
      // String s =null;


       try {
           int divide = n1 / n2;
           System.out.println(divide);
       }

       catch (ArithmeticException e) {
           System.out.println("don't divide by zero");
       }

       try
       {String s = null;
           String m = s.toLowerCase();
           System.out.println(m);
       }

       catch (NullPointerException e){
           System.out.println("Null!");
           System.out.println(e.getMessage());
       }

       try {
           int[] m = new int[2];
            m[8]=5;
       }
       catch (IndexOutOfBoundsException e) {
           System.out.println(e.getMessage());
       }

   }


}
