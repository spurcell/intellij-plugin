// This is a generated file. Not intended for manual editing.
package org.lolanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.lolanguage.psi.LoTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.lolanguage.psi.*;

public class LoPropertyImpl extends ASTWrapperPsiElement implements LoProperty {

  public LoPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LoVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LoVisitor) accept((LoVisitor)visitor);
    else super.accept(visitor);
  }

}
