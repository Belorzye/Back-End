import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiguraTest {

    private Figura quadrado;

    private Figura circulo;

    @BeforeEach
    void doBefore() {
        circulo = new Circulo(2);
        quadrado = new Quadrado(2);
    }

    @Test
    void getPerimetroCirculo() {
        double perimetroCirculo = circulo.calcularPerimetro(); //valorPerimetro = 12,566
        assertEquals(12.566, perimetroCirculo);
    }

    @Test
    void getPerimetroQuadrado() {
        double perimetroQuadrado = quadrado.calcularPerimetro(); //valorPerimetro = 8
        assertEquals(8, perimetroQuadrado);
    }
}
