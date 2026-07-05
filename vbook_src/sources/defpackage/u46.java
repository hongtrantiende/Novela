package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u46  reason: default package */
/* loaded from: classes3.dex */
public final class u46 implements Iterator, j76 {
    public final r36 a;
    public final uh9 b;
    public final s76 c;

    public u46(r36 r36Var, uh9 uh9Var, s76 s76Var) {
        r36Var.getClass();
        s76Var.getClass();
        this.a = r36Var;
        this.b = uh9Var;
        this.c = s76Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b.w() != 10) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        s76 s76Var = this.c;
        return new m1b(this.a, znd.c, this.b, s76Var.e(), null).d(s76Var);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
