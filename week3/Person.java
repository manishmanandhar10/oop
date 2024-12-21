package Workshop3;

public interface Person {
	public void canWalk();
}


class Tyler implements Person{
	public void canWalk() {
		System.out.println("Tyler can Walk.");
	}
}