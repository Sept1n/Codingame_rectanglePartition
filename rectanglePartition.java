import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        int countX = in.nextInt();
        int countY = in.nextInt();
        ArrayList<Integer> inX = new ArrayList<>();
        ArrayList<Integer> inY = new ArrayList<>();
        for (int i = 0; i < countX; i++) {
            int x = in.nextInt();
            inX.add(x);
        }
        //System.err.println();
        for (int i = 0; i < countY; i++) {
            int y = in.nextInt();
            inY.add(y);
        }
        inX.add(w);
        inX.add(0);
        inY.add(h);
        inY.add(0);
        ArrayList<Integer> actualDiffX = new ArrayList<>();
        ArrayList<Integer> actualDiffY = new ArrayList<>();
        Collections.sort(inX, Collections.reverseOrder());
        Collections.sort(inY, Collections.reverseOrder());

        for (int i = 0; i < inX.size(); i++) {
            for (int j = i + 1; j < inX.size(); j++) {
                actualDiffX.add(inX.get(i) - inX.get(j));
            }
        }
        for (int i = 0; i < inY.size(); i++) {
            for (int j = i + 1; j < inY.size(); j++) {
                actualDiffY.add(inY.get(i) - inY.get(j));
            }
        }
        System.err.println(actualDiffX);
        System.err.println(actualDiffY);
        int count = 0;
        for (int i = 0; i < actualDiffX.size(); i++) {
            for (int j = 0; j < actualDiffY.size(); j++) {
                if (actualDiffX.get(i).equals(actualDiffY.get(j))) {
                    count++;
                }
            }
        }

        System.out.print(count);

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        //System.out.println("0");
    }
}