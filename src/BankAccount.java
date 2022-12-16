public class BankAccount {

    private double amount;

    public double getAmount() {

        return amount;
    }

    public  void  deposit(double sum){
       amount = amount + sum;
        System.out.println("Вы внесли в счет" + sum);
    }
    public void withDraw(int sum)throws LimitException {
        if (sum > amount) {
            throw new LimitException("Ошибка. У вас не хватает денег на счете ", amount);
        } else {
            System.out.println("Вы можете снять со счета" + sum);
            amount = amount - sum;
            System.out.println("Вы сняли со счета " + sum);


        }
    }



}
