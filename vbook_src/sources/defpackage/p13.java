package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p13  reason: default package */
/* loaded from: classes3.dex */
public final class p13 implements b9a {
    public final CharSequence a;
    public final int b;
    public final lu4 c;

    public p13(CharSequence charSequence, int i, lu4 lu4Var) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = lu4Var;
    }

    @Override // defpackage.b9a
    public final Iterator iterator() {
        return new o13(this);
    }
}
