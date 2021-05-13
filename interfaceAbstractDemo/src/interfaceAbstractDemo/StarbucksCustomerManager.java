package interfaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		this.customerCheckService=customerCheckService;
	}
	
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to database "+ customer.getFirstName());
		}else {
			System.out.println("Not a valid person ");
		}
			
		}
	}

	
