
package MyFrames;


public class BillSearch {
 
    

    private int bno;
    private String cname;
    private int amt;
    private String pdate;
     private int balance;
    
    public BillSearch(int bno,String cname,int amt, String pdate,int balance)
    {
        this.bno=bno;
        this.cname=cname;
        this.amt=amt;
        this.pdate=pdate;
        this.balance=balance;
        
        
    }
            
    public int getbno()
    {
        return bno;
    }
    public String getcname()
    {
        return cname;
    }
    public int getamt()
    {
        return amt;
    }
    public String pdate()
    {
        return pdate;
    }
     public int getbalance()
    {
        return balance;
    }
  }


