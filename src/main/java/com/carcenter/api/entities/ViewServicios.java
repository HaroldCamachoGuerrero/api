package com.carcenter.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "view_servicios")
public class ViewServicios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codigo")
    private Long codigo;

    @Column(name = "estado")
    private String estado;

    @Column(name = "doc_cliente")
    private String doc_cliente;

    @Column(name = "mec_tipo_documento")
    private String mec_tipo_documento;

    @Column(name = "docmecanico")
    private String docMecanico;

        @Column(name = "documento")
    private String documento;
        
        
    @Column(name = "nombre_servicio")
    private String nombre_servicio;

    @Column(name = "precio")
    private String precio;

    public Long getCodigo() {
        return codigo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDoc_cliente() {
        return doc_cliente;
    }

    public void setDoc_cliente(String doc_cliente) {
        this.doc_cliente = doc_cliente;
    }

    public String getMec_tipo_documento() {
        return mec_tipo_documento;
    }

    public void setMec_tipo_documento(String mec_tipo_documento) {
        this.mec_tipo_documento = mec_tipo_documento;
    }

    public String getDocMecanico() {
        return docMecanico;
    }

    public void setDocMecanico(String docMecanico) {
        this.docMecanico = docMecanico;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    
}
