package java9;

public class DiamondWithAnonymous {
	public static void main(String[] args) {
		Anonymous<String> ano = new Anonymous<>() {
			public void hack(String t) {
				System.out.println("anonymous hacking");
			};
		};
		ano.hack("diamond operator...");
	}
}

class Anonymous<T> {
	public void hack(T t) {
		System.out.println("hacking : " + t.getClass());
	}
}
