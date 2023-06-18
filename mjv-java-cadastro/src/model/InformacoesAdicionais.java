package model;

import java.util.List;

public class InformacoesAdicionais {

    private List<String> habilidades;
    private double pretensaoMinima;
    private double pretensaoMaxima;

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public double getPretensaoMinima() {
        return pretensaoMinima;
    }

    public void setPretensaoMinima(double pretensaoMinima) {
        this.pretensaoMinima = pretensaoMinima;
    }

    public double getPretensaoMaxima() {
        return pretensaoMaxima;
    }

    public void setPretensaoMaxima(double pretensaoMaxima) {
        this.pretensaoMaxima = pretensaoMaxima;
    }
}
