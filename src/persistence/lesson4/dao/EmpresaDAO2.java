package persistence.lesson4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import persistence.lesson4.entidade.Empresa;


//DAO - Data Access Object
public class EmpresaDAO2 {

	private Connection conexao;

	public void salva(Empresa empresa) throws SQLException{
		conexao = BancoDeDados.getConexao();
		PreparedStatement ps;
		try {
			ps = conexao.prepareStatement("insert into empresas (cnpj, nome) values (?, ?)");
			ps.setString(1, empresa.getCnpj());
			ps.setString(2, empresa.getNome());
			ps.execute();
			ps.close();
		}catch(SQLException e) {
			if(e.getMessage().contains("pk_empresas")) {
				atualiza(empresa);
			}
			
			throw e;
		}
	}
	
	private void atualiza(Empresa empresa) throws SQLException{
		conexao = BancoDeDados.getConexao();
		PreparedStatement ps;
		ps = conexao.prepareStatement("update empresas set nome = ? where cnpj = ?");
		ps.setString(1, empresa.getNome());
		ps.setString(2, empresa.getCnpj());	
		ps.execute();
		ps.close();
	}
	
	private Empresa obtem(String cnpj) throws SQLException {
		conexao = BancoDeDados.getConexao();
		PreparedStatement ps = conexao.prepareStatement("select * from empresas where cnpj = ?");
		ps.setString(1, cnpj);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Empresa empresa = new Empresa(rs.getString(1), rs.getString(2));
			rs.close();
			return empresa;
		}
		return null;
	} 
	
	public void deleta(String cnpj) throws SQLException{
		conexao = BancoDeDados.getConexao();
		PreparedStatement ps;
		try {
			ps = conexao.prepareStatement("delete from empresas where cnpj = ?");
			ps.setString(1, cnpj);
			ps.execute();
		} catch (SQLException e) {
			 throw new SQLException("houve um erro grave no momento da exclusão");
		}	
	}
	
	public List<Empresa> lista(){
		List<Empresa> listaDeEmpresas = new ArrayList<Empresa>();
		conexao = BancoDeDados.getConexao();
		try {
			PreparedStatement ps = conexao.prepareStatement("select * from empresas");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Empresa empresa = new Empresa(rs.getString(1), rs.getString(2));
				listaDeEmpresas.add(empresa);
			}
			rs.close();
		}catch(SQLException e) {
			
		}
		
		return listaDeEmpresas;
	}
}
