package org.launchcode;

import java.util.Scanner;
public class Area {


        public static void main(String[] args ){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the radius");
            double radius =input.nextDouble();
            System.out.println(Circle.getArea(radius));

        }
    }


