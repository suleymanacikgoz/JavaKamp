package donduncuGunBirinciOdev;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws RemoteException {
		Customer customer = new Customer();
		customer.birthYear=11;
		customer.firstName="S�leyman";
		customer.lastName="A��kg�z";
		customer.nationalityId=(long) 123456789;
		customer.id=1;
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(customer);
		
				
		
	}

}
