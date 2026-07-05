package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y79  reason: default package */
/* loaded from: classes.dex */
public final class y79 implements gs6 {
    public volatile boolean C;
    public long E;
    public mg2 F;
    public fjc G;
    public boolean H;
    public final /* synthetic */ b89 I;
    public final Uri a;
    public final h0b b;
    public final ij1 c;
    public final b89 d;
    public final vy1 e;
    public final fr2 f = new Object();
    public boolean D = true;

    /* JADX WARN: Type inference failed for: r1v2, types: [fr2, java.lang.Object] */
    public y79(b89 b89Var, Uri uri, jg2 jg2Var, ij1 ij1Var, b89 b89Var2, vy1 vy1Var) {
        this.I = b89Var;
        this.a = uri;
        this.b = new h0b(jg2Var);
        this.c = ij1Var;
        this.d = b89Var2;
        this.e = vy1Var;
        cs6.b.getAndIncrement();
        this.F = a(0L, null);
    }

    public final mg2 a(long j, String str) {
        Map map = b89.n0;
        if (str != null && !str.startsWith("W/")) {
            kj a = rm9.a();
            a.w(map.entrySet());
            a.v("If-Range", str);
            map = a.d(false);
        }
        Map map2 = Collections.EMPTY_MAP;
        Uri uri = this.a;
        wq9.z(uri, "The uri must be set.");
        return new mg2(uri, 1, null, map, j, -1L, null, 6);
    }

    @Override // defpackage.gs6
    public final void b() {
        jg2 jg2Var;
        r94 r94Var;
        int i;
        int i2 = 0;
        String str = null;
        while (i2 == 0 && !this.C) {
            try {
                long j = this.f.a;
                mg2 a = a(j, str);
                this.F = a;
                long d = this.b.d(a);
                if (this.C) {
                    if (i2 != 1 && this.c.A() != -1) {
                        this.f.a = this.c.A();
                    }
                    yae.k(this.b);
                    return;
                }
                List list = (List) this.b.a.o().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (d != -1) {
                    d += j;
                    b89 b89Var = this.I;
                    b89Var.M.post(new u79(b89Var, 0));
                }
                long j2 = d;
                this.I.O = rk5.d(this.b.a.o());
                h0b h0bVar = this.b;
                rk5 rk5Var = this.I.O;
                if (rk5Var != null && (i = rk5Var.f) != -1) {
                    jg2Var = new pk5(h0bVar, i, this);
                    fjc D = this.I.D(new a89(0, true));
                    this.G = D;
                    D.g(b89.o0);
                } else {
                    jg2Var = h0bVar;
                }
                this.c.N(jg2Var, this.a, this.b.a.o(), j, j2, this.d);
                if (this.I.O != null && (r94Var = (r94) this.c.c) != null && (r94Var instanceof os7)) {
                    ((os7) r94Var).s = true;
                }
                if (this.D) {
                    ij1 ij1Var = this.c;
                    long j3 = this.E;
                    r94 r94Var2 = (r94) ij1Var.c;
                    r94Var2.getClass();
                    r94Var2.d(j, j3);
                    this.D = false;
                }
                while (i2 == 0 && !this.C) {
                    try {
                        vy1 vy1Var = this.e;
                        synchronized (vy1Var) {
                            while (!vy1Var.b) {
                                vy1Var.a.getClass();
                                vy1Var.wait();
                            }
                        }
                        ij1 ij1Var2 = this.c;
                        fr2 fr2Var = this.f;
                        r94 r94Var3 = (r94) ij1Var2.c;
                        r94Var3.getClass();
                        tt2 tt2Var = (tt2) ij1Var2.d;
                        tt2Var.getClass();
                        i2 = r94Var3.b(tt2Var, fr2Var);
                        long A = this.c.A();
                        if (A > this.I.E + j) {
                            vy1 vy1Var2 = this.e;
                            synchronized (vy1Var2) {
                                vy1Var2.b = false;
                            }
                            b89 b89Var2 = this.I;
                            b89Var2.M.post(b89Var2.L);
                            j = A;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (this.c.A() != -1) {
                    this.f.a = this.c.A();
                }
                yae.k(this.b);
            } catch (Throwable th) {
                if (i2 != 1 && this.c.A() != -1) {
                    this.f.a = this.c.A();
                }
                yae.k(this.b);
                throw th;
            }
        }
    }

    @Override // defpackage.gs6
    public final void c() {
        this.C = true;
    }
}
