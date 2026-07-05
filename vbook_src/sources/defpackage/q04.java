package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q04  reason: default package */
/* loaded from: classes.dex */
public final class q04 implements Handler.Callback, m57, o8d {
    public static final long C0 = a2d.e0(10000);
    public boolean A0;
    public final ys2 C;
    public final ggb D;
    public final elf E;
    public final Looper F;
    public final z9c G;
    public final y9c H;
    public final long I;
    public final kv2 J;
    public final ArrayList K;
    public final xfb L;
    public final wz3 M;
    public final q57 N;
    public final u67 O;
    public final hv2 P;
    public final long Q;
    public final a09 R;
    public final ms2 S;
    public final ggb T;
    public final boolean U;
    public final a50 V;
    public final boolean W;
    public o4a X;
    public boolean Z;
    public final bo9[] a;
    public boolean a0;
    public final ei0[] b;
    public p04 b0;
    public final boolean[] c;
    public int c0;
    public final ly2 d;
    public ly8 d0;
    public final ljc e;
    public n04 e0;
    public final jv2 f;
    public boolean f0;
    public boolean h0;
    public boolean i0;
    public boolean k0;
    public int l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public int q0;
    public p04 r0;
    public long s0;
    public long t0;
    public int u0;
    public boolean v0;
    public pz3 w0;
    public rz3 y0;
    public long z0 = -9223372036854775807L;
    public boolean g0 = false;
    public float B0 = 1.0f;
    public u3a Y = u3a.b;
    public long x0 = -9223372036854775807L;
    public long j0 = -9223372036854775807L;

    public q04(Context context, ei0[] ei0VarArr, ei0[] ei0VarArr2, ly2 ly2Var, ljc ljcVar, jv2 jv2Var, ys2 ys2Var, int i, boolean z, ms2 ms2Var, o4a o4aVar, hv2 hv2Var, long j, Looper looper, xfb xfbVar, wz3 wz3Var, a09 a09Var, rz3 rz3Var, final o8d o8dVar, boolean z2) {
        Looper looper2;
        this.M = wz3Var;
        this.d = ly2Var;
        this.e = ljcVar;
        this.f = jv2Var;
        this.C = ys2Var;
        this.l0 = i;
        this.m0 = z;
        this.X = o4aVar;
        this.P = hv2Var;
        this.Q = j;
        boolean z3 = false;
        this.L = xfbVar;
        this.R = a09Var;
        this.y0 = rz3Var;
        this.S = ms2Var;
        this.W = z2;
        this.I = jv2Var.n;
        x9c x9cVar = aac.a;
        ly8 k = ly8.k(ljcVar);
        this.d0 = k;
        this.e0 = new n04(k);
        this.b = new ei0[ei0VarArr.length];
        this.c = new boolean[ei0VarArr.length];
        ly2Var.getClass();
        this.a = new bo9[ei0VarArr.length];
        boolean z4 = false;
        for (int i2 = 0; i2 < ei0VarArr.length; i2++) {
            ei0 ei0Var = ei0VarArr[i2];
            ei0Var.e = i2;
            ei0Var.f = a09Var;
            ei0Var.C = xfbVar;
            this.b[i2] = ei0Var;
            ei0 ei0Var2 = this.b[i2];
            synchronized (ei0Var2.a) {
                ei0Var2.N = ly2Var;
            }
            ei0 ei0Var3 = ei0VarArr2[i2];
            if (ei0Var3 != null) {
                ei0Var3.e = i2;
                ei0Var3.f = a09Var;
                ei0Var3.C = xfbVar;
                z4 = true;
            }
            this.a[i2] = new bo9(ei0VarArr[i2], ei0Var3, i2);
        }
        this.U = z4;
        this.J = new kv2(this, xfbVar);
        this.K = new ArrayList();
        this.G = new z9c();
        this.H = new y9c();
        wq9.D(ly2Var.a == null);
        ly2Var.a = this;
        ly2Var.b = ys2Var;
        this.v0 = true;
        ggb a = xfbVar.a(looper, null);
        this.T = a;
        this.N = new q57(ms2Var, a, new q6(this, 19), rz3Var);
        this.O = new u67(this, ms2Var, a, a09Var);
        elf elfVar = new elf();
        this.E = elfVar;
        synchronized (elfVar.c) {
            try {
                if (((Looper) elfVar.b) == null) {
                    if (elfVar.a == 0 && ((HandlerThread) elfVar.d) == null) {
                        z3 = true;
                    }
                    wq9.D(z3);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    elfVar.d = handlerThread;
                    handlerThread.start();
                    elfVar.b = ((HandlerThread) elfVar.d).getLooper();
                }
                elfVar.a++;
                looper2 = (Looper) elfVar.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.F = looper2;
        ggb a2 = xfbVar.a(looper2, this);
        this.D = a2;
        this.V = new a50(context, looper2, this);
        a2.b(35, new o8d() { // from class: j04
            @Override // defpackage.o8d
            public final void c(long j2, long j3, vq4 vq4Var, MediaFormat mediaFormat) {
                o8dVar.c(j2, j3, vq4Var, mediaFormat);
                q04.this.c(j2, j3, vq4Var, mediaFormat);
            }
        }).b();
        a2.b(39, new k04(this)).b();
    }

    public static Pair S(aac aacVar, p04 p04Var, boolean z, int i, boolean z2, z9c z9cVar, y9c y9cVar) {
        aac aacVar2;
        int T;
        aac aacVar3 = p04Var.a;
        if (!aacVar.p()) {
            if (aacVar3.p()) {
                aacVar2 = aacVar;
            } else {
                aacVar2 = aacVar3;
            }
            try {
                Pair i2 = aacVar2.i(z9cVar, y9cVar, p04Var.b, p04Var.c);
                if (!aacVar.equals(aacVar2)) {
                    if (aacVar.b(i2.first) != -1) {
                        if (aacVar2.g(i2.first, y9cVar).f && aacVar2.m(y9cVar.c, z9cVar, 0L).m == aacVar2.b(i2.first)) {
                            return aacVar.i(z9cVar, y9cVar, aacVar.g(i2.first, y9cVar).c, p04Var.c);
                        }
                    } else if (z && (T = T(z9cVar, y9cVar, i, z2, i2.first, aacVar2, aacVar)) != -1) {
                        return aacVar.i(z9cVar, y9cVar, T, -9223372036854775807L);
                    } else {
                        return null;
                    }
                }
                return i2;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return null;
    }

    public static int T(z9c z9cVar, y9c y9cVar, int i, boolean z, Object obj, aac aacVar, aac aacVar2) {
        z9c z9cVar2 = z9cVar;
        aac aacVar3 = aacVar;
        Object obj2 = aacVar3.m(aacVar3.g(obj, y9cVar).c, z9cVar, 0L).a;
        for (int i2 = 0; i2 < aacVar2.o(); i2++) {
            if (aacVar2.m(i2, z9cVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int b = aacVar3.b(obj);
        int h = aacVar3.h();
        int i3 = -1;
        int i4 = 0;
        while (i4 < h && i3 == -1) {
            aac aacVar4 = aacVar3;
            int d = aacVar4.d(b, y9cVar, z9cVar2, i, z);
            if (d == -1) {
                break;
            }
            i3 = aacVar2.b(aacVar4.l(d));
            i4++;
            aacVar3 = aacVar4;
            b = d;
            z9cVar2 = z9cVar;
        }
        if (i3 == -1) {
            return -1;
        }
        return aacVar2.f(i3, y9cVar, false).c;
    }

    public static boolean z(o57 o57Var) {
        gx9[] gx9VarArr;
        long g;
        if (o57Var != null) {
            try {
                n57 n57Var = o57Var.a;
                if (!o57Var.e) {
                    n57Var.j();
                } else {
                    for (gx9 gx9Var : o57Var.c) {
                        if (gx9Var != null) {
                            gx9Var.b();
                        }
                    }
                }
                if (!o57Var.e) {
                    g = 0;
                } else {
                    g = n57Var.g();
                }
                if (g != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i, e67 e67Var) {
        boolean z;
        boolean z2;
        q57 q57Var = this.N;
        o57 o57Var = q57Var.k;
        if (o57Var != null && o57Var.g.a.equals(e67Var)) {
            bo9 bo9Var = this.a[i];
            o57 o57Var2 = q57Var.k;
            int i2 = bo9Var.d;
            if ((i2 == 2 || i2 == 4) && bo9Var.d(o57Var2) == bo9Var.a) {
                z = true;
            } else {
                z = false;
            }
            if (bo9Var.d == 3 && bo9Var.d(o57Var2) == bo9Var.c) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final void A0(int i, int i2, int i3, boolean z) {
        boolean z2;
        c14[] c14VarArr;
        if (z && i != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.Z;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            if (z3) {
                i2 = 4;
            } else {
                i2 = 0;
            }
        }
        ly8 ly8Var = this.d0;
        if (ly8Var.l != z2 || ly8Var.n != i2 || ly8Var.m != i3) {
            this.d0 = ly8Var.e(i3, i2, z2);
            D0(false, false);
            q57 q57Var = this.N;
            for (o57 o57Var = q57Var.i; o57Var != null; o57Var = o57Var.m) {
                for (c14 c14Var : (c14[]) o57Var.o.c) {
                    if (c14Var != null) {
                        c14Var.g(z2);
                    }
                }
            }
            if (!r0()) {
                v0();
                B0();
                ly8 ly8Var2 = this.d0;
                if (ly8Var2.p) {
                    this.d0 = ly8Var2.i(false);
                }
                q57Var.m(this.s0);
                return;
            }
            int i4 = this.d0.e;
            ggb ggbVar = this.D;
            if (i4 == 3) {
                kv2 kv2Var = this.J;
                kv2Var.f = true;
                kv2Var.a.f();
                t0();
                ggbVar.f(2);
            } else if (i4 == 2) {
                ggbVar.f(2);
            }
        }
    }

    public final boolean B() {
        o57 o57Var = this.N.i;
        long j = o57Var.g.f;
        if (o57Var.e) {
            if (j == -9223372036854775807L || this.d0.s < j || !r0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B0() {
        long j;
        boolean z;
        long j2;
        long max;
        long j3;
        float f;
        o57 o57Var = this.N.i;
        if (o57Var != null) {
            if (o57Var.e) {
                j = o57Var.a.p();
            } else {
                j = -9223372036854775807L;
            }
            if (j != -9223372036854775807L) {
                if (!o57Var.g()) {
                    this.N.n(o57Var);
                    u(false);
                    C();
                }
                Q(true, j);
                if (j != this.d0.s) {
                    ly8 ly8Var = this.d0;
                    this.d0 = y(ly8Var.b, j, ly8Var.c, j, true, 5);
                }
            } else {
                kv2 kv2Var = this.J;
                if (o57Var != this.N.j) {
                    z = true;
                } else {
                    z = false;
                }
                jya jyaVar = kv2Var.a;
                ei0 ei0Var = kv2Var.c;
                if (ei0Var != null && !ei0Var.m() && ((!z || kv2Var.c.D == 2) && (kv2Var.c.o() || (!z && !kv2Var.c.l())))) {
                    b47 b47Var = kv2Var.d;
                    b47Var.getClass();
                    long b = b47Var.b();
                    if (kv2Var.e) {
                        if (b < jyaVar.b()) {
                            if (jyaVar.b) {
                                jyaVar.d(jyaVar.b());
                                jyaVar.b = false;
                            }
                        } else {
                            kv2Var.e = false;
                            if (kv2Var.f) {
                                jyaVar.f();
                            }
                        }
                    }
                    jyaVar.d(b);
                    my8 e = b47Var.e();
                    if (!e.equals((my8) jyaVar.e)) {
                        jyaVar.a(e);
                        kv2Var.b.D.b(16, e).b();
                    }
                } else {
                    kv2Var.e = true;
                    if (kv2Var.f) {
                        jyaVar.f();
                    }
                }
                long b2 = kv2Var.b();
                this.s0 = b2;
                long j4 = b2 - o57Var.p;
                long j5 = this.d0.s;
                if (!this.K.isEmpty() && !this.d0.b.b()) {
                    if (this.v0) {
                        this.v0 = false;
                    }
                    ly8 ly8Var2 = this.d0;
                    ly8Var2.a.b(ly8Var2.b.a);
                    int min = Math.min(this.u0, this.K.size());
                    if (min > 0 && this.K.get(min - 1) != null) {
                        vm1.h();
                        return;
                    } else if (min < this.K.size() && this.K.get(min) != null) {
                        vm1.h();
                        return;
                    } else {
                        this.u0 = min;
                    }
                }
                if (this.J.c()) {
                    boolean z2 = !this.e0.e;
                    ly8 ly8Var3 = this.d0;
                    this.d0 = y(ly8Var3.b, j4, ly8Var3.c, j4, z2, 6);
                } else {
                    ly8 ly8Var4 = this.d0;
                    ly8Var4.s = j4;
                    ly8Var4.t = SystemClock.elapsedRealtime();
                }
            }
            this.d0.q = this.N.l.d();
            ly8 ly8Var5 = this.d0;
            ly8Var5.r = p(ly8Var5.q);
            ly8 ly8Var6 = this.d0;
            if (ly8Var6.l && ly8Var6.e == 3 && s0(ly8Var6.a, ly8Var6.b)) {
                ly8 ly8Var7 = this.d0;
                float f2 = 1.0f;
                if (ly8Var7.o.a == 1.0f) {
                    hv2 hv2Var = this.P;
                    long m = m(ly8Var7.a, ly8Var7.b.a, ly8Var7.s);
                    long j6 = this.d0.r;
                    if (hv2Var.c != -9223372036854775807L) {
                        long j7 = m - j6;
                        if (hv2Var.m == -9223372036854775807L) {
                            hv2Var.m = j7;
                            hv2Var.n = 0L;
                        } else {
                            hv2Var.m = Math.max(j7, (((float) j7) * 9.999871E-4f) + (((float) j2) * 0.999f));
                            hv2Var.n = (9.999871E-4f * ((float) Math.abs(j7 - max))) + (((float) hv2Var.n) * 0.999f);
                        }
                        if (hv2Var.l != -9223372036854775807L) {
                            j3 = 1000;
                            if (SystemClock.elapsedRealtime() - hv2Var.l < 1000) {
                                f2 = hv2Var.k;
                            }
                        } else {
                            j3 = 1000;
                        }
                        hv2Var.l = SystemClock.elapsedRealtime();
                        long j8 = (hv2Var.n * 3) + hv2Var.m;
                        if (hv2Var.h > j8) {
                            float Q = (float) a2d.Q(j3);
                            f = 1.0E-7f;
                            long[] jArr = {j8, hv2Var.e, hv2Var.h - (((hv2Var.k - 1.0f) * Q) + ((hv2Var.i - 1.0f) * Q))};
                            long j9 = jArr[0];
                            for (int i = 1; i < 3; i++) {
                                long j10 = jArr[i];
                                if (j10 > j9) {
                                    j9 = j10;
                                }
                            }
                            hv2Var.h = j9;
                        } else {
                            f = 1.0E-7f;
                            long j11 = a2d.j(m - (Math.max((float) nae.e, hv2Var.k - 1.0f) / 1.0E-7f), hv2Var.h, j8);
                            hv2Var.h = j11;
                            long j12 = hv2Var.g;
                            if (j12 != -9223372036854775807L && j11 > j12) {
                                hv2Var.h = j12;
                            }
                        }
                        long j13 = m - hv2Var.h;
                        if (Math.abs(j13) < hv2Var.a) {
                            hv2Var.k = 1.0f;
                        } else {
                            hv2Var.k = a2d.h((f * ((float) j13)) + 1.0f, hv2Var.j, hv2Var.i);
                        }
                        f2 = hv2Var.k;
                    }
                    if (this.J.e().a != f2) {
                        my8 my8Var = new my8(f2, this.d0.o.b);
                        this.D.e(16);
                        this.J.a(my8Var);
                        x(this.d0.o, this.J.e().a, false, false);
                    }
                }
            }
        }
    }

    public final void C() {
        long g;
        long j;
        boolean b;
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (!z(this.N.l)) {
            b = false;
        } else {
            o57 o57Var = this.N.l;
            if (!o57Var.e) {
                g = 0;
            } else {
                g = o57Var.a.g();
            }
            long p = p(g);
            o57 o57Var2 = this.N.i;
            if (s0(this.d0.a, o57Var.g.a)) {
                j = this.P.h;
            } else {
                j = -9223372036854775807L;
            }
            a09 a09Var = this.R;
            aac aacVar = this.d0.a;
            e67 e67Var = o57Var.g.a;
            float f = this.J.e().a;
            boolean z4 = this.d0.l;
            bs6 bs6Var = new bs6(a09Var, aacVar, e67Var, p, f, this.i0, j);
            b = this.f.b(bs6Var);
            o57 o57Var3 = this.N.i;
            if (!b && o57Var3.e && p < 500000 && this.I > 0) {
                o57Var3.a.l(this.d0.s);
                b = this.f.b(bs6Var);
            }
        }
        this.k0 = b;
        if (b) {
            o57 o57Var4 = this.N.l;
            o57Var4.getClass();
            us6 us6Var = new us6();
            us6Var.a = this.s0 - o57Var4.p;
            float f2 = this.J.e().a;
            if (f2 <= nae.e && f2 != -3.4028235E38f) {
                z = false;
            } else {
                z = true;
            }
            wq9.s(z);
            us6Var.b = f2;
            long j2 = this.j0;
            if (j2 < 0 && j2 != -9223372036854775807L) {
                z2 = false;
            } else {
                z2 = true;
            }
            wq9.s(z2);
            us6Var.c = j2;
            vs6 vs6Var = new vs6(us6Var);
            if (o57Var4.m == null) {
                z3 = true;
            }
            wq9.D(z3);
            o57Var4.a.t(vs6Var);
        }
        w0();
    }

    public final void C0(aac aacVar, e67 e67Var, aac aacVar2, e67 e67Var2, long j, boolean z) {
        Object obj;
        my8 my8Var;
        boolean s0 = s0(aacVar, e67Var);
        Object obj2 = e67Var.a;
        if (!s0) {
            if (e67Var.b()) {
                my8Var = my8.d;
            } else {
                my8Var = this.d0.o;
            }
            kv2 kv2Var = this.J;
            if (!kv2Var.e().equals(my8Var)) {
                this.D.e(16);
                kv2Var.a(my8Var);
                x(this.d0.o, my8Var.a, false, false);
                return;
            }
            return;
        }
        y9c y9cVar = this.H;
        int i = aacVar.g(obj2, y9cVar).c;
        z9c z9cVar = this.G;
        aacVar.n(i, z9cVar);
        b57 b57Var = z9cVar.i;
        hv2 hv2Var = this.P;
        hv2Var.getClass();
        hv2Var.c = a2d.Q(b57Var.a);
        hv2Var.f = a2d.Q(b57Var.b);
        hv2Var.g = a2d.Q(b57Var.c);
        float f = b57Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        hv2Var.j = f;
        float f2 = b57Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        hv2Var.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            hv2Var.c = -9223372036854775807L;
        }
        hv2Var.a();
        if (j != -9223372036854775807L) {
            hv2Var.d = m(aacVar, obj2, j);
            hv2Var.a();
            return;
        }
        Object obj3 = z9cVar.a;
        if (!aacVar2.p()) {
            obj = aacVar2.m(aacVar2.g(e67Var2.a, y9cVar).c, z9cVar, 0L).a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z) {
            return;
        }
        hv2Var.d = -9223372036854775807L;
        hv2Var.a();
    }

    public final void D() {
        boolean z;
        boolean z2;
        q57 q57Var = this.N;
        q57Var.k();
        o57 o57Var = q57Var.m;
        if (o57Var != null) {
            n57 n57Var = o57Var.a;
            if ((!o57Var.d || o57Var.e) && !n57Var.n()) {
                aac aacVar = this.d0.a;
                if (o57Var.e) {
                    n57Var.u();
                }
                for (iv2 iv2Var : this.f.p.values()) {
                    if (iv2Var.b) {
                        return;
                    }
                }
                boolean z3 = true;
                if (!o57Var.d) {
                    long j = o57Var.g.b;
                    o57Var.d = true;
                    n57Var.q(this, j);
                    return;
                }
                us6 us6Var = new us6();
                us6Var.a = this.s0 - o57Var.p;
                float f = this.J.e().a;
                if (f <= nae.e && f != -3.4028235E38f) {
                    z = false;
                } else {
                    z = true;
                }
                wq9.s(z);
                us6Var.b = f;
                long j2 = this.j0;
                if (j2 < 0 && j2 != -9223372036854775807L) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                wq9.s(z2);
                us6Var.c = j2;
                vs6 vs6Var = new vs6(us6Var);
                if (o57Var.m != null) {
                    z3 = false;
                }
                wq9.D(z3);
                n57Var.t(vs6Var);
            }
        }
    }

    public final void D0(boolean z, boolean z2) {
        long j;
        this.i0 = z;
        if (z && !z2) {
            this.L.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = -9223372036854775807L;
        }
        this.j0 = j;
    }

    public final void E() {
        boolean z;
        n04 n04Var = this.e0;
        ly8 ly8Var = this.d0;
        boolean z2 = n04Var.d;
        if (((ly8) n04Var.f) != ly8Var) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = z2 | z;
        n04Var.d = z3;
        n04Var.f = ly8Var;
        if (z3) {
            i04 i04Var = this.M.a;
            i04Var.j.d(new ex2(3, i04Var, n04Var));
            this.e0 = new n04(this.d0);
        }
    }

    public final void F(int i) {
        bo9 bo9Var = this.a[i];
        try {
            o57 o57Var = this.N.i;
            o57Var.getClass();
            ei0 d = bo9Var.d(o57Var);
            d.getClass();
            gx9 gx9Var = d.E;
            gx9Var.getClass();
            gx9Var.b();
        } catch (IOException | RuntimeException e) {
            int i2 = bo9Var.a.b;
            if (i2 != 3 && i2 != 5) {
                throw e;
            }
            ljc ljcVar = this.N.i.o;
            st0.i("ExoPlayerImplInternal", "Disabling track due to error: ".concat(vq4.c(((c14[]) ljcVar.c)[i].n())), e);
            ljc ljcVar2 = new ljc((ao9[]) ((ao9[]) ljcVar.b).clone(), (c14[]) ((c14[]) ljcVar.c).clone(), (tjc) ljcVar.d, ljcVar.e);
            ((ao9[]) ljcVar2.b)[i] = null;
            ((c14[]) ljcVar2.c)[i] = null;
            i(i);
            o57 o57Var2 = this.N.i;
            o57Var2.a(ljcVar2, this.d0.s, false, new boolean[o57Var2.j.length]);
        }
    }

    public final void G(int i, boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.T.d(new c50(this, i, z));
        }
    }

    public final void H() {
        v(this.O.c(), true);
    }

    public final void I() {
        this.e0.e(1);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [iv2, java.lang.Object] */
    public final void J() {
        boolean z;
        int i;
        int i2;
        this.e0.e(1);
        O(false, false, false, true);
        jv2 jv2Var = this.f;
        ConcurrentHashMap concurrentHashMap = jv2Var.p;
        long id = Thread.currentThread().getId();
        long j = jv2Var.q;
        if (j != -1 && j != id) {
            z = false;
        } else {
            z = true;
        }
        wq9.C("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z);
        jv2Var.q = id;
        a09 a09Var = this.R;
        iv2 iv2Var = (iv2) concurrentHashMap.get(a09Var);
        if (iv2Var == null) {
            ?? obj = new Object();
            obj.a = 1;
            concurrentHashMap.put(a09Var, obj);
        } else {
            iv2Var.a++;
        }
        iv2 iv2Var2 = (iv2) concurrentHashMap.get(a09Var);
        iv2Var2.getClass();
        Integer num = (Integer) jv2Var.o.get(a09Var.a);
        if (num != null && num.intValue() != -1) {
            i = num.intValue();
        } else {
            i = jv2Var.l;
        }
        if (i == -1) {
            i = 13107200;
        }
        iv2Var2.c = i;
        iv2Var2.b = false;
        if (this.d0.a.p()) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        n0(i2);
        ly8 ly8Var = this.d0;
        boolean z2 = ly8Var.l;
        A0(this.V.c(ly8Var.e, z2), ly8Var.n, ly8Var.m, z2);
        ys2 ys2Var = this.C;
        ys2Var.getClass();
        u67 u67Var = this.O;
        ArrayList arrayList = (ArrayList) u67Var.c;
        wq9.D(!u67Var.a);
        u67Var.l = ys2Var;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            t67 t67Var = (t67) arrayList.get(i3);
            u67Var.g(t67Var);
            ((HashSet) u67Var.h).add(t67Var);
        }
        u67Var.a = true;
        this.D.f(2);
    }

    public final void K(vy1 vy1Var) {
        elf elfVar = this.E;
        ggb ggbVar = this.D;
        try {
            O(true, false, true, false);
            L();
            jv2 jv2Var = this.f;
            a09 a09Var = this.R;
            ConcurrentHashMap concurrentHashMap = jv2Var.p;
            iv2 iv2Var = (iv2) concurrentHashMap.get(a09Var);
            if (iv2Var != null) {
                int i = iv2Var.a - 1;
                iv2Var.a = i;
                if (i == 0) {
                    concurrentHashMap.remove(a09Var);
                    jv2Var.c();
                }
            }
            if (jv2Var.p.isEmpty()) {
                jv2Var.q = -1L;
            }
            a50 a50Var = this.V;
            a50Var.c = null;
            a50Var.a();
            a50Var.b(0);
            this.d.k();
            n0(1);
        } finally {
            ggbVar.a.removeCallbacksAndMessages(null);
            elfVar.a();
            vy1Var.c();
        }
    }

    public final void L() {
        boolean z;
        for (int i = 0; i < this.a.length; i++) {
            ei0 ei0Var = this.b[i];
            synchronized (ei0Var.a) {
                ei0Var.N = null;
            }
            bo9 bo9Var = this.a[i];
            ei0 ei0Var2 = bo9Var.a;
            boolean z2 = true;
            if (ei0Var2.D == 0) {
                z = true;
            } else {
                z = false;
            }
            wq9.D(z);
            ei0Var2.s();
            bo9Var.e = false;
            ei0 ei0Var3 = bo9Var.c;
            if (ei0Var3 != null) {
                if (ei0Var3.D != 0) {
                    z2 = false;
                }
                wq9.D(z2);
                ei0Var3.s();
                bo9Var.f = false;
            }
        }
    }

    public final void M(int i, int i2, ska skaVar) {
        boolean z = true;
        this.e0.e(1);
        u67 u67Var = this.O;
        u67Var.getClass();
        if (i < 0 || i > i2 || i2 > ((ArrayList) u67Var.c).size()) {
            z = false;
        }
        wq9.s(z);
        u67Var.k = skaVar;
        u67Var.i(i, i2);
        v(u67Var.c(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q04.N():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q04.O(boolean, boolean, boolean, boolean):void");
    }

    public final void P() {
        boolean z;
        o57 o57Var = this.N.i;
        if (o57Var != null && o57Var.g.j && this.g0) {
            z = true;
        } else {
            z = false;
        }
        this.h0 = z;
    }

    public final void Q(boolean z, long j) {
        q57 q57Var;
        long j2;
        bo9[] bo9VarArr;
        c14[] c14VarArr;
        o57 o57Var = this.N.i;
        if (o57Var == null) {
            j2 = 1000000000000L;
        } else {
            j2 = o57Var.p;
        }
        long j3 = j + j2;
        this.s0 = j3;
        this.J.a.d(j3);
        for (bo9 bo9Var : this.a) {
            long j4 = this.s0;
            ei0 d = bo9Var.d(o57Var);
            if (d != null) {
                d.B(j4, false, z);
            }
        }
        for (o57 o57Var2 = q57Var.i; o57Var2 != null; o57Var2 = o57Var2.m) {
            for (c14 c14Var : (c14[]) o57Var2.o.c) {
                if (c14Var != null) {
                    c14Var.s();
                }
            }
        }
    }

    public final void R(aac aacVar, aac aacVar2) {
        if (aacVar.p() && aacVar2.p()) {
            return;
        }
        ArrayList arrayList = this.K;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a82.x(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j) {
        boolean z;
        bo9[] bo9VarArr;
        o57 o57Var;
        long j2;
        if (this.Z) {
            this.Y.getClass();
            z = true;
        } else {
            z = false;
        }
        ly8 ly8Var = this.d0;
        long j3 = 1000;
        long j4 = C0;
        if (z) {
            if (ly8Var.e != 3) {
                j3 = j4;
            }
            for (bo9 bo9Var : this.a) {
                long j5 = this.s0;
                long j6 = this.t0;
                ei0 ei0Var = bo9Var.c;
                ei0 ei0Var2 = bo9Var.a;
                if (bo9.h(ei0Var2)) {
                    j2 = ei0Var2.i(j5, j6);
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (ei0Var != null && ei0Var.D != 0) {
                    j2 = Math.min(j2, ei0Var.i(j5, j6));
                }
                j3 = Math.min(j3, a2d.e0(j2));
            }
            if (this.d0.m()) {
                o57 o57Var2 = this.N.i;
                if (o57Var2 != null) {
                    o57Var = o57Var2.m;
                } else {
                    o57Var = null;
                }
                if (o57Var != null) {
                    if ((((float) a2d.Q(j3)) * this.d0.o.a) + ((float) this.s0) >= ((float) o57Var.e())) {
                        j3 = Math.min(j3, j4);
                    }
                }
            }
        } else if (ly8Var.e != 3 || r0()) {
            j3 = j4;
        }
        this.D.a.sendEmptyMessageAtTime(2, j + j3);
    }

    public final void V(boolean z) {
        e67 e67Var = this.N.i.g.a;
        long X = X(e67Var, this.d0.s, true, false);
        if (X != this.d0.s) {
            ly8 ly8Var = this.d0;
            this.d0 = y(e67Var, X, ly8Var.c, ly8Var.d, z, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:27|(21:(8:29|(1:95)(3:35|(1:39)|40)|41|(1:50)|48|49|19|20)(1:96)|55|56|(1:58)(1:88)|59|60|61|(1:63)(1:86)|64|65|66|67|68|69|70|71|72|73|18|19|20)|51|52|(1:54)(1:92)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0190, code lost:
        r0 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(defpackage.p04 r21) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q04.W(p04):void");
    }

    public final long X(e67 e67Var, long j, boolean z, boolean z2) {
        q57 q57Var;
        bo9[] bo9VarArr;
        boolean z3;
        bo9[] bo9VarArr2;
        int i;
        v0();
        boolean z4 = true;
        D0(false, true);
        if (z2 || this.d0.e == 3) {
            n0(2);
        }
        o57 o57Var = this.N.i;
        o57 o57Var2 = o57Var;
        while (o57Var2 != null && !e67Var.equals(o57Var2.g.a)) {
            o57Var2 = o57Var2.m;
        }
        if (z || o57Var != o57Var2 || (o57Var2 != null && o57Var2.p + j < 0)) {
            for (int i2 = 0; i2 < this.a.length; i2++) {
                i(i2);
            }
            this.z0 = -9223372036854775807L;
            if (o57Var2 != null) {
                while (true) {
                    q57Var = this.N;
                    if (q57Var.i == o57Var2) {
                        break;
                    }
                    q57Var.a();
                }
                q57Var.n(o57Var2);
                o57Var2.p = 1000000000000L;
                l(new boolean[this.a.length], this.N.j.e());
                o57Var2.h = true;
            }
        }
        h();
        if (this.Z) {
            for (bo9 bo9Var : this.a) {
                if (bo9Var.g() && ((i = bo9Var.a.b) == 2 || i == 4)) {
                    this.a0 = true;
                    break;
                }
            }
        }
        q57 q57Var2 = this.N;
        if (o57Var2 != null) {
            q57Var2.n(o57Var2);
            if (!o57Var2.e) {
                o57Var2.g = o57Var2.g.b(j, -9223372036854775807L);
            } else if (o57Var2.f) {
                if (this.Z) {
                    this.Y.getClass();
                    if (!this.d0.a.p() && o57Var2.g.a.equals(this.d0.b)) {
                        long j2 = o57Var2.p + j;
                        boolean z5 = true;
                        for (bo9 bo9Var2 : this.a) {
                            if (bo9Var2.g()) {
                                ei0 d = bo9Var2.d(o57Var2);
                                if (d != null && d.F(j2)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z5 &= z3;
                            }
                        }
                        if (z5) {
                            n57 n57Var = o57Var2.a;
                            long j3 = this.d0.s;
                            o4a o4aVar = o4a.c;
                            if (n57Var.h(j3, o4aVar) == o57Var2.a.h(j, o4aVar)) {
                                z4 = false;
                            }
                        }
                    }
                }
                j = o57Var2.a.k(j);
                o57Var2.a.l(j - this.I);
            }
            Q(z4, j);
            C();
        } else {
            q57Var2.b();
            Q(true, j);
        }
        u(false);
        this.D.f(2);
        return j;
    }

    public final void Y(c09 c09Var) {
        c09Var.getClass();
        ggb ggbVar = this.D;
        if (c09Var.e == this.F) {
            synchronized (c09Var) {
            }
            try {
                c09Var.a.d(c09Var.c, c09Var.d);
                c09Var.a(true);
                int i = this.d0.e;
                if (i != 3 && i != 2) {
                    return;
                }
                ggbVar.f(2);
                return;
            } catch (Throwable th) {
                c09Var.a(true);
                throw th;
            }
        }
        ggbVar.b(15, c09Var).b();
    }

    public final void Z(c09 c09Var) {
        Looper looper = c09Var.e;
        if (!looper.getThread().isAlive()) {
            st0.w("TAG", "Trying to send message on a dead thread.");
            c09Var.a(false);
            return;
        }
        this.L.a(looper, null).d(new x0(this, c09Var));
    }

    @Override // defpackage.m57
    public final void a(n57 n57Var) {
        this.D.b(8, n57Var).b();
    }

    public final void a0(l40 l40Var, boolean z) {
        int i;
        ly2 ly2Var = this.d;
        if (!ly2Var.i.equals(l40Var)) {
            ly2Var.i = l40Var;
            ly2Var.i();
        }
        if (!z) {
            l40Var = null;
        }
        a50 a50Var = this.V;
        if (!Objects.equals(a50Var.d, l40Var)) {
            a50Var.d = l40Var;
            boolean z2 = false;
            if (l40Var == null) {
                i = 0;
            } else {
                i = 1;
            }
            a50Var.f = i;
            if (i == 1 || i == 0) {
                z2 = true;
            }
            wq9.r("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", z2);
        }
        ly8 ly8Var = this.d0;
        boolean z3 = ly8Var.l;
        A0(a50Var.c(ly8Var.e, z3), ly8Var.n, ly8Var.m, z3);
    }

    public final void b(m04 m04Var, int i) {
        this.e0.e(1);
        u67 u67Var = this.O;
        if (i == -1) {
            i = ((ArrayList) u67Var.c).size();
        }
        v(u67Var.a(i, m04Var.a, m04Var.b), false);
    }

    public final void b0(boolean z, vy1 vy1Var) {
        if (this.n0 != z) {
            this.n0 = z;
            if (!z) {
                for (bo9 bo9Var : this.a) {
                    bo9Var.k();
                }
            }
        }
        if (vy1Var != null) {
            vy1Var.c();
        }
    }

    @Override // defpackage.o8d
    public final void c(long j, long j2, vq4 vq4Var, MediaFormat mediaFormat) {
        if (this.a0) {
            this.D.a(37).b();
        }
    }

    public final void c0(k04 k04Var) {
        bo9[] bo9VarArr;
        for (bo9 bo9Var : this.a) {
            ei0 ei0Var = bo9Var.a;
            if (ei0Var.b == 4) {
                ei0Var.d(23, k04Var);
                ei0 ei0Var2 = bo9Var.c;
                if (ei0Var2 != null) {
                    ei0Var2.d(23, k04Var);
                }
            }
        }
    }

    @Override // defpackage.e9a
    public final void d(f9a f9aVar) {
        this.D.b(9, (n57) f9aVar).b();
    }

    public final void d0(m04 m04Var) {
        this.e0.e(1);
        int i = m04Var.c;
        ska skaVar = m04Var.b;
        ArrayList arrayList = m04Var.a;
        if (i != -1) {
            this.r0 = new p04(new l09(arrayList, skaVar), m04Var.c, m04Var.d);
        }
        u67 u67Var = this.O;
        ArrayList arrayList2 = (ArrayList) u67Var.c;
        u67Var.i(0, arrayList2.size());
        v(u67Var.a(arrayList2.size(), arrayList, skaVar), false);
    }

    public final void e() {
        bo9[] bo9VarArr;
        u3a u3aVar;
        for (bo9 bo9Var : this.a) {
            if (this.Z) {
                u3aVar = this.Y;
            } else {
                u3aVar = null;
            }
            bo9Var.a.d(18, u3aVar);
            ei0 ei0Var = bo9Var.c;
            if (ei0Var != null) {
                ei0Var.d(18, u3aVar);
            }
        }
    }

    public final void e0(boolean z) {
        this.g0 = z;
        P();
        if (this.h0) {
            q57 q57Var = this.N;
            if (q57Var.j != q57Var.i) {
                V(true);
                u(false);
            }
        }
    }

    public final boolean f() {
        if (!this.U) {
            return false;
        }
        for (bo9 bo9Var : this.a) {
            if (bo9Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void f0(my8 my8Var) {
        this.D.e(16);
        kv2 kv2Var = this.J;
        kv2Var.a(my8Var);
        my8 e = kv2Var.e();
        x(e, e.a, true, true);
    }

    public final void g() {
        N();
        V(true);
    }

    public final void g0(rz3 rz3Var) {
        this.y0 = rz3Var;
        aac aacVar = this.d0.a;
        q57 q57Var = this.N;
        q57Var.getClass();
        rz3Var.getClass();
        if (!q57Var.q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < q57Var.q.size(); i++) {
                ((o57) q57Var.q.get(i)).i();
            }
            q57Var.q = arrayList;
            q57Var.m = null;
            q57Var.k();
        }
    }

    public final void h() {
        bo9[] bo9VarArr;
        boolean z;
        ei0 ei0Var;
        if (this.U && f()) {
            for (bo9 bo9Var : this.a) {
                int c = bo9Var.c();
                kv2 kv2Var = this.J;
                if (bo9Var.f()) {
                    int i = bo9Var.d;
                    int i2 = 1;
                    if (i != 4 && i != 2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (i != 4) {
                        i2 = 0;
                    }
                    if (z) {
                        try {
                            ei0Var = bo9Var.a;
                        } catch (RuntimeException e) {
                            st0.i("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        ei0Var = bo9Var.c;
                        ei0Var.getClass();
                    }
                    bo9Var.a(ei0Var, kv2Var);
                    try {
                        bo9Var.i(z);
                    } catch (RuntimeException e2) {
                        st0.i("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    bo9Var.d = i2;
                }
                this.q0 -= c - bo9Var.c();
            }
            this.z0 = -9223372036854775807L;
        }
    }

    public final void h0(int i) {
        this.l0 = i;
        aac aacVar = this.d0.a;
        q57 q57Var = this.N;
        q57Var.g = i;
        int r = q57Var.r(aacVar);
        if ((r & 1) != 0) {
            V(true);
        } else if ((r & 2) != 0) {
            h();
        }
        u(false);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        int i2;
        o57 o57Var;
        e67 e67Var;
        o57 o57Var2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3 = 1000;
        try {
            switch (message.what) {
                case 1:
                    if (message.arg1 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i4 = message.arg2;
                    this.e0.e(1);
                    A0(this.V.c(this.d0.e, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    j();
                    break;
                case 3:
                    W((p04) message.obj);
                    break;
                case 4:
                    f0((my8) message.obj);
                    break;
                case 5:
                    k0((o4a) message.obj);
                    break;
                case 6:
                    u0(false, true);
                    break;
                case 7:
                    K((vy1) message.obj);
                    return true;
                case 8:
                    w((n57) message.obj);
                    break;
                case 9:
                    s((n57) message.obj);
                    break;
                case 10:
                    N();
                    break;
                case 11:
                    h0(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    l0(z2);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    b0(z3, (vy1) message.obj);
                    break;
                case 14:
                    Y((c09) message.obj);
                    break;
                case 15:
                    Z((c09) message.obj);
                    break;
                case 16:
                    my8 my8Var = (my8) message.obj;
                    x(my8Var, my8Var.a, true, false);
                    break;
                case 17:
                    d0((m04) message.obj);
                    break;
                case 18:
                    b((m04) message.obj, message.arg1);
                    break;
                case 19:
                    a82.x(message.obj);
                    I();
                    throw null;
                case 20:
                    M(message.arg1, message.arg2, (ska) message.obj);
                    break;
                case 21:
                    m0((ska) message.obj);
                    break;
                case 22:
                    H();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    e0(z4);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    g();
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    y0(message.arg1, (List) message.obj, message.arg2);
                    break;
                case 28:
                    g0((rz3) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    p0(pair.first, (vy1) pair.second);
                    break;
                case 31:
                    l40 l40Var = (l40) message.obj;
                    if (message.arg1 != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    a0(l40Var, z5);
                    break;
                case 32:
                    q0(((Float) message.obj).floatValue());
                    break;
                case Token.GETPROP /* 33 */:
                    q(message.arg1);
                    break;
                case Token.GETPROPNOWARN /* 34 */:
                    r();
                    break;
                case Token.GETPROP_SUPER /* 35 */:
                    o0((o8d) message.obj);
                    break;
                case Token.GETPROPNOWARN_SUPER /* 36 */:
                    i0(((Boolean) message.obj).booleanValue());
                    break;
                case Token.SETPROP /* 37 */:
                    this.a0 = false;
                    p04 p04Var = this.b0;
                    if (p04Var != null) {
                        W(p04Var);
                        this.b0 = null;
                        break;
                    }
                    break;
                case Token.SETPROP_SUPER /* 38 */:
                    j0((u3a) message.obj);
                    break;
                case Token.GETELEM /* 39 */:
                    c0((k04) message.obj);
                    break;
            }
        } catch (al3 e) {
            t(e, e.a);
        } catch (hk0 e2) {
            t(e2, 1002);
        } catch (kg2 e3) {
            t(e3, e3.a);
        } catch (IOException e4) {
            t(e4, 2000);
        } catch (RuntimeException e5) {
            pz3 pz3Var = new pz3(2, e5, ((e5 instanceof IllegalStateException) || (e5 instanceof IllegalArgumentException)) ? 1004 : 1004);
            st0.i("ExoPlayerImplInternal", "Playback error", pz3Var);
            u0(true, false);
            this.d0 = this.d0.f(pz3Var);
        } catch (pz3 e6) {
            e = e6;
            int i5 = e.c;
            q57 q57Var = this.N;
            if (i5 == 1 && (o57Var2 = q57Var.j) != null && e.D == null) {
                e = e.a(o57Var2.g.a);
            }
            int i6 = e.c;
            ggb ggbVar = this.D;
            if (i6 == 1 && (e67Var = e.D) != null && A(e.e, e67Var)) {
                this.A0 = true;
                h();
                o57 g = q57Var.g();
                o57 o57Var3 = q57Var.i;
                if (o57Var3 != g) {
                    while (o57Var3 != null) {
                        o57 o57Var4 = o57Var3.m;
                        if (o57Var4 == g) {
                            break;
                        }
                        o57Var3 = o57Var4;
                    }
                }
                q57Var.n(o57Var3);
                if (this.d0.e != 4) {
                    C();
                    ggbVar.f(2);
                }
            } else {
                pz3 pz3Var2 = this.w0;
                if (pz3Var2 != null) {
                    pz3Var2.addSuppressed(e);
                    e = this.w0;
                }
                if (e.c == 1 && q57Var.i != q57Var.j) {
                    while (true) {
                        o57Var = q57Var.i;
                        if (o57Var == q57Var.j) {
                            break;
                        }
                        q57Var.a();
                    }
                    wq9.x(o57Var);
                    E();
                    p57 p57Var = o57Var.g;
                    e67 e67Var2 = p57Var.a;
                    long j = p57Var.b;
                    this.d0 = y(e67Var2, j, p57Var.d, j, true, 0);
                }
                if (e.E && (this.w0 == null || (i2 = e.a) == 5004 || i2 == 5003)) {
                    st0.x("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.w0 == null) {
                        this.w0 = e;
                    }
                    fgb b = ggbVar.b(25, e);
                    Handler handler = ggbVar.a;
                    Message message2 = b.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    b.a();
                } else {
                    st0.i("ExoPlayerImplInternal", "Playback error", e);
                    u0(true, false);
                    this.d0 = this.d0.f(e);
                }
            }
        } catch (xm8 e7) {
            boolean z6 = e7.a;
            int i7 = e7.b;
            if (i7 == 1) {
                if (z6) {
                    i = 3001;
                } else {
                    i = 3003;
                }
            } else {
                if (i7 == 4) {
                    if (z6) {
                        i = 3002;
                    } else {
                        i = 3004;
                    }
                }
                t(e7, i3);
            }
            i3 = i;
            t(e7, i3);
        }
        E();
        return true;
    }

    public final void i(int i) {
        boolean z;
        bo9[] bo9VarArr = this.a;
        int c = bo9VarArr[i].c();
        bo9 bo9Var = bo9VarArr[i];
        ei0 ei0Var = bo9Var.a;
        kv2 kv2Var = this.J;
        bo9Var.a(ei0Var, kv2Var);
        ei0 ei0Var2 = bo9Var.c;
        if (ei0Var2 != null) {
            if (ei0Var2.D != 0 && bo9Var.d != 3) {
                z = true;
            } else {
                z = false;
            }
            bo9Var.a(ei0Var2, kv2Var);
            bo9Var.i(false);
            if (z) {
                ei0 ei0Var3 = bo9Var.a;
                ei0Var2.getClass();
                ei0Var2.d(17, ei0Var3);
            }
        }
        bo9Var.d = 0;
        G(i, false);
        this.q0 -= c;
    }

    public final void i0(boolean z) {
        if (!z) {
            p04 p04Var = this.b0;
            ggb ggbVar = this.D;
            if (p04Var != null && this.a0 && !ggbVar.a.hasMessages(37)) {
                this.c0++;
            }
            int i = this.c0;
            if (i > 0) {
                this.T.d(new x0(this, i));
            }
            this.c0 = 0;
            this.a0 = false;
            ggbVar.e(37);
            p04 p04Var2 = this.b0;
            if (p04Var2 != null) {
                W(p04Var2);
                this.b0 = null;
                this.a0 = false;
            }
        }
        this.Z = z;
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x023a, code lost:
        if (r6 >= r4.c) goto L187;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q04.j():void");
    }

    public final void j0(u3a u3aVar) {
        this.Y = u3aVar;
        e();
    }

    public final void k(o57 o57Var, int i, boolean z, long j) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        boolean z6;
        bo9 bo9Var = this.a[i];
        boolean g = bo9Var.g();
        ei0 ei0Var = bo9Var.a;
        if (!g) {
            if (o57Var == this.N.i) {
                z2 = true;
            } else {
                z2 = false;
            }
            ljc ljcVar = o57Var.o;
            ao9 ao9Var = ((ao9[]) ljcVar.b)[i];
            c14 c14Var = ((c14[]) ljcVar.c)[i];
            if (r0() && this.d0.e == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z && z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.q0++;
            gx9 gx9Var = o57Var.c[i];
            long j2 = o57Var.p;
            e67 e67Var = o57Var.g.a;
            ei0 ei0Var2 = bo9Var.c;
            if (c14Var != null) {
                i2 = c14Var.length();
            } else {
                i2 = 0;
            }
            vq4[] vq4VarArr = new vq4[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                c14Var.getClass();
                vq4VarArr[i3] = c14Var.h(i3);
            }
            int i4 = bo9Var.d;
            kv2 kv2Var = this.J;
            if (i4 != 0 && i4 != 2 && i4 != 4) {
                bo9Var.f = true;
                ei0Var2.getClass();
                if (ei0Var2.D == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                wq9.D(z6);
                ei0Var2.d = ao9Var;
                ei0Var2.M = e67Var;
                ei0Var2.D = 1;
                ei0Var2.q(z4, z2);
                ei0Var2.A(vq4VarArr, gx9Var, j, j2, e67Var);
                ei0Var2.B(j, z4, true);
                kv2Var.d(ei0Var2);
            } else {
                bo9Var.e = true;
                if (ei0Var.D == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                wq9.D(z5);
                ei0Var.d = ao9Var;
                ei0Var.M = e67Var;
                ei0Var.D = 1;
                ei0Var.q(z4, z2);
                ei0Var.A(vq4VarArr, gx9Var, j, j2, e67Var);
                ei0Var.B(j, z4, true);
                kv2Var.d(ei0Var);
            }
            l04 l04Var = new l04(this);
            ei0 d = bo9Var.d(o57Var);
            d.getClass();
            d.d(11, l04Var);
            if (z3 && z2) {
                bo9Var.m();
            }
        }
    }

    public final void k0(o4a o4aVar) {
        this.X = o4aVar;
    }

    public final void l(boolean[] zArr, long j) {
        bo9[] bo9VarArr;
        q04 q04Var;
        long j2;
        o57 o57Var = this.N.j;
        ljc ljcVar = o57Var.o;
        int i = 0;
        while (true) {
            bo9VarArr = this.a;
            if (i >= bo9VarArr.length) {
                break;
            }
            if (!ljcVar.k(i)) {
                bo9VarArr[i].k();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < bo9VarArr.length) {
            if (!ljcVar.k(i2) || bo9VarArr[i2].d(o57Var) != null) {
                q04Var = this;
                j2 = j;
            } else {
                q04Var = this;
                j2 = j;
                q04Var.k(o57Var, i2, zArr[i2], j2);
            }
            i2++;
            this = q04Var;
            j = j2;
        }
    }

    public final void l0(boolean z) {
        this.m0 = z;
        aac aacVar = this.d0.a;
        q57 q57Var = this.N;
        q57Var.h = z;
        int r = q57Var.r(aacVar);
        if ((r & 1) != 0) {
            V(true);
        } else if ((r & 2) != 0) {
            h();
        }
        u(false);
    }

    public final long m(aac aacVar, Object obj, long j) {
        y9c y9cVar = this.H;
        int i = aacVar.g(obj, y9cVar).c;
        z9c z9cVar = this.G;
        aacVar.n(i, z9cVar);
        if (z9cVar.e == -9223372036854775807L || !z9cVar.a() || !z9cVar.h) {
            return -9223372036854775807L;
        }
        return a2d.Q(a2d.B(z9cVar.f) - z9cVar.e) - (j + y9cVar.e);
    }

    public final void m0(ska skaVar) {
        this.e0.e(1);
        u67 u67Var = this.O;
        int size = ((ArrayList) u67Var.c).size();
        if (skaVar.b.length != size) {
            skaVar = new ska(new Random(skaVar.a.nextLong())).a(size);
        }
        u67Var.k = skaVar;
        v(u67Var.c(), false);
    }

    public final long n(o57 o57Var) {
        if (o57Var == null) {
            return 0L;
        }
        long j = o57Var.p;
        if (!o57Var.e) {
            return j;
        }
        int i = 0;
        while (true) {
            bo9[] bo9VarArr = this.a;
            if (i < bo9VarArr.length) {
                if (bo9VarArr[i].d(o57Var) != null) {
                    ei0 d = bo9VarArr[i].d(o57Var);
                    Objects.requireNonNull(d);
                    long j2 = d.I;
                    if (j2 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j = Math.max(j2, j);
                }
                i++;
            } else {
                return j;
            }
        }
    }

    public final void n0(int i) {
        ly8 ly8Var = this.d0;
        if (ly8Var.e != i) {
            if (i != 2) {
                this.x0 = -9223372036854775807L;
            }
            if (i != 3 && ly8Var.p) {
                this.d0 = ly8Var.i(false);
            }
            this.d0 = this.d0.h(i);
        }
    }

    public final Pair o(aac aacVar) {
        long j = 0;
        if (aacVar.p()) {
            return Pair.create(ly8.u, 0L);
        }
        int a = aacVar.a(this.m0);
        Pair i = aacVar.i(this.G, this.H, a, -9223372036854775807L);
        e67 p = this.N.p(aacVar, i.first, 0L);
        long longValue = ((Long) i.second).longValue();
        if (p.b()) {
            Object obj = p.a;
            y9c y9cVar = this.H;
            aacVar.g(obj, y9cVar);
            if (p.c == y9cVar.e(p.b)) {
                y9cVar.g.getClass();
            }
        } else {
            j = longValue;
        }
        return Pair.create(p, Long.valueOf(j));
    }

    public final void o0(o8d o8dVar) {
        bo9[] bo9VarArr;
        for (bo9 bo9Var : this.a) {
            ei0 ei0Var = bo9Var.a;
            if (ei0Var.b == 2) {
                ei0Var.d(7, o8dVar);
                ei0 ei0Var2 = bo9Var.c;
                if (ei0Var2 != null) {
                    ei0Var2.d(7, o8dVar);
                }
            }
        }
    }

    public final long p(long j) {
        o57 o57Var = this.N.l;
        if (o57Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.s0 - o57Var.p));
    }

    public final void p0(Object obj, vy1 vy1Var) {
        bo9[] bo9VarArr;
        for (bo9 bo9Var : this.a) {
            ei0 ei0Var = bo9Var.a;
            if (ei0Var.b == 2) {
                int i = bo9Var.d;
                if (i != 4 && i != 1) {
                    ei0Var.d(1, obj);
                } else {
                    ei0 ei0Var2 = bo9Var.c;
                    ei0Var2.getClass();
                    ei0Var2.d(1, obj);
                }
            }
        }
        int i2 = this.d0.e;
        if (i2 == 3 || i2 == 2) {
            this.D.f(2);
        }
        if (vy1Var != null) {
            vy1Var.c();
        }
    }

    public final void q(int i) {
        ly8 ly8Var = this.d0;
        A0(i, ly8Var.n, ly8Var.m, ly8Var.l);
    }

    public final void q0(float f) {
        bo9[] bo9VarArr;
        this.B0 = f;
        float f2 = f * this.V.g;
        for (bo9 bo9Var : this.a) {
            ei0 ei0Var = bo9Var.a;
            if (ei0Var.b == 1) {
                ei0Var.d(2, Float.valueOf(f2));
                ei0 ei0Var2 = bo9Var.c;
                if (ei0Var2 != null) {
                    ei0Var2.d(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void r() {
        q0(this.B0);
    }

    public final boolean r0() {
        ly8 ly8Var = this.d0;
        if (ly8Var.l && ly8Var.n == 0) {
            return true;
        }
        return false;
    }

    public final void s(n57 n57Var) {
        q57 q57Var = this.N;
        o57 o57Var = q57Var.l;
        if (o57Var != null && o57Var.a == n57Var) {
            q57Var.m(this.s0);
            C();
            return;
        }
        o57 o57Var2 = q57Var.m;
        if (o57Var2 != null && o57Var2.a == n57Var) {
            D();
        }
    }

    public final boolean s0(aac aacVar, e67 e67Var) {
        if (!e67Var.b() && !aacVar.p()) {
            int i = aacVar.g(e67Var.a, this.H).c;
            z9c z9cVar = this.G;
            aacVar.n(i, z9cVar);
            if (z9cVar.a() && z9cVar.h && z9cVar.e != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void t(IOException iOException, int i) {
        pz3 pz3Var = new pz3(0, iOException, i);
        o57 o57Var = this.N.i;
        if (o57Var != null) {
            pz3Var = pz3Var.a(o57Var.g.a);
        }
        st0.i("ExoPlayerImplInternal", "Playback error", pz3Var);
        u0(false, false);
        this.d0 = this.d0.f(pz3Var);
    }

    public final void t0() {
        o57 o57Var = this.N.i;
        if (o57Var != null) {
            ljc ljcVar = o57Var.o;
            int i = 0;
            while (true) {
                bo9[] bo9VarArr = this.a;
                if (i < bo9VarArr.length) {
                    if (ljcVar.k(i)) {
                        bo9VarArr[i].m();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void u(boolean z) {
        e67 e67Var;
        long d;
        o57 o57Var = this.N.l;
        if (o57Var == null) {
            e67Var = this.d0.b;
        } else {
            e67Var = o57Var.g.a;
        }
        boolean equals = this.d0.k.equals(e67Var);
        if (!equals) {
            this.d0 = this.d0.c(e67Var);
        }
        ly8 ly8Var = this.d0;
        if (o57Var == null) {
            d = ly8Var.s;
        } else {
            d = o57Var.d();
        }
        ly8Var.q = d;
        ly8 ly8Var2 = this.d0;
        ly8Var2.r = p(ly8Var2.q);
        if ((!equals || z) && o57Var != null && o57Var.e) {
            x0(o57Var.g.a, o57Var.o);
        }
    }

    public final void u0(boolean z, boolean z2) {
        boolean z3;
        if (!z && this.n0) {
            z3 = false;
        } else {
            z3 = true;
        }
        O(z3, false, true, false);
        this.e0.e(z2 ? 1 : 0);
        jv2 jv2Var = this.f;
        ConcurrentHashMap concurrentHashMap = jv2Var.p;
        a09 a09Var = this.R;
        iv2 iv2Var = (iv2) concurrentHashMap.get(a09Var);
        if (iv2Var != null) {
            int i = iv2Var.a - 1;
            iv2Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(a09Var);
                jv2Var.c();
            }
        }
        this.V.c(1, this.d0.l);
        n0(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03aa A[Catch: all -> 0x03a5, TryCatch #1 {all -> 0x03a5, blocks: (B:210:0x03a1, B:214:0x03aa, B:216:0x03b0, B:224:0x03bf, B:226:0x03c6, B:228:0x03cc, B:230:0x03d6, B:231:0x03e3, B:232:0x03e6), top: B:282:0x036c }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(defpackage.aac r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q04.v(aac, boolean):void");
    }

    public final void v0() {
        bo9[] bo9VarArr;
        kv2 kv2Var = this.J;
        kv2Var.f = false;
        jya jyaVar = kv2Var.a;
        if (jyaVar.b) {
            jyaVar.d(jyaVar.b());
            jyaVar.b = false;
        }
        for (bo9 bo9Var : this.a) {
            ei0 ei0Var = bo9Var.c;
            ei0 ei0Var2 = bo9Var.a;
            if (bo9.h(ei0Var2)) {
                bo9.b(ei0Var2);
            }
            if (ei0Var != null && ei0Var.D != 0) {
                bo9.b(ei0Var);
            }
        }
    }

    public final void w(n57 n57Var) {
        o57 o57Var;
        q04 q04Var;
        q57 q57Var = this.N;
        o57 o57Var2 = q57Var.l;
        kv2 kv2Var = this.J;
        if (o57Var2 != null && o57Var2.a == n57Var) {
            o57Var2.getClass();
            if (!o57Var2.e) {
                float f = kv2Var.e().a;
                ly8 ly8Var = this.d0;
                o57Var2.f(f, ly8Var.a, ly8Var.l);
            }
            x0(o57Var2.g.a, o57Var2.o);
            if (o57Var2 == q57Var.i) {
                Q(true, o57Var2.g.b);
                l(new boolean[this.a.length], q57Var.j.e());
                o57Var2.h = true;
                ly8 ly8Var2 = this.d0;
                e67 e67Var = ly8Var2.b;
                long j = o57Var2.g.b;
                q04Var = this;
                q04Var.d0 = y(e67Var, j, ly8Var2.c, j, false, 5);
            } else {
                q04Var = this;
            }
            q04Var.C();
            return;
        }
        int i = 0;
        while (true) {
            if (i < q57Var.q.size()) {
                o57Var = (o57) q57Var.q.get(i);
                if (o57Var.a == n57Var) {
                    break;
                }
                i++;
            } else {
                o57Var = null;
                break;
            }
        }
        if (o57Var != null) {
            wq9.D(!o57Var.e);
            float f2 = kv2Var.e().a;
            ly8 ly8Var3 = this.d0;
            o57Var.f(f2, ly8Var3.a, ly8Var3.l);
            o57 o57Var3 = q57Var.m;
            if (o57Var3 != null && o57Var3.a == n57Var) {
                D();
            }
        }
    }

    public final void w0() {
        boolean z;
        o57 o57Var = this.N.l;
        if (!this.k0 && (o57Var == null || !o57Var.a.n())) {
            z = false;
        } else {
            z = true;
        }
        ly8 ly8Var = this.d0;
        if (z != ly8Var.g) {
            this.d0 = ly8Var.b(z);
        }
    }

    public final void x(my8 my8Var, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.e0.e(1);
            }
            this.d0 = this.d0.g(my8Var);
        }
        float f2 = my8Var.a;
        o57 o57Var = this.N.i;
        while (true) {
            i = 0;
            if (o57Var == null) {
                break;
            }
            c14[] c14VarArr = (c14[]) o57Var.o.c;
            int length = c14VarArr.length;
            while (i < length) {
                c14 c14Var = c14VarArr[i];
                if (c14Var != null) {
                    c14Var.q(f2);
                }
                i++;
            }
            o57Var = o57Var.m;
        }
        bo9[] bo9VarArr = this.a;
        int length2 = bo9VarArr.length;
        while (i < length2) {
            bo9 bo9Var = bo9VarArr[i];
            float f3 = my8Var.a;
            bo9Var.a.C(f, f3);
            ei0 ei0Var = bo9Var.c;
            if (ei0Var != null) {
                ei0Var.C(f, f3);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0(defpackage.e67 r9, defpackage.ljc r10) {
        /*
            r8 = this;
            q57 r0 = r8.N
            o57 r0 = r0.l
            r0.getClass()
            long r1 = r0.d()
            r8.p(r1)
            ly8 r1 = r8.d0
            aac r1 = r1.a
            p57 r0 = r0.g
            e67 r0 = r0.a
            boolean r0 = r8.s0(r1, r0)
            if (r0 == 0) goto L20
            hv2 r0 = r8.P
            long r0 = r0.h
        L20:
            ly8 r0 = r8.d0
            aac r0 = r0.a
            kv2 r1 = r8.J
            my8 r1 = r1.e()
            float r1 = r1.a
            ly8 r1 = r8.d0
            boolean r1 = r1.l
            java.lang.Object r10 = r10.c
            c14[] r10 = (defpackage.c14[]) r10
            jv2 r1 = r8.f
            r1.getClass()
            rm9 r2 = r1.o
            a09 r8 = r8.R
            java.lang.String r3 = r8.a
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r3 = -1
            if (r2 == 0) goto L53
            int r4 = r2.intValue()
            if (r4 == r3) goto L53
            int r2 = r2.intValue()
            goto L55
        L53:
            int r2 = r1.l
        L55:
            java.util.concurrent.ConcurrentHashMap r4 = r1.p
            java.lang.Object r8 = r4.get(r8)
            iv2 r8 = (defpackage.iv2) r8
            r8.getClass()
            if (r2 != r3) goto Lc7
            java.lang.Object r9 = r9.a
            y9c r2 = r1.b
            y9c r9 = r0.g(r9, r2)
            int r9 = r9.c
            z9c r2 = r1.a
            r3 = 0
            z9c r9 = r0.m(r9, r2, r3)
            f57 r9 = r9.b
            c57 r9 = r9.b
            r0 = 0
            if (r9 != 0) goto L7d
        L7b:
            r9 = r0
            goto L92
        L7d:
            android.net.Uri r9 = r9.a
            java.lang.String r9 = r9.getScheme()
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto L91
            mm9 r2 = defpackage.jv2.r
            boolean r9 = r2.contains(r9)
            if (r9 == 0) goto L7b
        L91:
            r9 = 1
        L92:
            int r2 = r10.length
            r3 = r0
            r4 = r3
        L95:
            r5 = 13107200(0xc80000, float:1.8367099E-38)
            if (r3 >= r2) goto Lc1
            r6 = r10[r3]
            if (r6 == 0) goto Lbe
            ajc r6 = r6.c()
            int r6 = r6.c
            r7 = 131072(0x20000, float:1.83671E-40)
            switch(r6) {
                case -2: goto Lbc;
                case -1: goto Lbd;
                case 0: goto Lb9;
                case 1: goto Lbd;
                case 2: goto Lb1;
                case 3: goto Lac;
                case 4: goto Lae;
                case 5: goto Lac;
                case 6: goto Lac;
                default: goto La8;
            }
        La8:
            defpackage.p1a.g()
            return
        Lac:
            r5 = r7
            goto Lbd
        Lae:
            r5 = 26214400(0x1900000, float:5.2897246E-38)
            goto Lbd
        Lb1:
            if (r9 == 0) goto Lb6
            r5 = 19660800(0x12c0000, float:3.159141E-38)
            goto Lbd
        Lb6:
            r5 = 131072000(0x7d00000, float:3.1296362E-34)
            goto Lbd
        Lb9:
            r5 = 144310272(0x89a0000, float:9.268538E-34)
            goto Lbd
        Lbc:
            r5 = r0
        Lbd:
            int r4 = r4 + r5
        Lbe:
            int r3 = r3 + 1
            goto L95
        Lc1:
            r9 = 210239488(0xc880000, float:2.0954118E-31)
            int r2 = defpackage.a2d.i(r4, r5, r9)
        Lc7:
            r8.c = r2
            r1.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q04.x0(e67, ljc):void");
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [hs5, ls5] */
    public final ly8 y(e67 e67Var, long j, long j2, long j3, boolean z, int i) {
        boolean z2;
        boolean z3;
        mm9 mm9Var;
        boolean z4;
        boolean z5;
        if (!this.v0 && j == this.d0.s && e67Var.equals(this.d0.b)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.v0 = z2;
        P();
        ly8 ly8Var = this.d0;
        bjc bjcVar = ly8Var.h;
        ljc ljcVar = ly8Var.i;
        List list = ly8Var.j;
        if (this.O.a) {
            o57 o57Var = this.N.i;
            if (o57Var == null) {
                bjcVar = bjc.d;
            } else {
                bjcVar = o57Var.n;
            }
            if (o57Var == null) {
                ljcVar = this.e;
            } else {
                ljcVar = o57Var.o;
            }
            c14[] c14VarArr = (c14[]) ljcVar.c;
            ?? hs5Var = new hs5(4);
            boolean z6 = false;
            for (c14 c14Var : c14VarArr) {
                if (c14Var != null) {
                    tb7 tb7Var = c14Var.h(0).l;
                    if (tb7Var == null) {
                        hs5Var.b(new tb7(new rb7[0]));
                    } else {
                        hs5Var.b(tb7Var);
                        z6 = true;
                    }
                }
            }
            if (z6) {
                mm9Var = hs5Var.g();
            } else {
                ms5 ms5Var = qs5.b;
                mm9Var = mm9.e;
            }
            list = mm9Var;
            if (o57Var != null) {
                p57 p57Var = o57Var.g;
                if (p57Var.d != j2) {
                    o57Var.g = p57Var.a(j2);
                }
            }
            bo9[] bo9VarArr = this.a;
            q57 q57Var = this.N;
            o57 o57Var2 = q57Var.i;
            if (o57Var2 == q57Var.j && o57Var2 != null) {
                ljc ljcVar2 = o57Var2.o;
                int i2 = 0;
                boolean z7 = false;
                while (true) {
                    if (i2 < bo9VarArr.length) {
                        if (ljcVar2.k(i2)) {
                            if (bo9VarArr[i2].a.b != 1) {
                                z4 = false;
                                break;
                            } else if (((ao9[]) ljcVar2.b)[i2].a != 0) {
                                z7 = true;
                            }
                        }
                        i2++;
                    } else {
                        z4 = true;
                        break;
                    }
                }
                if (z7 && z4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5 != this.p0) {
                    this.p0 = z5;
                    if (!z5 && this.d0.p) {
                        this.D.f(2);
                    }
                }
            }
        } else if (!e67Var.equals(ly8Var.b)) {
            bjcVar = bjc.d;
            ljcVar = this.e;
            list = mm9.e;
        }
        ljc ljcVar3 = ljcVar;
        List list2 = list;
        bjc bjcVar2 = bjcVar;
        if (z) {
            n04 n04Var = this.e0;
            if (n04Var.e && n04Var.c != 5) {
                if (i == 5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                wq9.s(z3);
            } else {
                n04Var.d = true;
                n04Var.e = true;
                n04Var.c = i;
            }
        }
        ly8 ly8Var2 = this.d0;
        return ly8Var2.d(e67Var, j, j2, j3, p(ly8Var2.q), bjcVar2, ljcVar3, list2);
    }

    public final void y0(int i, List list, int i2) {
        boolean z;
        boolean z2 = true;
        this.e0.e(1);
        u67 u67Var = this.O;
        u67Var.getClass();
        ArrayList arrayList = (ArrayList) u67Var.c;
        if (i >= 0 && i <= i2 && i2 <= arrayList.size()) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        if (list.size() != i2 - i) {
            z2 = false;
        }
        wq9.s(z2);
        for (int i3 = i; i3 < i2; i3++) {
            ((t67) arrayList.get(i3)).a.s((f57) list.get(i3 - i));
        }
        v(u67Var.c(), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x029b, code lost:
        if ((((float) (r3.e() - r23.s0)) / r23.J.e().a) > 10000000) goto L214;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z0() {
        /*
            Method dump skipped, instructions count: 1493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q04.z0():void");
    }
}
