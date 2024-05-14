enum Points{
    csk(4,"chennai"),rcb(6,"Bangalore"),mi(2,"mumbai"),lsg;
    private int score;
    private String ground;
    
    private Points(){             //Default constructor
        score = 0;
        ground = "null";
    }
    private Points(int score,String ground)
    {
        this.score = score;
        this.ground = ground;
    }

    public int getScore()
    {
        return score;
    }
    public String getGround()
    {
        return ground;
    }
    public void setScore(int score,String ground)
    {
        this.score = score;
        this.ground = ground;
    }
}

class Main{
    public static void main(String[] args){

      Points[] list = Points.values(); 
      for(Points name : list){
        System.out.println(name + ":" + name.getScore() + ":" + name.getGround());  
      }
      
    }
}