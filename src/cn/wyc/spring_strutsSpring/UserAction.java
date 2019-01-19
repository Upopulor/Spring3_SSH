package cn.wyc.spring_strutsSpring;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	private UserService us;
	public void setUs(UserService us) {
		this.us = us;
	}
	//зЂВс
	public String register() {
		us.register(user);
		return "success";
	}

}
