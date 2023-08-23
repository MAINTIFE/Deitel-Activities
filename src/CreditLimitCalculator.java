public class CreditLimitCalculator {
    public static void main(String[] args){
        int acctnum, balance, totalitems, totalcredits, creditlimit, newbalance;
        acctnum = 01234567;
        balance = 50000;
        totalitems = 15500;
        totalcredits = 3750;
        creditlimit = 20000;
        newbalance = balance + totalitems - totalcredits;
        if(newbalance < creditlimit){
            System.out.println(newbalance);
        } else {
            System.out.println("Credit Limit Exceeded!");
        }



    }
}
