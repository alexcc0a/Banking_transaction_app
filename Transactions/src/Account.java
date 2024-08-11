public class Account
{
    private String accNumber;
    private long money;
    boolean isBlocked;

    public Account(String accNumber, long money, boolean isBlocked) {
        this.accNumber = accNumber;
        this.money = money;
        this.isBlocked = isBlocked;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}