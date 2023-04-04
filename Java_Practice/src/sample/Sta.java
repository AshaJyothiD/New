 package sample;

import java.util.Stack;

public class Sta {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("color pencils");
		stack.push("marker");
		stack.push("rubberband");
		//stack.add(0,"white");
		
		//stack.set(0,"black");//update the value of index 0
		//System.out.println(stack.search("rubberband"));
		System.out.println(stack.isEmpty());
		System.out.println(stack.empty());

	}

}
