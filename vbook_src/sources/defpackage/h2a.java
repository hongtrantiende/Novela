package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h2a  reason: default package */
/* loaded from: classes3.dex */
public abstract class h2a {
    public final hm8 a;
    public m82 b;
    public float c;
    public float d;
    public final hm8 e;
    public final hm8 f;
    public final hm8 g;
    public uf h;
    public uf i;
    public uf j;
    public final hm8 k;
    public final hm8 l;
    public se0 m;
    public fi8 n;
    public final float o;
    public float p;
    public float q;
    public int r;
    public int s;
    public int t;
    public bt1 u;

    public h2a(kj6 kj6Var) {
        kj6Var.getClass();
        this.a = yae.z(kj6Var);
        Float valueOf = Float.valueOf((float) nae.e);
        this.e = yae.z(valueOf);
        this.f = yae.z(valueOf);
        this.g = yae.z(new zy5(0L));
        fi8 fi8Var = fi8.a;
        this.k = yae.z(fi8Var);
        this.l = yae.z(null);
        this.n = fi8Var;
        this.o = 8.0f;
        this.p = -1.0f;
        this.q = -1.0f;
        this.r = -1;
        this.s = -1;
        this.t = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.m42 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.g2a
            if (r0 == 0) goto L13
            r0 = r8
            g2a r0 = (defpackage.g2a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            g2a r0 = new g2a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            hm8 r2 = r7.l
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.hre.r(r8)
            goto L71
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L2e:
            defpackage.hre.r(r8)
            bt1 r8 = defpackage.jxe.c()
            r7.u = r8
            r8 = 0
            r7.r = r8
            boolean r1 = r7.g()
            r5 = -1
            if (r1 == 0) goto L43
            r1 = r8
            goto L44
        L43:
            r1 = r5
        L44:
            r7.t = r1
            boolean r1 = r7.h()
            if (r1 == 0) goto L4d
            goto L4e
        L4d:
            r8 = r5
        L4e:
            r7.s = r8
            yj1 r8 = defpackage.by5.a
            zx5 r8 = r8.k()
            long r5 = r8.b()
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r5)
            r2.setValue(r8)
            bt1 r8 = r7.u
            if (r8 == 0) goto L73
            r0.c = r3
            java.lang.Object r8 = r8.r(r0)
            n82 r0 = defpackage.n82.a
            if (r8 != r0) goto L71
            return r0
        L71:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
        L73:
            r2.setValue(r4)
            r7.u = r4
            pvc r7 = defpackage.pvc.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2a.a(m42):java.lang.Object");
    }

    public abstract void b(float f, float f2);

    public abstract void c();

    public final int d() {
        return i().h();
    }

    public final float e() {
        return ((Number) this.e.getValue()).floatValue();
    }

    public final fi8 f() {
        return (fi8) this.k.getValue();
    }

    public boolean g() {
        gj6 gj6Var = (gj6) sl1.k0(i().j().k);
        if (gj6Var != null && gj6Var.a < i().j().n - 1) {
            return true;
        }
        return false;
    }

    public boolean h() {
        gj6 gj6Var = (gj6) sl1.e0(i().j().k);
        if (gj6Var != null && gj6Var.a > 0) {
            return true;
        }
        return false;
    }

    public final kj6 i() {
        return (kj6) this.a.getValue();
    }

    public final long j() {
        return ((zy5) this.g.getValue()).a;
    }

    public abstract boolean k();

    public abstract pvc l(boolean z, y78 y78Var);

    public abstract pvc m(boolean z, y78 y78Var);

    public final void n(float f) {
        this.e.setValue(Float.valueOf(f));
    }

    public final void o(float f) {
        this.f.setValue(Float.valueOf(f));
    }

    public abstract void p(float f, float f2);
}
