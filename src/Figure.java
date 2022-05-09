public abstract class Figure{
    protected String name;
    protected boolean relleno;

    public Figure(String name, boolean relleno) {
        this.name = name;
        this.relleno = relleno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
    public abstract double obtenerPerimetro();
    public abstract double obtenerArea();

}
