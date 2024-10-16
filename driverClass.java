package Shepe;

import java.util.Scanner;

public class driverClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose One");
        System.out.println("1.Circle/2.Rectangle");
        int pilihan = input.nextInt();
        if (pilihan ==1) {
            System.out.println("Name: ");
            String name = input.next();
            System.out.println("Color: ");
            String color = input.next();
            System.out.println("Radius: ");
            int radius = input.nextInt();
            

            Circle cc = new Circle(name, color, radius);
            System.out.println("Circle Details");
            cc.print();
            cc.luas();
                   
        }else if(pilihan==2){
            System.out.println("Choose One");
                    System.out.println("1. Rectangle/2. Cube");
                    int pilihan2 = input.nextInt();

                    if (pilihan2==1) {
                        System.out.println("Name: ");
                        String name = input.next();
                        System.out.println("Color: ");
                        String color = input.next();
                        System.out.println("Length: ");
                        int length= input.nextInt();
                        System.out.println("Width: ");
                        int width= input.nextInt();

                       

                        Rectangle rc = new Rectangle(name, color, length, width);
                        System.out.println("Rectangle Details");
                        rc.print();
                        rc.luas(width,length);
                        
                    }else if (pilihan2==2){
                        System.out.println("Name: ");
                        String name = input.next();
                        System.out.println("Color: ");
                        String color = input.next();
                        System.out.println("Length: ");
                        int length= input.nextInt();
                        System.out.println("Width: ");
                        int width= input.nextInt();
                        System.out.println("Height");
                        int height = input.nextInt();
                        Cube cb = new Cube(name, color,length, width, height);
                        System.out.println("Cube Details");
                        cb.print();
                        cb.luas(length, width);
                        


                    } input.close();
            
        }
    }
    
}
