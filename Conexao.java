import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    private String caminho = "jdbc:mysql://localhost:3306/ComaBem"; //url de acesso ao banco de dados
    private String usuario = "root"; //usuário cadastrado
    private String senha = "CursoSenai"; // Senha de acesso ao banco de dados
    public Connection conn;
    public void conexao () { // bloco para realização caso não ocorra erro
        try {
            conn = DriverManager.getConnection(caminho, usuario, senha);
            System.out.println("Conectado com Sucesso");
        } catch (SQLException ex) // bloco para realização caso ocorra erro
        {
        Logger.getLogger (Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void desconecta (){
        try{
       conn.close();
       System.out.println("Desconectado");
    } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null,ex);
            System.out.println("Erro ao fechar a conexao");
        }
        }
        public static void main (String[]args){ // método main apenas utilizado para teste da classe conexão
        Conexao obj_conexao = new Conexao ();
        obj_conexao.conexao();
        }
}
