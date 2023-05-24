public class Circulo implements Figura{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
//        return 2 * Math.PI * this.raio;
        return 2 * 3.1415 * this.raio;
    }
}
