/*
 * Created by Angel Leon (@gubatron), Alden Torres (aldenml)
 * Copyright (c) 2011, 2012, FrostWire(TM). All rights reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.frostwire.android.gui.httpserver;

import java.io.IOException;

import com.frostwire.android.core.ConfigurationManager;
import com.frostwire.android.core.Constants;
import com.frostwire.android.gui.services.Engine;
import com.sun.net.httpserver.HttpHandler;

/**
 * @author gubatron
 * @author aldenml
 *
 */
public abstract class AbstractHandler implements HttpHandler {

    protected void assertUPnPActive() throws IOException {
        if (!Engine.instance().isStarted() || !ConfigurationManager.instance().getBoolean(Constants.PREF_KEY_NETWORK_ENABLE_WIFI_SHARING)) {
            throw new IOException("UPnP deactivated");
        }
    }
}
