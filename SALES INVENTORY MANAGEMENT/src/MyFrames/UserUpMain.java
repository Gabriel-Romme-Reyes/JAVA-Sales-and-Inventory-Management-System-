
package MyFrames;


public class UserUpMain {
    
    private int id;
     private String barcode;
      private String type;
    private String pname;
    private int available;
    private String gravity;
   
     private int mrp;
     
     private String expdate;
      private String expdate2;
       private String expdate3;
    
    
    public UserUpMain(int Id,String Barcode,String Type,String Pname,int Available,String Gravity,int Mrp,String Expdate,String Expdate2,String Expdate3)
    {
        this.id = Id;
         this.barcode = Barcode;
         this.type = Type;
        this.pname = Pname;
        this.available = Available;
         this.gravity = Gravity;
        this.mrp = Mrp;
        
        this.expdate = Expdate;
         this.expdate2 = Expdate2;
          this.expdate3 = Expdate3;
    }

  
    
    public int getId()
    {
        return id;
    }
     public String getBarcode()
    {
        return barcode;
    }
     
      public String getType()
    {
        return type;
    }
    
    public String getPname()
    {
        return pname;
    }
    
    public int getAvailable()
    {
        return available;
    }
    
     public String getGravity()
    {
        return gravity;
    }
    
    
     public int getMrp()
    {
        return mrp;
    }
   
    
     public String getExpdate()
    {
        return expdate;
    }
     
     public String getExpdate2()
    {
        return expdate2;
    }
     
        public String getExpdate3()
    {
        return expdate3;
    }
}


