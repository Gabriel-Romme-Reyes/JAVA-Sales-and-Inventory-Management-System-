
package MyFrames;

public class BillSearchm {
 
    

    private int bno;

    private int amt;
    private String pdate;
   
    
    public BillSearchm(int bno,int amt, String pdate)
    {
        this.bno=bno;
       
        this.amt=amt;
        this.pdate=pdate;
       
        
        
    }
            
    public int getbno()
    {
        return bno;
    }

    public int getamt()
    {
        return amt;
    }
    public String pdate()
    {
        return pdate;
    }
   
  }


