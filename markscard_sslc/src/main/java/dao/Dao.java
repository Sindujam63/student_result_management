package dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Dto;

public class Dao
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

public void insert(Dto d1)
{
	entityTransaction.begin();
	entityManager.persist(d1);
	entityTransaction.commit();
}


public Dto student_marks(int usn1)
{
Dto s1=entityManager.find(Dto.class, usn1);
return s1;
}


public List<Dto> fetchall()
{
	Query q1=entityManager.createQuery("select data from Dto data");
	 List<Dto> l1=q1.getResultList();
	return l1;
}


public void update(Dto d1)
{
	entityTransaction.begin();
	entityManager.merge(d1);
	entityTransaction.commit();
}


public String delete(int usn1) 
{
	Dto d1=entityManager.find(Dto.class, usn1);
	if(d1!=null)
	{
		entityTransaction.begin();
		entityManager.remove(d1);
		entityTransaction.commit();
		return "<h1>data deleted sucessfully</h1>";
	}
	else
		return "<h1>data not found</h1>";
			
}
 
}



