package org.lolanguage;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class LoFileType extends LanguageFileType {
    public static final LoFileType INSTANCE = new LoFileType();

    public static final String DEFAULT_EXTENSION = "lo";
    public static final String DOT_DEFAULT_EXTENSION = "."+DEFAULT_EXTENSION;

    private LoFileType() {
        super(Lo.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Lo file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Lo file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return LoIcons.FILE;
    }
}
