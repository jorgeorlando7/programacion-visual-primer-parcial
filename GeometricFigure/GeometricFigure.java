package GeometricFigure;

public abstract class GeometricFigure {
    public int height, width;
    public String figureType;
    public int area;
    abstract void getArea(int h, int w);
    
    public String toString(){
        return("h: "+height+" w: "+width+" area: "+area);
    }
    
}