package com.tcs.springmvcorm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<EmployeeT> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Employee", EmployeeT.class).getResultList();
    }

    @Override
    public void saveEmployee(EmployeeT employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }
}

