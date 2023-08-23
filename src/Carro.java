public class Carro {
    private String placa;
    private String marca;
    private int modelo;
    public Carro(String placa, String marca, int modelo){
        this.placa=placa;
        this.marca=marca;
        this.modelo=modelo;
    }
  public String get_datos_carro(){
        return "Placa: "+ placa+"\nMarca: "+ marca+ "\nModelo: "+ modelo;
  }
}
