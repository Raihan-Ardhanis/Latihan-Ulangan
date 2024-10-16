package Shepe;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle() {
        super();
        length = 0;
        width = 0;
    }

    public Rectangle(String name, String color, int length, int width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void luas (int length, int width){
        System.out.println("Luas: "+length * width);
    }

    public void print() {
        super.print();
        System.out.println("Length :" + length);
        System.out.println("Width :" + width);
    }

}
