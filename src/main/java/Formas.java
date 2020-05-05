// importamos la libreria proncipal
import processing.core.PApplet;

/**
 * Esta será nuestra clase principal
 * Hererda de PApplet, que es la clase padre que tiene todos los métodos
 * y atributos para usar Processing
 * Desde este fichero si le damos al triangulito verde a la izquierda
 * podemos ejecutar esta clase sin ser 'main'
 */
public class Formas extends PApplet {
    // definimos atributos para todoa la clase
    // es la ventana de salida de la aplicacion
    // en Processing las aplicaciones se llaman sketchs
    int viewport_w = 640; // ancho en pixels
    int viewport_h = 360; // alto en pixels

    // truco para poder ejecutar nuestro código
    // en el entorno gráfico ya creado
    public static void main(String args[]) {
        PApplet.main("Formas");
    }

    // método que tiene las configuraciones iniciales
    @Override
    public void settings() {
        size(viewport_w, viewport_h, P2D);
        smooth(8);
    }

    // en este metodo tambien podemos meter configuraciones iniciales de nuestro sketch
    @Override
    public void setup() {
    }

    // método principal. Aqui estará el grueso de nuestro código
    // sería equivalente a un 'main'
    // la DIFERENCIA principal es que se ejecuta en bucle
    // es decir, se repite el código infinitamente
    @Override
    public void draw() {
        background(136,182,188);
        stroke(46, 13, 222);
        if (mousePressed) {
            fill(227,231,30);
        } else {
            fill(241,103,5);
        }
        rect(125, 45, 250, 300);
        stroke(234,234,243);
        fill(109,100,100);
        ellipse(275, 120, 70, 70);
        stroke(241,232,233);
        fill(106,2,67);
        ellipse(mouseX, 220, 250, 100);
        stroke(246,239,245);
        fill(109,100,100);
        ellipse(mouseX, 120, 70, 70);
    }
}