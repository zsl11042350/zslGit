package com.neusoft.object.answer.ex01;

public class TestSoftwareTeacher {

	public static void main(String[] args) {
		SoftwareTeacher mt = new SoftwareTeacher();
		mt.name="软件老师";
		mt.startWork(7);
		mt.teach("软件");
		mt.offWork(8);
		mt.teachProcedure();

	}

}
