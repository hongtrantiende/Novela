package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r75  reason: default package */
/* loaded from: classes.dex */
public final class r75 extends ci0 {
    public final du2 h;
    public final fz4 i;
    public final kh5 j;
    public final fl3 k;
    public final ox9 l;
    public final boolean m;
    public final int n;
    public final hu2 o;
    public final long p;
    public b57 q;
    public ys2 r;
    public f57 s;

    static {
        g57.a("media3.exoplayer.hls");
    }

    public r75(f57 f57Var, fz4 fz4Var, du2 du2Var, kh5 kh5Var, fl3 fl3Var, ox9 ox9Var, hu2 hu2Var, long j, boolean z, int i) {
        this.s = f57Var;
        this.q = f57Var.c;
        this.i = fz4Var;
        this.h = du2Var;
        this.j = kh5Var;
        this.k = fl3Var;
        this.l = ox9Var;
        this.o = hu2Var;
        this.p = j;
        this.m = z;
        this.n = i;
    }

    public static l75 t(long j, List list) {
        l75 l75Var = null;
        for (int i = 0; i < list.size(); i++) {
            l75 l75Var2 = (l75) list.get(i);
            long j2 = l75Var2.e;
            if (j2 <= j && l75Var2.H) {
                l75Var = l75Var2;
            } else if (j2 > j) {
                break;
            }
        }
        return l75Var;
    }

    @Override // defpackage.ci0
    public final n57 b(e67 e67Var, ij1 ij1Var, long j) {
        cl3 a = a(e67Var);
        cl3 cl3Var = new cl3(this.d.c, 0, e67Var);
        ys2 ys2Var = this.r;
        a09 a09Var = this.g;
        a09Var.getClass();
        return new h75(this.h, this.o, this.i, ys2Var, this.k, cl3Var, this.l, a, ij1Var, this.j, this.m, this.n, a09Var);
    }

    @Override // defpackage.ci0
    public final synchronized f57 h() {
        return this.s;
    }

    @Override // defpackage.ci0
    public final void j() {
        hu2 hu2Var = this.o;
        ij1 ij1Var = hu2Var.C;
        if (ij1Var != null) {
            ij1Var.b();
        }
        xm8 xm8Var = hu2Var.G;
        if (xm8Var == null) {
            Uri uri = hu2Var.L;
            if (uri != null) {
                hu2Var.j(uri);
                return;
            }
            return;
        }
        throw xm8Var;
    }

    @Override // defpackage.ci0
    public final void l(ys2 ys2Var) {
        boolean z;
        this.r = ys2Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        a09 a09Var = this.g;
        a09Var.getClass();
        fl3 fl3Var = this.k;
        fl3Var.l(myLooper, a09Var);
        fl3Var.j();
        cl3 a = a(null);
        c57 c57Var = h().b;
        c57Var.getClass();
        Uri uri = c57Var.a;
        hu2 hu2Var = this.o;
        hu2Var.getClass();
        hu2Var.D = a2d.p(null);
        hu2Var.f = a;
        hu2Var.E = this;
        Map map = Collections.EMPTY_MAP;
        wq9.z(uri, "The uri must be set.");
        bn8 bn8Var = new bn8(((gg2) hu2Var.a.a).h(), new mg2(uri, 1, null, map, 0L, -1L, null, 1), 4, hu2Var.b.m());
        if (hu2Var.C == null) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        ij1 ij1Var = new ij1("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        hu2Var.C = ij1Var;
        ij1Var.Z(bn8Var, hu2Var, hu2Var.c.r(bn8Var.c));
    }

    @Override // defpackage.ci0
    public final void n(n57 n57Var) {
        g85[] g85VarArr;
        f85[] f85VarArr;
        h75 h75Var = (h75) n57Var;
        h75Var.b.e.remove(h75Var);
        for (g85 g85Var : h75Var.P) {
            if (g85Var.Z) {
                for (f85 f85Var : g85Var.R) {
                    f85Var.k();
                    mu9 mu9Var = f85Var.h;
                    if (mu9Var != null) {
                        mu9Var.y(f85Var.e);
                        f85Var.h = null;
                        f85Var.g = null;
                    }
                }
            }
            f75 f75Var = g85Var.d;
            int m = f75Var.r.m();
            hu2 hu2Var = f75Var.g;
            Uri c = f75Var.e[m].c();
            gu2 gu2Var = (gu2) hu2Var.d.get(c);
            if (gu2Var != null) {
                fu2 fu2Var = (fu2) nk2.r(gu2Var.b, c, c);
                fu2Var.getClass();
                fu2Var.H = false;
            }
            f75Var.n = null;
            g85Var.F.S(g85Var);
            g85Var.N.removeCallbacksAndMessages(null);
            g85Var.d0 = true;
            g85Var.O.clear();
        }
        h75Var.M = null;
    }

    @Override // defpackage.ci0
    public final void p() {
        hu2 hu2Var = this.o;
        hu2Var.L = null;
        hu2Var.M = null;
        hu2Var.F = null;
        hu2Var.H = null;
        hu2Var.I = null;
        hu2Var.J = null;
        hu2Var.K = null;
        hu2Var.G = null;
        hu2Var.O = -9223372036854775807L;
        hu2Var.C.S(null);
        hu2Var.C = null;
        HashMap hashMap = hu2Var.d;
        for (gu2 gu2Var : hashMap.values()) {
            for (fu2 fu2Var : gu2Var.b.values()) {
                fu2Var.c.S(null);
            }
        }
        hu2Var.D.removeCallbacksAndMessages(null);
        hu2Var.D = null;
        hashMap.clear();
        this.k.a();
    }

    @Override // defpackage.ci0
    public final synchronized void s(f57 f57Var) {
        this.s = f57Var;
    }

    /* JADX WARN: Type inference failed for: r32v0, types: [kh5, java.lang.Object] */
    public final void u(q75 q75Var) {
        long j;
        long j2;
        long j3;
        mma mmaVar;
        long j4;
        boolean z;
        long j5;
        long j6;
        long j7;
        boolean z2;
        float f;
        long j8;
        boolean z3;
        boolean z4 = q75Var.p;
        boolean z5 = q75Var.g;
        qs5 qs5Var = q75Var.r;
        long j9 = q75Var.u;
        long j10 = q75Var.e;
        int i = q75Var.d;
        long j11 = q75Var.h;
        if (z4) {
            j = a2d.e0(j11);
        } else {
            j = -9223372036854775807L;
        }
        if (i != 2 && i != 1) {
            j2 = -9223372036854775807L;
        } else {
            j2 = j;
        }
        hu2 hu2Var = this.o;
        hu2Var.F.getClass();
        ?? obj = new Object();
        long j12 = 0;
        if (hu2Var.N) {
            p75 p75Var = q75Var.v;
            long j13 = j11 - hu2Var.O;
            boolean z6 = q75Var.o;
            if (z6) {
                j4 = j13 + j9;
            } else {
                j4 = -9223372036854775807L;
            }
            if (q75Var.p) {
                z = z5;
                j5 = a2d.Q(a2d.B(this.p)) - (j11 + j9);
            } else {
                z = z5;
                j5 = 0;
            }
            long j14 = this.q.a;
            if (j14 != -9223372036854775807L) {
                j7 = a2d.Q(j14);
            } else {
                if (j10 != -9223372036854775807L) {
                    j6 = j9 - j10;
                } else {
                    j6 = p75Var.d;
                    if (j6 == -9223372036854775807L || q75Var.n == -9223372036854775807L) {
                        j6 = p75Var.c;
                        if (j6 == -9223372036854775807L) {
                            j6 = 3 * q75Var.m;
                        }
                    }
                }
                j7 = j6 + j5;
            }
            long j15 = j9 + j5;
            long j16 = a2d.j(j7, j5, j15);
            b57 b57Var = h().c;
            if (b57Var.d == -3.4028235E38f && b57Var.e == -3.4028235E38f && p75Var.c == -9223372036854775807L && p75Var.d == -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            a57 a = this.q.a();
            a.a = a2d.e0(j16);
            float f2 = 1.0f;
            if (z2) {
                f = 1.0f;
            } else {
                f = this.q.d;
            }
            a.d = f;
            if (!z2) {
                f2 = this.q.e;
            }
            a.e = f2;
            b57 b57Var2 = new b57(a);
            this.q = b57Var2;
            if (j10 == -9223372036854775807L) {
                j10 = j15 - a2d.Q(b57Var2.a);
            }
            if (z) {
                j12 = j10;
            } else {
                l75 t = t(j10, q75Var.s);
                if (t != null) {
                    j8 = t.e;
                } else if (!qs5Var.isEmpty()) {
                    n75 n75Var = (n75) qs5Var.get(a2d.d(qs5Var, Long.valueOf(j10), true));
                    l75 t2 = t(j10, n75Var.I);
                    if (t2 != null) {
                        j8 = t2.e;
                    } else {
                        j8 = n75Var.e;
                    }
                }
                j12 = j8;
            }
            if (i == 2 && q75Var.f) {
                z3 = true;
            } else {
                z3 = false;
            }
            mmaVar = new mma(j2, j, j4, q75Var.u, j13, j12, true, !z6, z3, obj, h(), this.q);
        } else {
            if (j10 != -9223372036854775807L && !qs5Var.isEmpty()) {
                if (!z5 && j10 != j9) {
                    j10 = ((n75) qs5Var.get(a2d.d(qs5Var, Long.valueOf(j10), true))).e;
                }
                j3 = j10;
            } else {
                j3 = 0;
            }
            long j17 = q75Var.u;
            mmaVar = new mma(j2, j, j17, j17, 0L, j3, true, false, true, obj, h(), null);
        }
        m(mmaVar);
    }
}
