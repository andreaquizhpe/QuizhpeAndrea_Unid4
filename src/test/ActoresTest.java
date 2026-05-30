package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Model.Actor;

public class ActoresTest {
	@Test
	void testCrearActor() {

		Actor actor = new Actor("Sam Worthington", 45);

		assertEquals("Sam Worthington", actor.getNombre());

		assertEquals(45, actor.getEdad());
	}
}
