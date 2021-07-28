package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;
import model.service.ProductService;

public class Program {

	public static void main(String[] args) {
		
Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<Product>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getPrice() < 100.00);
		
		System.out.println("Sum = " + String.format("%.2f", sum));

	}

}
