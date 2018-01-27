public class Circle extends Shape{
    //Atributos
            protected double radious;
    //Métodos
            //Constructores
            public Circle (){
                super();
                this.radious=0.0;
            }
    public Circle (String color, boolean filled, double radious){
                super(color,filled);
                this.radious=radious;
            }

            public double getRadious(){
                return  this.radious;
            }

            public void setRadious(double radious){
                this.radious=radious;
            }
    @Override
    public double getArea(){
                return 3.1416 * Math.pow(this.radious,2);
            }
    @Override
    public double getPerimeter(){
                return 2.1416 * radious;
            }

            @Override
    public String toString(){
                String relleno;
                if (this.filled)relleno=" está relleno\n"; else relleno=" no está relleno\n";
                return "El círculo es color " + this.color + relleno;
            }

        }