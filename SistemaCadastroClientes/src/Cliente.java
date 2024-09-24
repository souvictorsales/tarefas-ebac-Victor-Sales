/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//testedocommit
/**
 *
 * @author victo
 */
public class Cliente {
    private String cpf;
    private String email;
    private String nome;
    private String telefone;
    private String cidade;
    private String estado;
    private String endereco;

    public Cliente(String cpf, String email, String nome, String telefone, String cidade, String estado, String endereco) {
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
        this.cidade = cidade;
        this.estado = estado;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}