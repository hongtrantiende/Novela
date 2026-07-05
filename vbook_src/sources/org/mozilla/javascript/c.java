package org.mozilla.javascript;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.ast.AstNode;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Parser.Transformer {
    public final /* synthetic */ IRFactory a;

    public /* synthetic */ c(IRFactory iRFactory) {
        this.a = iRFactory;
    }

    @Override // org.mozilla.javascript.Parser.Transformer
    public final Node transform(AstNode astNode) {
        Node transform;
        transform = this.a.transform(astNode);
        return transform;
    }
}
