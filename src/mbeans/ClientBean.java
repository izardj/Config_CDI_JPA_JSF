package mbeans;

import java.util.ArrayList;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import metier.Client;
import service.IService;

@Named
@RequestScoped
public class ClientBean {
	
	@Inject
	private IService services;

	private Client client = new Client();
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public IService getServices() {
		return services;
	}

	public void setServices(IService services) {
		this.services = services;
	}

	public String add(){
		services.addClient(client);
		return "clients";
	}
	
	public Collection<Client> list(){
		return services.listClients();
	}
}