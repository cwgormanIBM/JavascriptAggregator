/*
 * (C) Copyright 2012, IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ibm.jaggr.core;

/**
 * Extends Exception for use by the <code>IPlatformServices</code> class.
 */
public class PlatformServicesException extends Exception {

	private static final long serialVersionUID = 107124091694842289L;

	public PlatformServicesException(){
		super();
	}

	/**
	 * Constructs a new exception with the specified message.
	 *
	 * @param message
	 *            a <code>String</code> specifying the text of the exception
	 *            message
	 */
	public PlatformServicesException(String message) {
		super(message);
	}

	/**
	 * Constructs a new exception when the <code>IPlatformServices</code> needs to throw an exception
	 * and include a message about the "root cause" exception that interfered
	 * with its normal operation. The exception's message is based on the
	 * localized message of the underlying exception.
	 *
	 * @param rootCause
	 *            the <code>Throwable</code> exception that interfered with the
	 *            <code>IPlatformServices</code>'s normal operation, making this exception necessary
	 */
	public PlatformServicesException(Throwable rootCause) {
		super(rootCause);
	}

	/**
	 * Constructs a new exception when the <code>IPlatformServices</code> needs to throw an exception
	 * and include a message about the "root cause" exception that interfered
	 * with its normal operation, including a description message.
	 *
	 * @param message
	 *            a <code>String</code> specifying the text of the exception
	 *            message
	 * @param rootCause
	 *            the <code>Throwable</code> exception that interfered with the
	 *            <code>IPlatformServices</code>'s normal operation, making this exception necessary
	 */
	public PlatformServicesException(String message, Throwable rootCause) {
		super(message, rootCause);
	}

}
