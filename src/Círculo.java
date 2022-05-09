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
        return 0;
    }

    @Override
    public double obtenerArea() {
        return 0;
    }
}
