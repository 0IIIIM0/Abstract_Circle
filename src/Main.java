public class Main {
    public static void main(String[] args) {
        //todo clase padre figura, será abstracta
        //color string, relleno booleano
        //constructor para los dos parametros
        //getters y setters
        //obtener Area -> abstracto, que retorne doble
        //obtenerPerímetro -> abstracto, que retorne doble

        //ToDo class circle
        //radio doble
        //constructor hereda super e incluye el radio
        //getters y setters
        //implementar obtenerArea
        //implementar obtenerPerimetro


        //ToDo clase rectangulo
        //ancho dpuble , alto double
        //constructor que hereda super, e incluye ancho y alto
        //getters and setter
        //implementar obtenerArea
        //implementar obtenerPerimetro

        Círculo circulo = new Círculo("azul",false,15.62);
        Rectangulo rectangulo = new Rectangulo("amarillo",true,19.85,45.60);

        System.out.println(rectangulo.obtenerArea());
        System.out.println(circulo.obtenerPerimetro());
    }
}
