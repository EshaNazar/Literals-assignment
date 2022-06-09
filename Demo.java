class PassByValue
{
 void swap(int x, int y)
     {
        int temp;
          temp= x;
             x=y;
             y=temp;
      }
}
class Demo
{ 
 public static void main (String args[])
   {
        int a=10;
        int b=20;
       PassByValue obj=new  PassByValue();
       System.out.println("Before call: a="+a+" b="+b);
       obj.swap(a,b);
       System.out.println("After call: a="+a+" b="+b);
    }
}