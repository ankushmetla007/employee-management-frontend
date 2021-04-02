package com.nagarro.dao;

import com.nagarro.models.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
 
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
    private UserDaoImpl() {	
    }
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    @SuppressWarnings( { "unchecked" } )
	public User validateUser(User user) {
    	String uname = user.getUsername();
    	String upwd = user.getPassword();
    	String sqlQuery = "from User";
    	User resultUser = null;
		try {
            List<User> userObj = (List<User>) hibernateTemplate.find(sqlQuery);
            if(userObj != null && userObj.size() > 0) {
            	for(User dbUser:userObj) {
            		if(dbUser.getUsername().equals(uname)&&dbUser.getPassword().equals(upwd))
            			resultUser = dbUser;
            	}
            }
        } catch(Exception e) {
            e.printStackTrace();   
        }
        return resultUser;
	}
}
