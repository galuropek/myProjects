package practice.practiceBook;

abstract class ColoredFigure {

    private String color;
    int size;

    ColoredFigure(String color, int size) {
        this.color = color;
        this.size = size;
    }

    void show() {
        System.out.println("Figure: " + color + " " + getName());
        System.out.println("Typical size (" + getSizeName() + "): " + size);
        System.out.printf("Area: %3f\n", getArea());
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            line.append("*");
        }
        System.out.println(line);
    }

    String getSizeName() {
        return "side";
    }

    abstract String getName();

    abstract double getArea();
}

class Triangle extends ColoredFigure {

    Triangle(String color, int size) {
        super(color, size);
    }

    @Override
    String getName() {
        return "triangle";
    }

    @Override
    double getArea() {
        double k = Math.sqrt(3) / 4;
        return size * size * k;
    }
}

class Square extends ColoredFigure {

    Square(String color, int size) {
        super(color, size);
    }

    @Override
    String getName() {
        return "square";
    }

    @Override
    double getArea() {
        double k = 1;
        return size * size * k;
    }
}

class Circle extends ColoredFigure {

    Circle(String color, int size) {
        super(color, size);
    }

    @Override
    String getName() {
        return "circle";
    }

    @Override
    double getArea() {
        double k = Math.PI;
        return size * size * k;
    }

    @Override
    String getSizeName() {
        return "radius";
    }
}

public class UsingAbstractClassApplication243 {

    public static void main(String[] args) {
        Triangle triangle = new Triangle("red", 2);
        Square square = new Square("black", 3);
        Circle circle = new Circle("yellow", 1);
        System.out.println("Использование объектных переменных подкласса");
        triangle.show();
        square.show();
        circle.show();
        ColoredFigure figure;
        System.out.println("Использование объектной еперменной аюстрактного суперкласса");
        figure = triangle;
        figure.show();
        figure = square;
        figure.show();
        figure = circle;
        figure.show();
    }
}
