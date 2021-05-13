package interfaceAbstractDemo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Batun","IDIKURT",LocalDate.of(1998, 08, 02),"15620000111"));
		
		
	}

}
