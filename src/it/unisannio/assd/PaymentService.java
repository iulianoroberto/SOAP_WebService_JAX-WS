package it.unisannio.assd;

import java.util.List;

import javax.jws.WebService;

@WebService(name = "PaymentService", targetNamespace = "http://assd.unisannio.it/")
public interface PaymentService {
	public List<String> getSupportedCreditCards();
	public List<Organization> getRegisteredOrganizations();
	public void pay(String cctype, String ccnumber, String code, Double amount, int destination);

}
