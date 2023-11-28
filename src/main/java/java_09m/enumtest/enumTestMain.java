package java_09m.enumtest;

public class enumTestMain {

    public static void main(String[] args) throws Exception {

        System.out.println(Winner.WINNER.isWinner("kyle"));
        System.out.println(Winner.WINNER.getWinnerSize());


        double result_1 = Operator.MULTIPLY.calculate(3, 4);
        double result_2 =  Operator.PLUS.calculate(1, 2);

        System.out.println("result_1 : " + result_1);
        System.out.println("result_2 : " + result_2);
    }
}
