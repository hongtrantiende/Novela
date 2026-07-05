package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y65  reason: default package */
/* loaded from: classes3.dex */
public final class y65 implements ListIterator, j76 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public final Object e;

    public y65(ora oraVar, int i) {
        this.a = 3;
        this.e = oraVar;
        this.b = i - 1;
        this.c = -1;
        this.d = sve.p(oraVar);
    }

    public void a() {
        int i;
        i = ((AbstractList) ((iq6) this.e).e).modCount;
        if (i == this.d) {
            return;
        }
        vs.f();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2 = this.a;
        Object obj2 = this.e;
        switch (i2) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                iq6 iq6Var = (iq6) obj2;
                int i3 = this.b;
                this.b = i3 + 1;
                iq6Var.add(i3, obj);
                this.c = -1;
                this.d = iq6.c(iq6Var);
                return;
            case 2:
                b();
                jq6 jq6Var = (jq6) obj2;
                int i4 = this.b;
                this.b = i4 + 1;
                jq6Var.add(i4, obj);
                this.c = -1;
                i = ((AbstractList) jq6Var).modCount;
                this.d = i;
                return;
            default:
                c();
                ora oraVar = (ora) obj2;
                oraVar.add(this.b + 1, obj);
                this.c = -1;
                this.b++;
                this.d = sve.p(oraVar);
                return;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((jq6) this.e)).modCount;
        if (i == this.d) {
            return;
        }
        vs.f();
    }

    public void c() {
        if (sve.p((ora) this.e) == this.d) {
            return;
        }
        vs.f();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (this.b >= this.d) {
                    return false;
                }
                return true;
            case 1:
                if (this.b >= ((iq6) obj).c) {
                    return false;
                }
                return true;
            case 2:
                if (this.b >= ((jq6) obj).b) {
                    return false;
                }
                return true;
            default:
                if (this.b >= ((ora) obj).size() - 1) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                if (this.b > this.c) {
                    return true;
                }
                return false;
            case 1:
                if (this.b > 0) {
                    return true;
                }
                return false;
            case 2:
                if (this.b > 0) {
                    return true;
                }
                return false;
            default:
                if (this.b >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                kv7 kv7Var = ((a75) obj).a;
                int i2 = this.b;
                this.b = i2 + 1;
                Object f = kv7Var.f(i2);
                f.getClass();
                return (mq7) f;
            case 1:
                a();
                int i3 = this.b;
                iq6 iq6Var = (iq6) obj;
                if (i3 < iq6Var.c) {
                    this.b = i3 + 1;
                    this.c = i3;
                    return iq6Var.a[iq6Var.b + i3];
                }
                xk5.g();
                return null;
            case 2:
                b();
                int i4 = this.b;
                jq6 jq6Var = (jq6) obj;
                if (i4 < jq6Var.b) {
                    this.b = i4 + 1;
                    this.c = i4;
                    return jq6Var.a[i4];
                }
                xk5.g();
                return null;
            default:
                c();
                int i5 = this.b + 1;
                this.c = i5;
                ora oraVar = (ora) obj;
                sve.h(i5, oraVar.size());
                Object obj2 = oraVar.get(i5);
                this.b = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return this.b - this.c;
            case 1:
                return this.b;
            case 2:
                return this.b;
            default:
                return this.b + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                kv7 kv7Var = ((a75) obj).a;
                int i2 = this.b - 1;
                this.b = i2;
                Object f = kv7Var.f(i2);
                f.getClass();
                return (mq7) f;
            case 1:
                a();
                int i3 = this.b;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    this.b = i4;
                    this.c = i4;
                    iq6 iq6Var = (iq6) obj;
                    return iq6Var.a[iq6Var.b + i4];
                }
                xk5.g();
                return null;
            case 2:
                b();
                int i5 = this.b;
                if (i5 > 0) {
                    int i6 = i5 - 1;
                    this.b = i6;
                    this.c = i6;
                    return ((jq6) obj).a[i6];
                }
                xk5.g();
                return null;
            default:
                c();
                ora oraVar = (ora) obj;
                sve.h(this.b, oraVar.size());
                int i7 = this.b;
                this.c = i7;
                this.b--;
                return oraVar.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.a) {
            case 0:
                return (this.b - this.c) - 1;
            case 1:
                i = this.b;
                break;
            case 2:
                i = this.b;
                break;
            default:
                return this.b;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2 = this.a;
        Object obj = this.e;
        switch (i2) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                iq6 iq6Var = (iq6) obj;
                a();
                int i3 = this.c;
                if (i3 != -1) {
                    iq6Var.b(i3);
                    this.b = this.c;
                    this.c = -1;
                    this.d = iq6.c(iq6Var);
                    return;
                }
                vs.k("Call next() or previous() before removing element from the iterator.");
                return;
            case 2:
                jq6 jq6Var = (jq6) obj;
                b();
                int i4 = this.c;
                if (i4 != -1) {
                    jq6Var.b(i4);
                    this.b = this.c;
                    this.c = -1;
                    i = ((AbstractList) jq6Var).modCount;
                    this.d = i;
                    return;
                }
                vs.k("Call next() or previous() before removing element from the iterator.");
                return;
            default:
                c();
                ora oraVar = (ora) obj;
                oraVar.remove(this.c);
                this.b--;
                this.c = -1;
                this.d = sve.p(oraVar);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i2 = this.c;
                if (i2 != -1) {
                    ((iq6) obj2).set(i2, obj);
                    return;
                } else {
                    vs.k("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i3 = this.c;
                if (i3 != -1) {
                    ((jq6) obj2).set(i3, obj);
                    return;
                } else {
                    vs.k("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                ora oraVar = (ora) obj2;
                c();
                int i4 = this.c;
                if (i4 >= 0) {
                    oraVar.set(i4, obj);
                    this.d = sve.p(oraVar);
                    return;
                }
                vs.k("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                return;
        }
    }

    public y65(jq6 jq6Var, int i) {
        int i2;
        this.a = 2;
        this.e = jq6Var;
        this.b = i;
        this.c = -1;
        i2 = ((AbstractList) jq6Var).modCount;
        this.d = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y65(a75 a75Var, int i, int i2) {
        this(a75Var, (i2 & 1) != 0 ? 0 : i, 0, a75Var.a.b);
        this.a = 0;
    }

    public y65(a75 a75Var, int i, int i2, int i3) {
        this.a = 0;
        this.e = a75Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public y65(iq6 iq6Var, int i) {
        this.a = 1;
        this.e = iq6Var;
        this.b = i;
        this.c = -1;
        this.d = iq6.c(iq6Var);
    }
}
