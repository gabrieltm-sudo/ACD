import java.util.ArrayList;

public class Division extends Expression {
    private ArrayList<Expression> expressions;
    
    public Division(ArrayList<Expression> expressions){
        if(expressions.size()!=2){
            throw new ExpressaoInvalidaException("A divisão precisa de duas expressões.");
        }
        this.expressions = expressions;
    }

    @Override
    public double evaluate(){
        double divisor = expressions.get(1).evaluate();
        double dividendo = expressions.get(0).evaluate();
        if(divisor==0){
            throw new ExpressaoInvalidaException("O divisor da divisão não pode ser zero.");
        }
        return dividendo/divisor;
    }
}
