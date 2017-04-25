package mbeans;

import java.util.ArrayList;
import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import metier.Client;
import service.IService;

@ManagedBean
@ViewScoped
@Named
public class ClientBean {
	
	@Inject
	private IService services;

	private Client client = new Client();
	private Collection<Client> clients = new ArrayList<>();
	
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
	
	public Collection<Client> getClients() {
		return clients;
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	public String add(){
		services.addClient(client);
		return "clients";
	}
	
	public Collection<Client> list(){
		return services.listClients();
	}
}