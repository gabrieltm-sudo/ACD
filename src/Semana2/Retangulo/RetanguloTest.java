public class RetanguloTest {
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo(20, 10);

        System.out.println("Largura: " + retangulo.getLargura() + " | Comprimento: " + retangulo.getComprimento() + " | Perimetro: " + retangulo.calculoPerimetro() + " | Área: " + retangulo.calculoArea());

        retangulo.setComprimento(30.5f); // Sem o sufixo f, o valor é considerado double por algum motivo... O uso do f converte para float

        System.out.println("Largura: " + retangulo.getLargura() + " | Comprimento: " + retangulo.getComprimento() + " | Perimetro: " + retangulo.calculoPerimetro() + " | Área: " + retangulo.calculoArea());
    }
}
