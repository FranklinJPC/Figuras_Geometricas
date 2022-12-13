public class Geometria_FranklinPatino
{
    //Constante
    private final double PI = 3.1416;

    int lados;
    double perimetro;
    double area;
    double volumen;
    Geometria_FranklinPatino()
    {
        lados = 3;
        perimetro = 0.00;
        area = 0.00;
        volumen = 0.00;
    }

    public double getPI() {
        return PI;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    // PERIMETROS
    public double PerimetroSemejante(int lado, double medida)
    {
        return lado * medida;
    }
    public double PerimetroParalelogramoCometa(double ladoA, double ladoB)
    {
        return 2*(ladoA + ladoB);
    }
    public double PerimetroTrapecio(double ladoInf, double ladoSup, double ladoA, double ladoB) {
        return ladoInf + ladoSup + ladoA + ladoB;
    }
    public double PerimetroCirculo(double radio)
    {
        return 2 * PI * radio;
    }

    //AREAS
    public double AreaTriangulo(double base, double altura)
    {
        return ((base * altura)/2);
    }
    public double AreaCuadrado(double lado)
    {
        return Math.pow(lado, 2);
    }
    public double AreaRomboCometa(double ladoLargo, double ladoCorto)
    {
        return ((ladoCorto * ladoLargo) / 2);
    }
    public double AreaCirculo(double radio)
    {
        return PI * Math.pow(radio,2);
    }
    public double AreaParalelogramo(double base, double altura)
    {
        return base * altura;
    }
    public double AreaTrapecio(double ladoInf, double ladoSup, double altura)
    {
        return (((ladoInf * ladoSup) * altura) / 2);
    }

    //VOLUMEN
    public double VolumenCubo(double lado)
    {
        return Math.pow(lado, 3);
    }
    public double VolumenOrtoedro(double ladoA, double ladoB, double ladoC)
    {
        return ladoA * ladoB * ladoC;
    }
    public double VolumenPiramide(double base, double altura)
    {
        return ((base * altura) / 3);
    }
    public double VolumenCilindro(double radio, double altura)
    {
        return PI * Math.pow(radio, 2) * altura;
    }
    public double VolumenCono(double radio, double altura)
    {
        return (((PI * Math.pow(radio, 2)) * altura) / 3);
    }
    public double VolumenEsfera(double radio)
    {
        return 4 * PI * Math.pow(radio, 2);
    }

    //Visualizar
    public void VerDatos(String NombreFIg, int CD)
    {
        System.out.println("---" + NombreFIg + "----");
        System.out.println("Numero de lados: " + getLados());
        System.out.println("Area: " + getArea());
        System.out.println("Perimetro: " + getPerimetro());
        if (CD != -1)
            System.out.println("Volumen: " + getVolumen());
    }
}
