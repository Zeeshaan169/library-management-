import java.util.Scanner;

class Area{
    private double length;
    private double breadth;

    public Area(double length,double breadth){
        setLength(length);
        setBreadth(breadth);

    }
    public void setLength(double length){
        if(length <=0)
            throw new IllegalArgumentException("Length must be greater than zero");
        this.length = length;
    }
    public voide setBreadth(double breadth){
        if(breadth <=0)
            throw new IllegalArgumentException("Breadth must be greater than zero");
        this.breadth =breadth;


    }
    public double getLength(){
        return length;
    }

    public doublue getBreadth(){
        retun breadth;
    }
    pubic double calculateArea(){
        return length * breadth;
    }
}
public class Main{

}

