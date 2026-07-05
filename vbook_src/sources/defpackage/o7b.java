package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o7b  reason: default package */
/* loaded from: classes.dex */
public final class o7b implements bn9 {
    public final hm8 C;
    public final hm8 D;
    public final hm8 E;
    public final hm8 F;
    public final hm8 G;
    public final hm8 H;
    public final hm8 I;
    public final em8 J;
    public final hm8 K;
    public final hm8 L;
    public final hm8 M;
    public final btd a;
    public final xn6 b;
    public m41 c;
    public int d;
    public final b7b e;
    public final qw6 f;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, hq7] */
    public o7b(btd btdVar, xn6 xn6Var) {
        btdVar.getClass();
        xn6Var.getClass();
        this.a = btdVar;
        this.b = xn6Var;
        b7b b7bVar = new b7b(btdVar.a, new Object(), new bp9(this, 4), new k7b(this, 0), new k7b(this, 1));
        this.e = b7bVar;
        this.f = btdVar.a;
        Boolean bool = Boolean.FALSE;
        yae.z(bool);
        this.C = yae.z((n8c) b7bVar.i.b);
        yae.z(bool);
        yae.z(b7bVar.q);
        new em8(b7bVar.p);
        yae.z(bool);
        this.D = yae.z(Boolean.valueOf(b7bVar.r));
        yae.z(bool);
        this.E = yae.z(b7bVar.t);
        this.F = yae.z(bool);
        this.G = yae.z(Boolean.valueOf(b7bVar.v));
        this.H = yae.z(b7bVar.u);
        Map map = b7bVar.A;
        LinkedHashMap linkedHashMap = new LinkedHashMap(p17.k(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            long j = ((qy5) entry.getValue()).a;
            int i = qy5.c;
            linkedHashMap.put(key, new py5((((int) (j >> 32)) << 32) | (4294967295L & ((int) (j & 4294967295L)))));
        }
        this.I = yae.z(linkedHashMap);
        this.J = new em8(this.e.y);
        this.K = yae.z(dye.v(this.e.z));
        this.L = yae.z(this.e.w);
        this.M = yae.z(this.e.x);
        b7b b7bVar2 = this.e;
        xn6 xn6Var2 = this.b;
        an9 an9Var = b7bVar2.n;
        zr1.A();
        if (!c16.i(b7bVar2.s, xn6Var2)) {
            xn6 xn6Var3 = b7bVar2.s;
            if (xn6Var3 != null) {
                xn6Var3.f(an9Var);
            }
            b7bVar2.s = xn6Var2;
            if (b7bVar2.f != null && xn6Var2 != null) {
                xn6Var2.a(an9Var);
            }
        }
    }

    @Override // defpackage.bn9
    public final void a() {
        b();
    }

    @Override // defpackage.bn9
    public final void b() {
        m41 m41Var;
        int i = this.d;
        if (i > 0) {
            int i2 = i - 1;
            this.d = i2;
            if (i2 != 0 || (m41Var = this.c) == null) {
                return;
            }
            b7b b7bVar = this.e;
            b7bVar.getClass();
            zr1.A();
            m41 m41Var2 = b7bVar.f;
            if (m41Var2 != null) {
                xn6 xn6Var = b7bVar.s;
                if (xn6Var != null) {
                    xn6Var.f(b7bVar.n);
                }
                b7bVar.a("setCoroutineScope");
                b7bVar.b("setCoroutineScope");
                k27.n(m41Var2, null);
                b7bVar.f = null;
            }
            k27.n(m41Var, nye.b("onForgotten", null));
            this.c = null;
        }
    }

    @Override // defpackage.bn9
    public final void c() {
        int i = this.d + 1;
        this.d = i;
        if (i == 1) {
            sw2 sw2Var = ab3.a;
            n35 n35Var = zz6.a;
            this.c = k27.a(n35Var);
            b7b b7bVar = this.e;
            b7bVar.getClass();
            zr1.A();
            if (b7bVar.f == null) {
                m41 a = k27.a(n35Var);
                b7bVar.f = a;
                z87.v(a, null, null, new a7b(b7bVar, null, 0), 3);
                z87.v(a, null, null, new a7b(b7bVar, null, 1), 3);
                z87.v(a, null, null, new a7b(b7bVar, null, 2), 3);
                z87.v(a, null, null, new a7b(b7bVar, null, 3), 3);
                z87.v(a, null, null, new a7b(b7bVar, null, 4), 3);
                xn6 xn6Var = b7bVar.s;
                if (xn6Var != null) {
                    xn6Var.a(b7bVar.n);
                }
                if (b7bVar.o != null) {
                    b7bVar.f("setImage");
                }
            }
        }
    }

    public final void d(n8c n8cVar) {
        this.C.setValue(n8cVar);
        b7b b7bVar = this.e;
        b7bVar.getClass();
        zr1.A();
        k57 k57Var = b7bVar.i;
        if (!c16.i((n8c) k57Var.b, n8cVar)) {
            qw6 qw6Var = b7bVar.a;
            qw6Var.getClass();
            mw6 mw6Var = mw6.b;
            if (qw6Var.a(mw6Var)) {
                pj pjVar = qw6Var.b;
                String str = qw6Var.a;
                pjVar.getClass();
                pj.a(mw6Var, str, "SubsamplingState. tileImageCache=" + n8cVar + ". '" + b7bVar.c() + '\'');
            }
            k57Var.b = n8cVar;
        }
    }
}
