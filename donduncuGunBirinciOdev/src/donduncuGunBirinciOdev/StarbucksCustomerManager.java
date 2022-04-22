package donduncuGunBirinciOdev;

public class StarbucksCustomerManager extends BaseCustomerManager {

	ICustomerCheckService customerChechkService;
	
	
	public StarbucksCustomerManager(ICustomerCheckService customerChechkService) {
		super();
		this.customerChechkService = customerChechkService;
	}


	@Override
	public  void Save(Customer customer) {
		if(this.customerChechkService.CheckIfRealPerson(customer)) {	
			Save(customer);
		}		
		else {
			System.out.println("Not a valid person");;
		}
	}
}
