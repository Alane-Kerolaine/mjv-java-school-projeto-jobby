package model;

public class Profissional {
    private String profissao;
    private String empresa;
    private double salario;
    private String empregoAtual;

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmpregoAtual() {
        return empregoAtual;
    }

    public void setEmpregoAtual(String empregoAtual) {
        this.empregoAtual = empregoAtual;
    }
}
