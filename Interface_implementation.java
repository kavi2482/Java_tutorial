interface Computer
{
    void work();
}

class Desktop implements Computer
{
    public void work()
    {
        System.out.println("in Desktop");
    }
}

class Laptop implements Computer
{
    public void work()
    {
        System.out.println("in Laptop");
    }
}
class Worker
{   public void start(Computer l)
{
    l.work();
}
}

class Main
{
    public static void main(String[] args)
    {
       Computer lap = new Laptop();
       Computer Desk = new Desktop();
       Worker w = new Worker();
       w.start(Desk);
       System.out.println("****************");
       w.start(lap);
    }
}