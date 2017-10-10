/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author user
 */

@Entity
@Table(name = "Soal")
public class WordModel implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String kata;
    private String hint;

    @Transient
    private String jawaban;
    
    
    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    public String acakHuruf() {
        setKata(getKata().toUpperCase());
        String arrayOfWord[] = getKata().split("");
        List<String> hurufHuruf = Arrays.asList(arrayOfWord); //Arrays.aslist digunakan untuk mengubah dari array ke list
        Collections.shuffle(hurufHuruf);

        StringBuilder sb = new StringBuilder();
        for (String huruf : hurufHuruf) {
            if (!(huruf.equals(" "))) {
                sb.append(huruf);
            }
        }
        return sb.toString();
    }

    public boolean cekJawaban() {
        boolean hasil = false;
        if (getJawaban().equalsIgnoreCase(getKata())) {
            hasil = true;
        }
        return hasil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WordModel)) {
            return false;
        }
        WordModel other = (WordModel) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.WordModel[ id=" + getId() + " ]";
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the soal
     */
    public String getSoal() {
        return getKata();
    }

    /**
     * @param soal the soal to set
     */
    public void setSoal(String soal) {
        this.setKata(soal);
    }

    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }

    /**
     * @return the jawaban
     */
    public String getJawaban() {
        return jawaban;
    }

    /**
     * @param jawaban the jawaban to set
     */
    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    /**
     * @return the kata
     */
    public String getKata() {
        return kata;
    }

    /**
     * @param kata the kata to set
     */
    public void setKata(String kata) {
        this.kata = kata;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

}
