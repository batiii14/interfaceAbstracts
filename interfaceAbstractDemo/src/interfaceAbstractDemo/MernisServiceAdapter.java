package interfaceAbstractDemo;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		System.out.println("Kullan�c� do�rulamas� yap�l�yor...");
		return false;
		
		
	}
	
}
