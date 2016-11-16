package vn.smartdev.demo_bean_scopes;

import org.springframework.beans.factory.InitializingBean;

public class Database implements InitializingBean {

	private String url;
	private String username;
	private String password;

	private Connection connection;

	public Connection getConnection() {
		return connection;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public void afterPropertiesSet() throws Exception {
		if(url != "" && username !="" && password != ""){
			System.out.println("Connected !");		
		} else {
			System.out.println("No connect !");
		}		
	}
}