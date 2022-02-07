package DAO;

public class User {
	
	private Integer id;
	private String nome;
	private String email;
	private String telefone;
	private String pais;
	
	
//	
//	public User(String nome, String email, String telefone, String pais) {
//		this.nome = nome;
//		this.email = email;
//		this.telefone = telefone;
//		this.pais = pais;
//	}

	public User (String nome, String email, String pais) {
		this.nome = nome;
		this.email = email;
		this.pais = pais;
	}
	
//	public User (Integer id, String name, String email) {
//		this.id = id;
//		this.nome = name;
//		this.email = email;
//	}
	
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return this.nome;
	}
	
	public void setName(String name) {
		this.nome = name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
	
		return this.id + " : " + this.nome + " : " + this.pais;
	}
}






