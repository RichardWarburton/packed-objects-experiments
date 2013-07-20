/**
 * 
 */
package com.insightfullogic.packed_experiments;

import com.ibm.jvm.packed.ImportPacked;
import com.ibm.jvm.packed.Packed;
import com.ibm.jvm.packed.PackedObject;

/**
 * @author richard
 * 
 */
@ImportPacked("com/insightfullogic/packed_experiments/ComplexNumber")
@Packed
public final class ComplexPair extends PackedObject {

	public ComplexNumber left;
	public ComplexNumber right;

	public ComplexPair(final ComplexNumber left, final ComplexNumber right) {
		left.copyFrom(left);
		right.copyFrom(right);
	}

}
