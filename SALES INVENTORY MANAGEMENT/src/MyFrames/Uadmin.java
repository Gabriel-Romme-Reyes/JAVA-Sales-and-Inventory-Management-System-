package MyFrames;

public class Uadmin {

    private int id;
    private String name;
   
    private String password;
     private String sq;
   
    private String sa;
    
    public Uadmin(int id,String name, String password,String sq, String sa)
    {
        this.id=id;
        this.name=name;
     
        this.password=password;
            this.sq=sq;
             this.sa=sa;
        
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
     public String getsq()
    {
        return sq;
    }
     
        public String getsa()
    {
        return sa;
    }
}
