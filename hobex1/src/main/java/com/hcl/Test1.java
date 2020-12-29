package com.hcl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hcl.domain.Emp;

public class Test1 {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
        Emp e=session.get(Emp.class, 1);
        System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getAddress());
        session.close();

	}

}
