import java.util.Scanner;

public class Rectangle {
    private int width;
    private int height;

    private Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    private int getArea(){
        return width * height;
    }

    private int getPerimeter(){
        return 2 * (width + height);
    }

    private String display(){
        return "Rectangle{" + "width = " + width + ", height = " + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("Enter height: ");
        int height = scanner.nextInt();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}

