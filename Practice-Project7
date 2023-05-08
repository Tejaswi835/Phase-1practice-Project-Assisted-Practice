package implicit;

class OuterClass {
	int x = 20;

	class InnerClass {
		int y = 2;
	}

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		System.out.println(inner.y + outer.x);
	}
}
