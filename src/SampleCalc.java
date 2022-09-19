public class SampleCalc {
    int sum;
	
   public void plus(int x, int y) {
      sum = x + y;
      System.out.println("sumの計算結果: " + sum);
   }
	
   public void minus(int x, int y) {
      sum = x - y;
      System.out.println("sumの計算結果: " + sum);
   }
}