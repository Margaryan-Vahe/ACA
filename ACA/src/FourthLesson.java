public class FourthLesson {
    public static void main(String[] args) {
        Point point_1 = new Point(0,0);
        Point point_2 = new Point(1, 1);
        Point point_3 = point_1;

        point_1.printInfo();
        point_2.printInfo();
        point_3.printInfo();
        point_1.x = 100;
        point_1.y = 105;
        point_2.x = 200;
        point_2.y = 205;
        point_3.x = 12312;
        point_1.printInfo();
        point_2.printInfo();
        point_3.printInfo();

        Point[] newPoint = new Point[4];
        newPoint[0].x = 5;
        newPoint[0].y = 15;

        System.out.println(newPoint[0].x);

    }

}
class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void printInfo (){
        System.out.printf("\nX value is: %d and Y value is: %d", x,y);
    }
}