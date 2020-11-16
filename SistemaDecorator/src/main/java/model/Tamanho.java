package model;

public class Tamanho {
    
    private Medida medida;
    private Double porcentagemAcrescimo;

    public Tamanho(Medida medida, Double porcentagemAcrescimo) {
        this.medida = medida;
        this.porcentagemAcrescimo = porcentagemAcrescimo;
    }

    public Medida getMedida() {
        return medida;
    }

    public void setMedida(Medida medida) {
        this.medida = medida;
    }

    public Double getPorcentagemAcrescimo() {
        return porcentagemAcrescimo;
    }

    public void setPorcentagemAcrescimo(Double porcentagemAcrescimo) {
        this.porcentagemAcrescimo = porcentagemAcrescimo;
    }
}