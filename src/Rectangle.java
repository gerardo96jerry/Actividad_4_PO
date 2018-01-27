public class Rectangle extends Shape{
    //Atributos
    protected double width;
    protected double length;
    //Métodos

    //Constructores
    public Rectangle (){
        super();
        this.width=0.0;
        this.length=0.0;
    }
    public Rectangle (String color, boolean filled, double width, double length){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth(){
        return  this.width;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public double getLength(){
        return this.length;
    }

    public void setLength(){
        this.length=length;
    }

    @Override
    public double getArea(){
        return width * length;
    }
    @Override
    public double getPerimeter(){
        return width + length;
    }

    @Override
    public String toString(){
        String relleno;
        if (this.filled)relleno=" está relleno\n"; else relleno=" no está relleno\n";
        return "El rectangulo es color " + this.color + relleno;
    }

}