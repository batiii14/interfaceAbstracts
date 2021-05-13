package interfaceAbstractDemo;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		System.out.println("Kullanýcý doðrulamasý yapýlýyor...");
		return false;
		
		
	}
	
}
