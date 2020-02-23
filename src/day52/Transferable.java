package day52;

public interface Transferable {


    void transferAll(Account otherAccount);

    public abstract void transferAll(Account otherAccount, int amountToTransfer);

    // public abstract void transferAmount(Account otherAccount , int amountToTransfer);
}
