@FunctionalInterface
interface Show{
    void film();
    
}

@FunctionalInterface
interface Time{
    int movie(int i,int j);
    
}

class Main{
    public static void main(String[] args)
    {
       Show obj = () -> System.out.println("in film method");
       obj.film();
       Time obj1 = (i,j) -> i+j;
       System.out.println(obj1.movie(2,3));
    }
}