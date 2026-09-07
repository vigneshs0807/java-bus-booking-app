package project;

enum Berth{
	UPPER,LOWER
}

public class Passenger {
	
	int pid;
	String name;
	Berth prefBerth;
	Berth allocatedBerth;
	
	@Override
	public String toString() {
		return "Passenger [pid=" + pid + ", name=" + name + ", prefBerth=" + prefBerth + ", allocatedBerth="
				+ allocatedBerth + "]";
	}
	public Passenger(int pid, String name, Berth prefBerth) {
		super();
		this.pid = pid;
		this.name = name;
		this.prefBerth = prefBerth;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Berth getPrefBerth() {
		return prefBerth;
	}
	public void setPrefBerth(Berth prefBerth) {
		this.prefBerth = prefBerth;
	}
	public Berth getAllocatedBerth() {
		return allocatedBerth;
	}
	public void setAllocatedBerth(Berth allocatedBerth) {
		this.allocatedBerth = allocatedBerth;
	}

}
