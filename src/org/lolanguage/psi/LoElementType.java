package org.lolanguage.psi;


import com.intellij.psi.tree.IElementType;
import org.lolanguage.Lo;
import org.jetbrains.annotations.*;

public class LoElementType extends IElementType {
    public LoElementType(@NotNull @NonNls String debugName) {
        super(debugName, Lo.INSTANCE);
    }
}