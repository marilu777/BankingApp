package bankingApp;

import java.util.ArrayList;
import java.util.List;

public class BankingApp {

    // Método de arranque da app
    public static void main(String[] args) {
        System.out.println("Bem vindo ao BNP Paribas");

        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("jose", "ator", "jose@mail", 123456789, 987654321, 1234));
        clientes.add(new Cliente("paula", "cantora", "paula@mail", 435261789, 987999321, 1284));
        System.out.println("Clientes: " + clientes);

    }
}
