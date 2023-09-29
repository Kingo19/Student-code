package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

abstract class Wall {
    private final String name;
    private final String color;

    public Wall(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public abstract int getArea();

    @Override
    public String toString() {
        return name + " (" + getColor() + ") " + getClass().getSimpleName().toLowerCase();
    }
}

class RectangleWall extends Wall {
    private final int length;
    private final int height;

    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        return length * height;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + getLength() + "x" + getHeight() + ") rectangle";
    }
}

class SquareWall extends RectangleWall {
    public SquareWall(String name, String color, int sideLength) {
        super(name, color, sideLength, sideLength);
    }

    @Override
    public String toString() {
        return super.toString().replace("rectangle", "square");
    }
}

class TriangleWall extends Wall {
    private final int base;
    private final int height;

    public TriangleWall(String name, String color, int base, int height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + getBase() + "x" + getHeight() + ") triangle";
    }
}

public class PaintCalculator {
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        List<Wall> walls = new ArrayList<Wall>();

        while (true) {
            System.out.println("[1] Add a wall");
            System.out.println("[2] Calculate paint required (and Exit)");
            System.out.print("Please choose >>> ");
            String userChoice = userInput.nextLine();

            System.out.println();

            if (userChoice.equals("1")) {
                Wall newWall = null;

                System.out.println("What's the name of the new wall?");
                String name = userInput.nextLine();

                System.out.println("What color is the wall?");
                String color = userInput.nextLine();

                System.out.println("What kind of wall?");
                System.out.println("[1] Rectangle");
                System.out.println("[2] Square");
                System.out.println("[3] Triangle");
                String shapeChoice = userInput.nextLine();

                if (shapeChoice.equals("1")) {
                    System.out.println("Enter wall height >>> ");
                    int height = Integer.parseInt(userInput.nextLine());
                    System.out.println("Enter wall length >>> ");
                    int length = Integer.parseInt(userInput.nextLine());
                    newWall = new RectangleWall(name, color, length, height);
                } else if (shapeChoice.equals("2")) {
                    System.out.println("Enter wall side length >>> ");
                    int sideLength = Integer.parseInt(userInput.nextLine());
                    newWall = new SquareWall(name, color, sideLength);
                } else if (shapeChoice.equals("3")) {
                    System.out.println("Enter wall height >>> ");
                    int height = Integer.parseInt(userInput.nextLine());
                    System.out.println("Enter wall base >>> ");
                    int base = Integer.parseInt(userInput.nextLine());
                    newWall = new TriangleWall(name, color, base, height);
                }

                System.out.println("Added " + newWall + " - " + newWall.getArea() + " square feet");
                walls.add(newWall);
            } else if (userChoice.equals("2")) {
                Map<String, Integer> colorChoiceAreas = new TreeMap<>();
                int totalArea = 0;

                for (Wall wall : walls) {
                    System.out.println(wall);
                    System.out.println("Area: " + wall.getArea() + " square feet");
                    totalArea += wall.getArea();
                    colorChoiceAreas.put(wall.getColor(),
                            colorChoiceAreas.getOrDefault(wall.getColor(), 0) + wall.getArea());
                }

                System.out.println("===============================");
                System.out.println("Total Area: " + totalArea + " square feet");

                // 1 gallon of paint covers 400 square feet
                for (Map.Entry<String, Integer> colorEntry : colorChoiceAreas.entrySet()) {
                    double gallonsRequiredForColor = (double) colorEntry.getValue() / 400;
                    System.out.println(colorEntry.getKey() + " Paint Required: "
                            + gallonsRequiredForColor + " gallons");
                }

                return;
            }
        }
    }
}
