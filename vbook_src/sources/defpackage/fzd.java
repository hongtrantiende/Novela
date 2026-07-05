package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fzd  reason: default package */
/* loaded from: classes.dex */
public final class fzd implements Iterator {
    public final /* synthetic */ int a = 1;
    public final Iterator b;
    public final Iterator c;

    public fzd(w0e w0eVar, Iterator it, Iterator it2) {
        this.b = it;
        this.c = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b.hasNext()) {
                    return true;
                }
                return this.c.hasNext();
            default:
                if (!this.b.hasNext() && !this.c.hasNext()) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.c;
        Iterator it2 = this.b;
        switch (i) {
            case 0:
                if (it2.hasNext()) {
                    return new p9e(((Integer) it2.next()).toString());
                }
                if (it.hasNext()) {
                    return new p9e((String) it.next());
                }
                xk5.g();
                return null;
            default:
                if (it2.hasNext()) {
                    return it2.next();
                }
                return it.next();
        }
    }

    public fzd(Iterator it, Iterator it2) {
        this.b = it;
        this.c = it2;
    }
}
