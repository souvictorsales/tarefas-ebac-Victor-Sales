package Modulo14;

import Modulo14.dao.ClienteMapDAO;
import Modulo14.dao.IClienteDAO;

import javax.swing.*;

public class Aplicacao {
    private static IClienteDAO iClienteDAO;
    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,"Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
    }
}
