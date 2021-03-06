/*******************************************************************************
 * Copyright (c) 2008 Ketan Padegaonkar and others.
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
package org.eclipse.swtbot.swt.demo;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * @author Ketan Padegaonkar &lt;KetanPadegaonkar [at] gmail [dot] com&gt;
 * @version $Id$
 */
public class Test {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display, SWT.SHELL_TRIM);
		shell.setLayout(new FillLayout());

		Button blah0 = new Button(shell, SWT.RADIO);
		blah0.setText("blah0"); //$NON-NLS-1$
		Button blah1 = new Button(shell, SWT.RADIO);
		blah1.setText("blah1"); //$NON-NLS-1$
		Button blah2 = new Button(shell, SWT.RADIO);
		blah2.setText("blah2"); //$NON-NLS-1$
		Button blah3 = new Button(shell, SWT.RADIO);
		blah3.setText("blah3"); //$NON-NLS-1$

		blah2.setSelection(true);
		blah3.setSelection(true);

		shell.open();
		while (!shell.isDisposed())
			if (!display.readAndDispatch())
				display.sleep();
	}
}
