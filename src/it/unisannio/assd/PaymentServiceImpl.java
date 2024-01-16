package it.unisannio.assd;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(targetNamespace = "http://assd.unisannio.it/", endpointInterface = "it.unisannio.assd.PaymentService", portName = "PaymentServiceImplPort", serviceName = "PaymentServiceImplService")
public class PaymentServiceImpl implements PaymentService{
	private List<String> supportedCC = new ArrayList<String>();
	private List<Organization> registeredOrganizations = new ArrayList<Organization>();
	
	public PaymentServiceImpl() {
		supportedCC.add("MasterCard");
		supportedCC.add("AmericanExpress");
		registeredOrganizations.add(new Organization("Enterprise1", "123456789", "via Roma, 10"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<String> getSupportedCreditCards() {
		// TODO Auto-generated method stub
		return supportedCC;
	}

	@Override
	public List<Organization> getRegisteredOrganizations() {
		// TODO Auto-generated method stub
		return registeredOrganizations;
	}

	@Override
	public void pay(String cctype, String ccnumber, String code, Double amount, int destination) {
		// TODO Auto-generated method stub
		System.out.println("Payed: " + cctype + " " + "ccnumber" + " " + code + " " + amount + " " + destination);
	}

}
