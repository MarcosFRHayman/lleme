package uff.ic.lleme.letstalk.sand;

/**
 * ComponentDescriptionHolder.java . Generated by the IDL-to-Java compiler
 * (portable), version "3.2" from deployment.idl Saturday, December 10, 2005
 * 1:24:06 AM GMT
 */

public final class ComponentDescriptionHolder implements
		org.omg.CORBA.portable.Streamable {
	public ComponentDescription value = null;

	public ComponentDescriptionHolder() {
	}

	public ComponentDescriptionHolder(ComponentDescription initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = ComponentDescriptionHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		ComponentDescriptionHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return ComponentDescriptionHelper.type();
	}

}