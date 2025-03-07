public class AreaPoligono {
    /*
     * Crea una única función (importante que sólo sea una) que sea capaz
     * de calcular y retornar el área de un polígono.
     * - La función recibirá por parámetro sólo UN polígono a la vez.
     * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
     * - Imprime el cálculo del área de un polígono de cada tipo.
     */

    public void calcArea(String shape, float width, float height) {
        switch (shape) {
            case "square":
                System.out.println(square(width));
                break;
            case "rectangle":
                System.out.println(rectangle(width, height));
                break;
            case "triangle":
                System.out.println(triangle(width, height));
                break;
            default:
                System.out.println("You must enter a valid shape");
        }
    }

    private float square(float side) {
        return side * side;
    }

    private float rectangle(float width, float height) {
        return width * height;
    }

    private float triangle(float side, float height) {
        return (side * height) / 2;
    }


}
