package by.popkov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        shapes.add(new CustomShape(100));

        Collections.sort(shapes, Comparator.comparing(Shape::getArea));
        return shapes;
    }

    public static void main(String[] args) {
        System.out.println(new SortableShapes().sortShape());
    }
}

interface Shape {
    public double getArea();
}


class Square implements Shape {
    private double side;
    private double area;

    public Square(double side) {
        this.side = side;
        this.area = Math.pow(side, 2);
    }

    @Override
    public double getArea() {
        return area;
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;
    private double area;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.area = width * height;
    }

    @Override
    public double getArea() {
        return area;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;
    private double area;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.area = base * height / 2;
    }

    @Override
    public double getArea() {
        return area;
    }
}

class Circle implements Shape {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double getArea() {
        return area;
    }
}

class CustomShape implements Shape {
    private double area;

    public CustomShape(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}