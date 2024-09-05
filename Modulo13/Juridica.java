package Modulo13;

public class Juridica extends Pessoa {

    private String nomeFantasia;
    
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String string) {
        this.cnpj = string;
    }

    private String iCMS;

    public String getiCMS() {
        return iCMS;
    }

    public void setiCMS(String iCMS) {
        this.iCMS = iCMS;
    }

}
