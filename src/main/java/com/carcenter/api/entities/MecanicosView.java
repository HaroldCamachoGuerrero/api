
package com.carcenter.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "viewMecanico")
public class MecanicosView implements Serializable {

 
    private static final long serialVersionUID = 1L;
    @Id
        @Column(name = "documento")
    private String documento;
        
    @Column(name = "tipo_documento")
    private String tipo_documento;
    
    @Column(name = "primer_nombre")
    private String primer_nombre;
    
    @Column(name = "segundo_nombre")
    private String segundo_nombre;
    
    @Column(name = "primer_apellido")
    private String primer_apellido;
    
    @Column(name = "segundo_apellido")
    private String segundo_apellido;
    
    @Column(name = "celular")
    private String celular;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "estado")
    private String estado;
    
        @Column(name = "tiempotrabajado")
    private String tiempoTrabajado;

    public String getDocumento() {
        return documento;
    }

    public String getTiempoTrabajado() {
        return tiempoTrabajado;
    }

    public void setTiempoTrabajado(String tiempoTrabajado) {
        this.tiempoTrabajado = tiempoTrabajado;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }




    

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

    



    
    
    
    
    
    
}
