import java .sql.*;

public class DAO_unidades {
    Conexao obj_conexao = new Conexao(); //instância da classe conexão
    public void consultar () { //metodo consultar unidades no banco de dados
        obj_conexao.conexao();
        Statement stm = null; //objeto para executar instruções sql
        ResultSet rs = null; //classe da API JAva para percorrer um datatable

        try {
            stm = obj_conexao.conn.createStatement();
            rs = stm.executeQuery("select * from unidades");
            while (rs.next())
                System.out.println(rs.getInt(1) +
                        " " + rs.getString(2));
            obj_conexao.desconecta();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void inserir (Unidade u) { //metodo inserir unidades no banco de dados
        obj_conexao.conexao();
        PreparedStatement pst = null;
        String sql = "INSERT INTO Unidades (cd_unidade, ds_unidade) VALUES (?,?)";

        try {
            pst = obj_conexao.conn.prepareStatement(sql);
            pst.setInt(1, u.getCd_unidade());
            pst.setString(2, u.getDs_unidade());
            obj_conexao.desconecta();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void alterar (Unidade u) { //metodo alterar unidades no banco de dados
        obj_conexao.conexao();
        PreparedStatement pst = null;
        String sql = "Update Unidade Set ds_unidade=? WHERE cd_unidade=?" ;

        try {
            pst = obj_conexao.conn.prepareStatement(sql);

            pst.setString(1, u.getDs_unidade());
            pst.setInt(2, u.getCd_unidade());
            pst.execute();
            obj_conexao.desconecta();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void excluir (int id) { //metodo excluir unidades no banco de dados
        obj_conexao.conexao();
        PreparedStatement pst = null;
        String sql = "DELEte from Unidades WHERE cd_unidade=?" ;

        try {
            pst = obj_conexao.conn.prepareStatement(sql);
            pst.setInt(1,id);
            pst.execute();
            obj_conexao.desconecta();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
