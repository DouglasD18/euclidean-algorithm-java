
public class EuclideanAlgorithm {

  private static int recursiveCalc(int big, int low) {
    if (low == 0) {
      return big;
    }

    int module = big % low;
    return EuclideanAlgorithm.recursiveCalc(low, module);
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int mdc = EuclideanAlgorithm.recursiveCalc(270, 192);
    System.out.println(mdc);
  }

}
