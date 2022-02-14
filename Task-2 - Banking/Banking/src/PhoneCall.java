
public class PhoneCall extends Notifier{

    public PhoneCall(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    public void display(){

        if(event.equals("Withdraw") && bankAccount.amount >= 100000){
            System.out.println("Calling " + bankAccount.owner);
            System.out.println("Withdrawal operation is successful. Withdrawal amount is Rs." + bankAccount.amount);
        }

        System.out.println("The amount of your account is Rs." + bankAccount.balance );
        System.out.println("");
    }
}
