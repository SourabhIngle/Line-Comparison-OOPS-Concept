package com.linecomparison;

import java.util.Scanner;

public class OOPSLineComparisonUC4 extends Line implements Line.LineCompare {
    public float getLength() {
        return (float) Math.sqrt(Math.pow(pt1.x - pt2.x, 2) + Math.pow(pt1.y - pt2.y, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        OOPSLineComparisonUC4 line1=new OOPSLineComparisonUC4();
        OOPSLineComparisonUC4 line2=new OOPSLineComparisonUC4();
        OOPSLineComparisonUC4 line3=new OOPSLineComparisonUC4();


        System.out.println("Enter Co-ordinates for line 1");
        line1.pt1=new Point();
        line1.pt1.x=sc.nextInt();
        line1.pt1.y=sc.nextInt();
        line1.pt2=new Point();
        line1.pt2.x = sc.nextInt();
        line1.pt2.y = sc.nextInt();
        System.out.println("length of line 1: "+line1.getLength());

        System.out.println("Enter Co-ordinates for line 2");
        line2.pt1=new Point();
        line2.pt1.x=sc.nextInt();
        line2.pt1.y=sc.nextInt();
        line2.pt2=new Point();
        line2.pt2.x=sc.nextInt();
        line2.pt2.y=sc.nextInt();
        System.out.println("length of line 2: "+line2.getLength());

        line3.checkingLineEqualGreaterSmaller((double) line1.getLength(),(double) line2.getLength());
        line3.checkingLineCompareToMethod((double) line1.getLength(),(double) line2.getLength());
    }
    @Override
    public void checkingLineEqualGreaterSmaller(Double length1 ,Double length2){
        if (length1.equals(length2))
            System.out.println("Lines are equal. ");
        else
            System.out.println("Lines are not equal.");
    }

    public void checkingLineCompareToMethod(Double length1 , Double length2){
        if (length1.compareTo(length2) == 1)
            System.out.println("Line 1 is Greater than Line 2 ");
        else if (length1.compareTo(length2) == -1)
            System.out.println("Line 1 is Less than Line 2 ");
        else
            System.out.println("Both lines are Equals");
    }
}

class Point {
    int x, y;
}

class Line {
    Point pt1, pt2;

     interface LineCompare {
        default void checkingLineEqualGreaterSmaller(Double length1, Double length2){}
    }
}