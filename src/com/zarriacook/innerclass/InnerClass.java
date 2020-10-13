package com.zarriacook.innerclass;

class Outside{
	public String data = "I'm the outer class. Hello.";
	
	class Inside{

		public void innerMethod() {
		System.out.println(data);
		}

	}
}


public class InnerClass {

	public static void main(String[] args) {
		Outside o = new Outside();
		Outside.Inside i = o.new Inside();
		i.innerMethod();
	}

}










