package UtopianTree;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by SKG on 21-Jul-14.
 */
public class UtopianTree {
  public static void main(String args[]){
    Scanner scanner = new Scanner(new InputStreamReader(System.in));
    int testCaseCount = scanner.nextInt();
    int[] testCase = new int[testCaseCount];
    for(int i=0; i<testCaseCount; i++){
      int treeHeight = 1;
      testCase[i] = scanner.nextInt();
      int j = 0;
      if(testCase[i]%2==0){
        while (j<testCase[i]){
          treeHeight = treeHeight * 2;
          j++;
          treeHeight++;
          j++;
        }
        System.out.println(treeHeight);
      }
      else{
        while (j<testCase[i]-1){
          treeHeight = treeHeight * 2;
          j++;
          treeHeight++;
          j++;
        }
        treeHeight = treeHeight * 2;
        System.out.println(treeHeight);
      }
    }
  }
}
