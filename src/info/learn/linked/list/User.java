package info.learn.linked.list;

public class User {

	private String name = null;
	private int age;
	private String email = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", email=" + email + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object user) {
		User obj = (User) user;
		if (obj.getEmail() == null || obj.getName() == null) {
			return false;
		} else if (obj.getEmail().equals(this.getEmail()) && obj.getAge() == this.getAge()
				&& obj.getName().equals(this.getName())) {
			return true;
		}
		return false;
	}

	public User(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

	@Override
	public int hashCode() {
		return null != this.getEmail() ? this.getEmail().hashCode()
				: 0 + this.getName() != null ? this.getName().hashCode() : 0 + this.getAge();
	}
}
