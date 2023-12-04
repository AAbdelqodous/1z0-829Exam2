package q43;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

record CryptoCurrency(String name, int unit){}
public class Test {
    public static void main(String[] args) {
        Function<CryptoCurrency, Integer> extractor = curr -> curr.unit();
        UnaryOperator<Integer> operator = i -> i % 100;
        var result =
                Stream.of(
                        new CryptoCurrency("DOGE", 8921),
                        new CryptoCurrency("ETH", 99),
                        new CryptoCurrency("LTC", 17689))
                .map(extractor.andThen(operator))
                .reduce(0, (a, b) -> a + b);
        System.out.println(result);
    }
}
