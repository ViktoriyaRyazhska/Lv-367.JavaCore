
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import homeworkl4.Task1;

class Task1Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {

		homeworkl4.Task1 tsk = new Task1();
		for (int i = 0; i <= 10; i++) {

			tsk.floatnum((float) (Math.random() * 10), (float) (Math.random() * 10), (float) (Math.random() * 10));
		}

		for (int i = 0; i <= 10; i++) {

			tsk.intnum((int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
		}
		for (int i = 400; i <= 405; i++) {
			tsk.erorhttp(i);
		}
	}

}
