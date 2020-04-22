package com.neusoft.object.answer.ex04;

public class Test {

	public static void main(String[] args) {
		BulletProofDoor b_door=new BulletProofDoor();
		b_door.bulletProof();
		b_door.close();
		b_door.open();
		FireProofDoor f_door=new FireProofDoor();
		f_door.fireProof();
		f_door.close();
		f_door.open();
	}

}
