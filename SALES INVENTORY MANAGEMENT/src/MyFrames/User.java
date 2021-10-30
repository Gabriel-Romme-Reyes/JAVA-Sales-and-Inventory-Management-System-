
package MyFrames;


public class User {
    
    private int id;
    // private String barcode;
    private String pname;
    private int available;
    private int mrp;
    
    private int whole;
  
    
    public User(int Id,String Pname,int Available,int Mrp,int Whole)
    {
        this.id = Id;
       //  this.barcode = Barcode;
        this.pname = Pname;
        this.available = Available;
        this.mrp = Mrp;
       
        this.whole = Whole;
       
    }
    
    public int getId()
    {
        return id;
    }
   //  public String getBarcode()
    //{
      //  return barcode;
   // }
    
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
   
      public int getWhole()
    {
        return whole;
    }
    
}


