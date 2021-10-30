
package MyFrames;


public class UserUp {
    
    private int id;
     private String barcode;
    private String pname;
    private int available;
     private int Retail;
     private int retailpack;
    
       private int wholesale;
     private String expdate;
      private String expdate2;
      private String expdate3;
      private int pack;
        private int discount;
      private String gravity;
    
    public UserUp(int Id,String Barcode,String Pname,int Available,int Retail,int Retailpack,int wholesale,String Expdate,int Pack,int Discount,String Gravity)
    {
        this.id = Id;
         this.barcode = Barcode;
        this.pname = Pname;
        this.available = Available;
        
        this.Retail = Retail;
         this.retailpack = Retailpack;
       
         this.wholesale = wholesale;
        this.expdate = Expdate;
          this.pack = Pack;
           this.discount = Discount;
           this.gravity = Gravity;
    }

   /* UserUp(int aInt, String string, String string0, int aInt0, int aInt1, int aInt2, int aInt3, int aInt4, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
    public int getId()
    {
        return id;
    }
     public String getBarcode()
    {
        return barcode;
    }
    
    public String getPname()
    {
        return pname;
    }
    
    public int getAvailable()
    {
        return available;
    }
    
    
     public int getRetail()
    {
        return Retail;
    }
      public int getRetailpack()
    {
        return retailpack;
    }
  
     public int getwholesale()
    {
        return wholesale;
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
       public int getPack()
    {
        return pack;
    }
         public int getDiscount()
    {
        return discount;
    }
         
          public String getGravity()
    {
        return gravity;
    }
}


