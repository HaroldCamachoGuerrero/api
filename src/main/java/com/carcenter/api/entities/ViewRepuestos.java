package com.carcenter.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "view_repuestos")
public class ViewRepuestos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codigo")
    private Long codigo;

    @Column(name = "doc_cliente")
    private String doc_cliente;

    @Column(name = "mec_tipo_documento")
    private String mec_tipo_documento;

    @Column(name = "docmecanico")
    private String docMecanico;

    @Column(name = "documento")
    private String documento;

    @Column(name = "nombre_repuesto")
    private String nombre_repuesto;

    @Column(name = "precio_unitario")
    private String precio_unitario;

    @Column(name = "unidades")
    private String unidades;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre_repuesto() {
        return nombre_repuesto;
    }

    public void setNombre_repuesto(String nombre_repuesto) {
        this.nombre_repuesto = nombre_repuesto;
    }

    public String getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(String precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

   
}
