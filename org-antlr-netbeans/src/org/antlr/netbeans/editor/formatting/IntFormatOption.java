/*
 *  Copyright (c) 2012 Sam Harwell, Tunnel Vision Laboratories LLC
 *  All rights reserved.
 *
 *  The source code of this document is proprietary work, and is not licensed for
 *  distribution. For information about licensing, contact Sam Harwell at:
 *      sam@tunnelvisionlabs.com
 */
package org.antlr.netbeans.editor.formatting;

import java.util.prefs.Preferences;

/**
 *
 * @author Sam Harwell
 */
public class IntFormatOption extends AbstractFormatOption {

    private final int _defaultValue;

    public IntFormatOption(String name, int defaultValue) {
        super(name);
        this._defaultValue = defaultValue;
    }

    public int getDefaultValue() {
        return _defaultValue;
    }

    public int getValue(Preferences preferences) {
        return preferences.getInt(getName(), _defaultValue);
    }

    @Override
    public String getDefaultValueAsString() {
        return String.valueOf(getDefaultValue());
    }

    @Override
    public String getValueAsString(Preferences preferences) {
        return String.valueOf(getValue(preferences));
    }

}
