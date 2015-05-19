package com.ibm.jaggr.core.impl.resource;

import com.ibm.jaggr.core.impl.resource.FileResourceFactory;

import java.net.URI;
import java.net.URISyntaxException;

public class JSXResourceFactory extends FileResourceFactory {

	public JSXResourceFactory() {
		this(null);
	}

	protected JSXResourceFactory(ClassLoader classLoader) {
		super(classLoader);
	}

	protected URI convertToTransformURI (URI uri) {
		String fullUri = uri.toString();
		String extension = fullUri.substring(fullUri.lastIndexOf('.'));
		if ("js".equals(extension)) { //$NON-NLS-1$
			try {
				return new URI(fullUri + 'x'); //js -> jsx
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		} else {
			return null;
		}
	}
}
