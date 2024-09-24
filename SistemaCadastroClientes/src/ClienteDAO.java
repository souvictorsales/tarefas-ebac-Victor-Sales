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
    void adicionar(Cliente cliente);
    void atualizar(Cliente cliente);
    void remover(String cpf);
    Cliente buscarPorCPF(String cpf);
    List<Cliente> listarTodos();
}