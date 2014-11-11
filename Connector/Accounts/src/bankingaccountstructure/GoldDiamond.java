/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingaccountstructure;

/**
 *
 * @author Nic
 */
public class GoldDiamond extends Checking
{
    private double monthlyPaymentsFee = 0.75;
    private double transferFee = 0.50;
    private double ACTIVE_AMOUNT = 1000.0;
    private int active;//0 is not active, 1 is active
    
    
    public GoldDiamond(int accNum, int custID, double accTot)
    {
        super(accNum, custID, accTot);
    }
    
    public Account transferFundsInactive(double transferAmount, Account transferTo)
    {
        /*
         * This will accept the amount to transfer and the account to transfer to.
         * First, check if there is enough funds in the checking account
         * If there is enough funds, debit the checking acount and credit the account
         * being transfered to. Return the accoutn being tranfered to so the GUI
         * can update the database entry for that account.
         */
        if(transferAmount > accountTotal)
        {
            System.out.println("Not Enough Funds");
        }
        else
        {
            accountTotal -= transferAmount;
            accountTotal -= transferFee;
            transferTo.credit(transferAmount);
            System.out.println("Transfered: $" + transferAmount);
            System.out.println("Current Total: $" + accountTotal);
            System.out.println(transferTo.getAccountNumber() + " - Current Total : $" + transferTo.getAccountTotal());
        }
        
        return transferTo;
    }
    
    public void isActive()
    {
        if(accountTotal >= ACTIVE_AMOUNT)
        {
            active = 1;
        }
        else
        {
            active = 0;
        }
    }
    
}
