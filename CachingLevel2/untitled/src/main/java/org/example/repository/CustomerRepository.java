package org.example.repository;

import org.example.model.Customer;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    @Override
    public void createCustomer(Customer customer) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(customer);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.err.println(e);
        }
    }

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customerList = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            customerList = session
                    .createQuery("from Customer ", Customer.class)
                    .list();
        } catch (Exception e) {
            System.err.println(e);
        }
        return customerList;
    }
}
