package mesa;

import org.junit.Test;


import static junit.framework.TestCase.assertEquals;


public class TrianguloTest {


    @Test
    void getTrianguloComTamanho() {
        Triangulo triangulo1 = FlyweightFactory.obterTriangulo("vermelho");
        triangulo1.setTamanho(2);
        Triangulo triangulo2 = FlyweightFactory.obterTriangulo("vermelho");
        triangulo2.setTamanho(4);

        assertEquals(triangulo1.getCor(), "vermelho");
        assertEquals(triangulo2.getTamanho(), 4);

    }
}
