/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author victo
 */
import java.util.List;

public interface ClienteDAO {
    void adicionar(ClienteCarros cliente);
    void atualizar(ClienteCarros cliente);
    void remover(String cpf);
    ClienteCarros buscarPorCPF(String cpf);
    List<ClienteCarros> listarTodos();
}