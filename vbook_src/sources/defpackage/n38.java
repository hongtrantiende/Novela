package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n38  reason: default package */
/* loaded from: classes.dex */
public final class n38 implements Iterator, j76 {
    public final gi1 a;
    public y28 b;
    public y28 c;
    public y28 d;
    public y28 e;
    public y28 f;

    public n38(y28 y28Var, gi1 gi1Var) {
        y28Var.getClass();
        this.a = gi1Var;
        if (gi1Var.h(y28Var)) {
            this.c = y28Var;
        }
        this.d = y28Var;
        this.e = y28Var;
        this.b = y28Var;
        this.f = y28Var.A();
    }

    public final void a() {
        y28 y28Var;
        y28 y28Var2;
        if (this.c != null) {
            return;
        }
        if (this.f != null && ((y28Var2 = this.d) == null || y28Var2.a == null)) {
            this.d = this.e;
        }
        y28 y28Var3 = this.d;
        loop0: while (true) {
            y28Var3.getClass();
            y28Var = null;
            if (y28Var3.g() > 0) {
                y28Var3 = (y28) y28Var3.l().get(0);
            } else if (c16.i(this.b, y28Var3)) {
                y28Var3 = null;
            } else if (y28Var3.t() != null) {
                y28Var3 = y28Var3.t();
            } else {
                do {
                    y28Var3 = y28Var3.A();
                    if (y28Var3 == null || c16.i(this.b, y28Var3)) {
                        break loop0;
                    }
                } while (y28Var3.t() == null);
                y28Var3 = y28Var3.t();
            }
            if (y28Var3 == null) {
                break;
            } else if (this.a.h(y28Var3)) {
                y28Var = y28Var3;
                break;
            }
        }
        this.c = y28Var;
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public final y28 next() {
        cp3 cp3Var;
        a();
        y28 y28Var = this.c;
        if (y28Var != null) {
            this.e = this.d;
            this.d = y28Var;
            if (y28Var != null) {
                cp3Var = y28Var.A();
            } else {
                cp3Var = null;
            }
            this.f = cp3Var;
            this.c = null;
            return y28Var;
        }
        xk5.g();
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        if (this.c != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        y28 y28Var = this.d;
        if (y28Var != null) {
            y28Var.D();
        }
    }
}
