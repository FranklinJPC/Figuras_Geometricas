import java.util.Scanner;

public class Metodos
{
    Geometria_FranklinPatino figuras = new Geometria_FranklinPatino();
    Scanner scn = new Scanner(System.in);
    public void MenuInicio()
    {
            System.out.println("<-----FIGURAS GEOMETRICAS----->");
            System.out.println("A. Figuras Planas");
            System.out.println("B. Cuerpos Geometricos");
            System.out.println("X. SALIR");
            System.out.print("\nEscoga una opcion: ");
    }
    public void MenuFigurasPlanas()
    {
        System.out.println("<-----FIGURAS PLANAS----->");
        System.out.println("A. Lados Semejantes");
        System.out.println("B. Lados escalenos");
        System.out.println("C. Circulo");
        System.out.println("<. Regresar");
        System.out.println("\nEscoga una opcion: ");
    }
    public void FigurasPlanasLadosIguales()
    {
        System.out.println("<-----Lados Semejantes----->");
        System.out.println("A. Cuadrado");
        System.out.println("B. Triangulo (Equilatero)");
        System.out.println("C. Rombo");
        System.out.println("<. Regresar");
        System.out.println("\nEscoga una opcion: ");
    }
    public void FigurasPlanasLadosEscalenos()
    {
        System.out.println("<-----Lados Escalenos----->");
        System.out.println("A. Paralelogramo");
        System.out.println("B. Cometa");
        System.out.println("C. Trapecio");
        System.out.println("<. Regresar");
        System.out.println("\nEscoga una opcion: ");
    }
    public void MenuCuerpoesGeometricos()
    {
        System.out.println("<-----CUERPOS GEOMETRICOS----->");
        System.out.println("A. Cubo");
        System.out.println("B. Ortoedro");
        System.out.println("C. Piramide");
        System.out.println("D. Cilindro");
        System.out.println("E. Cono");
        System.out.println("F. Esfera");
        System.out.println("<. Regresar");
        System.out.println("\nEscoga una opcion: ");
    }
    public void Cuadrado()
    {
        Geometria_FranklinPatino cuadrado = new Geometria_FranklinPatino();
        double lado;

        System.out.println("**Cuadrado**");
        System.out.print("Ingrese el lado: ");
        lado = scn.nextDouble();
        cuadrado.setArea(figuras.AreaCuadrado(lado));
        cuadrado.setLados(4);
        cuadrado.setPerimetro(figuras.PerimetroSemejante(cuadrado.lados, lado));
        cuadrado.VerDatos("Cuadrado", -1);
    }
    public void Triangulo()
    {
        double base, altura, lado;
        Geometria_FranklinPatino triangulo = new Geometria_FranklinPatino();
        System.out.println("**Triangulo**");
        System.out.print("Ingrese la altura: ");
        altura = scn.nextDouble();
        System.out.println("Ingrese la base: ");
        base = scn.nextDouble();
        System.out.println("Ingrese el lado: ");
        lado = scn.nextDouble();
        triangulo.setLados(3);
        triangulo.setArea(figuras.AreaTriangulo(base, altura));
        triangulo.setPerimetro(figuras.PerimetroSemejante(triangulo.lados, lado));
        triangulo.VerDatos("Triangulo", -1);
    }
    public void Rombo()
    {
        double base, altura, lado;
        Geometria_FranklinPatino rombo = new Geometria_FranklinPatino();
        System.out.println("**Rombo**");
        System.out.print("Ingrese el lado: ");
        lado = scn.nextDouble();
        rombo.setArea(figuras.AreaCuadrado(lado));
        rombo.setLados(4);
        rombo.setPerimetro(figuras.PerimetroSemejante(rombo.lados, lado));
        rombo.VerDatos("Rombo", -1);
    }
    public void ParaleloGramo()
    {
        Geometria_FranklinPatino paralelogramo = new Geometria_FranklinPatino();
        double ladoA, ladoB, base, altura;
        System.out.println("**ParaleloGramo***");
        System.out.println("Ingrese lado A: ");
        ladoA = scn.nextDouble();
        System.out.println("Ingrese lado B: ");
        ladoB = scn.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = scn.nextDouble();
        System.out.println("Ingrese la base: ");
        base = scn.nextDouble();
        paralelogramo.setLados(4);
        paralelogramo.setPerimetro(figuras.PerimetroParalelogramoCometa(ladoA, ladoB));
        paralelogramo.setArea(figuras.AreaParalelogramo(base, altura));
        paralelogramo.VerDatos("Paralelogramo", -1);
    }
    public void Cometa()
    {
        Geometria_FranklinPatino cometa = new Geometria_FranklinPatino();
        double ladoA, ladoB;
        System.out.println("**Cometa***");
        System.out.println("Ingrese lado A: ");
        ladoA = scn.nextDouble();
        System.out.println("Ingrese lado B: ");
        ladoB = scn.nextDouble();
        cometa.setLados(4);
        cometa.setArea(figuras.AreaRomboCometa(ladoA, ladoB));
        cometa.setPerimetro(figuras.PerimetroParalelogramoCometa(ladoA, ladoB));
        cometa.VerDatos("Cometa", -1);
    }
    public void Trapecio()
    {
        Geometria_FranklinPatino trapecio = new Geometria_FranklinPatino();
        double ladoA, ladoB, ladoInf, ladoSup, altura;
        System.out.println("**ParaleloGramo***");
        System.out.println("Ingrese lado A: ");
        ladoA = scn.nextDouble();
        System.out.println("Ingrese lado B: ");
        ladoB = scn.nextDouble();
        System.out.print("Ingrese lado inferior: ");
        ladoInf = scn.nextDouble();
        System.out.println("Ingrese lado superior: ");
        ladoSup = scn.nextDouble();
        System.out.println("Altura: ");
        altura = scn.nextDouble();
        trapecio.setLados(4);
        trapecio.setArea(figuras.AreaTrapecio(ladoInf, ladoSup, ladoA));
        trapecio.setPerimetro(figuras.PerimetroTrapecio(ladoInf, ladoSup, ladoA, ladoB));
        trapecio.VerDatos("Trapecio", -1);
    }
    public void Circulo()
    {
        Geometria_FranklinPatino circulo = new Geometria_FranklinPatino();
        double radio;
        System.out.println("**Circulo***");
        System.out.println("Ingrese el radio: ");
        radio = scn.nextDouble();
        circulo.setLados(0);
        circulo.setPerimetro(figuras.PerimetroCirculo(radio));
        circulo.setArea(figuras.AreaCirculo(radio));
        circulo.VerDatos("Circulo", -1);
    }
    public void Cubo()
    {
        Geometria_FranklinPatino cubo = new Geometria_FranklinPatino();
        double lado;
        System.out.println("**Cubo***");
        System.out.println("Ingrese el lado: ");
        lado = scn.nextDouble();
        cubo.setLados(12);
        cubo.setVolumen(figuras.VolumenCubo(lado));
        cubo.VerDatos("Cubo", 0);
    }
    public void Ortoedro()
    {
        Geometria_FranklinPatino ortoedro = new Geometria_FranklinPatino();
        double ladoA, ladoB, ladoC;
        System.out.println("**Ortoedro***");
        System.out.println("Ingrese lado A: ");
        ladoA = scn.nextDouble();
        System.out.println("Ingrese lado B: ");
        ladoB = scn.nextDouble();
        System.out.print("Ingrese lado C: ");
        ladoC = scn.nextDouble();
        ortoedro.setLados(12);
        ortoedro.setVolumen(figuras.VolumenOrtoedro(ladoA, ladoB, ladoC));
        ortoedro.VerDatos("Ortoedro", 0);
    }
    public void Cilindro()
    {
        Geometria_FranklinPatino cilindro = new Geometria_FranklinPatino();
        double radio, altura;
        System.out.println("**Cilindro***");
        System.out.println("Ingrese el radio: ");
        radio = scn.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = scn.nextDouble();
        cilindro.setLados(0);
        cilindro.setVolumen(figuras.VolumenCilindro(radio, altura));
        cilindro.VerDatos("Cilindor", 0);
    }
    public void Piramide()
    {
        Geometria_FranklinPatino piramide  = new Geometria_FranklinPatino();
        double base, altura;
        System.out.println("**Piramide***");
        System.out.println("Ingrese la base: ");
        base = scn.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = scn.nextDouble();
        piramide.setLados(8);
        piramide.setVolumen(figuras.VolumenPiramide(base, altura));
        piramide.VerDatos("Piramide", 0);
    }
    public void Cono()
    {
        Geometria_FranklinPatino cono = new Geometria_FranklinPatino();
        double radio, altura;
        System.out.println("**Cono***");
        System.out.println("Ingrese el radio: ");
        radio = scn.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = scn.nextDouble();
        cono.setLados(0);
        cono.setVolumen(figuras.VolumenCono(radio, altura));
        cono.VerDatos("Cono", 0);
    }
    public void Esfera()
    {
        Geometria_FranklinPatino esfera = new Geometria_FranklinPatino();
        double radio;
        System.out.println("**Esfera***");
        System.out.println("Ingrese el radio: ");
        radio = scn.nextDouble();
        esfera.setLados(0);
        esfera.setVolumen(figuras.VolumenEsfera(radio));
        esfera.VerDatos("Esfera", 0);
    }
}
