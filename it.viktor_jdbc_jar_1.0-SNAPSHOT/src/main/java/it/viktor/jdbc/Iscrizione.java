/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.viktor.jdbc;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author tss
 */
@Entity
@Table(name = "t_iscrizioni")
public class Iscrizione implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_iscrizione")
    private Long id;
    @Column (name = "data_iscrizione")
    private LocalDateTime dataIscrizione;
    
    // RELAZIONI
    @ManyToOne
    @JoinColumn(name = "id_anagrafica")
    private Anagrafica anagrafica;
    @ManyToOne
    @JoinColumn(name = "id_corso")
    private Corso corso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataIscrizione() {
        return dataIscrizione;
    }

    public void setDataIscrizione(LocalDateTime dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }

    public Anagrafica getAnagrafica() {
        return anagrafica;
    }

    public void setAnagrafica(Anagrafica anagrafica) {
        this.anagrafica = anagrafica;
    }

    public Corso getCorso() {
        return corso;
    }

    public void setCorso(Corso corso) {
        this.corso = corso;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final Iscrizione other = (Iscrizione) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Iscrizione{" + "id=" + id + ", dataIscrizione=" + dataIscrizione + ", anagrafica=" + anagrafica + ", corso=" + corso + '}';
    }
    
    
    
    
    
    
    
}
