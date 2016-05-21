package fpl.draftpick.app.dao.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import fpl.draftpick.app.model.user.User;

@Repository
public class UserDAOImpl implements IUserDAO {
	
	@PersistenceContext
    private EntityManager em;

	@Override
	public User findUserByUsername(String username) {
		List<User> users = em.createNamedQuery(User.FIND_BY_USERNAME, User.class)
                .setParameter("username", username)
                .getResultList();

        return users.size() == 1 ? users.get(0) : null;
	}

	@Override
	public void save(User user) {
		 em.merge(user);
	}

	@Override
	public boolean isUsernameAvailable(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
