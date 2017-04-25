package mbeans;

import java.util.Collection;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import metier.Client;
import service.IService;

@Named
@ViewScoped
public class ClientBean {
	
	@Inject
	private IService service;

	private Client client = new Client();
	private boolean editMode = false;
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public IService getServices() {
		return service;
	}

	public void setServices(IService services) {
		this.service = services;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}

	public String add(){
		if(editMode == false){
			service.addClient(client);
		}
		else
		{
			service.majClient(client);
			editMode = false;
		}
		client = new Client();
		return "index";
	}
	
	public Collection<Client> list(){
		return service.listClients();
	}
	
	public String delete(){
		service.deleteClient(client);
		client = new Client();
		return "index";
	}
	
	public String maj(){
		editMode = true;
		return "index";
	}
}