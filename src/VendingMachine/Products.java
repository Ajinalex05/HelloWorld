package VendingMachine;

public class Products {
    private String pname;
    private int pprice;
    private int pstock;

    public Products(String pname, int pprice, int pstock) {
        this.pname = pname;
        this.pprice = pprice;
        this.pstock = pstock;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPprice() {
        return pprice;
    }

    public void setPprice(int pprice) {
        this.pprice = pprice;
    }

    public int getPstock() {
        return pstock;
    }

    public void setPstock(int pstock) {
        this.pstock = pstock;
    }
}
