package ServiceLane;

/**
 * Created by SKG on 17-Jul-14.
 */
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;

public class ServiceLane {
  public static void main(String args[])  {
    Scanner scanner = new Scanner(new InputStreamReader(System.in));
    String[] inputLineOne = scanner.nextLine().split(" ");
    Integer freeWayLength = Integer.parseInt(inputLineOne[0]);
    Integer testCase = Integer.parseInt(inputLineOne[1]);

    String[] inputLineTwo = scanner.nextLine().split(" ");
    int[] width = new int[freeWayLength];
    for(int i=0; i<freeWayLength; i++){
      width[i] = Integer.parseInt(inputLineTwo[i]);
    }

    int startSegment, endSegment;

    for(int y=0; y<testCase; y++){
      String[] inputTextCase = scanner.nextLine().split(" ");
      startSegment = Integer.parseInt(inputTextCase[0]);
      endSegment = Integer.parseInt(inputTextCase[1]);
      int output = width[startSegment];
      startSegment++;
      while(startSegment <= endSegment){
        if(output > width[startSegment])
          output = width[startSegment];
        startSegment++;
      }
      System.out.println(output);
    }
  }
}
