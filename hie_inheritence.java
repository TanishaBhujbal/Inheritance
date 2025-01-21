class Vehicle1
{
    void start()
    {
        System.out.println("This is Vehicle");
    }
}
class car1 extends Vehicle1
{
    void drive()
    {
        System.out.println("This is Car");
    }
}
class bike extends Vehicle1
{
    void boom()
    {
        System.out.println("This bike");
    }
}
public class hie_inheritence
{
    public static void main(String[] args)
    {
        bike l=new bike();
        l.start();
        l.boom();

        car1 c=new car1();
        c.start();
        c.drive();
    }
}
