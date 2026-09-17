import java.util.ArrayList;

public class Multiplication extends Expression{
    private ArrayList<Expression> expressions;

    public Multiplication(ArrayList<Expression> expressions){
        if(expressions.size()<2){
            throw new ExpressaoInvalidaException("A multiplicação precisa de pelo menos duas expressões.");
        }
        this.expressions = expressions;
    }
    
    @Override
    public double evaluate(){
        double resultado = 1;

        for(Expression i: expressions){
            resultado*=i.evaluate();
        }

        return resultado;
    }
}
