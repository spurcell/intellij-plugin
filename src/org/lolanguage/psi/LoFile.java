package org.lolanguage.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.lolanguage.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class LoFile extends PsiFileBase {
    public LoFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, Lo.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return LoFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Simple File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}