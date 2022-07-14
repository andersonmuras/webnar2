import java .sql.*;

public class DAO_produtos {
    Conexao obj_conexao = new Conexao();
    public void consultar () { //metodo consultar produtos no banco de dados
        obj_conexao.conexao();
        Statement stm = null;
        ResultSet rs = null;

        try {
            stm = obj_conexao.conn.createStatement();
            rs = stm.executeQuery("select * from produtos");
            while (rs.next())
                System.out.println(rs.getInt(1) +
                        " " + rs.getString(2) +
                        " " + rs.getDouble(3) +
                        " " + rs.getDouble(4) +
                        " " + rs.getInt(5) );
            obj_conexao.desconecta();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void inserir (Produto p) { //metodo inserir produtos no banco de dados
        obj_conexao.conexao();
        PreparedStatement pst = null;
        String sql = "Insert INTO Produtos (cd_produto, ds_produto, vl_produto, cd_unidade) VALUES (?,?,?,?,?)";

        try {
            pst = obj_conexao.conn.prepareStatement(sql);
            pst.setInt(1,p.getCd_produto());
            pst.setString(2,p.getDs_produto());
            pst.setDouble(3,p.getVl_produto());
            pst.setDouble(4, p.getQt_produto());
            pst.setInt(5,p.getCd_unidade());
            obj_conexao.desconecta();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void alterar (Produto p) { //metodo alterar produtos no banco de dados
        obj_conexao.conexao();
        PreparedStatement pst = null;
        String sql = "Update Produtos Set ds_produto=?, vl_produto=?, qt_produto=?, cd_unidade=? WHERE cd_produto=?" ;

        try {
            pst = obj_conexao.conn.prepareStatement(sql);

            pst.setString(1,p.getDs_produto());
            pst.setDouble(2,p.getVl_produto());
            pst.setDouble(3, p.getQt_produto());
            pst.setInt(4,p.getCd_unidade());
            pst.setInt(5,p.getCd_produto());
            pst.execute();
            obj_conexao.desconecta();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void excluir (int id) { //metodo excluir produtos no banco de dados
        obj_conexao.conexao();
        PreparedStatement pst = null;
        String sql = "DELEte from Produtos WHERE cd_produto=?" ;

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
