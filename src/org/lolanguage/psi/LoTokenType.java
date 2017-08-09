package org.lolanguage.psi;


import com.intellij.psi.tree.IElementType;
import org.lolanguage.Lo;
import org.jetbrains.annotations.*;

public class LoTokenType extends IElementType {
    public LoTokenType(@NotNull @NonNls String debugName) {
        super(debugName, Lo.INSTANCE);
    }

    @Override
    public String toString() {
        return "LoTokenType." + super.toString();
    }
}