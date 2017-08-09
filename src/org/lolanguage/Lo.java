package org.lolanguage;

import com.intellij.lang.Language;

public class Lo extends Language {
    public static final Lo INSTANCE = new Lo();

    private Lo() {
        super("Lo");
    }
}

