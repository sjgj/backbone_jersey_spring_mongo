/**
 * 
 */
package com.sj.stack.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.sj.model.Users;

/**
 * @author SJ
 *
 */
public class IUsersImpl implements IUsers {

    @Autowired
    MongoTemplate mongoTemplate;
    
    /* (non-Javadoc)
     * @see com.sj.stack.core.IUsers#getUser(java.lang.String, java.lang.String)
     */
    public Users getUser(String username, String password) {
	// TODO Auto-generated method stub
	// query to search user
	Query searchUserQuery = new Query(Criteria.where("username").is(username).and(password).is(password));
	Users searchedUser = mongoTemplate.findOne(searchUserQuery, Users.class);	
	return searchedUser;
    }

    /* (non-Javadoc)
     * @see com.sj.stack.core.IUsers#findAllUsers()
     */
    public List<Users> findAllUsers() {
	// TODO Auto-generated method stub
	List<Users> listUser = mongoTemplate.findAll(Users.class);
	return listUser;
    }

    /* (non-Javadoc)
     * @see com.sj.stack.core.IUsers#saveUser(com.sj.model.Users)
     */
    public void saveUser(Users users) {
	// TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.sj.stack.core.IUsers#removeUser(com.sj.model.Users)
     */
    public void removeUser(Users users) {
	// TODO Auto-generated method stub

    }

}
