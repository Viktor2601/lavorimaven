/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.viktor.jdbc;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author tss
 */
@Entity
@Table(name = "t_province")
public class Provincia implements Serializable{
    @Id
    @Column(length = 4)
    private String provincia;
    @Column(name = "provincia_completa")
    private String provinciaCompleta;

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getProvinciaCompleta() {
        return provinciaCompleta;
    }

    public void setProvinciaCompleta(String provinciaCompleta) {
        this.provinciaCompleta = provinciaCompleta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.provincia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Provincia other = (Provincia) obj;
        if (!Objects.equals(this.provincia, other.provincia)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Provincia{" + "provincia=" + provincia + ", provinciaCompleta=" + provinciaCompleta + '}';
    }
    
    
    
    
    
}
