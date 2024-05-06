abstract class Car
{
    public abstract void steering();
    public abstract void wheel();
    public static void speaker()
    {
        System.out.println("Song...");
    }
}
class Slavia extends Car
{
    public void steering()
    {
        System.out.println("Right");
    }
    public void wheel()
    {
        System.out.println("4 wheels");
    }
}

class Main{
    public static void main(String[] a)
    {
        Slavia c1 = new Slavia();
        c1.steering();
    }
}