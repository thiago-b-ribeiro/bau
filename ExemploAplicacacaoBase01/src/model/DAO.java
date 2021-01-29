package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/areadetestes04?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "Recomeco137!";
	
	private Connection conectar() {
		Connection con = null;
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public void inserirEquacao(OperacoesAritimeticas equacao) {
		String sql = "INSERT INTO operacoesAritimeticas(tipoOperacao, resultado, n1, n2) VALUES (?, ?, ?, ?);";
		
		try {
			Connection con = conectar();
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, equacao.getTipoOperacao());
			pst.setInt(2, equacao.getResultado());
			pst.setInt(3, equacao.getN1());
			pst.setInt(4, equacao.getN2());
			
			pst.executeUpdate();
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
