package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w17  reason: default package */
/* loaded from: classes.dex */
public final class w17 extends xnd {
    public final boolean l;
    public final z9c m;
    public final y9c n;
    public u17 o;
    public t17 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public w17(ci0 ci0Var, boolean z) {
        super(ci0Var);
        boolean z2;
        if (z && ci0Var.i()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new z9c();
        this.n = new y9c();
        aac g = ci0Var.g();
        if (g != null) {
            this.o = new u17(g, null, null);
            this.s = true;
            return;
        }
        this.o = new u17(new v17(ci0Var.h()), z9c.p, u17.f);
    }

    @Override // defpackage.xnd
    public final void B() {
        if (!this.l) {
            this.q = true;
            A();
        }
    }

    @Override // defpackage.ci0
    /* renamed from: C */
    public final t17 b(e67 e67Var, ij1 ij1Var, long j) {
        boolean z;
        t17 t17Var = new t17(e67Var, ij1Var, j);
        if (t17Var.d == null) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        t17Var.d = this.k;
        if (this.r) {
            Object obj = e67Var.a;
            if (this.o.e != null && obj.equals(u17.f)) {
                obj = this.o.e;
            }
            t17Var.b(e67Var.a(obj));
            return t17Var;
        }
        this.p = t17Var;
        if (!this.q) {
            this.q = true;
            A();
        }
        return t17Var;
    }

    public final boolean D(long j) {
        t17 t17Var = this.p;
        int b = this.o.b(t17Var.a.a);
        if (b == -1) {
            return false;
        }
        u17 u17Var = this.o;
        y9c y9cVar = this.n;
        u17Var.f(b, y9cVar, false);
        long j2 = y9cVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        t17Var.C = j;
        return true;
    }

    @Override // defpackage.ci0
    public final void n(n57 n57Var) {
        t17 t17Var = (t17) n57Var;
        if (t17Var.e != null) {
            ci0 ci0Var = t17Var.d;
            ci0Var.getClass();
            ci0Var.n(t17Var.e);
        }
        if (n57Var == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.jx1, defpackage.ci0
    public final void p() {
        this.r = false;
        this.q = false;
        super.p();
    }

    @Override // defpackage.xnd, defpackage.ci0
    public final void s(f57 f57Var) {
        bac bacVar;
        if (this.s) {
            u17 u17Var = this.o;
            aac aacVar = u17Var.b;
            if (aacVar instanceof bac) {
                bacVar = new bac(((bac) aacVar).b, f57Var);
            } else {
                bacVar = new bac(aacVar, f57Var);
            }
            this.o = new u17(bacVar, u17Var.d, u17Var.e);
        } else {
            this.o = new u17(new v17(f57Var), z9c.p, u17.f);
        }
        this.k.s(f57Var);
    }

    @Override // defpackage.xnd
    public final e67 y(e67 e67Var) {
        Object obj = e67Var.a;
        Object obj2 = this.o.e;
        if (obj2 != null && obj2.equals(obj)) {
            obj = u17.f;
        }
        return e67Var.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.xnd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(defpackage.aac r13) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w17.z(aac):void");
    }
}
