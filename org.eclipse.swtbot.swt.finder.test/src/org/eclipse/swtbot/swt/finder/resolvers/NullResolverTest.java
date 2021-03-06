/*******************************************************************************
 * Copyright (c) 2008, 2017 Ketan Padegaonkar and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Ketan Padegaonkar - initial API and implementation
 *******************************************************************************/
package org.eclipse.swtbot.swt.finder.resolvers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.swt.widgets.Widget;
import org.junit.Test;

/**
 * @author Ketan Padegaonkar &lt;KetanPadegaonkar [at] gmail [dot] com&gt;
 * @version $Id$
 */
public class NullResolverTest {

	@Test
	public void getChildren() {
		List<Widget> children = new NullResolver().getChildren(null);
		assertTrue(children.isEmpty());
	}

	@Test
	public void resolvesEverything() throws Exception {
		assertTrue(new NullResolver().canResolve(null));
	}

	@Test
	public void getParent() {
		assertNull(new NullResolver().getParent(null));
	}

	@Test
	public void hasChildren() {
		assertFalse(new NullResolver().hasChildren(null));
	}

	@Test
	public void hasParent() {
		assertFalse(new NullResolver().hasParent(null));
	}

}
