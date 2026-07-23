package org.crud;

import org.dao.Service.ClientDaoService;
import org.entity.Client;

public class ClientCrudServiceImp implements ClientCrudService {

    private ClientDaoService clientDaoService;

    public ClientCrudServiceImp(ClientDaoService clientDaoService) {
        this.clientDaoService = clientDaoService;
    }


    @Override
    public void add(Client client) {
        clientDaoService.add(client);
    }

    @Override
    public void delete(Client client) {
        clientDaoService.delete(client);
    }

}
