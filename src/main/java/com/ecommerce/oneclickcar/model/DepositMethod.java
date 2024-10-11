package com.ecommerce.oneclickcar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DepositMethods")
public class DepositMethod {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long idAccount;
	@Column(nullable=false)
	private String nameAccount;
	@Column(nullable=false)
	private String nameBank;
	@Column(nullable=false)
	private String accountBank;
	@Column(nullable=false)
	private Long usersIdUser;
	
	// Constructores
	
	public DepositMethod() {
	}
	
		public DepositMethod(String nameAccount, String nameBank, String accountBank,
			Long usersIdUser) {
		this.nameAccount = nameAccount;
		this.nameBank = nameBank;
		this.accountBank = accountBank;
		this.usersIdUser = usersIdUser;
	}

		// Getters and setters
	public Long getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(Long idAccount) {
		this.idAccount = idAccount;
	}
	
	public String getNameAccount() {
		return nameAccount;
	}
	
	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}
	
	public String getNameBank() {
		return nameBank;
	}
	
	public void setNameBank(String nameBank) {
		this.nameBank = nameBank;
	}
	
	public String getAccountBank() {
		return accountBank;
	}
	
	public void setAccountBank(String accountBank) {
		this.accountBank = accountBank;
	}
	
	public Long getUsersIdUser() {
		return usersIdUser;
	}
	
	public void getUsersIdUser(Long usersIdUser) {
		this.usersIdUser = usersIdUser;
	}
	
	@Override
	public String toString() {
		return "DepositMethod [idAccount=" + idAccount + ", nameAccount=" + nameAccount + ", nameBank=" + nameBank
				+ ", accountBank=" + accountBank + ", usersIdUser=" + usersIdUser + "]";
	}
	
	
}
