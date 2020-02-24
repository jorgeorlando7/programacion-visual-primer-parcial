package GeometricFigure;

public class UseGeometric {
    public static void main(String[] args){
        GeometricFigure figures[]=new GeometricFigure[2];
        Square s1=new Square(10,44);
        Triangle t1=new Triangle(14,33);
        figures[0]=s1;
        figures[1]=t1;
    System.out.println(Arrays.toString(figures));
        
    }
    
}