package fpl.draftpick.app.dao.user;

import fpl.draftpick.app.model.user.User;

public interface IUserDAO {
	
	/**
     * finds a user given its username
     *
     * @param username - the username of the searched user
     * @return  a matching user, or null if no user found.
     */
    public User findUserByUsername(String username);
    
    /**
    *
    * save changes made to a user, or insert it if its new
    *
    * @param user
    */
   public void save(User user);

   /**
    * checks if a username is still available in the database
    *
    * @param username - the username to be checked for availability
    * @return true if the username is still available
    */
   public boolean isUsernameAvailable(String username);

}
