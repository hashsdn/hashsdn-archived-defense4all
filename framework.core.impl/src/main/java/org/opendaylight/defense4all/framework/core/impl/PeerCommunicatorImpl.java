/**
 * Copyright (c) <2013> <Radware Ltd.> and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * @author Gera Goft 
 * @version 0.1
 */


package org.opendaylight.defense4all.framework.core.impl;

import org.opendaylight.defense4all.framework.core.PeerCommunicator;

public class PeerCommunicatorImpl extends FrameworkModule implements PeerCommunicator {

	@Override
	protected void actionSwitcher(int actionCode, Object param) {
		// TODO: check if decoupled execution is needed		
	}
}
