public class Triangle extends Shape {
    private double base;
    private double height;
    Triangle(double base, double height){
        this.base= base;
        this.height= height;
    }

    double getBase(){
        return base;
    }
    double getHeight(){
        return height;
    }
    void setBase(double height){
        this.height= height;
    }
    void setHeight(double base){
        this.base= base;
    }
    @Override
    double area(){
        return 0.5*base*height;
    }
}
