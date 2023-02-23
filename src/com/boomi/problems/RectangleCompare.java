package com.boomi.problems;

public class RectangleCompare {
    public static void main(String[] args) {
        RectanglePlus rect1 = new RectanglePlus(1,2);
        RectanglePlus rect2 = new RectanglePlus(2,3);

        System.out.println(rect1.isLargerThan(rect2));

        RectanglePlus largeRect = (RectanglePlus) new RectanglePlus().findLargest(rect1,rect2);

        RectanglePlus smallRect = (RectanglePlus) new RectanglePlus().findSmallest(rect1,rect2);

        boolean checkEquals =  new RectanglePlus().isEqual(rect1,rect2);

        System.out.println(largeRect.getArea());
        System.out.println(smallRect.getArea());
        System.out.println(checkEquals);


    }
}
