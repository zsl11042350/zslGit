package com.neusoft.$temp.fanxing.oldWay;

import java.util.Arrays;

public class Factory {
	Qishui[] qishuis=new Qishui[100];
	int i=0;
	
	public void produce(Qishui qishui) {
		qishuis[i++]=qishui;
	}

	@Override
	public String toString() {
		return "Factory [qishuis=" + Arrays.toString(qishuis) + ", i=" + i + "]";
	}
	
}
