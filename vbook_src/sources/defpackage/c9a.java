package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c9a  reason: default package */
/* loaded from: classes3.dex */
public final class c9a implements Iterator, m42, j76 {
    public int a;
    public Object b;
    public Iterator c;
    public m42 d;

    public final RuntimeException b() {
        int i = this.a;
        if (i != 4) {
            if (i != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void c(m42 m42Var, Object obj) {
        this.b = obj;
        this.a = 3;
        this.d = m42Var;
        m42Var.getClass();
    }

    @Override // defpackage.m42
    public final d82 getContext() {
        return gs3.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw b();
                }
                Iterator it = this.c;
                it.getClass();
                if (it.hasNext()) {
                    this.a = 2;
                    return true;
                }
                this.c = null;
            }
            this.a = 5;
            m42 m42Var = this.d;
            m42Var.getClass();
            this.d = null;
            m42Var.resumeWith(pvc.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.a = 0;
                    Object obj = this.b;
                    this.b = null;
                    return obj;
                }
                throw b();
            }
            this.a = 1;
            Iterator it = this.c;
            it.getClass();
            return it.next();
        } else if (hasNext()) {
            return next();
        } else {
            xk5.g();
            return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.m42
    public final void resumeWith(Object obj) {
        hre.r(obj);
        this.a = 4;
    }
}
