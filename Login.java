package org.cap.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login {
			@Id
			private int userName;
			private String password;
			public Login() {
				
			}
			public Login(int userName, String password) {
				super();
				this.userName = userName;
				this.password = password;
			}
			public int getUserName() {
				return userName;
			}
			public void setUserName(int userName) {
				this.userName = userName;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			@Override
			public String toString() {
				return "Login [userName=" + userName + ", password=" + password + "]";
			}
			
			
			
			
}
