package Service;

import javax.jws.WebMethod;

public class Service {
    double final_amount=0;

    public String deposit(String amount, String account_no) {
        double amt=Double.valueOf(amount);  
        int accno=Integer.valueOf(account_no);
        if(accno==1)
        {
            final_amount+=amt;
            return Double.toString(final_amount);
        }
        else
            return "Incorrect Account number";
    }
    public String withdraw(String amount, String account_no) {
        double amt=Double.valueOf(amount);
        int accno=Integer.valueOf(account_no);
        if(accno==1)
        {
            final_amount-=amt;
            if(final_amount<0)
                return "Low balance";
            return Double.toString(final_amount);
        } 
        else
            return "Incorrect Account number";
    }
    public String balance(String account_no) {
         int accno=Integer.valueOf(account_no);
        if(accno==1)
            return Double.toString(final_amount);
        else
            return "Incorrect Account number";
    }
}
