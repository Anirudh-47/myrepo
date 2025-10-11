package jdbcprograms.executor;

import jdbcprograms.services.CRUDOperations;

public class JDBCMain {

	public static void main(String[] args) {
		CRUDOperations.addStudent(101,"Anirudh");
		CRUDOperations.addStudent(102,"Joy");
		CRUDOperations.addStudent(103,"Ravi");
		System.out.println("students added");

	}
	

}
