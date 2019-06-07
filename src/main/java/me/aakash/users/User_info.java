package me.aakash.users;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User_info {
	
		@Id
	    private long mob_number;
	   
		@Column(name="usrname")
	   private String usrname;
		
		@Column(name="email")
	   private String email;
		
		

		/**
		 * @param mob_number
		 * @param usrname
		 * @param email
		 */
		public User_info(long mob_number, String usrname, String email) {
			this.mob_number = mob_number;
			this.usrname = usrname;
			this.email = email;
		}

		public long getMob_number() {
			return mob_number;
		}

		public void setMob_number(long mob_number) {
			this.mob_number = mob_number;
		}

		public String getUsrname() {
			return usrname;
		}

		public void setUsrname(String usrname) {
			this.usrname = usrname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		};
	   
	   

}
