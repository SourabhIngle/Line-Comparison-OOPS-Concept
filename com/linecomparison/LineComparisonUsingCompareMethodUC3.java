package com.linecomparison;

import java.util.Scanner;

public class LineComparisonUsingCompareMethodUC3 implements Line.LineCompare {
    public void checkingLineEqualGreaterSmaller(Double length1 ,Double length2){
        if (length1.compareTo(length2) == 1)
            System.out.println("Line 1 is Greater than Line 2 ");
        else if (length1.compareTo(length2) == -1)
            System.out.println("Line 1 is Less than Line 2 ");
        else
            System.out.println("Both lines are Equals");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter the Co-ordinates of x2 and y2 :");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        Double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("Enter the Co-ordinates of x3 and y3 :");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        System.out.println("Enter the Co-ordinates of x4 and y4 :");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        Double length2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

        System.out.println("Length of first Line = " + length1);
        System.out.println("Length of second Line = " + length2);

       LineComparisonUsingCompareMethodUC3 obj = new LineComparisonUsingCompareMethodUC3();
       obj.checkingLineEqualGreaterSmaller(length1,length2);
    }
}
