package junit_tests;

import static org.junit.Assert.*;
import org.junit.Test;
import model.*;

public class PalindromeTest {
	
	// isPalindrome test
	@Test
	public void isPalindrome_returnsTrue_test1() {
		Palindrome p = new Palindrome();
		assertTrue(p.isPalindrome(""));
	}
	@Test
	public void isPalindrome_returnsTrue_test2() {
		Palindrome p = new Palindrome();
		assertTrue(p.isPalindrome("a"));
		assertTrue(p.isPalindrome("b"));
		assertTrue(p.isPalindrome("y"));
		assertTrue(p.isPalindrome("z"));
	}
	@Test
	public void isPalindrome_returnsTrue_test3() {
		Palindrome p = new Palindrome();
		assertTrue(p.isPalindrome("noon"));
		assertTrue(p.isPalindrome("madam"));
		assertTrue(p.isPalindrome("racecar"));
		assertTrue(p.isPalindrome("rotator"));
		assertTrue(p.isPalindrome("deified"));
	}
	@Test
	public void isPalindrome_returnsTrue_test4() {
		Palindrome p = new Palindrome();
		
		assertTrue(p.isPalindrome("A"));
		assertTrue(p.isPalindrome("B"));
		assertTrue(p.isPalindrome("Y"));
		assertTrue(p.isPalindrome("Z"));
		
		assertTrue(p.isPalindrome("Noon"));
		assertTrue(p.isPalindrome("NOON"));
		assertTrue(p.isPalindrome("NooN"));
		assertTrue(p.isPalindrome("nOOn"));
		
		assertTrue(p.isPalindrome("Madam"));
		assertTrue(p.isPalindrome("MADAM"));
		assertTrue(p.isPalindrome("MaDaM"));
		assertTrue(p.isPalindrome("mAdAm"));
		
		assertTrue(p.isPalindrome("Racecar"));
		assertTrue(p.isPalindrome("RACECAR"));
		assertTrue(p.isPalindrome("RaCeCaR"));
		assertTrue(p.isPalindrome("rAcEcAr"));
		
		assertTrue(p.isPalindrome("Rotator"));
		assertTrue(p.isPalindrome("ROTATOR"));
		assertTrue(p.isPalindrome("RoTaToR"));
		assertTrue(p.isPalindrome("rOtAtOr"));
		
		assertTrue(p.isPalindrome("Deified"));
		assertTrue(p.isPalindrome("DEIFIED"));
		assertTrue(p.isPalindrome("DeIfIeD"));
		assertTrue(p.isPalindrome("dEiFiEd"));
	}
	@Test
	public void isPalindrome_returnsFalse_test5() {
		Palindrome p = new Palindrome();
		
		assertFalse(p.isPalindromeRecursion("Hello"));
		assertFalse(p.isPalindromeRecursion("Palindrome"));
		assertFalse(p.isPalindromeRecursion("Programming"));
		
		assertFalse(p.isPalindromeRecursion("hello"));
		assertFalse(p.isPalindromeRecursion("palindrome"));
		assertFalse(p.isPalindromeRecursion("programming"));
		
		assertFalse(p.isPalindromeRecursion("HELLO"));
		assertFalse(p.isPalindromeRecursion("PALINDROME"));
		assertFalse(p.isPalindromeRecursion("PROGRAMMING"));
	}
	@Test
	public void isPalindrome_returnsTrue_test6() {
		Palindrome p = new Palindrome();
		assertTrue(p.isPalindrome("Step on no pets."));
		assertTrue(p.isPalindrome("Yo, Banana Boy!"));
		assertTrue(p.isPalindrome("Dammit, I'm mad."));
		assertTrue(p.isPalindrome("Was it a car or a cat I saw?"));
		assertTrue(p.isPalindrome("A man, a plan, a canal: Panama!"));
	}
	
	// isPalindrome2 test
	@Test
	public void isPalindrome2_returnsTrue_test1() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindrome2(""));
	}
	@Test
	public void isPalindrome2_returnsTrue_test2() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindrome2("a"));
	    assertTrue(p.isPalindrome2("b"));
	    assertTrue(p.isPalindrome2("y"));
	    assertTrue(p.isPalindrome2("z"));
	}
	@Test
	public void isPalindrome2_returnsTrue_test3() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindrome2("noon"));
	    assertTrue(p.isPalindrome2("madam"));
	    assertTrue(p.isPalindrome2("racecar"));
	    assertTrue(p.isPalindrome2("rotator"));
	    assertTrue(p.isPalindrome2("deified"));
	}
	@Test
	public void isPalindrome2_returnsTrue_test4() {
	    Palindrome p = new Palindrome();

	    assertTrue(p.isPalindrome2("A"));
	    assertTrue(p.isPalindrome2("B"));
	    assertTrue(p.isPalindrome2("Y"));
	    assertTrue(p.isPalindrome2("Z"));

	    assertTrue(p.isPalindrome2("Noon"));
	    assertTrue(p.isPalindrome2("NOON"));
	    assertTrue(p.isPalindrome2("NooN"));
	    assertTrue(p.isPalindrome2("nOOn"));

	    assertTrue(p.isPalindrome2("Madam"));
	    assertTrue(p.isPalindrome2("MADAM"));
	    assertTrue(p.isPalindrome2("MaDaM"));
	    assertTrue(p.isPalindrome2("mAdAm"));

	    assertTrue(p.isPalindrome2("Racecar"));
	    assertTrue(p.isPalindrome2("RACECAR"));
	    assertTrue(p.isPalindrome2("RaCeCaR"));
	    assertTrue(p.isPalindrome2("rAcEcAr"));

	    assertTrue(p.isPalindrome2("Rotator"));
	    assertTrue(p.isPalindrome2("ROTATOR"));
	    assertTrue(p.isPalindrome2("RoTaToR"));
	    assertTrue(p.isPalindrome2("rOtAtOr"));

	    assertTrue(p.isPalindrome2("Deified"));
	    assertTrue(p.isPalindrome2("DEIFIED"));
	    assertTrue(p.isPalindrome2("DeIfIeD"));
	    assertTrue(p.isPalindrome2("dEiFiEd"));
	}
	@Test
	public void isPalindrome2_returnsFalse_test5() {
	    Palindrome p = new Palindrome();

	    assertFalse(p.isPalindrome2("Hello"));
	    assertFalse(p.isPalindrome2("Palindrome"));
	    assertFalse(p.isPalindrome2("Programming"));

	    assertFalse(p.isPalindrome2("hello"));
	    assertFalse(p.isPalindrome2("palindrome"));
	    assertFalse(p.isPalindrome2("programming"));

	    assertFalse(p.isPalindrome2("HELLO"));
	    assertFalse(p.isPalindrome2("PALINDROME"));
	    assertFalse(p.isPalindrome2("PROGRAMMING"));
	}
	@Test
	public void isPalindrome2_returnsTrue_test6() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindrome2("Step on no pets."));
	    assertTrue(p.isPalindrome2("Yo, Banana Boy!"));
	    assertTrue(p.isPalindrome2("Dammit, I'm mad."));
	    assertTrue(p.isPalindrome2("Was it a car or a cat I saw?"));
	    assertTrue(p.isPalindrome2("A man, a plan, a canal: Panama!"));
	}

	// isPalindrome3 test
	@Test
	public void isPalindrome3_returnsTrue_test1() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindrome3(""));
	}
	@Test
	public void isPalindrome3_returnsTrue_test2() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindrome3("a"));
	    assertTrue(p.isPalindrome3("b"));
	    assertTrue(p.isPalindrome3("y"));
	    assertTrue(p.isPalindrome3("z"));
	}
	@Test
	public void isPalindrome3_returnsTrue_test3() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindrome3("noon"));
	    assertTrue(p.isPalindrome3("madam"));
	    assertTrue(p.isPalindrome3("racecar"));
	    assertTrue(p.isPalindrome3("rotator"));
	    assertTrue(p.isPalindrome3("deified"));
	}
	@Test
	public void isPalindrome3_returnsTrue_test4() {
	    Palindrome p = new Palindrome();

	    assertTrue(p.isPalindrome3("A"));
	    assertTrue(p.isPalindrome3("B"));
	    assertTrue(p.isPalindrome3("Y"));
	    assertTrue(p.isPalindrome3("Z"));

	    assertTrue(p.isPalindrome3("Noon"));
	    assertTrue(p.isPalindrome3("NOON"));
	    assertTrue(p.isPalindrome3("NooN"));
	    assertTrue(p.isPalindrome3("nOOn"));

	    assertTrue(p.isPalindrome3("Madam"));
	    assertTrue(p.isPalindrome3("MADAM"));
	    assertTrue(p.isPalindrome3("MaDaM"));
	    assertTrue(p.isPalindrome3("mAdAm"));

	    assertTrue(p.isPalindrome3("Racecar"));
	    assertTrue(p.isPalindrome3("RACECAR"));
	    assertTrue(p.isPalindrome3("RaCeCaR"));
	    assertTrue(p.isPalindrome3("rAcEcAr"));

	    assertTrue(p.isPalindrome3("Rotator"));
	    assertTrue(p.isPalindrome3("ROTATOR"));
	    assertTrue(p.isPalindrome3("RoTaToR"));
	    assertTrue(p.isPalindrome3("rOtAtOr"));

	    assertTrue(p.isPalindrome3("Deified"));
	    assertTrue(p.isPalindrome3("DEIFIED"));
	    assertTrue(p.isPalindrome3("DeIfIeD"));
	    assertTrue(p.isPalindrome3("dEiFiEd"));
	}
	@Test
	public void isPalindrome3_returnsFalse_test5() {
	    Palindrome p = new Palindrome();

	    assertFalse(p.isPalindrome3("Hello"));
	    assertFalse(p.isPalindrome3("Palindrome"));
	    assertFalse(p.isPalindrome3("Programming"));

	    assertFalse(p.isPalindrome3("hello"));
	    assertFalse(p.isPalindrome3("palindrome"));
	    assertFalse(p.isPalindrome3("programming"));

	    assertFalse(p.isPalindrome3("HELLO"));
	    assertFalse(p.isPalindrome3("PALINDROME"));
	    assertFalse(p.isPalindrome3("PROGRAMMING"));
	}
	@Test
	public void isPalindrome3_returnsTrue_test6() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindrome3("Step on no pets."));
	    assertTrue(p.isPalindrome3("Yo, Banana Boy!"));
	    assertTrue(p.isPalindrome3("Dammit, I'm mad."));
	    assertTrue(p.isPalindrome3("Was it a car or a cat I saw?"));
	    assertTrue(p.isPalindrome3("A man, a plan, a canal: Panama!"));
	}

	//isPalindrome4 test
	@Test
	public void isPalindrome4_returnsTrue_test1() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindrome4(""));
	}
	@Test
	public void isPalindrome4_returnsTrue_test2() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindrome4("a"));
	    assertTrue(p.isPalindrome4("b"));
	    assertTrue(p.isPalindrome4("y"));
	    assertTrue(p.isPalindrome4("z"));
	}
	@Test
	public void isPalindrome4_returnsTrue_test3() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindrome4("noon"));
	    assertTrue(p.isPalindrome4("madam"));
	    assertTrue(p.isPalindrome4("racecar"));
	    assertTrue(p.isPalindrome4("rotator"));
	    assertTrue(p.isPalindrome4("deified"));
	}
	@Test
	public void isPalindrome4_returnsTrue_test4() {
	    Palindrome p = new Palindrome();

	    assertTrue(p.isPalindrome4("A"));
	    assertTrue(p.isPalindrome4("B"));
	    assertTrue(p.isPalindrome4("Y"));
	    assertTrue(p.isPalindrome4("Z"));

	    assertTrue(p.isPalindrome4("Noon"));
	    assertTrue(p.isPalindrome4("NOON"));
	    assertTrue(p.isPalindrome4("NooN"));
	    assertTrue(p.isPalindrome4("nOOn"));

	    assertTrue(p.isPalindrome4("Madam"));
	    assertTrue(p.isPalindrome4("MADAM"));
	    assertTrue(p.isPalindrome4("MaDaM"));
	    assertTrue(p.isPalindrome4("mAdAm"));

	    assertTrue(p.isPalindrome4("Racecar"));
	    assertTrue(p.isPalindrome4("RACECAR"));
	    assertTrue(p.isPalindrome4("RaCeCaR"));
	    assertTrue(p.isPalindrome4("rAcEcAr"));

	    assertTrue(p.isPalindrome4("Rotator"));
	    assertTrue(p.isPalindrome4("ROTATOR"));
	    assertTrue(p.isPalindrome4("RoTaToR"));
	    assertTrue(p.isPalindrome4("rOtAtOr"));

	    assertTrue(p.isPalindrome4("Deified"));
	    assertTrue(p.isPalindrome4("DEIFIED"));
	    assertTrue(p.isPalindrome4("DeIfIeD"));
	    assertTrue(p.isPalindrome4("dEiFiEd"));
	}
	@Test
	public void isPalindrome4_returnsFalse_test5() {
	    Palindrome p = new Palindrome();

	    assertFalse(p.isPalindrome4("Hello"));
	    assertFalse(p.isPalindrome4("Palindrome"));
	    assertFalse(p.isPalindrome4("Programming"));

	    assertFalse(p.isPalindrome4("hello"));
	    assertFalse(p.isPalindrome4("palindrome"));
	    assertFalse(p.isPalindrome4("programming"));

	    assertFalse(p.isPalindrome4("HELLO"));
	    assertFalse(p.isPalindrome4("PALINDROME"));
	    assertFalse(p.isPalindrome4("PROGRAMMING"));
	}
	@Test
	public void isPalindrome4_returnsTrue_test6() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindrome4("Step on no pets."));
	    assertTrue(p.isPalindrome4("Yo, Banana Boy!"));
	    assertTrue(p.isPalindrome4("Dammit, I'm mad."));
	    assertTrue(p.isPalindrome4("Was it a car or a cat I saw?"));
	    assertTrue(p.isPalindrome4("A man, a plan, a canal: Panama!"));
	}

	// isPalindromeRecursion test
	@Test
	public void isPalindromeRecursion_returnsTrue_test1() {
		Palindrome p = new Palindrome();
		assertTrue(p.isPalindromeRecursion(""));
	}
	@Test
	public void isPalindromeRecursion_returnsTrue_test2() {
		Palindrome p = new Palindrome();
		assertTrue(p.isPalindromeRecursion("a"));
		assertTrue(p.isPalindromeRecursion("b"));
		assertTrue(p.isPalindromeRecursion("y"));
		assertTrue(p.isPalindromeRecursion("z"));
	}
	@Test
	public void isPalindromeRecursion_returnsTrue_test3() {
		Palindrome p = new Palindrome();
		assertTrue(p.isPalindromeRecursion("noon"));
		assertTrue(p.isPalindromeRecursion("madam"));
		assertTrue(p.isPalindromeRecursion("racecar"));
		assertTrue(p.isPalindromeRecursion("rotator"));
		assertTrue(p.isPalindromeRecursion("deified"));
	}
	@Test
	public void isPalindromeRecursion_returnsTrue_test4() {
		Palindrome p = new Palindrome();
		
		assertTrue(p.isPalindromeRecursion("A"));
		assertTrue(p.isPalindromeRecursion("B"));
		assertTrue(p.isPalindromeRecursion("Y"));
		assertTrue(p.isPalindromeRecursion("Z"));
		
		assertTrue(p.isPalindromeRecursion("Noon"));
		assertTrue(p.isPalindromeRecursion("NOON"));
		assertTrue(p.isPalindromeRecursion("NooN"));
		assertTrue(p.isPalindromeRecursion("nOOn"));
		
		assertTrue(p.isPalindromeRecursion("Madam"));
		assertTrue(p.isPalindromeRecursion("MADAM"));
		assertTrue(p.isPalindromeRecursion("MaDaM"));
		assertTrue(p.isPalindromeRecursion("mAdAm"));
		
		assertTrue(p.isPalindromeRecursion("Racecar"));
		assertTrue(p.isPalindromeRecursion("RACECAR"));
		assertTrue(p.isPalindromeRecursion("RaCeCaR"));
		assertTrue(p.isPalindromeRecursion("rAcEcAr"));
		
		assertTrue(p.isPalindromeRecursion("Rotator"));
		assertTrue(p.isPalindromeRecursion("ROTATOR"));
		assertTrue(p.isPalindromeRecursion("RoTaToR"));
		assertTrue(p.isPalindromeRecursion("rOtAtOr"));
		
		assertTrue(p.isPalindromeRecursion("Deified"));
		assertTrue(p.isPalindromeRecursion("DEIFIED"));
		assertTrue(p.isPalindromeRecursion("DeIfIeD"));
		assertTrue(p.isPalindromeRecursion("dEiFiEd"));
	}
	@Test
	public void isPalindromeRecursion_returnsFalse_test5() {
		Palindrome p = new Palindrome();
		
		assertFalse(p.isPalindromeRecursion("Hello"));
		assertFalse(p.isPalindromeRecursion("Palindrome"));
		assertFalse(p.isPalindromeRecursion("Programming"));
		
		assertFalse(p.isPalindromeRecursion("hello"));
		assertFalse(p.isPalindromeRecursion("palindrome"));
		assertFalse(p.isPalindromeRecursion("programming"));
		
		assertFalse(p.isPalindromeRecursion("HELLO"));
		assertFalse(p.isPalindromeRecursion("PALINDROME"));
		assertFalse(p.isPalindromeRecursion("PROGRAMMING"));
	}
	@Test
	public void isPalindromeRecursion_returnsTrue_test6() {
		Palindrome p = new Palindrome();
		assertTrue(p.isPalindromeRecursion("Step on no pets."));
		assertTrue(p.isPalindromeRecursion("Yo, Banana Boy!"));
		assertTrue(p.isPalindromeRecursion("Dammit, I'm mad."));
		assertTrue(p.isPalindromeRecursion("Was it a car or a cat I saw?"));
		assertTrue(p.isPalindromeRecursion("A man, a plan, a canal: Panama!"));
	}
	
	// isPalindromeRecursion2 test
	@Test
	public void isPalindromeRecursion2_returnsTrue_test1() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindromeRecursion2(""));
	}
	@Test
	public void isPalindromeRecursion2_returnsTrue_test2() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindromeRecursion2("a"));
	    assertTrue(p.isPalindromeRecursion2("b"));
	    assertTrue(p.isPalindromeRecursion2("y"));
	    assertTrue(p.isPalindromeRecursion2("z"));
	}
	@Test
	public void isPalindromeRecursion2_returnsTrue_test3() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindromeRecursion2("noon"));
	    assertTrue(p.isPalindromeRecursion2("madam"));
	    assertTrue(p.isPalindromeRecursion2("racecar"));
	    assertTrue(p.isPalindromeRecursion2("rotator"));
	    assertTrue(p.isPalindromeRecursion2("deified"));
	}
	@Test
	public void isPalindromeRecursion2_returnsTrue_test4() {
	    Palindrome p = new Palindrome();
	    
	    assertTrue(p.isPalindromeRecursion2("A"));
	    assertTrue(p.isPalindromeRecursion2("B"));
	    assertTrue(p.isPalindromeRecursion2("Y"));
	    assertTrue(p.isPalindromeRecursion2("Z"));
	    
	    assertTrue(p.isPalindromeRecursion2("Noon"));
	    assertTrue(p.isPalindromeRecursion2("NOON"));
	    assertTrue(p.isPalindromeRecursion2("NooN"));
	    assertTrue(p.isPalindromeRecursion2("nOOn"));
	    
	    assertTrue(p.isPalindromeRecursion2("Madam"));
	    assertTrue(p.isPalindromeRecursion2("MADAM"));
	    assertTrue(p.isPalindromeRecursion2("MaDaM"));
	    assertTrue(p.isPalindromeRecursion2("mAdAm"));
	    
	    assertTrue(p.isPalindromeRecursion2("Racecar"));
	    assertTrue(p.isPalindromeRecursion2("RACECAR"));
	    assertTrue(p.isPalindromeRecursion2("RaCeCaR"));
	    assertTrue(p.isPalindromeRecursion2("rAcEcAr"));
	    
	    assertTrue(p.isPalindromeRecursion2("Rotator"));
	    assertTrue(p.isPalindromeRecursion2("ROTATOR"));
	    assertTrue(p.isPalindromeRecursion2("RoTaToR"));
	    assertTrue(p.isPalindromeRecursion2("rOtAtOr"));
	    
	    assertTrue(p.isPalindromeRecursion2("Deified"));
	    assertTrue(p.isPalindromeRecursion2("DEIFIED"));
	    assertTrue(p.isPalindromeRecursion2("DeIfIeD"));
	    assertTrue(p.isPalindromeRecursion2("dEiFiEd"));
	}
	@Test
	public void isPalindromeRecursion2_returnsFalse_test5() {
	    Palindrome p = new Palindrome();
	    
	    assertFalse(p.isPalindromeRecursion2("Hello"));
	    assertFalse(p.isPalindromeRecursion2("Palindrome"));
	    assertFalse(p.isPalindromeRecursion2("Programming"));
	    
	    assertFalse(p.isPalindromeRecursion2("hello"));
	    assertFalse(p.isPalindromeRecursion2("palindrome"));
	    assertFalse(p.isPalindromeRecursion2("programming"));
	    
	    assertFalse(p.isPalindromeRecursion2("HELLO"));
	    assertFalse(p.isPalindromeRecursion2("PALINDROME"));
	    assertFalse(p.isPalindromeRecursion2("PROGRAMMING"));
	}
	@Test
	public void isPalindromeRecursion2_returnsTrue_test6() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindromeRecursion2("Step on no pets."));
	    assertTrue(p.isPalindromeRecursion2("Yo, Banana Boy!"));
	    assertTrue(p.isPalindromeRecursion2("Dammit, I'm mad."));
	    assertTrue(p.isPalindromeRecursion2("Was it a car or a cat I saw?"));
	    assertTrue(p.isPalindromeRecursion2("A man, a plan, a canal: Panama!"));
	}

	// isPalindromeRecursion3 test
	@Test
	public void isPalindromeRecursion3_returnsTrue_test1() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindromeRecursion3(""));
	}
	@Test
	public void isPalindromeRecursion3_returnsTrue_test2() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindromeRecursion3("a"));
	    assertTrue(p.isPalindromeRecursion3("b"));
	    assertTrue(p.isPalindromeRecursion3("y"));
	    assertTrue(p.isPalindromeRecursion3("z"));
	}
	@Test
	public void isPalindromeRecursion3_returnsTrue_test3() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindromeRecursion3("noon"));
	    assertTrue(p.isPalindromeRecursion3("madam"));
	    assertTrue(p.isPalindromeRecursion3("racecar"));
	    assertTrue(p.isPalindromeRecursion3("rotator"));
	    assertTrue(p.isPalindromeRecursion3("deified"));
	}
	@Test
	public void isPalindromeRecursion3_returnsTrue_test4() {
	    Palindrome p = new Palindrome();

	    assertTrue(p.isPalindromeRecursion3("A"));
	    assertTrue(p.isPalindromeRecursion3("B"));
	    assertTrue(p.isPalindromeRecursion3("Y"));
	    assertTrue(p.isPalindromeRecursion3("Z"));

	    assertTrue(p.isPalindromeRecursion3("Noon"));
	    assertTrue(p.isPalindromeRecursion3("NOON"));
	    assertTrue(p.isPalindromeRecursion3("NooN"));
	    assertTrue(p.isPalindromeRecursion3("nOOn"));

	    assertTrue(p.isPalindromeRecursion3("Madam"));
	    assertTrue(p.isPalindromeRecursion3("MADAM"));
	    assertTrue(p.isPalindromeRecursion3("MaDaM"));
	    assertTrue(p.isPalindromeRecursion3("mAdAm"));

	    assertTrue(p.isPalindromeRecursion3("Racecar"));
	    assertTrue(p.isPalindromeRecursion3("RACECAR"));
	    assertTrue(p.isPalindromeRecursion3("RaCeCaR"));
	    assertTrue(p.isPalindromeRecursion3("rAcEcAr"));

	    assertTrue(p.isPalindromeRecursion3("Rotator"));
	    assertTrue(p.isPalindromeRecursion3("ROTATOR"));
	    assertTrue(p.isPalindromeRecursion3("RoTaToR"));
	    assertTrue(p.isPalindromeRecursion3("rOtAtOr"));

	    assertTrue(p.isPalindromeRecursion3("Deified"));
	    assertTrue(p.isPalindromeRecursion3("DEIFIED"));
	    assertTrue(p.isPalindromeRecursion3("DeIfIeD"));
	    assertTrue(p.isPalindromeRecursion3("dEiFiEd"));
	}
	@Test
	public void isPalindromeRecursion3_returnsFalse_test5() {
	    Palindrome p = new Palindrome();

	    assertFalse(p.isPalindromeRecursion3("Hello"));
	    assertFalse(p.isPalindromeRecursion3("Palindrome"));
	    assertFalse(p.isPalindromeRecursion3("Programming"));

	    assertFalse(p.isPalindromeRecursion3("hello"));
	    assertFalse(p.isPalindromeRecursion3("palindrome"));
	    assertFalse(p.isPalindromeRecursion3("programming"));

	    assertFalse(p.isPalindromeRecursion3("HELLO"));
	    assertFalse(p.isPalindromeRecursion3("PALINDROME"));
	    assertFalse(p.isPalindromeRecursion3("PROGRAMMING"));
	}
	@Test
	public void isPalindromeRecursion3_returnsTrue_test6() {
	    Palindrome p = new Palindrome();
	    assertTrue(p.isPalindromeRecursion3("Step on no pets."));
	    assertTrue(p.isPalindromeRecursion3("Yo, Banana Boy!"));
	    assertTrue(p.isPalindromeRecursion3("Dammit, I'm mad."));
	    assertTrue(p.isPalindromeRecursion3("Was it a car or a cat I saw?"));
	    assertTrue(p.isPalindromeRecursion3("A man, a plan, a canal: Panama!"));
	}
	
}
