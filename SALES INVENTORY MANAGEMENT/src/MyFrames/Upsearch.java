
package MyFrames;

public class Upsearch {
    
    private int id;
    private String pname;
    private int available;
    private int mrp;
    
    
    public Upsearch(int Id,String Pname,int Available,int Mrp)
    {
        this.id = Id;
        this.pname = Pname;
        this.available = Available;
        this.mrp = Mrp;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getPname()
    {
        return pname;
    }
    
    public int getAvailable()
    {
        return available;
    }
    
    public int getMrp()
    {
        return mrp;
    }
}


