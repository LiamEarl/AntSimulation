package org.example.main;

import Vector.Vec2d;
import World.Point;
import processing.core.PApplet;

import java.util.List;

import static World.Pathfinding.FindPath;

public class Simulation extends PApplet {
    public enum antClasses {
        QUEEN,
        SOLDIER,
        WORKER,
    }

    Vec2d test = new Vec2d(200, 150);
    Vec2d two = new Vec2d(25, 100);

    public void settings() {
        size(600, 600);
    }
    public void setup() {

        int[][] map = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 0, 1}
        };

        Point start = new Point(0, 0, null);
        Point end = new Point(3, 4, null);
        List<Point> path = FindPath(map, start, end);
        if (path != null) {
            for (Point point : path) {
                System.out.println(point);
            }
        }
        else
            System.out.println("No path found");

    }
    public void draw() {
        background(255);
    }

    public static void main(String[] args) {
        String[] appletArgs = new String[] {Simulation.class.getName()};
        PApplet.main(appletArgs);
    }
}