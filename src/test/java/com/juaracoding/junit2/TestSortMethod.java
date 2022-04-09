package com.juaracoding.junit2;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSortMethod {
	static final Logger log = getLogger(lookup().lookupClass());
	
	

	@Before
	public void setUp() throws Exception {
	}
	
	private static Logger getLogger(Class<?> lookupClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Rule
	public TestWatcher testWatcher = new TestWatcher() {
		
		@Override
		protected void succeeded(Description description) {
			log.debug("Pesan Sukses: {}", description.getMethodName());
		}
		
		@Override
		protected void failed(Throwable e, Description description) {
			log.debug("Pesan Failed: {}", description.getMethodName());
		}
	};

	
		@Test
		public void testB() {
			log.debug("Testing 2");
			System.out.println("Test 2");
			
		}

}
