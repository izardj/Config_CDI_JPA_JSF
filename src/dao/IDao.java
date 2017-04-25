package dao;

import java.util.Collection;

import metier.Client;

public interface IDao {

	public long addClient(Client c);
	public Collection<Client> listClients();
}
