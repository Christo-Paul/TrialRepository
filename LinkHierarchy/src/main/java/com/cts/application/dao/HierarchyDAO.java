package com.cts.application.dao;

import java.util.List;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.application.model.PageA;
import com.cts.application.model.PageB;
import com.cts.application.model.PageC;
import com.cts.application.model.PageD;

@PropertySource("classpath:sql.properties")
@Repository
public class HierarchyDAO {
/*	@PersistenceContext
	@Autowired
	private EntityManager entityManager;*/

	@Value("${db.query.PageA}")
	private String queryPageA;

	@Value("${db.query.PageB}")
	private String queryPageB;

	@Value("${db.query.PageC}")
	private String queryPageC;

	@Value("${db.query.PageD}")
	private String queryPageD;

	
	@Autowired
	SessionFactory sf;
	
	public List<PageA> getAllPageAContent() {
 Session s=sf.getCurrentSession();
 List<PageA> page_A_List=s.createQuery(queryPageA).getResultList();
		//List<PageA> page_A_List = entityManager.createQuery(queryPageA).getResultList();
		return page_A_List;
	}

	public List<PageB> getAllPageBContent(String link_name) {
		Session s=sf.getCurrentSession();
		//List<PageB> page_B_List = entityManager.createQuery(queryPageB).setParameter(1, link_name).getResultList();
		List<PageB> page_B_List =s.createQuery(queryPageB).setParameter(1, link_name).getResultList();
		return page_B_List;

	}

	public List<PageC> getAllPageCContent(String link_name) {
		Session s=sf.getCurrentSession();
		List<PageC> page_C_List = s.createQuery(queryPageC).setParameter(1, link_name).getResultList();
		//List<PageC> page_C_List = entityManager.createQuery(queryPageC).setParameter(1, link_name).getResultList();
		return page_C_List;

	}

	public List<PageD> getAllPageDContent(String link_nameD) {
		Session s=sf.getCurrentSession();
		List<PageD> page_D_List = s.createQuery(queryPageD).setParameter(1, link_nameD).getResultList();
		//List<PageD> page_D_List = entityManager.createQuery(queryPageD).setParameter(1, link_nameD).getResultList();
		return page_D_List;
	}

}
