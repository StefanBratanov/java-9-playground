import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Stream.of(1,2,3,4)
                .dropWhile(i -> i > 2)
                .forEach(System.out::println);

        Stream.ofNullable(null);

        Optional.of(1)
                .filter(i -> i == 1);

        String value = CompletableFuture
                .supplyAsync(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                    return "Stefan";
                })
                .orTimeout(3, TimeUnit.SECONDS).get();

        System.out.println(value);
    }

}
