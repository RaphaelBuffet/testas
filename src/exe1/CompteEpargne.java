package exe1;

public class CompteEpargne extends BankAccount{

    private int amount;
    private Client owner;
    private int taxeTypeSemblable,TaxeTypeDifferents;

    public CompteEpargne(Client owner, int amount) {
        super(owner, amount);
        this.setAmount(amount);
        this.setOwner(owner);

        taxeTypeSemblable=5;
        TaxeTypeDifferents=2;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
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
}
