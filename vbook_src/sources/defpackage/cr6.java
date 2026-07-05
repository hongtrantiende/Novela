package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cr6  reason: default package */
/* loaded from: classes3.dex */
public abstract class cr6 implements o9a {
    public final o9a a;

    public cr6(o9a o9aVar) {
        this.a = o9aVar;
    }

    @Override // defpackage.o9a
    public final int d(String str) {
        str.getClass();
        Integer R = r4b.R(10, str);
        if (R != null) {
            return R.intValue();
        }
        vs.m(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // defpackage.o9a
    public final bze e() {
        return a5b.g;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cr6) {
                cr6 cr6Var = (cr6) obj;
                if (c16.i(this.a, cr6Var.a) && c16.i(a(), cr6Var.a())) {
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
        return 1;
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
        p1a.m(hl5.s("Illegal index ", ", ", i), a(), " expects only non-negative indices");
        return null;
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.o9a
    public final o9a i(int i) {
        if (i >= 0) {
            return this.a;
        }
        p1a.m(hl5.s("Illegal index ", ", ", i), a(), " expects only non-negative indices");
        return null;
    }

    @Override // defpackage.o9a
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        p1a.m(hl5.s("Illegal index ", ", ", i), a(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
