public class Retangulo{
    private float largura;
    private float comprimento;

    public Retangulo(float largura, float comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public float calculoPerimetro(){
        return largura*2+comprimento*2;
    }

    public float calculoArea(){
        return largura*comprimento;
    }

    public void setLargura(float largura){
        if(largura<0 || largura>20){
            this.largura = largura;
        }
        this.largura = 1;
    }

    public float getLargura(){
        return largura;
    }

    public void setComprimento(float comprimento){
        if(comprimento>0 || comprimento<20){
            this.comprimento = comprimento;
        }
        this.comprimento = 1;
    }

    public float getComprimento(){
        return comprimento;
    }
}
