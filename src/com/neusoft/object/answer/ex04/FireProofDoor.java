package com.neusoft.object.answer.ex04;

public class FireProofDoor extends Door implements FireSafe{

	void open() {
		System.out.println("FireProofDoor can open!");
	}

	void close() {
		System.out.println("FireProofDoor can close!");
	}

	public void fireProof() {
		System.out.println("FireProofDoor can fire_proof!");
	}

}
