package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department obj = new Department (1, "Books");
		System.out.println(obj);
		
		Seller seller = new Seller(1, "Maria Green", "greenmaria@gmail.com", sdf.parse("24/04/1985"), 3000.0, obj);
		System.out.println(seller);
	}

}
