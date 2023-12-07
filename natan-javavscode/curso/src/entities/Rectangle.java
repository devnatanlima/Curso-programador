package entities;

public class Rectangle {
    public double height;
    public double width;

public double area(){
    return  width * height;
}

public double perimeter() {
    return (width + height) *2;

}

public double diagonal() {
    return Math.sqrt(width*width + height*height);
}
public String valorArea() {
    return String.format("AREA : %.2f", area());
}
public String valorPerimeter() {
    return String.format("PERIMETER: %.2f", perimeter());
}
public String valorDiagonal() {
    return String.format("DIAGONAL : %.2f", diagonal());
}


}
