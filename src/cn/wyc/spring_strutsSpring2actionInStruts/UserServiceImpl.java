package cn.wyc.spring_strutsSpring2actionInStruts;

public class UserServiceImpl implements UserService {
	private UserDao userdao;
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public void register(User user) {
		userdao.save(user);
	}

}
