package com.Bridgelab.assignment;
 class Line{
    protected double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calculateLength() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}

class LineComparison extends Line {
    public LineComparison(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }

    public void compareLines(Line line2) {
        double length1 = this.calculateLength();
        double length2 = line2.calculateLength();

        if (length1 == length2) {
            System.out.println("Both lines are equal in length.");
        } else if (length1 > length2) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 2 is longer than Line 1.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LineComparison line1 = new LineComparison(1, 2, 4, 6);
        LineComparison line2 = new LineComparison(2, 3, 5, 7);

        line1.compareLines(line2);
    }
}
