package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.bean.User;

public class UserDAO extends DAO{
	public User search(String id,String pass) throws Exception {
		User user = null;
		Connection con=getConnection();
		
		PreparedStatement st;
		st=con.prepareStatement("select * from members where id=? and pass=?");
		st.setString(1, id);
		st.setString(2, pass);
		ResultSet rs=st.executeQuery();
		
		while(rs.next()) {
			user=new jp.co.aforce.bean.User();
			user.setId(rs.getString("id"));
			user.setPass(rs.getString("pass"));
			user.setName(rs.getString("name"));
		}
		
		st.close();
		con.close();
		return user;
	}
}
