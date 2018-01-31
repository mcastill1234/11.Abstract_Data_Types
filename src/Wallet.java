public class Wallet {
    private int amount;

    public void loanTo(Wallet that) {
        that.amount += this.amount;
        amount = 0;
    }

    public static void main(String[] args) {
        Wallet w = new Wallet();
        w.amount = 100;
        w.loanTo(w);
    }
}

class Person {
    private Wallet w;

    public int getNetWorth() {
        return w.amount;
    }

    public boolean isBroke() {
        return Wallet.amount == 0;
    }

}
