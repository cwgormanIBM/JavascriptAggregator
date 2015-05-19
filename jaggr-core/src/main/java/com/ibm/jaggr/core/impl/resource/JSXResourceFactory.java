package com.ibm.jaggr.core.impl.resource;

import com.ibm.jaggr.core.impl.resource.FileResourceFactory;
import com.ibm.jaggr.core.resource.IResource;

import java.net.URI;
import java.net.URISyntaxException;

public class JSXResourceFactory extends FileResourceFactory {

	public JSXResourceFactory() {
		this(null);
	}

	protected JSXResourceFactory(ClassLoader classLoader) {
		super(classLoader);
	}

	/**
	 * @Override
	 * If a JS file is not found, check for a sibling JSX file. If
	 * that exists, transform it to JS and return that IResource.
	 * Otherwise, proceed as normal.
	 * @param uri
	 * @return IResource
	 */
	protected IResource handleNotFoundResource(URI uri) {
		URI jsxURI = convertToTransformURI(uri);
		if (jsxURI != null) {
			IResource jsxResource = newResource(jsxURI);
			return convertToJS(jsxResource);
		} else {
			return super.handleNotFoundResource(uri);
		}
	}

	/**
	 * Convert a JSX IResource to a JS IResource
	 * @param jsxResource
	 * @return IResource containing the transformed jsx file
	 */
	protected IResource convertToJS(IResource jsxResource) {
		// temporarily just return the resource instead of converting it, so
		// that we can check this in
		return jsxResource;
	}

	protected URI convertToTransformURI (URI uri) {
		String fullUri = uri.toString();
		String extension = fullUri.substring(fullUri.lastIndexOf('.'));
		if (".js".equals(extension)) { //$NON-NLS-1$
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
