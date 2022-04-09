package com.juaracoding.junit2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.juaracoding.junit2.bangunDatar.BangunDatar;
import com.juaracoding.junit2.bangunDatar.BangunRuang;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestBangunRuang {

	
	BangunRuang bangunRuang;

	@Before
	public void setUp() throws Exception {
		bangunRuang = new BangunRuang();
	}

	@Test
	@FileParameters("src/test/resources/balok.csv")
	public void testVolumeBalok(double p, double l, double t, double expect) {
		double actual = bangunRuang.volumeBalok(p, l, t);
		assertEquals(expect, actual, 0.0);
	}
	
	@Test
	@FileParameters("src/test/resources/luasbalok.csv")
	public void testLuasBalok(double p, double l, double t, double expect) {
		double actual = bangunRuang.luasBalok(p, l, t);
		assertEquals(expect, actual, 0.0);
	}
	
	@Test
	@FileParameters("src/test/resources/VolumTabung.csv")
	public void testVolumeTabung(double r, double t, double expect) {
		double actual = bangunRuang.volumeTabung(r, t);
		assertEquals(expect, actual, 0.4);
	}

}
