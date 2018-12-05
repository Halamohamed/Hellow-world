package Lab2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Lab2.Customer.Customers;

public class Customer {
	public class Customers {
		//public static int idGenerator;
	
			public int id;
			public String Name;
			public String address;
			
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return Name;
			}
			public void setName(String name) {
				Name = name;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public Customers(int id, String name, String address) {
				super();
				
				this.id = id;
				Name = name;
				this.address = address;
			}
			@Override
			public String toString() {
				return "Customer [id=" + id + ", Name=" + Name + ", address=" + address + "]";
			}
			
		}
		
		
		List<Customer> customerList= new ArrayList<>();


		

		public List<Customer> getCustomerList() {
			return customerList;
		}

		public void addCustomer( String name, String address) {
			Customers person= new Customers( 1, name, address);
			customerList.addAll((Collection<? extends Customer>) person);		
		}
		
		
		
		

}
