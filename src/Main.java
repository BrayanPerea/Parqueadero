import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro mazda = new Carro("YJS234","Mazda",2019);
        Carro toyota= new Carro("IMP542","Toyota", 2015);
        Carro ford = new Carro("DFG456","Ford",2022);

        Parqueadero carro1 = new Parqueadero(0,5,5);

        System.out.println("Para el carro 1");
        carro1.parquear_carro(mazda);
        carro1.cobrar_por_tiempo(mazda);

        System.out.println("Para el carro 2");
        carro1.parquear_carro(toyota);
        carro1.cobrar_por_tiempo(toyota);

        System.out.println("Para el carro 3");
        carro1.parquear_carro(ford);
        carro1.cobrar_por_tiempo(ford);



        carro1.mostrar_estado_del_parqueadero();

    }
}