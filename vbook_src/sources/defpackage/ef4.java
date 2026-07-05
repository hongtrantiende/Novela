package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ef4  reason: default package */
/* loaded from: classes3.dex */
public final class ef4 implements Iterator, j76 {
    public final /* synthetic */ int a;
    public final Iterator b;
    public int c;
    public Object d;
    public final /* synthetic */ b9a e;

    public ef4(ki4 ki4Var) {
        this.a = 1;
        this.e = ki4Var;
        this.b = ((Iterable) ((c00) ki4Var.c).b).iterator();
    }

    public void a() {
        Object next;
        ff4 ff4Var = (ff4) this.e;
        do {
            Iterator it = this.b;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.c = 0;
                return;
            }
        } while (((Boolean) ff4Var.c.invoke(next)).booleanValue() != ff4Var.b);
        this.d = next;
        this.c = 1;
    }

    public boolean b() {
        Iterator it;
        ki4 ki4Var = (ki4) this.e;
        Iterator it2 = (Iterator) this.d;
        if (it2 != null && it2.hasNext()) {
            this.c = 1;
            return true;
        }
        do {
            Iterator it3 = this.b;
            if (it3.hasNext()) {
                it = (Iterator) k9a.a.invoke(((xt4) ki4Var.b).invoke(it3.next()));
            } else {
                this.c = 2;
                this.d = null;
                return false;
            }
        } while (!it.hasNext());
        this.d = it;
        this.c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 1) {
                    return true;
                }
                return false;
            default:
                int i = this.c;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c != 0) {
                    Object obj = this.d;
                    this.d = null;
                    this.c = -1;
                    return obj;
                }
                xk5.g();
                return null;
            default:
                int i = this.c;
                if (i != 2) {
                    if (i == 0 && !b()) {
                        xk5.g();
                        return null;
                    }
                    this.c = 0;
                    Iterator it = (Iterator) this.d;
                    it.getClass();
                    return it.next();
                }
                xk5.g();
                return null;
        }
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

    public ef4(ff4 ff4Var) {
        this.a = 0;
        this.e = ff4Var;
        this.b = ff4Var.a.iterator();
        this.c = -1;
    }
}
