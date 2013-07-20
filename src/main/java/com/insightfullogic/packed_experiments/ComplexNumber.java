/**
 * 
 */
package com.insightfullogic.packed_experiments;

import com.ibm.jvm.packed.*;

//import com.ibm.jvm.packed.*;
/**
 * @author richard
 * 
 */
@Packed
public class ComplexNumber extends PackedObject {

    public double real;
    public double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

}
