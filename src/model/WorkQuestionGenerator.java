/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author user
 */
public class WorkQuestionGenerator {

    List<WordModel> bankSoal;
    List<Category> wm;
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("GameGuessAWordDatabasePU");

    public WorkQuestionGenerator() {
    }

    
    public List<Category> getCategory() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT c FROM Category c");
        wm = query.getResultList();

        return wm;
    }

    public String[] showCategory() {
        List<Category> cat = getCategory();
        int size = cat.size();
        String namaCategory[] = new String[size];
        for (int i = 0; i < size; i++) {
            namaCategory[i] = cat.get(i).getName();
        }
        System.out.println("Jumlah kategori: " + size);

        return namaCategory;
    }

    public List<WordModel> getSoal(String a) {
        EntityManager em = emf.createEntityManager();
        String kata = a;
        Query query = em.createQuery("SELECT w FROM Category w WHERE w.name = :categoryName");
        query.setParameter("categoryName", kata);
        Category c = (Category) query.getSingleResult();
        bankSoal = c.getWordModels();
        em.close();
        
        return bankSoal;
    }
}
