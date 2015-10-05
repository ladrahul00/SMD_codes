
public abstract class Person {
	private Name name;
	private Address address;
	private Gender gender;
	private int age;
	
	public Person(Name n, Address addr, Gender g, int ag){
		super();
		this.name = n;
		this.address = addr;
		this.gender = g;
		this.age = ag;
	}
	
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		
		builder.append("[ ");
		builder.append(name);
		builder.append(", ");
		builder.append(address);
		builder.append(", ");
		builder.append(gender);
		builder.append(", ");
		builder.append(age);
		builder.append(" ]");
		
		return builder.toString();
	}
	
}
