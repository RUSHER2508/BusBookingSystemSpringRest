package com.bbs.spring.rest.dao;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.bbs.spring.beans.Admin;
import com.bbs.spring.beans.Bus;
import com.bbs.spring.beans.Ticket;
import com.bbs.spring.beans.User;

@Repository
public class JPAAdminImpl implements AdminDaoBBS{
	private static EntityManagerFactory  emf = Persistence.createEntityManagerFactory("myPersistanceUnit");
	Bus bus = new Bus();
	Admin admin = new Admin();
	
	//For create  operation
	public Bus createBus(Bus bus) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(bus);
		em.getTransaction().commit();
		em.close();
		return bus;
	}
	
	//For  update  operation
	public Bus updateBus(String source, String destination, Double price, Integer busId) {
		try {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
	  bus = em.find(Bus.class,busId);
	  bus.setSource(source);
	  bus.setDestination(destination);
	  bus.setPrice(price);
		em.getTransaction().commit();
		em.close();
		return bus;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//For search operation
	public Bus searchBus(Integer busId) {
		 EntityManager em = emf.createEntityManager();
	       Query query = em.createQuery("from Bus u where u.busId= :busid ");
	       query.setParameter("busid", busId );
	       em.getTransaction().begin();
	       List bus=query.getResultList();
	       em.getTransaction().commit();
	      Bus bus1= (Bus) bus.get(0);
	      return bus1;
	}
	
	//For delete operation
	public Bus deletebus(Integer busId) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Bus bus = em.find(Bus.class,busId );
		em.remove(bus);
		em.getTransaction().commit();
		return bus;
	}
	
	//To check bus between source and destination
	public List<Bus> busBetween(String source, String destination) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<Bus> query = em.createQuery("Select b from Bus b where b.source= :source and b.destination= :destination",Bus.class);
		query.setParameter("source",source);
		query.setParameter("destination",destination);
		List<Bus> buses = query.getResultList();
		bus = buses.get(0);
		em.close();
		return buses;
	
	}
	
	//For login operation
	public Admin adminLogin(Integer adminId, String password) {
		try{
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			TypedQuery<Admin> query = em.createQuery("from Admin where adminId= :id and password= :passwd", Admin.class);
			query.setParameter("id", adminId);
			query.setParameter("passwd", password);
			List<Admin> admins = query.getResultList();
			admin = admins.get(0);
			em.getTransaction().commit();
			em.close();
			return admin;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	
}
	}

