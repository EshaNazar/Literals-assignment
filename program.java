class Addition 
{
  int x,y;
     
   Addition()
  { 
       x=10;
       y=20;
  }
}
public class program
 {
    public static void main(String args[])
    {
         Addition P=new Addition();
         System.out.println(P.x+P.y);
    }
 }