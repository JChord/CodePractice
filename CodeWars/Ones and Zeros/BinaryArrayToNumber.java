import java.util.List;

public class BinaryArrayToNumber {

  public static int ConvertBinaryArrayToInt(List<Integer> binary) {
      int j=0;
      double result=0;
      for(int i= binary.size()-1; i>=0; i--) {
          result += binary.get(i) * Math.pow(2,j);
          j++;
      }
      return (int)result;
  }
  
}
