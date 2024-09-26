/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//commit
/**
 *
 * @author victo
 */
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    private final List<ClienteCarros> clientes = new ArrayList<>();

    @Override
    public void adicionar(ClienteCarros cliente) {
        clientes.add(cliente);
    }

    @Override
    public void atualizar(ClienteCarros cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf().equals(cliente.getCpf())) {
                clientes.set(i, cliente);
                return;
            }
        }
    }

    @Override
    public void remover(String cpf) {
        clientes.removeIf(cliente -> cliente.getCpf().equals(cpf));
    }

    @Override
    public ClienteCarros buscarPorCPF(String cpf) {
        return clientes.stream()
                .filter(cliente -> cliente.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<ClienteCarros> listarTodos() {
        System.out.println("Método listarTodos() chamado, retornando " + clientes.size() + " clientes");
        return new ArrayList<>(clientes);
    }
}