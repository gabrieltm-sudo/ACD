public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String num, String desc, int quant, double price){
        this.number = num;
        this.description = desc;
        this.quantity = quant;
        this.price = price;
    }

    public String getNumber(){
        return this.number;
    }

    public void setNumber(String num){
        this.number = num;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String desc){
        this.description = desc;
    }
    
    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getInvoice(){
        if(quantity < 0){
            quantity = 0;
        }
        
        if(price < 0){
            price = 0;
        }

        return quantity*price;
    }
    
    public String print(){

        return String.format("Fatura %s | Descrição: %s | Quantidade de itens: %d | Preço: R$%.2f\n", number, description, quantity, price);
    }
}
