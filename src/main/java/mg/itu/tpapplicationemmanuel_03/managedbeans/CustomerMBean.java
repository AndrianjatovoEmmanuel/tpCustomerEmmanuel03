/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.tpapplicationemmanuel_03.managedbeans;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import mg.itu.tpapplicationemmanuel_03.entities.Customer;
import mg.itu.tpapplicationemmanuel_03.session.CustomerManager;

/**
 *
 * @author Emmanuel
 */
@Named(value = "customerMBean")
@ViewScoped
public class CustomerMBean implements Serializable {
    private List<Customer> customers; 
    
    @EJB
    private CustomerManager customerManager;
    
    
    /**
     * Creates a new instance of CustomerMBean
     */
    public CustomerMBean() {
    }
    
    public List<Customer> getCustomers() {
      if (customers == null) {
        customers = customerManager.getAllCustomers();
      }
      return customers;
    } 
    
}
