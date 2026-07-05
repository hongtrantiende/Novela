package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ff4  reason: default package */
/* loaded from: classes3.dex */
public final class ff4 implements b9a {
    public final b9a a;
    public final boolean b;
    public final xt4 c;

    public ff4(b9a b9aVar, boolean z, xt4 xt4Var) {
        this.a = b9aVar;
        this.b = z;
        this.c = xt4Var;
    }

    @Override // defpackage.b9a
    public final Iterator iterator() {
        return new ef4(this);
    }
}
