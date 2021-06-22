package com.carcenter.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "viewEncabezado")
public class ViewFacturacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codigo")
    private Long codigo;

    @Column(name = "estado")
    private String estado;

    @Column(name = "doc_cliente")
    private String docCliente;

    @Column(name = "documento")
    private String documento;

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

    @Column(name = "nombremec")
    private String nombreMec;

    @Column(name = "nombremec2")
    private String nombremec2;

    @Column(name = "apellidomec")
    private String apellidoMec;

    @Column(name = "Apellidomec2")
    private String ApellidoMec2;

    @Column(name = "tipo_documento")
    private String tipo_documento;

    @Column(name = "docmec")
    private String docMec;
    @Column(name = "celmec")
    private String celMec;
    @Column(name = "dirmec")
    private String dirMec;
    @Column(name = "emailmec")
    private String emailMec;


    @Column(name = "Sumaprepuestos")
    private String SumaPrepuestos;

    @Column(name = "Sumaservicios")
    private String SumaServicios;

    @Column(name = "subtotal")
    private String subtotal;

    @Column(name = "descuento")
    private String descuento;

    @Column(name = "iva")
    private String iva;

    @Column(name = "total")
    private String total;

    public Long getCodigo() {
        return codigo;
    }

    public String getCelMec() {
        return celMec;
    }

    public void setCelMec(String celMec) {
        this.celMec = celMec;
    }

    public String getDirMec() {
        return dirMec;
    }

    public void setDirMec(String dirMec) {
        this.dirMec = dirMec;
    }

    public String getEmailMec() {
        return emailMec;
    }

    public void setEmailMec(String emailMec) {
        this.emailMec = emailMec;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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

    public String getNombreMec() {
        return nombreMec;
    }

    public void setNombreMec(String nombreMec) {
        this.nombreMec = nombreMec;
    }

    public String getNombremec2() {
        return nombremec2;
    }

    public void setNombremec2(String nombremec2) {
        this.nombremec2 = nombremec2;
    }

    public String getApellidoMec() {
        return apellidoMec;
    }

    public void setApellidoMec(String apellidoMec) {
        this.apellidoMec = apellidoMec;
    }

    public String getApellidoMec2() {
        return ApellidoMec2;
    }

    public void setApellidoMec2(String ApellidoMec2) {
        this.ApellidoMec2 = ApellidoMec2;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getDocMec() {
        return docMec;
    }

    public void setDocMec(String docMec) {
        this.docMec = docMec;
    }

    public String getSumaPrepuestos() {
        return SumaPrepuestos;
    }

    public void setSumaPrepuestos(String SumaPrepuestos) {
        this.SumaPrepuestos = SumaPrepuestos;
    }

    public String getSumaServicios() {
        return SumaServicios;
    }

    public void setSumaServicios(String SumaServicios) {
        this.SumaServicios = SumaServicios;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDocCliente() {
        return docCliente;
    }

    public void setDocCliente(String docCliente) {
        this.docCliente = docCliente;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
