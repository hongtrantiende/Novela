package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v97  reason: default package */
/* loaded from: classes.dex */
public final class v97 implements c14 {
    public final c14 a;
    public final ajc b;

    public v97(c14 c14Var, ajc ajcVar) {
        this.a = c14Var;
        this.b = ajcVar;
    }

    @Override // defpackage.c14
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override // defpackage.c14
    public final void b(long j, long j2, long j3, List list, a47[] a47VarArr) {
        this.a.b(j, j2, j3, list, a47VarArr);
    }

    @Override // defpackage.c14
    public final ajc c() {
        return this.b;
    }

    @Override // defpackage.c14
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.c14
    public final int e(vq4 vq4Var) {
        return this.a.u(this.b.a(vq4Var));
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof v97)) {
            return this.b.equals(((v97) obj).b);
        }
        return false;
    }

    @Override // defpackage.c14
    public final boolean f(long j, hh1 hh1Var, List list) {
        return this.a.f(j, hh1Var, list);
    }

    @Override // defpackage.c14
    public final void g(boolean z) {
        this.a.g(z);
    }

    @Override // defpackage.c14
    public final vq4 h(int i) {
        return this.b.d[this.a.j(i)];
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.c14
    public final void i() {
        this.a.i();
    }

    @Override // defpackage.c14
    public final int j(int i) {
        return this.a.j(i);
    }

    @Override // defpackage.c14
    public final int k(long j, List list) {
        return this.a.k(j, list);
    }

    @Override // defpackage.c14
    public final void l() {
        this.a.l();
    }

    @Override // defpackage.c14
    public final int length() {
        return this.a.length();
    }

    @Override // defpackage.c14
    public final int m() {
        return this.a.m();
    }

    @Override // defpackage.c14
    public final vq4 n() {
        return this.b.d[this.a.m()];
    }

    @Override // defpackage.c14
    public final int o() {
        return this.a.o();
    }

    @Override // defpackage.c14
    public final boolean p(int i, long j) {
        return this.a.p(i, j);
    }

    @Override // defpackage.c14
    public final void q(float f) {
        this.a.q(f);
    }

    @Override // defpackage.c14
    public final Object r() {
        return this.a.r();
    }

    @Override // defpackage.c14
    public final void s() {
        this.a.s();
    }

    @Override // defpackage.c14
    public final void t() {
        this.a.t();
    }

    @Override // defpackage.c14
    public final int u(int i) {
        return this.a.u(i);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v97)) {
            return false;
        }
        return this.a.equals(((v97) obj).a);
    }
}
