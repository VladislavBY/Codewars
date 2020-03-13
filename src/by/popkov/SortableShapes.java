package by.popkov;

import java.util.ArrayList;
import java.util.Collections;

public class SortableShapes {
    double side = 1.1234;
    double radius = 1.1234;
    double base = 5;
    double height = 2;

    public ArrayList<Shape> sortShape() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(side));
        shapes.add(new Rectangle(2, 3));
        shapes.add(new Triangle(base, height));
        shapes.add(new Circle(radius));
        shapes.add(new CustomShape(1));

        Collections.sort(shapes);
        return shapes;
    }

    public static void main(String[] args) {
        System.out.println(new SortableShapes().sortShape());
    }
}

abstract class Shape implements Comparable<Shape> {
    protected double area;

    @Override
    public int compareTo(Shape o) {
        double div = this.area - o.area;
        if (div > 0) return 1;
        else if (div < 0) return -1;
        else return 0;
    }
}


class Square extends Shape {
    public Square(double side) {
        this.area = Math.pow(side, 2);
    }
}

class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        this.area = width * height;
    }
}

class Triangle extends Shape {
    public Triangle(double base, double height) {
        this.area = base * height / 2;
    }
}

class Circle extends Shape {
    public Circle(double radius) {
        this.area = Math.pow(radius, 2) * Math.PI;
    }
}

class CustomShape extends Shape {
    public CustomShape(double area) {
        this.area = area;
    }
}