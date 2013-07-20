/**
 * 
 */
package com.insightfullogic.packed_experiments;

import com.ibm.jvm.packed.Packed;
import com.ibm.jvm.packed.PackedObject;

/**
 * Complex Number Packed Object
 * 
 * @author richard
 */
@Packed
public final class ComplexNumber extends PackedObject {

	public double real;
	public double imaginary;

	public ComplexNumber(final double real, final double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

}
