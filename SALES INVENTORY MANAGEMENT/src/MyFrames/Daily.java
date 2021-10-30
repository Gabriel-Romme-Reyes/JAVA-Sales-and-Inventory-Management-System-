

package MyFrames;


public class Daily {
    
     private int ai;
    private String bill_id;
    private String cuname;
    private String pid;
    private String qty;
    private String pname;
    private String date;
    private String amt;
    private String price;
    
    
    public Daily(int Ai, String BI,String Cuname,String Pid,String Qty, String Pname,String Date,String Amt,String Price)
    {
        this.ai = Ai;
        this.bill_id = BI;
        this.cuname = Cuname;
        this.pid = Pid;
        this.qty = Qty;
        this.pname = Pname;
        this.date = Date;
        this.amt = Amt;
        this.price = Price;
    }
    
 
    
       public int getAi()
    {
        return ai;
    }
    
    public String getBI()
    {
        return bill_id;
    }
    
    public String getCuname()
    {
        return cuname;
    }
    
    public String getPid()
    {
        return pid;
    }
    
    public String getQty()
    {
        return qty;
    }
    
      public String getPname()
    {
        return pname;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public String getAmt()
    {
        return amt;
    }
    
    public String getPrice()
    {
        return price;
    }
}


