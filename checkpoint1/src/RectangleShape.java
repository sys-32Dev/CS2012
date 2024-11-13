public class RectangleShape {
    private double w;
    private double h;

    public RectangleShape() {
        w = 1.0;
        h = 1.0;
    }

    public RectangleShape(double w, double h) {
        if (h <= 0) {
            this.h = 1;
        }
        else {
            this.h = h;
        }
        if (w <= 0) {
            this.w = 1;
        }
        else {
            this.w = w;
        }
    }


    public double getW() {
        return w;
    }
    public double getH() {
        return h;
    }

    public void setW(double w) {
        if (w <= 0) {
            this.w = 1;
        }
        else {
            this.w = w;
        }
    }
    public void setH(double h) {
        if (h <= 0) {
            this.h = 1;
        }
        else {
            this.h = h;
        }
    }

    public double getArea() {
        return h * w;
    }

    public String toString() {
        return "RectangleShape("+ w + ", " + h + ")";
    }

    public double compareRectangles(RectangleShape rs) {
        double d1 = getArea();
        double d2 = rs.getArea();
        if (Double.compare(d1, d2) == 0) {

            return 0;
        } else if (Double.compare(d1, d2) < 0) {

            return -1;
        } else {

            return 1;
        }
    }
}
