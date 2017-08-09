package org.lolanguage;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class LoLexerAdapter extends FlexAdapter {
    public LoLexerAdapter() {
        super(new LoLexer((Reader) null));
    }
}
