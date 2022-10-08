package com.pom.manager;

import org.openqa.selenium.WebDriver;

import com.pom.CasualDresses;
import com.pom.ConfirmOrder;
import com.pom.ConfirmOrder1;
import com.pom.EveOrder;
import com.pom.EveOrder1;
import com.pom.EveOrder2;
import com.pom.EveningDress;
import com.pom.EveningPrinted;
import com.pom.EveningPrinted1;
import com.pom.LogOut;
import com.pom.Login_MyStore;
import com.pom.MyAccount_MyStore;
import com.pom.MyStore;
import com.pom.Order;
import com.pom.Order1;
import com.pom.Order2;
import com.pom.Payment;
import com.pom.Payment1;
import com.pom.PrintedDress;
import com.pom.PrintedDress1;

public class ProjectObjectManager {

	public WebDriver driver;

	private MyStore store;
	private Login_MyStore mylogin;
	private MyAccount_MyStore myAccStore;
	private CasualDresses casualdress;
	private PrintedDress printedDress;
	private PrintedDress1 printedDress1;
	private Order order;
	private Order1 order1;
	private Order2 order2;
	private Payment payment;
	private EveningDress eveningdress;
	private ConfirmOrder confirmorder;
	private EveningPrinted eveningprinted;
	private EveningPrinted1 eveningprinted1;
	private EveOrder eveOrder;
	private EveOrder1 eveOrder1;
	private EveOrder2 eveOrder2;
	private Payment1 payment1;
	private ConfirmOrder1 confirmorder1;
	private LogOut logOut;

	public ProjectObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}
	
	public LogOut getlogOut() {
		if (logOut == null) {
			logOut = new LogOut(driver);
		}
		return logOut;
	}

	public MyStore getStore() {
		if (store == null) {
			store = new MyStore(driver);
		}
		return store;
	}

	public Login_MyStore getMylogin() {
		if (mylogin == null) {
			mylogin = new Login_MyStore(driver);
		}
		return mylogin;
	}

	public MyAccount_MyStore getMyAccStore() {
		if (myAccStore == null) {
			myAccStore = new MyAccount_MyStore(driver);
		}
		return myAccStore;
	}

	public CasualDresses getCasualdress() {
		if (casualdress == null) {
			casualdress = new CasualDresses(driver);
		}
		return casualdress;
	}

	public PrintedDress getPrintedDress() {
		if (printedDress == null) {
			printedDress = new PrintedDress(driver);
		}
		return printedDress;
	}

	public PrintedDress1 getPrintedDress1() {
		if (printedDress1 == null) {
			printedDress1 = new PrintedDress1(driver);
		}
		return printedDress1;
	}

	public Order getOrder() {
		if (order == null) {
			order = new Order(driver);
		}
		return order;
	}

	public Order1 getOrder1() {
		if (order1 == null) {
			order1 = new Order1(driver);
		}
		return order1;
	}

	public Order2 getOrder2() {
		if (order2 == null) {
			order2 = new Order2(driver);
		}
		return order2;
	}

	public Payment getPayment() {
		if (payment == null) {
			payment = new Payment(driver);
		}
		return payment;
	}

	public EveningDress getEveningdress() {
		if (eveningdress==null) {
			eveningdress = new EveningDress(driver);
		}
		return eveningdress;
	}

	public ConfirmOrder getConfirmorder() {
		if (confirmorder == null) {
			confirmorder = new ConfirmOrder(driver);
		}
		return confirmorder;
	}

	public EveningPrinted getEveningprinted() {
		if (eveningprinted == null) {
			eveningprinted = new EveningPrinted(driver);
		}
		return eveningprinted;
	}

	public EveningPrinted1 getEveningprinted1() {
		if (eveningprinted1 == null) {
			eveningprinted1 = new EveningPrinted1(driver);
		}
		return eveningprinted1;
	}

	public EveOrder getEveOrder() {
		if (eveOrder == null) {
			eveOrder = new EveOrder(driver);
		}
		return eveOrder;
	}

	public EveOrder1 getEveOrder1() {
		if (eveOrder1 == null) {
			eveOrder1 = new EveOrder1(driver);
		}
		return eveOrder1;
	}

	public EveOrder2 getEveOrder2() {
		if (eveOrder2 == null) {
			eveOrder2 = new EveOrder2(driver);
		}
		return eveOrder2;
	}

	public Payment1 getPayment1() {
		if (payment1 == null) {
			payment1 = new Payment1(driver);
		}
		return payment1;
	}

	public ConfirmOrder1 getConfirmorder1() {
		if (confirmorder1 == null) {
			confirmorder1 = new ConfirmOrder1(driver);
		}
		return confirmorder1;
	}

}
