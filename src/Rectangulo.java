public class Rectangulo extends Figure{
    private double ancho;
    private double alto;

    public Rectangulo(String name, boolean relleno, double ancho, double alto) {
        super(name, relleno);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
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
