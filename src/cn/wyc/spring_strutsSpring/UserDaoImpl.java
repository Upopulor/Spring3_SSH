package cn.wyc.spring_strutsSpring;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
//�ײ���ҪsessionFactory���Զ�����Hibernatetemplate
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
//	private HibernateTemplate hibernateTemplate;
//	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
//		this.hibernateTemplate = hibernateTemplate;
//	}
	@Override
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

}
