package Shepe;

public class Cube extends Rectangle {
    private int height;


    public Cube(){
        super();
        height= 0;
    }
    public Cube(String name, String color,int length, int width, int height){
        super(name, color, length, width);
        this.height = height;       
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void print(){
        super.print();
        System.out.println("Height : "+height);
    }
    public void luas(int length, int width, int height){
        System.out.println("Luas: "+ length*width*height);
    }

    

}
