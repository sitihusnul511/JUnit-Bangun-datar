package com.juaracoding.junit2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.juaracoding.junit2.bangunDatar.BangunDatar;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestBangunDatar {
	
	private static final Double Null = null;
	BangunDatar bangunDatar;

	@Before
	public void setUp() throws Exception {
		bangunDatar = new BangunDatar();
	}
	
	@Test
	@FileParameters("src/test/resources/segitiga.csv")
	public void testLuasSegitiga(double a, double t,  double expect) {
		
		double actual = bangunDatar.luasSegitiga(a, t);
		assertEquals(expect, actual, 0.0);
	}
	
	
	@Test
	public void testLuasSegitigaAngkaNegatif() {
		double a = -4;
		double t = -5;
		
		double actual = bangunDatar.luasSegitiga(a, t);
		
		assertEquals(10, actual, 0.0);
	}
	
	@Test
	public void testLuasSegitigaAngkaNull() {
		double a = 0;
		double t = 0;
		Double aNull = Null;
		Double tNull = Null;
		
		double actual = bangunDatar.luasSegitiga(a, t);
		
		assertNull(aNull);
		assertNull(tNull);
		assertEquals(0, actual, 0.0);
	}
	
	@Test
	@FileParameters("src/test/resources/persegi.csv")
	public void testLuasPersegi(double sisi, double expect) {
		
		double actual = bangunDatar.luasPersegi(sisi);
		assertEquals(expect, actual, 0.0);
	}
	
	@Test
	public void testLuasPersegiBukanAngka() {
		String sisiBukanAngka = "A";
		double convert = Double.parseDouble(sisiBukanAngka);
		double actual = bangunDatar.luasPersegi(convert);
		String expect = "A";
		assertEquals(Double.parseDouble(expect), actual, 0.0);
	}
	
	@Test
	public void testLuasPersegiAngkaNegatif() {
		double sisi = -4;
		
		double actual = bangunDatar.luasPersegi(sisi);
		
		assertEquals(16, actual, 0.0);
	}
	
	@Test
	public void testLuasPersegiAngkaNull() {
		double sisi = 0;
		Double sisiNull = Null;
		
		double actual = bangunDatar.luasPersegi(sisi);
		
		assertNull(sisiNull);
		assertEquals(0, actual, 0.0);
	}
	

}
