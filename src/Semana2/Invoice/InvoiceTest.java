public class InvoiceTest {
    public static void main(String[] args){
        String num = "2123";
        String desc = "Fatura do mês 8";
        int quantity = 10;
        double price = 324.12;
        
        Invoice invoice = new Invoice(num, desc, quantity, price);

        System.out.println("Número da fatura: " + invoice.getNumber());
        
        System.out.println(invoice.print());

        num = "1234";
        desc = "Fatura do mês 9";
        quantity = 20;
        price = 734.28;
        
        invoice.setNumber(num);
        invoice.setDescription(desc);
        invoice.setQuantity(quantity);
        invoice.setPrice(price);

        System.out.println(invoice.print());
    }
}
