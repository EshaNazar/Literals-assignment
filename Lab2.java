class Addition
{        
     int x;
     int y; 
     int add ()
         {    
               return x+y;
         }
}
public class Lab2
{
    public static void main(String arg[])
        {
            Addition P=new   Addition();
           P.x=40;
           P.y=10;
           P.add();
        System.out.println(P.add());
        }
}   