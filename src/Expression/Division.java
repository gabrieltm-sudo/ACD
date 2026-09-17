import java.util.ArrayList;

public class Division extends Expression {
    private ArrayList<Expression> expressions;
    
    public Division(ArrayList<Expression> expressions){
        if(expressions.size()!=2){
            throw new ExpressaoInvalidaException("A divisão precisa de duas expressões.");
        }
        this.expressions = expressions;
    }

    public double evaluate(){
        if(expressions.get(1).evaluate()==0){
            throw new ExpressaoInvalidaException("O divisor da divisão não pode ser zero.");
        }
        return expressions.get(0).evaluate()/expressions.get(1).evaluate(); // TODO: Ajustar - Utilizar variáveis para maior legibilidade
    }
}
