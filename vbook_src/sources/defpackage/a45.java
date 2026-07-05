package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a45  reason: default package */
/* loaded from: classes3.dex */
public final class a45 implements o9a {
    public final String a;
    public final o9a b;
    public final o9a c;

    public a45(String str, o9a o9aVar, o9a o9aVar2) {
        this.a = str;
        this.b = o9aVar;
        this.c = o9aVar2;
    }

    @Override // defpackage.o9a
    public final String a() {
        return this.a;
    }

    @Override // defpackage.o9a
    public final int d(String str) {
        str.getClass();
        Integer R = r4b.R(10, str);
        if (R != null) {
            return R.intValue();
        }
        vs.m(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // defpackage.o9a
    public final bze e() {
        return a5b.h;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a45) {
                a45 a45Var = (a45) obj;
                if (!this.a.equals(a45Var.a) || !this.b.equals(a45Var.b) || !this.c.equals(a45Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.o9a
    public final int f() {
        return 2;
    }

    @Override // defpackage.o9a
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.o9a
    public final List h(int i) {
        if (i >= 0) {
            return ks3.a;
        }
        p1a.k(s21.q(hl5.s("Illegal index ", ", ", i), this.a, " expects only non-negative indices"));
        return null;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.o9a
    public final o9a i(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 != 0) {
                if (i2 == 1) {
                    return this.c;
                }
                vs.k("Unreached");
                return null;
            }
            return this.b;
        }
        p1a.k(s21.q(hl5.s("Illegal index ", ", ", i), this.a, " expects only non-negative indices"));
        return null;
    }

    @Override // defpackage.o9a
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        p1a.k(s21.q(hl5.s("Illegal index ", ", ", i), this.a, " expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }
}
