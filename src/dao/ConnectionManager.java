package dao;

import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

public class ConnectionManager {
		public DataSource getMySqlDataSource() {
			Properties props=new Properties();
			InputStream is=getClass().getClassLoader().getResourceAsStream("db.properties");
			MysqlDataSource mySqlDataSource=null;
			try {
				props.load(is);
				mySqlDataSource=new MysqlDataSource();
				mySqlDataSource.setURL(props.getProperty("url"));
				mySqlDataSource.setUser(props.getProperty("username"));
				mySqlDataSource.setPassword(props.getProperty("password"));
				
				
			} catch (Exception e) {
				System.err.println("An Error Occured!\n Error is:" + e);
			}
			return mySqlDataSource;
		}
}