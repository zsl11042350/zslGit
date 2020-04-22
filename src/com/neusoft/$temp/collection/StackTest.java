package com.neusoft.$temp.collection;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("zhangsan");
		stack.push("lisi");
		stack.push("wangwu");
		System.out.println(stack.pop());
		System.out.println(stack.peek());//用peek,pop方法查看遵循后进先出的栈中顺序
		System.out.println(stack);//打印顺序没变
	}
}
