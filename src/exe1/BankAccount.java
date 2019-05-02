package exe1;

public abstract class BankAccount {

    private Client owner;
    private int amount;
    private int taxeTypeSemblable,TaxeTypeDifferents;

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTaxeTypeSemblable() {
        return taxeTypeSemblable;
    }

    public void setTaxeTypeSemblable(int taxeTypeSemblable) {
        this.taxeTypeSemblable = taxeTypeSemblable;
    }

    public int getTaxeTypeDifferents() {
        return TaxeTypeDifferents;
    }

    public void setTaxeTypeDifferents(int taxeTypeDifferents) {
        TaxeTypeDifferents = taxeTypeDifferents;
    }

    public BankAccount(Client owner, int amount){
        this.owner=owner;
        this.amount=amount;
    }

}
