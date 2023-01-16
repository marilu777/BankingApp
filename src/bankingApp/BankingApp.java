package bankingApp;

import java.util.ArrayList;
import java.util.List;

public class BankingApp {

    // Método de arranque da app
    public static void main(String[] args) {
        System.out.println("Bem vindo ao BNP Paribas");

        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("jose", "ator", "jose@mail", 123456789, 987654321, 1234));

        System.out.println("Clientes: " + clientes);

    }
}
