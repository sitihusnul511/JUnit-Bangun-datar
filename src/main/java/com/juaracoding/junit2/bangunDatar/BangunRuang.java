package com.juaracoding.junit2.bangunDatar;

public class BangunRuang {
	
	double phi = 3.14;
	public double volumeBalok (double p, double l, double t) {
		return p*l*t;
	}
	
	public double luasBalok (double p, double l, double t) {
		return 2*((p*l)+(p*t)+(l*t));
	}
	
	public double volumeTabung (double r, double t) {
		return 3.14*r*r*t;
	}
	
	
}
