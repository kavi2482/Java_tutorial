
//final 
class Car
{   
    public void steering()
    {
        System.out.println("Right");
    }
    public final void wheel(final int a)
    {   a=20;                       //rror: final parameter a may not be assigned(variable)
        System.out.println("4 wheels");
    }
}
class Slavia  extends Car            //error: cannot inherit from final Car(class)
{
    public void wheel1()              //wheel() in Slavia cannot override wheel() in Car (method)
    {
        System.out.println("8 wheels");
    }
}

class Main{
    public static void main(String[] a)
    {
        Car c1 = new Car();
        c1.steering();
        
        Slavia s1 = new Slavia();
        s1.wheel1();
        Slavia s2 = new Slavia();
        s1.wheel(10);
    }
}