import java.util.*;
interface CompareShapes {
    double area();
    double perimeter();
    int compare(Object o);
}

class Rectangle implements CompareShapes {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double area() {
        return width * height;
    }

    
    public double perimeter() {
        return 2 * (width + height);
    }

  
    public int compare(Object o) {
        if (o instanceof Rectangle) {
            Rectangle other = (Rectangle) o;
            double thisArea = this.area();
            double otherArea = other.area();

            if (thisArea < otherArea) {
                return -1;
            } else if (thisArea > otherArea) {
                return 1;
            } else {
                return 0;
            }
        }
        return 0; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Rectangle> rectangles = new ArrayList<>();

        System.out.println("Enter dimensions for 5 rectangles:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Rectangle " + i + " - Width: ");
            double width = scanner.nextDouble();
            System.out.print("Rectangle " + i + " - Height: ");
            double height = scanner.nextDouble();

            rectangles.add(new Rectangle(width, height));
        }

        Collections.sort(rectangles, new Comparator<Rectangle>() {
            
            public int compare(Rectangle r1, Rectangle r2) {
                return r1.compare(r2);
            }
        });

        System.out.println("Rectangles sorted by area:");
        for (Rectangle rectangle : rectangles) {
            System.out.println("Area: " + rectangle.area() + ", Perimeter: " + rectangle.perimeter());
        }

        scanner.close();
    }
}
