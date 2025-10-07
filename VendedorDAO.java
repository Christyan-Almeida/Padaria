package Controller;
import DAO.FabricaConexao;
import Model.Vendedor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VendedorDAO {
    public List<Vendedor> listarVendedores() {
        List<Vendedor> lista = new ArrayList<>();
        String sql = "SELECT id, nome FROM vendedores";

        try (Connection conn = FabricaConexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Vendedor v = new Vendedor(rs.getInt("id"), rs.getString("nome"));
                lista.add(v);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
