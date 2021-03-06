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
package org.eclipse.swtbot.eclipse.ui.test;

import org.eclipse.swtbot.eclipse.ui.launcher.SWTBotJUnitTabGroupTest;
import org.eclipse.swtbot.eclipse.ui.preferences.PreferenceInitializerTest;
import org.eclipse.swtbot.eclipse.ui.project.ProjectCreatorTest;
import org.eclipse.swtbot.eclipse.ui.project.TemplatizerTest;
import org.eclipse.swtbot.eclipse.ui.wizards.ProjectSettingValidatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Ketan Padegaonkar &lt;KetanPadegaonkar [at] gmail [dot] com&gt;
 * @version $Id$
 */
@RunWith(Suite.class)
@SuiteClasses({PreferenceInitializerTest.class, ProjectCreatorTest.class, TemplatizerTest.class, SWTBotJUnitTabGroupTest.class, ProjectSettingValidatorTest.class})
public class AllTests {

}
