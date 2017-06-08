/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sholjun.pulsa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author sholjun
 */
public class queryQu {
    public void Add(Object object) {
        
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("Sholjun_PulsaPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        try {
                em.persist(object);
                em.getTransaction().commit();
        } catch (Exception e) {
                e.printStackTrace();
                em.getTransaction().rollback();
        } finally {
                em.close();
        }
    }
    
  public void update(long a,String b,String c){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("Sholjun_PulsaPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        em.createQuery("UPDATE jualpulsa e SET e.nama=?1,e.no_hp=?2 WHERE e.id=?3",jualpulsa.class).setParameter(1, b).setParameter(2, c).setParameter(3, a).executeUpdate();
        em.getTransaction().commit();
        
       
    }
  public void hapus(long id){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("Sholjun_PulsaPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        int hapusyu=em.createQuery("DELETE FROM jualpulsa e WHERE e.id=:par").setParameter("par", id).executeUpdate();
        em.getTransaction().commit();
      
  }
  public void Show() {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("Sholjun_PulsaPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT e FROM jualpulsa e");
        List<jualpulsa> result = query.getResultList();
        for (jualpulsa e : result) {
                 System.out.println("ID AGEN :"+ e.getId() + "\n NAMA :" + e.getNama()+ "\n NO HP :" +e.getNo_hp()+"\n Saldo :"+e.getSaldo());   
        }
    }
}
