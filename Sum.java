import java.util Scanner
public class Sum
{
public int sum(int x, int y)
{
return (x+y);
}
public int sum(intx, int y, int z)
{
return (x + y + z);
}
public double sum(double x, double y)
{
return (x + y);
}
public static void main(String args[])
{
Sum s = new Sum();
int first1;
first1 = s.sum(10, 20);
System.out.println(first1);
int second2;
second2 = s.sum(10, 20, 30);
System.out.println(second2);
int third3;
third3 = s.sum(10.5, 20.5);
System.out.println(third3);
}
}
