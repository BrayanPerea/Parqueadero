import java.util.Scanner;

public class Parqueadero {
    private Carro[][] disponible;
    private double tarifa_por_hora;
    private int fila;
    private int columna;
    Scanner sc =new Scanner(System.in);

    public Parqueadero(double tarifa_por_hora, int fila, int columna) {
        disponible = new Carro[fila][columna];
        this.tarifa_por_hora = tarifa_por_hora;
        this.fila = fila;
        this.columna = columna;
    }
//>” (mayor) y “<
    public void parquear_carro(Carro mazda){
        boolean validar = true;
        while (validar) {
            System.out.println("Digite en qué fila pondrá el vehículo");
            int fila_ingresada = sc.nextInt();

            if (fila_ingresada >= 0 && fila_ingresada < this.fila) {
                System.out.println("Digite en qué columna va a parquear el vehículo");
                int columna_ingresada = sc.nextInt();
                if (columna_ingresada >= 0 && columna_ingresada < this.columna) {
                    if (disponible[fila_ingresada][columna_ingresada] == null) {
                        disponible[fila_ingresada][columna_ingresada] = mazda;
                        validar = false;
                    } else {
                        System.out.println("Columna ocupada, intente de nuevo");
                    }
                } else {
                    System.out.println("Columna inválida, intente de nuevo");
                }
            } else {
                System.out.println("Fila inválida, intente de nuevo");
            }
        }
    }


    public double cobrar_por_tiempo(Carro mazda){
        System.out.println("Valor minuto de parqueadero: $60 \nDigite los minutos que duró en el parqueadero:");
        int minutos=sc.nextInt();
        tarifa_por_hora= minutos* 60;
        System.out.println("Valor a pagar: " + tarifa_por_hora);
        return tarifa_por_hora;
    }
    public void mostrar_estado_del_parqueadero(){
        System.out.println("El estado del parqueadero es:");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (disponible[i][j] == null) {
                    System.out.print("O ");
                } else {
                    Carro carro = disponible[i][j];
                    System.out.print("X "+ carro.get_datos_carro());
                }
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }

}


