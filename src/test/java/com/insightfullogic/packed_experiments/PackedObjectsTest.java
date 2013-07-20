/**
 * 
 */
package com.insightfullogic.packed_experiments;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import com.ibm.jvm.packed.PackedObject;

/**
 * Asserts expectations of a Packed Object.
 * 
 * @author richard
 */
public class PackedObjectsTest {

	@Test
	public void environmentSetupCorrectly() {
		assertTrue("you've probably forgotten to use -XX:+PackedObject", PackedObject.isPackedSupportEnabled());
	}

	@Test
	public void isPacked() {
		assertTrue(PackedObject.isPackedClass(ComplexNumber.class));
	}

	@Test
	public void stackOverflowExample() {
		final ComplexNumber origin = new ComplexNumber(0.0, 0.0);
		final ComplexNumber alsoOrigin = new ComplexNumber(0.0, 0.0);
		// TODO: Causes StackOverflowError
		// assertEquals(origin, alsoOrigin);
	}

	@Test
	public void assignmentCopies() {
		final ComplexNumber origin = new ComplexNumber(0.0, 0.0);
		final ComplexPair pair = new ComplexPair(origin, origin);
		final ComplexNumber left0 = pair.left;
		final ComplexNumber left1 = pair.left;
		Assert.assertNotSame(left0, left1);
	}

	@Test
	public void arrays() {
		final PackedString str = new PackedString();
		str.values[1].value = 'a';

		Assert.assertEquals('a', str.values[1].value);
	}

}
