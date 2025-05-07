import java.util.function.Predicate;

// Here, you can learn the basics of the predicate and how it works
interface Evaluate<T>{
    boolean isNegative(T t);
}
public class predicateFunction {
    public static void main(String [] args){
        // Predicate <T> is functional interface i.e one abstract method 
        // boolean test(T t)
        Predicate<Integer> predicate = i -> i < 0;
        System.out.println("Predicate : " + predicate.test(-1));
        System.out.println("Predicate : " + predicate.test(1));
        int x = 20;
        System.out.println("Is " + x + " even ? : " + check(x, n -> n % 2 == 0));
        x = 21;
        System.out.println("Is " + x + " even ? : " + check(x, n -> n % 2 == 0));
    }

    public static <T> boolean check(T t, Predicate<T> lambda) {
        return lambda.test(t);
    }
}
