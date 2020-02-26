import java.util.ArrayList;

public class BasicJava {
  public void print1To255(){
    for(int num = 1; num <= 255; num++){
      System.out.println(num);
    }
  };

  public void printOdd(){
    for(int odd = 1; odd <= 255; odd+=2){
      System.out.println(odd);
    }
  };

  public void printSum(){
    int sum = 0;
    for(int num = 0; num <= 255; num++){
      sum += num;
      System.out.println("New number: " + num + " Sum: " + sum);
    }
  };

  public void iteratingArray(int[] arr){
    for (int element : arr){
      System.out.println(element);
    }
  };

  public void findMax(int[] arrMax){
    int max = arrMax[0];
    for (int num : arrMax){
      if (num > max){
        max = num;
      }
    }
    System.out.println(max);
  };

  public void getAverage(int[] arrAvg) {
    int avgSum = 0;
    for (int element : arrAvg){
      avgSum += element;
    };
    int avg = avgSum/arrAvg.length;
    System.out.println(avg);
  };

  public void arrOdd() {
    ArrayList<Integer> y = new ArrayList<Integer>();
    for (int num = 1; num <= 255; num+=2){
      y.add(num);
    }
    System.out.println(y);
  }

  public void greaterThanY(int[] arrY, int y) {
    int counter = 0;
    for (int element : arrY){
      if (element > y){
        counter ++;
      };
    };
    System.out.println(counter);
  }

  public void square(ArrayList<Integer> arrSq){
    for (int i = 0; i < arrSq.size(); i++){
      int sqaureNum = arrSq.get(i) * arrSq.get(i);
      arrSq.set(i, sqaureNum);
    };
    System.out.println(arrSq);
  } 

  public void removeNegatives(ArrayList<Integer> arrNeg) {
    for (int i = 0; i < arrNeg.size(); i++){
      if (arrNeg.get(i) < 0){
        arrNeg.set(i, 0);
      }
    }
    System.out.println(arrNeg);
  };

  public void maxMinAvg(int[] mma) {
    int max = mma[0];
    int min = mma[0];
    int sum = 0;
    for (int num : mma){
      if (num > max){
        max = num;
      }
      if (num < min){
        min = num;
      }
      sum += num;
    }
    int avg = sum / mma.length;
    System.out.println(max);
    System.out.println(min);
    System.out.println(avg);
  };

  public void shift(ArrayList<Integer> arrShift) {
    for (int i = 0; i < arrShift.size()-1; i++){
      arrShift.set(i, arrShift.get(i+1));
    }
    arrShift.set(arrShift.size()-1, 0);
    System.out.println(arrShift);
  };
}