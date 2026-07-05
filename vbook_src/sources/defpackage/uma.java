package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uma  reason: default package */
/* loaded from: classes.dex */
public final class uma implements b7a {
    public final boolean a;
    public final int b;
    public final int c;
    public final g6a d;
    public final z5a e;

    public uma(boolean z, int i, int i2, g6a g6aVar, z5a z5aVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = g6aVar;
        this.e = z5aVar;
    }

    @Override // defpackage.b7a
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.b7a
    public final z5a b() {
        return this.e;
    }

    @Override // defpackage.b7a
    public final z5a c(long j) {
        z5a z5aVar = this.e;
        if (j == z5aVar.a) {
            return z5aVar;
        }
        return null;
    }

    @Override // defpackage.b7a
    public final g6a d() {
        return this.d;
    }

    @Override // defpackage.b7a
    public final z5a e() {
        return this.e;
    }

    @Override // defpackage.b7a
    public final int f() {
        return 1;
    }

    @Override // defpackage.b7a
    public final int g() {
        return this.c;
    }

    @Override // defpackage.b7a
    public final z5a h() {
        return this.e;
    }

    @Override // defpackage.b7a
    public final jd2 i() {
        int i = this.b;
        int i2 = this.c;
        if (i < i2) {
            return jd2.b;
        }
        if (i > i2) {
            return jd2.a;
        }
        return this.e.b();
    }

    @Override // defpackage.b7a
    public final z5a k() {
        return this.e;
    }

    @Override // defpackage.b7a
    public final int l() {
        return this.b;
    }

    @Override // defpackage.b7a
    public final boolean m(b7a b7aVar) {
        if (this.d != null && b7aVar != null && (b7aVar instanceof uma)) {
            uma umaVar = (uma) b7aVar;
            if (this.b == umaVar.b && this.c == umaVar.c && this.a == umaVar.a) {
                z5a z5aVar = umaVar.e;
                z5a z5aVar2 = this.e;
                if (z5aVar2.a == z5aVar.a && z5aVar2.c == z5aVar.c && z5aVar2.d == z5aVar.d) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.b7a
    public final cv7 n(g6a g6aVar) {
        boolean z = g6aVar.c;
        f6a f6aVar = g6aVar.b;
        f6a f6aVar2 = g6aVar.a;
        if ((!z && f6aVar2.b > f6aVar.b) || (z && f6aVar2.b <= f6aVar.b)) {
            g6aVar = g6a.a(g6aVar, null, null, !z, 3);
        }
        long j = this.e.a;
        cv7 cv7Var = zx6.a;
        cv7 cv7Var2 = new cv7();
        cv7Var2.i(g6aVar, j);
        return cv7Var2;
    }

    public final String toString() {
        jd2 i = i();
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + i + ", info=\n\t" + this.e + ")";
    }

    @Override // defpackage.b7a
    public final void j(h66 h66Var) {
    }
}
