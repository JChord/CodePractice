import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpinWords {

  public String spinWords(String sentence) {
     return Arrays.stream(sentence.split(" ")).map(str->{
      if (str.length() > 4) {
        return new StringBuilder(str).reverse().toString();
      }
      return str;
    }).collect(Collectors.joining(" "));

  }
}