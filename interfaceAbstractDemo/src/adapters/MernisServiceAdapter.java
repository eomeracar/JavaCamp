package adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import abstracts.BaseCustomerValidationService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter extends BaseCustomerValidationService{
	KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
	private boolean result=false;
	@Override
	public boolean validateRealPerson(Customer customer) {
		
		try {
					result=kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(
					customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
					
		} catch (RemoteException e) {
			return result;
		}
		return result;
	}

}
