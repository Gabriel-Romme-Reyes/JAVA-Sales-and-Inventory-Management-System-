package MyFrames;

public class Customerlist {

    private int id;
    private String name;
   
   
    private String password;
     private String dateadded;
    
    public Customerlist(int id,String name, String password, String dateadded)
    {
        this.id=id;
        this.name=name;
       
       
        this.password=password;
         this.dateadded=dateadded;
        
    }
            
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }

   
    public String getpassword()
    {
        return password;
    }
        public String getpdate()
    {
        return dateadded;
    }
}
