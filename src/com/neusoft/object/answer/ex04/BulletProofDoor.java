package com.neusoft.object.answer.ex04;

public class BulletProofDoor extends Door implements BulletSafe{

	void open() {
		System.out.println("BulletProofDoor can open!");
	}

	void close() {
		System.out.println("BulletProofDoor can close!");
	}

	public void bulletProof() {
		System.out.println("BulletProofDoor can bullet_proof!");	
	}
}
