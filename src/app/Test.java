/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Category;
import model.WordModel;

/**
 *
 * @author user
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GameGuessAWordDatabasePU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT m FROM Category m");
        List<Category> wm = query.getResultList();

        System.out.println("Ukuran: " + wm.size());
        for (Category category : wm) {
            System.out.println(category.getId());
            System.out.println(category.getName());
        }
        
        em.close();
    }

}
