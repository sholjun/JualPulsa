/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sholjun.pulsa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sholjun
 */
@Entity
public class jualpulsa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nama;
    private String no_hp;
    private String saldo;
    private String pulsa;
    private String tglsaldo;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof jualpulsa)) {
            return false;
        }
        jualpulsa other = (jualpulsa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sholjun.pulsa.jualpulsa[ id=" + id + " ]";
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the no_hp
     */
    public String getNo_hp() {
        return no_hp;
    }

    /**
     * @param no_hp the no_hp to set
     */
    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    /**
     * @return the saldo
     */
    public String getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tglsaldo
     */
    public String getTglsaldo() {
        return tglsaldo;
    }

    /**
     * @param tglsaldo the tglsaldo to set
     */
    public void setTglsaldo(String tglsaldo) {
        this.tglsaldo = tglsaldo;
    }

    /**
     * @return the pulsa
     */
    public String getPulsa() {
        return pulsa;
    }

    /**
     * @param pulsa the pulsa to set
     */
    public void setPulsa(String pulsa) {
        this.pulsa = pulsa;
    }
    
}
