package Controller;

import java.lang.ref.WeakReference;

import Conexao.Conexao;
import DAO.User;
import DAO.UserDAO;

public class Guilherme {

	public static void main(String[] args) {
		
		Conexao c = new Conexao();
		c.getConnection();
		WeakReference ref = new WeakReference<Object>(c);
		c = null;
		while (ref.get() != null) {
			System.gc();
			System.out.println(".");
		}
		c = new Conexao();
		c.getConnection();


		
		UserDAO dao = new UserDAO();
		User user = new User("Maria Rita", "mr@gmail.com", "Alemanha");
		dao.addUser(user);
		
				

	}

}
