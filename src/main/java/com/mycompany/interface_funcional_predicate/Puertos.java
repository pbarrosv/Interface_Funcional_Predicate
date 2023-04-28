package com.mycompany.interface_funcional_predicate;

public class Puertos {
 
    private int numeroPuerto;
    private boolean disponible;
    private String servicioRelacionado;

    public Puertos() {
    }
 
    public Puertos(int numeroPuerto, boolean disponible, String servicioRelacionado){
        this.numeroPuerto = numeroPuerto;
        this.disponible = disponible;
        this.servicioRelacionado = servicioRelacionado;
 
    }
 
    public void setNumeroPuerto(int numeroPuerto) {
        this.numeroPuerto = numeroPuerto;
    }
 
    public int getNumeroPuerto() {
        return numeroPuerto;
    }
 
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
 
    public boolean isDisponible() {
        return disponible;
    }
 
    public void setServicioRelacionado(String servicioRelacionado) {
        this.servicioRelacionado = servicioRelacionado;
    }
 
    public String getServicioRelacionado() {
        return servicioRelacionado;
    }
 
    @Override
    public String toString() {
        return "{ numero de puerto: " + numeroPuerto
                +", disponible: " + disponible
                +", servicio relacionado: " + servicioRelacionado
                +"}";
    }
}
