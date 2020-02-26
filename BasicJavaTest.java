import java.util.ArrayList;

public class BasicJavaTest {
  public static void main(String[] args) {
    BasicJava arr255 = new BasicJava();
    arr255.print1To255();

    BasicJava odd255 = new BasicJava();
    odd255.printOdd();

    BasicJava sum255 = new BasicJava();
    sum255.printSum();

    BasicJava iteArr = new BasicJava();
    int[] arr={1,3,5,7,9,13};
    iteArr.iteratingArray(arr);

    BasicJava max = new BasicJava();
    int[] maxArr = {-3, -5, -7};
    max.findMax(maxArr);

    BasicJava avg = new BasicJava();
    int[] avgArr = {2, 10, 3};
    max.getAverage(avgArr);

    BasicJava oddArr = new BasicJava();
    oddArr.arrOdd();

    BasicJava Y = new BasicJava();
    int[] yArr = {1, 3, 5, 7};
    Y.greaterThanY(yArr, 3);

    BasicJava sq = new BasicJava();
    ArrayList<Integer> sqArr = new ArrayList<Integer>(){{
      add(1);
      add(5);
      add(10);
      add(-2);
    }};
    sq.square(sqArr);

    BasicJava neg = new BasicJava();
    ArrayList<Integer> negArr = new ArrayList<Integer>(){{
      add(1);
      add(5);
      add(10);
      add(-2);
    }};
    neg.removeNegatives(negArr);

    BasicJava mma = new BasicJava();
    int[] mmaArr = {1, 5, 10, -2};
    mma.maxMinAvg(mmaArr);

    BasicJava shift = new BasicJava();
    ArrayList<Integer> shiftArr = new ArrayList<Integer>(){{
      add(1);
      add(5);
      add(10);
      add(7);
      add(-2);
    }};
    shift.shift(shiftArr);
  };
}