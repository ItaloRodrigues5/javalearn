package projeto.connectionJPA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Conexao {
    public static void main(String[] args) throws SQLException {
        Connection conexao = null;
        try {
            Class.forName("org.posgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql//localhost:5432/banco", "usuario", "senha");
            ResultSet resultado = conexao.createStatement().executeQuery("SELECT * FROM cliente");
            while(resultado.next()){
                System.out.println("Nome: " + resultado.getString("nome"));
            }
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver do banco de dados não localizado");
        } catch (SQLException e) {
            System.err.println("Erro ao acessar o banco de dados" + e.getMessage());
        } finally{
            if(conexao != null){
                conexao.close();
            }
        }
        
    }
}
