package com.cts.application.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
	@PersistenceContext
	private EntityManager entityManager;

	@Value("${db.query.PageA}")
	private String queryPageA;

	@Value("${db.query.PageB}")
	private String queryPageB;

	@Value("${db.query.PageC}")
	private String queryPageC;

	@Value("${db.query.PageD}")
	private String queryPageD;

	public List<PageA> getAllPageAContent() {

		List<PageA> page_A_List = entityManager.createQuery(queryPageA).getResultList();
		return page_A_List;
	}

	public List<PageB> getAllPageBContent(String link_name) {

		List<PageB> page_B_List = entityManager.createQuery(queryPageB).setParameter(1, link_name).getResultList();
		return page_B_List;

	}

	public List<PageC> getAllPageCContent(String link_name) {

		List<PageC> page_C_List = entityManager.createQuery(queryPageC).setParameter(1, link_name).getResultList();
		return page_C_List;

	}

	public List<PageD> getAllPageDContent(String link_nameD) {

		List<PageD> page_D_List = entityManager.createQuery(queryPageD).setParameter(1, link_nameD).getResultList();
		return page_D_List;
	}

}
