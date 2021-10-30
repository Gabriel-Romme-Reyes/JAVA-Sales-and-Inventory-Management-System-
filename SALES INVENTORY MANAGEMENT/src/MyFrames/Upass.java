package MyFrames;


public class Upass {

    private int id;
    private String name;
   
    private String password;
    
    public Upass(int id,String name, String password)
    {
        this.id=id;
        this.name=name;
     
        this.password=password;
        
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
}
