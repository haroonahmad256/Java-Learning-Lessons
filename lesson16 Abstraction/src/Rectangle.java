public class Rectangle extends Shape {
    double width;
    double height;
    Rectangle(double width, double height){
        this.height= height;
        this.width= width;
    }
    @Override
    double area(){
        return width * height;
    }
}
