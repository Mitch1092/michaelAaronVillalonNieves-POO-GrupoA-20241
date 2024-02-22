public class Rectangle {
    public double lenght;
    public double height;

    public Rectangle(double lenght, double height){
        this.lenght = lenght;
        this.height = height;
    }
    public String getAreaPerimeter(){
        return String.format("Lenght: %.2f, Height: %.2f, Area: %.2f, Perimeter: %.2f \n", lenght, height, lenght*height, (lenght*2)+(height*2));
    }
}