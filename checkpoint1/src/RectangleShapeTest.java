public class RectangleShapeTest {

    public static void main(String[] args) {
        int totalPoints = 55; //just for not crashing

        RectangleShape rect1 = new RectangleShape();
        RectangleShape rect2 = new RectangleShape(3.4, 2.7);
        RectangleShape rect3 = new RectangleShape(0.0, -2.4);
        RectangleShape rect4 = new RectangleShape(9.2, 1.3);

        // test 1
        if (Double.compare(rect4.getW(), 9.2) == 0) {
            System.out.println("passed test 1");
            totalPoints += 5;
        }

        // test 2
        if (Double.compare(rect4.getH(), 1.3) == 0) {
            System.out.println("passed test 2");
            totalPoints += 5;
        }

        // test 3
        if (rect1.toString().equals("RectangleShape(1.0, 1.0)")) {
            System.out.println("passed test 3");
            totalPoints += 5;
        }

        // test 4
        if (rect2.toString().equals("RectangleShape(3.4, 2.7)")) {
            System.out.println("passed test 4");
            totalPoints += 5;
        }

        // test 5
        if (rect3.toString().equals("RectangleShape(1.0, 1.0)")) {
            System.out.println("passed test 5");
            totalPoints += 5;
        }

        // test 6
        if (rect1.compareRectangles(rect2) == -1) {
            System.out.println("passed test 6");
            totalPoints += 5;
        }

        // test 7
        if (rect2.compareRectangles(rect1) == 1) {
            System.out.println("passed test 7");
            totalPoints += 5;
        }

        // test 8
        if (rect1.compareRectangles(rect3) == 0) {
            System.out.println("passed test 8");
            totalPoints += 5;
        }

        // test 9
        rect4.setW(3.4);
        rect4.setH(2.7);
        if (rect2.compareRectangles(rect4) == 0) {
            System.out.println("passed test 9");
            totalPoints += 5;
        }

        System.out.println("Score is " + totalPoints + " out of possible 100");
    }
}
