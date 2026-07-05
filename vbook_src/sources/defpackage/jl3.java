package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jl3  reason: default package */
/* loaded from: classes3.dex */
public final class jl3 implements b9a, ml3 {
    public final b9a a;
    public final int b;

    public jl3(b9a b9aVar, int i) {
        b9aVar.getClass();
        this.a = b9aVar;
        this.b = i;
        if (i >= 0) {
            return;
        }
        ls2.d(i, 46, "count must be non-negative, but was ");
        throw null;
    }

    @Override // defpackage.ml3
    public final b9a a(int i) {
        int i2 = this.b + i;
        if (i2 < 0) {
            return new jl3(this, i);
        }
        return new jl3(this.a, i2);
    }

    @Override // defpackage.b9a
    public final Iterator iterator() {
        return new il3(this);
    }
}
