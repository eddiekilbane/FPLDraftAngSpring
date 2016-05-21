package fpl.draftpick.app.model.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.dom4j.tree.AbstractEntity;

/**
*
* The User JPA entity.
*
*/
@Entity
@Table(name = "USERS")
@NamedQueries({
       @NamedQuery(
               name = User.FIND_BY_USERNAME,
               query = "select u from User u where username = :username"
       ),
      /* @NamedQuery(
               name = User.COUNT_TODAYS_CALORIES,
               query = "select sum(m.calories) from Meal m where m.user.username = :username and m.date = CURRENT_DATE"
       )*/
})
public class User extends AbstractEntity {

   public static final String FIND_BY_USERNAME = "user.findByUserName";
   public static final String COUNT_TODAYS_CALORIES = "user.todaysCalories";

   @Id
   private int user_id;
   private String username;
   private String password;
   private String email;
   private boolean enabled;
   private int draft_order;
   
   public User() {

   }

   public User(int userId, String username, String password, String email, boolean enabled, int draftOrder) {
       this.user_id = userId;
	   this.username = username;
       this.password = password;
       this.email = email;
       this.enabled = enabled;
       this.draft_order = draftOrder;
   }

   public String getUsername() {
       return username;
   }

   public void setUsername(String username) {
       this.username = username;
   }
   
   public String getEmail() {
       return email;
   }

   public void setEmail(String email) {
       this.email = email;
   }

   public int getUser_id() {
	return user_id;
}

public void setUser_id(int user_id) {
	this.user_id = user_id;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public boolean isEnabled() {
	return enabled;
}

public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}

public int getDraft_order() {
	return draft_order;
}

public void setDraft_order(int draft_order) {
	this.draft_order = draft_order;
}

public String toString() {
       return "User{" +
               "username='" + username + '\'' +
               ", email='" + email + 
               '}';
   }
}

