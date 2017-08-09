// This is a generated file. Not intended for manual editing.
package org.lolanguage.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.lolanguage.psi.impl.*;

public interface LoTypes {

  IElementType PROPERTY = new LoElementType("PROPERTY");

  IElementType COMMENT = new LoTokenType("COMMENT");
  IElementType KEY = new LoTokenType("KEY");
  IElementType SEPARATOR = new LoTokenType("SEPARATOR");
  IElementType VALUE = new LoTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new LoPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
