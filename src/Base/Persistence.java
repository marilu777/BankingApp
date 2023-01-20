package Base;


import bankingApp.Cliente;
import bankingApp.Conta;
import com.sun.jdi.connect.spi.Connection;
//package Base;


public class Persistence {
    
    public static final Persistence manager;
    private static Connection conexao;
    private static PreparedStateMent inserçao;
    
    static{
      manager = new Persistence();  
    }

    private static class PreparedStateMent {

        public PreparedStateMent() {
        }
    }
    
}
