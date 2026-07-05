package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t21  reason: default package */
/* loaded from: classes.dex */
public final class t21 implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b = 0;
    public final int c;
    public final /* synthetic */ Object d;

    public t21(szd szdVar) {
        this.d = szdVar;
        this.c = szdVar.b();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < this.c) {
                    return true;
                }
                return false;
            case 1:
                if (this.b < this.c) {
                    return true;
                }
                return false;
            case 2:
                if (this.b < this.c) {
                    return true;
                }
                return false;
            case 3:
                if (this.b < this.c) {
                    return true;
                }
                return false;
            case 4:
                if (this.b < this.c) {
                    return true;
                }
                return false;
            default:
                if (this.b < this.c) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.d;
        int i2 = this.c;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 < i2) {
                    this.b = i3 + 1;
                    return Byte.valueOf(((a31) obj).e(i3));
                }
                xk5.g();
                return null;
            case 1:
                int i4 = this.b;
                if (i4 < i2) {
                    this.b = i4 + 1;
                    return Byte.valueOf(((b31) obj).e(i4));
                }
                xk5.g();
                return null;
            case 2:
                int i5 = this.b;
                if (i5 < i2) {
                    this.b = i5 + 1;
                    return Byte.valueOf(((c31) obj).f(i5));
                }
                xk5.g();
                return null;
            case 3:
                int i6 = this.b;
                if (i6 < i2) {
                    this.b = i6 + 1;
                    return Byte.valueOf(((szd) obj).a(i6));
                }
                xk5.g();
                return null;
            case 4:
                int i7 = this.b;
                if (i7 < i2) {
                    this.b = i7 + 1;
                    return Byte.valueOf(((s6e) obj).a(i7));
                }
                xk5.g();
                return null;
            default:
                int i8 = this.b;
                if (i8 < i2) {
                    this.b = i8 + 1;
                    return Byte.valueOf(((qpe) obj).b(i8));
                }
                xk5.g();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public t21(qpe qpeVar) {
        this.d = qpeVar;
        this.c = qpeVar.d();
    }

    public t21(s6e s6eVar) {
        this.d = s6eVar;
        this.c = s6eVar.b();
    }

    public t21(a31 a31Var) {
        this.d = a31Var;
        this.c = a31Var.size();
    }

    public t21(c31 c31Var) {
        this.d = c31Var;
        this.c = c31Var.size();
    }

    public t21(b31 b31Var) {
        this.d = b31Var;
        this.c = b31Var.size();
    }
}
