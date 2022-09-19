public class Main extends SampleCalc{
    
    public void multi(int x, int y) {
      sum = x * y;
      System.out.println("sumの計算結果: " + sum);
    }
    
	public static void main(String args[]) {
      int a = 40, b = 50;
      Main sample = new Main();
      sample.plus(a, b);
      sample.minus(a, b);
      sample.multi(a, b);
   }
}