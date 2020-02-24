package GeometricFigure;

public class Triangle extends GeometricFigure{

    Triangle(int a, int b){
        this.height=a;
        this.width=b;
        getArea(a,b);
    }
    @Override
    public void getArea(int h, int w) {
        area=(h*w)/2;
    }
    
}