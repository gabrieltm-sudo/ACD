import java.util.ArrayList;

public class Subtraction extends Expression{
    private ArrayList<Expression> expressions;

    public Subtraction(ArrayList<Expression> expressions){
        if(expressions.size()<2){
            throw new ExpressaoInvalidaException("A subtração precisa de pelo menos duas expressões.");
        }
        this.expressions = expressions;
    }

    public double evaluate(){
        double resultado = 0;

        for(Expression i: expressions){
            resultado-=i.evaluate();
        }

        return resultado;
    }
}
