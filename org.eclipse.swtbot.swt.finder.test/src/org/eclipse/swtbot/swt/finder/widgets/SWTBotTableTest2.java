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
package org.eclipse.swtbot.swt.finder.widgets;

import static org.eclipse.swtbot.swt.finder.SWTBotTestCase.assertText;
import static org.junit.Assert.assertEquals;

import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.test.AbstractMenuExampleTest;
import org.junit.Test;

/**
 * @author Ketan Padegaonkar &lt;KetanPadegaonkar [at] gmail [dot] com&gt;
 * @version $Id$
 */
public class SWTBotTableTest2 extends AbstractMenuExampleTest {

	private static final String	FIRST_NAME	= "First Name";
	private static final String	LAST_NAME	= "Last Name";
	private SWTBot				bot;
	private SWTBotTable			table;

	@Test
	public void findsTableHeader() throws Exception {
		Widget tableHeader = table.header(LAST_NAME).widget;
		assertEquals(TableColumn.class, tableHeader.getClass());
		assertText(LAST_NAME, tableHeader);
	}

	@Test
	public void clicksTableHeader() throws Exception {
		table.header(LAST_NAME).click();
		assertEquals("last2", table.cell(0, LAST_NAME));
		assertEquals("last4", table.cell(1, LAST_NAME));
		assertEquals("last6", table.cell(2, LAST_NAME));

		table.header(LAST_NAME).click();
		assertEquals("last6", table.cell(0, LAST_NAME));
		assertEquals("last4", table.cell(1, LAST_NAME));
		assertEquals("last2", table.cell(2, LAST_NAME));

		table.header(FIRST_NAME).click();
		assertEquals("first1", table.cell(0, FIRST_NAME));
		assertEquals("first2", table.cell(1, FIRST_NAME));
		assertEquals("first3", table.cell(2, FIRST_NAME));

		table.header(FIRST_NAME).click();
		assertEquals("first3", table.cell(0, FIRST_NAME));
		assertEquals("first2", table.cell(1, FIRST_NAME));
		assertEquals("first1", table.cell(2, FIRST_NAME));
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		populateData();
		bot = new SWTBot();
		table = bot.table();
	}

	private void populateData() {
		display.syncExec(new Runnable() {
			@Override
			public void run() {
				addressBook.clearAddressbook();
				addressBook.addAddressBook(row1());
				addressBook.addAddressBook(row2());
				addressBook.addAddressBook(row3());
			}
		});
	}

	private String[] row1() {
		return new String[] { "last2", "first1", "business phone3", "home phone2", "email@addres.ss", "fax number" };
	}

	private String[] row2() {
		return new String[] { "last6", "first2", "business phone2", "home phone1", "email@addres.ss", "fax number" };
	}

	private String[] row3() {
		return new String[] { "last4", "first3", "business phone1", "home phone3", "email@addres.ss", "fax number" };
	}
}
