package demonstration2;

public class Box {

    private double width;
    private double height;
    private double depth;

    public Box (double w, double h, double d){

        this.width = w;
        this.height = h;
        this.depth = d;
    }

    public Box (double len){

        this.width = this.height = this.depth = len;
    }

    public double volume (){

        return width * height * depth;
    }
}
