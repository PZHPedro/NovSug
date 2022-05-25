/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author jesus
 */
public class U0_Empleado {
    private String nombre, apellidos, edad, sexo, curp, correo, tel, calle1, calle2,
            colonia, municipio, estado, cargo;

    public U0_Empleado(String nombre, String apellidos, String edad, String sexo, String curp, String correo, String tel, String calle1, String calle2, String colonia, String municipio, String estado, String cargo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.curp = curp;
        this.correo = correo;
        this.tel = tel;
        this.calle1 = calle1;
        ///una clle, CP, num interior y exterior
        this.calle2 = calle2;
        this.colonia = colonia;
        this.municipio = municipio;
        this.estado = estado;
        this.cargo = cargo;
    }
        
    
    
    public U0_Empleado() {
       this("NA", "NA", "NA", "NA", "NA", "NA", "NA", "NA", "NA", "NA", "NA", "NA", "NA");
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCurp() {
        return curp;
    }

    public String getCorreo() {
        return correo;
    }
    
    public String getTel() {
        return tel;
    }

    public String getCalle1() {
        return calle1;
    }

    public String getCalle2() {
        return calle2;
    }

    public String getColonia() {
        return colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getEstado() {
        return estado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public void setTel(String tel) {
        this.tel = correo;
    }

    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }

    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public String toString(){
       return curp; 
    }
}
