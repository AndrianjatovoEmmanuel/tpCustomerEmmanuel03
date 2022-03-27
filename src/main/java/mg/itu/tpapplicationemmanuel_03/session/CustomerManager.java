/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package mg.itu.tpapplicationemmanuel_03.session;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import mg.itu.tpapplicationemmanuel_03.entities.Customer;

/**
 *
 * @author Emmanuel
 */
@Stateless
public class CustomerManager {
    
    @PersistenceContext(unitName = "customerPU")
    private EntityManager em;

    public void persist(Object object) {
      em.persist(object);
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public List<Customer> getAllCustomers() {
       Query query = em.createNamedQuery("Customer.findAll");
       return query.getResultList();
    } 
    
    public Customer getCustomer(int idCustomer) {  
      return em.find(Customer.class, idCustomer);  
    }
    public Customer update(Customer customer) {
      return null;  
    }     
}
