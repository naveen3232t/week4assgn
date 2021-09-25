public class PastaMachine {
    private int Orderid;
    private String Defaultpizza;

    public PastaMachine(int Orderid, String Defaultpizza){
        this.Orderid = Orderid;
        this.Defaultpizza = Defaultpizza;
    }

    public int getOrderid() {return Orderid;}
    public void setOrderid(int Orderid) {
        this.Orderid = Orderid;
    }
    public int getDefaultPizza() {
        return Orderid;
    }
    public void setDefaultpizza(String Defaultpizza) {
        this.Defaultpizza = Defaultpizza;
    }

    @Override
    public String toString(){
        return "ID: "+Orderid+" Type: "+Defaultpizza;
    }
}
