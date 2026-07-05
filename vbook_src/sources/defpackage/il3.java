package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: il3  reason: default package */
/* loaded from: classes3.dex */
public final class il3 implements Iterator, j76 {
    public final /* synthetic */ int a = 1;
    public final Iterator b;
    public int c;

    public il3(jl3 jl3Var) {
        this.b = jl3Var.a.iterator();
        this.c = jl3Var.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                break;
            default:
                return it.hasNext();
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                break;
            default:
                int i2 = this.c;
                this.c = i2 + 1;
                if (i2 >= 0) {
                    return new du5(i2, it.next());
                }
                tl1.M();
                throw null;
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public il3(Iterator it) {
        it.getClass();
        this.b = it;
    }
}
