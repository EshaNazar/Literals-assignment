class Figure 
{
  double dim1;
  double dim2;
  
  double area()
   {
    System.out.print("Area of figure class");
    return 0;
   }
}

 class Triangle extends Figure
{
    double area()
    {
     return 1.0/2.0*dim1*dim2;
    }
}

class MainDemoOverride
{
  public static void main(String arg[])
   {
    Figure f=new Figure();
    Triangle t=new Triangle();
    t.dim1=2.3;
    t.dim2=6.5;
    f.dim1=4;
    f.dim2=5;
    double at=t.area(); 
    double af=f.area();
    System.out.println("at:"+ at);
    System.out.println("af:"+ af);
   }
}