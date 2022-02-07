package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Conexao.Conexao;

public class UserDAO {
	
	public UserDAO() {

	}
	
	public void addUser(User abobrinhaUser) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("insert into users (nome, email, pais) values (?, ?, ?)");
			p.setString(1, abobrinhaUser.getName());
			p.setString(2, abobrinhaUser.getEmail());
			p.setString(3, abobrinhaUser.getPais());
			System.out.println(p);
			p.executeUpdate();
			System.out.println("Comando executado");
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<User> getListUser(){
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		ArrayList<User> lista = new ArrayList<User>();
		try {
			PreparedStatement p = con.prepareStatement("select * from users");
			ResultSet r = p.executeQuery();			
			
			while (r.next()) {
				Integer id = r.getInt("id");
				String nome = r.getString("name");
				String email = r.getString("email");
				String pais = r.getString("pais");
				User u = new User(nome, email, pais);
				u.setId(id);
				lista.add(u);
			}
			r.close();
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	
	public void removeUser(Integer id) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("delete from users where id = ?");
			p.setInt(1, id);
			System.out.println(p);
			p.executeUpdate();
			System.out.println("Comando executado");
			p.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//public void updateUser(Integer id, String newName) {
	public void updateUser(User updateUser) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("update users set name = ?, email = ?, pais = ? where id = ?");
			p.setString(1, updateUser.getName());
			p.setString(2, updateUser.getEmail());
			p.setString(3, updateUser.getPais());
			p.setInt(4, updateUser.getId());
			System.out.println(p);
			p.executeUpdate();
			System.out.println("Comando executado");
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public User buscarUser(Integer id) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		User u = null;
		try {
			PreparedStatement p = con.prepareStatement("select * from users where id = ?");
			p.setInt(1, id);
			ResultSet r = p.executeQuery();			
			
			
			while (r.next()) {
				Integer id2 = r.getInt("id");
				String nome = r.getString("name");
				String email = r.getString("email");
				String pais = r.getString("pais");
			
				u = new User(nome, email, pais);
				u.setId(id);
			}
			r.close();
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
}






