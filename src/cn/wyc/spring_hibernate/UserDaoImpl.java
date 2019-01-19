package cn.wyc.spring_hibernate;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class UserDaoImpl implements UserDao {
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public void save(User user) {
		this.hibernateTemplate.save(user);
	}

}
