import java.util.*;
public abstract class Shape
{
    public abstract void area();
    public abstract void parimeter();
}
class Rectangle extends Shape
{
    int l,b;
    Rectangle(int l,int b)
    {
    this.l=l;
    this.b=b;
    }
    public void area()
    {
        int a=l*b;
        System.out.println("Area of ractangle is::"+a);
    }
    public void parimeter()
    {
        int p=2*(l+b);
        System.out.println("parimeter of ractangle is::"+p);
    }
}
class circle extends Shape
{
    int r;
    double i=3.14;
    circle(int r)
    {
    this.r=r;
    }
    public void parimeter()
    {
        double p=2*i*r;
        System.out.println("parimeter of circle is::"+p);
    }
    public void area()
    {
        double a=i*r*r;
        System.out.println("area of circle is::"+a);
    }
  
}
class triange extends Shape
{
    int n,b,c;
    triange(int a,int b)
    {
    this.n=n;
    this.b=b;
    this.c=Math.sqrt(n*n+b*b);
    }
    public void area()
    {
        double a=(b*n)/2;
        System.out.println("area of triangle is::"+a);
    }
    public void parimeter()
    {
        double p=n+b+c;
        System.out.println("area of triangle is::"+p);
    }
}
class Area_abs
{
    public static void main(String[] args) 
    {
    Rectangle ob=new Rectangle(2,3);
    ob.area();
    ob.parimeter();
    triange obj = new triange(2,3);
    obj.area();
    obj.parimeter();
    circle o=new circle(2);
    o.area();
    o.parimeter();
    }
}
   