import Model.Carro;

public class App{
    public static void main(String[] args) {
        Carro gol = new Carro();

        gol.placa = "texto";
        gol.numChassi =1234;

        System.out.printf("Carro contém a placa %s e o numero do chassi %d", gol.placa, gol.numChassi);
    }
}