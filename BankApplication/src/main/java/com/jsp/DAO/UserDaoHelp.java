package com.jsp.DAO;

public class UserDaoHelp {
  public static UserDao userDao() {
	UserDao user = new  UserDaoImpl();
	return user;
  }
}
