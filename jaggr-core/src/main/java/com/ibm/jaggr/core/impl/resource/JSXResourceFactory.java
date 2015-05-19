package com.ibm.jaggr.core.impl.resource;

import com.ibm.jaggr.core.impl.resource.FileResourceFactory;

public class JSXResourceFactory extends FileResourceFactory {

	public JSXResourceFactory() {
		this(null);
	}

	protected JSXResourceFactory(ClassLoader classLoader) {
		super(classLoader);
	}
}
