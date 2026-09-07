public class InvoiceTest {
    public static void main(String[] args){
        String num = "2123";
        String desc = "Fatura do mês 8";
        int quantity = 10;
        double price = 324.12;
        Invoice invoice = new Invoice(num, desc, quantity, price);

        System.out.println("Número da fatura: " + invoice.getNumber());
        
    }
}
