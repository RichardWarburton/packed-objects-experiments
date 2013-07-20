/**
 * 
 */
package com.insightfullogic.packed_experiments;

import com.ibm.jvm.packed.ImportPacked;
import com.ibm.jvm.packed.Length;
import com.ibm.jvm.packed.Packed;
import com.ibm.jvm.packed.PackedObject;
import com.ibm.jvm.packed.types.PackedChar;

/**
 * Pretty much never going to work due to the fixed length restriction on Strings!
 * 
 * @author richard
 */
@ImportPacked({ "com/ibm/jvm/packed/types/PackedChar" })
@Packed
public final class PackedString extends PackedObject {

	@Length(255)
	PackedChar[] values;

}
