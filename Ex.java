class Ex
{
 public static void main (String args[])
 {
      int a=1;
      int b=0;
      int[] arr= new int[2];
     try
     {
      System.out.println(a/b);
       System.out.println(arr[5]);
      }
     catch(ArithmeticException e)  
      {
       System.out.println(e);
       }
       System.out.println(a);
   }
}
