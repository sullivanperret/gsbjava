package tests.unit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import service.VisiteService;

class VisiteServiceTest extends TestCase {

	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
	}

	@AfterEach
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	final void testRechercherVisiteNull() {
		assertNull(VisiteService.rechercherVisite("v01"));
	}
	
	@Test
	final void testRechercherVisiteOk() {
		assertEquals("visite trouvée", "v0001", VisiteService.rechercherVisite("v0001").getReferences());
	}

}
