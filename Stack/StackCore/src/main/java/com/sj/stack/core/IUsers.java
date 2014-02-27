/**
 * 
 */
package com.sj.stack.core;

import java.util.List;

import com.sj.model.Users;

/**
 * @author SJ
 *
 */
public interface IUsers {
    public Users getUser(String username,String password);
    public List<Users>findAllUsers();
    public void saveUser(Users users);
    public void removeUser(Users users);   
    
}
