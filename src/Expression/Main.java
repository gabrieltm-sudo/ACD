import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<Expression> sumExpressions = new ArrayList<>();

        sumExpressions.add(new Number(10));
        sumExpressions.add(new Number(20));
        
        Expression sum = new Sum(sumExpressions);
        System.out.println("10+20 = " + sum.evaluate());

        ArrayList<Expression> multiExpressions = new ArrayList<>();
        multiExpressions.add(sum);
        multiExpressions.add(new Number(5));

        Expression expression1 = new Multiplication(multiExpressions);
        System.out.println("(10+20)*(5) = " + expression1.evaluate());

        ArrayList<Expression> divExpression = new ArrayList<>();
        divExpression.add(new Number(100));
        divExpression.add(new Number(4));

        Expression divExpressions = new Division(divExpression);
        
        ArrayList<Expression> subExpression1 = new ArrayList<>();
        subExpression1.add(divExpressions);
        subExpression1.add(new Number(7));

        Expression expression2 = new Sum(subExpression1);

        ArrayList<Expression>  subExpression = new ArrayList<>();
        subExpression.add(expression1);
        subExpression.add(expression2);
        
        Expression expressionFinal = new Subtraction(subExpression);
        
        System.out.println("((10+20)*5)-((100-4)+7) = " + expressionFinal.evaluate());
    }
}