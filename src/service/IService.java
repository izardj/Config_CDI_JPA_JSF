package service;

import java.util.Collection;

import metier.Client;

public interface IService {

	public long addClient(Client c);
	public Collection<Client> listClients();
}
