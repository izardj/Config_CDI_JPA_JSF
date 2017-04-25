package service;

import java.util.Collection;

import javax.inject.Inject;

import dao.IDao;
import metier.Client;

public class ServiceImpl implements IService {

	@Inject
	private IDao dao;

	@Override
	public long addClient(Client c) {
		return dao.addClient(c);
	}

	@Override
	public Collection<Client> listClients() {
		return dao.listClients();
	}

}
