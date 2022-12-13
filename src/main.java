import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        String opcionFigur, sino, opFigurasPlanas, opFigurasPlanasSame;

        Metodos proceso = new Metodos();
        Scanner scn = new Scanner(System.in);
        do
        {
            proceso.MenuInicio();
            opcionFigur = scn.next().toUpperCase();
            switch (opcionFigur)
            {
                case "A":
                        proceso.MenuFigurasPlanas();
                        opFigurasPlanas = scn.next().toUpperCase();
                        switch (opFigurasPlanas) {
                            case "A":
                                proceso.FigurasPlanasLadosIguales();
                                opFigurasPlanasSame = scn.next().toUpperCase();
                                    switch (opFigurasPlanasSame) {
                                        case "A":
                                            proceso.Cuadrado();
                                            break;
                                        case "B":
                                            proceso.Triangulo();
                                            break;
                                        case "C":
                                            proceso.Rombo();
                                            break;
                                        case "<":
                                            break;
                                    }
                                break;
                            case "B":
                                proceso.FigurasPlanasLadosEscalenos();
                                String opLadosEscalenos = scn.next().toUpperCase();
                                switch (opLadosEscalenos)
                                {
                                    case "A":
                                        proceso.ParaleloGramo();
                                        break;
                                    case "B":
                                        proceso.Cometa();
                                        break;
                                    case "C":
                                        proceso.Trapecio();
                                        break;
                                    case "<":
                                        break;
                                }
                                break;
                            case "C":
                                proceso.Circulo();
                                break;
                            case "<":
                                break;
                        }
                    break;
                case "B":
                    proceso.MenuCuerpoesGeometricos();
                    String opCuerpos = scn.next().toUpperCase();
                    switch (opCuerpos)
                    {
                        case "A":
                            proceso.Cubo();
                            break;
                        case "B":
                            proceso.Ortoedro();
                            break;
                        case "C":
                            proceso.Piramide();
                            break;
                        case "D":
                            proceso.Cilindro();
                            break;
                        case "E":
                            proceso.Cono();
                            break;
                        case "F":
                            proceso.Esfera();
                            break;
                        case "<":
                            break;
                    }
                    break;
                default:
                    System.out.println("Error!!!");
            }
            System.out.print("Continuar (s/n): ");
            sino = scn.next();
        } while ("s".equals(sino));
    }
}
