public class Hostelmngmt
{
public void Hostel(int hid)
{
System.out.println("Hostel vacant");
System.out.println(hid);
}
public void Hostel(char c, int num)
{
System.out.println("Room which are booked");
System.out.println(c + " " +num);
}
}
class management
{
public static void main(String args[])
{
Hostelmngmt obj = new Hostelmngmt();
obj.Hostel(20);
obj.Hostel('P' , 1001);
}
} 