package collectionsdemo.libraryms;

/**
* author: Shradhey.Naudiyal
* date: Sep 9, 2025
* time: 2:16:39 PM
* project: Corejava
*/

public class Member {
	private int id;
    private String name;
    private String email;
    private String phoneNumber;
    
    
	public Member(int id, String name, String email, String phoneNumber) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}
    
    
}
