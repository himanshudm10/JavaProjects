package Day_9;

public class Account_Main {

	public static void main(String[] args) {
		
		Account acc= new Account();
		acc.setAccno(5128710);
		System.out.println(acc.getAccno());
		acc.setName("Himanshu");
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
		
	}

}
