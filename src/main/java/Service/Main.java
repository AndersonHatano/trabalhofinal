package Service;

import Repository.ClienteRepository;
import Repository.ContaCorrenteRepository;
import domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Main {

    @Autowired
    ContaCorrenteRepository contaCorrenteRepository;

    @Autowired
    ClienteRepository clienteRepository;

    public Boolean register(Cliente cliente){

        clienteRepository.save(cliente);

        return true;
    }
}
