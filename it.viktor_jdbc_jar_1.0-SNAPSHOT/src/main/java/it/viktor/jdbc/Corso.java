/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.viktor.jdbc;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author tss
 */
@Entity // CLASSI CHE VANNO SALAVTE NEL DATABASE
@Table(name = "t_corsi") // TABELLA DA CUI LO PRENDE
public class Corso implements Serializable{
    // ATTRIBUTI 
    @Id // CHIAVE PRIMARIA
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GENERA AUTOMATICAMENTE
    @Column(name = "id_corso") // ANNOTAZIONI SULLA COLONNA
    private Long id;
    
    @Column(name = "titolo")
    private String titolo;
    
    @Column(name = "descrizione")
    private String descrizione;
    
    @Column(name = "data_inizio")
    private LocalDate dataInizio;
    
    @Column(name = "durata")
    private Integer durata;
    
    @Column(name = "costo", precision = 2, scale = 6)
    private BigDecimal costo;
    
    @Column(name = "data_creazione")
    private LocalDateTime dataCreazione;

    // GETTER AND SETTER
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public Integer getDurata() {
        return durata;
    }

    public void setDurata(Integer durata) {
        this.durata = durata;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public LocalDateTime getDataCreazione() {
        return dataCreazione;
    }

    public void setDataCreazione(LocalDateTime dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    // EQUALS AND HASHCODE
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.id);
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
        final Corso other = (Corso) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    // TO STRING  
    @Override
    public String toString() {
        return "Corso{" + "id=" + id + ", titolo=" + titolo + ", descrizione=" + descrizione + ", dataInizio=" + dataInizio + ", durata=" + durata + ", costo=" + costo + ", dataCreazione=" + dataCreazione + '}';
    }
    
    
    
    
    
    
}
