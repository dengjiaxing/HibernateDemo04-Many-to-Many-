package org.hibernate.entity;
import java.util.HashSet;
import java.util.Set;

public class User {
	private int userid; 				// User��ı�ʶ����
	private String name; 			//name����
	private String password;			//password����
	private Set<Address> addresses=new HashSet<Address>(); 				// User��Ĺ���ʵ������
	//�޲ι��췽��
	public User() {                                                                   
	}
	//��ʼ������User���ԵĹ��췽��
	public User(int userid, String name, String password, String type, Address address) {
		this.userid = userid;
		this.name = name;
		this.password = password;
	}
	// userid���Ե�getter��setter����
	public int getUseid() {
		return this. userid;
	}
	public void setUseid(int userid) {
		this. userid = userid;
	}
	//name��getter��setter����
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//password���Ե�getter��setter����
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//address��getter��setter����
	public Set<Address> getAddresses() {
		return this.addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

}
