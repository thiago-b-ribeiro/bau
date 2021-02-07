package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	public DAO() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public void inserirEquacao(OperacoesAritimeticas resultado) {
		String sql = "INSERT INTO operacoesAritimeticas(tipoOperacao, resultado, n1, n2) VALUES (?, ?, ?, ?);";
		
		try {
			Connection con = conectar();
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, resultado.getTipoOperacao());
			pst.setInt(2, resultado.getResultado());
			pst.setInt(3, resultado.getN1());
			pst.setInt(4, resultado.getN2());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public OperacoesAritimeticas[] resgatarEquacao() {
		String sql ="SELECT * FROM areadetestes04.operacoesaritimeticas;";
		ArrayList<OperacoesAritimeticas> lista= new ArrayList<OperacoesAritimeticas>();
	
		try {
			Connection con = conectar();
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery(sql);
			
			while (rs.next()){
				OperacoesAritimeticas equacoes = new OperacoesAritimeticas(
						rs.getString("tipoOperacao"),
						rs.getInt("resultado"),
						rs.getInt("n1"),
						rs.getInt("n2")
						);
				lista.add(equacoes);
			}
			
			pst.close();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return (OperacoesAritimeticas[]) lista.toArray(new OperacoesAritimeticas[0]);
	}

}
