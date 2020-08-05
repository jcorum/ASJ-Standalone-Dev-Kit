public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

/*
    public double distanceFromOrigin(){
        return 1.5;
    }
*/

    public double distanceFromOrigin(){
        double distance = Math.sqrt(x*x + y*y);
        return distance;
    }

    public String getQuadrant() {
        if (x > 0 && y > 0) {
            return "in quadrant 1";
        } else if (x<0 && y>0){
            return "in quadrant 2";
        } else if (x<0 && y<0){
            return "in quadrant 3";
        } else if (x>0 && y<0){
            return "in quadrant 4";
        } else if ((x==0 && y!=0) || (y==0 && x!=0)){
            return "on axis";
        } else if (x==0 && y==0) {
            return "at the origin";
        }
        else {
            return null;
        }

    }


}
