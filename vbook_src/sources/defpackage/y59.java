package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y59  reason: default package */
/* loaded from: classes3.dex */
public final class y59 implements o9a {
    public final String a;
    public final w59 b;

    public y59(String str, w59 w59Var) {
        w59Var.getClass();
        this.a = str;
        this.b = w59Var;
    }

    @Override // defpackage.o9a
    public final String a() {
        return this.a;
    }

    public final void b() {
        throw new IllegalStateException(s21.q(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    @Override // defpackage.o9a
    public final int d(String str) {
        str.getClass();
        b();
        throw null;
    }

    @Override // defpackage.o9a
    public final bze e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y59) {
                y59 y59Var = (y59) obj;
                if (this.a.equals(y59Var.a) && c16.i(this.b, y59Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.o9a
    public final int f() {
        return 0;
    }

    @Override // defpackage.o9a
    public final String g(int i) {
        b();
        throw null;
    }

    @Override // defpackage.o9a
    public final List h(int i) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.o9a
    public final o9a i(int i) {
        b();
        throw null;
    }

    @Override // defpackage.o9a
    public final boolean j(int i) {
        b();
        throw null;
    }

    public final String toString() {
        return s21.p(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
