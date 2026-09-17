import java.util.ArrayList;

public class Subtraction extends Expression{
    private ArrayList<Expression> expressions;

    public Subtraction(ArrayList<Expression> expressions){
        if(expressions.size()<2){
            throw new ExpressaoInvalidaException("A subtração precisa de pelo menos duas expressões.");
        }
        this.expressions = expressions;
    }

    @Override
    public double evaluate(){
        double resultado = expressions.get(0).evaluate();

        resultado-=expressions.get(1).evaluate();
        

        return resultado;
    }
}
