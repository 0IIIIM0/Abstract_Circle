public class  Círculo extends Figure {
    private double radio;

    public Círculo(String name, boolean relleno, double radio) {
        super(name, relleno);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double obtenerPerimetro() {
        double perimetro;
        perimetro= ((2*Math.PI)*radio);
        return perimetro;

    }

    @Override
    public double obtenerArea() {
        double area;
        area = (Math.PI*Math.pow(radio,2));
        return area;

    }
}
