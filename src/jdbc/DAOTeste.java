package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		//System.out.println(dao.incluir(sql,  "João da Silva"));
		//System.out.println(dao.incluir(sql,  "Ana Julia"));
		//System.out.println(dao.incluir(sql,  "Djalma Pereira"));

		sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		System.out.println(dao.incluir(sql,  "João da Silva", 110));
		System.out.println(dao.incluir(sql,  "Ana Julia", 111));
		System.out.println(dao.incluir(sql,  "Djalma Pereira", 112));
		
		
		
		dao.close();
	}
}
