import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata {
  public static int dontGiveMeFive(int start, int end) {
    return IntStream.rangeClosed(start, end)
      .filter(num -> !Integer.toString(num)
      .contains("5"))
      .toArray()
      .length;
  }
}