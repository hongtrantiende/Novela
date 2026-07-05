package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i04  reason: default package */
/* loaded from: classes.dex */
public final class i04 implements ExoPlayer, cz8 {
    public final long A;
    public final t6f B;
    public final kn C;
    public final h04 D;
    public final kw5 E;
    public final kw5 F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public ts5 M;
    public final u3a N;
    public final o4a O;
    public ska P;
    public final rz3 Q;
    public yy8 R;
    public j57 S;
    public vq4 T;
    public vq4 U;
    public Object V;
    public Surface W;
    public SurfaceHolder X;
    public nwa Y;
    public boolean Z;
    public final z9c a;
    public TextureView a0;
    public final ljc b;
    public final int b0;
    public final yy8 c;
    public bna c0;
    public final vy1 d;
    public final l40 d0;
    public final Context e;
    public float e0;
    public final i04 f;
    public boolean f0;
    public final ei0[] g;
    public ud2 g0;
    public final ei0[] h;
    public final boolean h0;
    public final ly2 i;
    public boolean i0;
    public final ggb j;
    public final int j0;
    public final wz3 k;
    public boolean k0;
    public final q04 l;
    public uad l0;
    public final rr6 m;
    public final long m0;
    public final CopyOnWriteArraySet n;
    public final long n0;
    public final y9c o;
    public final long o0;
    public final ArrayList p;
    public j57 p0;
    public final boolean q;
    public ly8 q0;
    public final ms2 r;
    public int r0;
    public final Looper s;
    public long s0;
    public final ys2 t;
    public final xfb u;
    public final c04 v;
    public final d04 w;
    public final o40 x;
    public final j9b y;
    public final nt5 z;

    static {
        g57.a("media3.exoplayer");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x032b A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:3:0x0020, B:7:0x009d, B:8:0x00a6, B:10:0x00ac, B:13:0x00ba, B:15:0x014c, B:16:0x0159, B:17:0x0181, B:19:0x0187, B:20:0x019d, B:21:0x0287, B:23:0x028d, B:25:0x0297, B:27:0x02a0, B:29:0x02b6, B:31:0x02cd, B:33:0x030d, B:35:0x0311, B:37:0x0315, B:42:0x031d, B:46:0x0332, B:48:0x0349, B:50:0x0351, B:45:0x032b), top: B:55:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0349 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:3:0x0020, B:7:0x009d, B:8:0x00a6, B:10:0x00ac, B:13:0x00ba, B:15:0x014c, B:16:0x0159, B:17:0x0181, B:19:0x0187, B:20:0x019d, B:21:0x0287, B:23:0x028d, B:25:0x0297, B:27:0x02a0, B:29:0x02b6, B:31:0x02cd, B:33:0x030d, B:35:0x0311, B:37:0x0315, B:42:0x031d, B:46:0x0332, B:48:0x0349, B:50:0x0351, B:45:0x032b), top: B:55:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x034f  */
    /* JADX WARN: Type inference failed for: r4v4, types: [d04, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i04(defpackage.qz3 r43) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i04.<init>(qz3):void");
    }

    public static long t(ly8 ly8Var) {
        z9c z9cVar = new z9c();
        y9c y9cVar = new y9c();
        ly8Var.a.g(ly8Var.b.a, y9cVar);
        long j = ly8Var.c;
        if (j == -9223372036854775807L) {
            return ly8Var.a.m(y9cVar.c, z9cVar, 0L).k;
        }
        return y9cVar.e + j;
    }

    public static ly8 z(ly8 ly8Var, int i) {
        ly8 h = ly8Var.h(i);
        if (i != 1 && i != 4) {
            return h;
        }
        return h.b(false);
    }

    public final ly8 A(ly8 ly8Var, aac aacVar, Pair pair) {
        boolean z;
        e67 e67Var;
        bjc bjcVar;
        ljc ljcVar;
        List list;
        int i;
        long j;
        if (!aacVar.p() && pair == null) {
            z = false;
        } else {
            z = true;
        }
        wq9.s(z);
        aac aacVar2 = ly8Var.a;
        long f = f(ly8Var);
        ly8 j2 = ly8Var.j(aacVar);
        if (aacVar.p()) {
            e67 e67Var2 = ly8.u;
            long Q = a2d.Q(this.s0);
            ly8 c = j2.d(e67Var2, Q, Q, Q, 0L, bjc.d, this.b, mm9.e).c(e67Var2);
            c.q = c.s;
            return c;
        }
        Object obj = j2.b.a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            e67Var = new e67(pair.first);
        } else {
            e67Var = j2.b;
        }
        long longValue = ((Long) pair.second).longValue();
        long Q2 = a2d.Q(f);
        if (!aacVar2.p()) {
            Q2 -= aacVar2.g(obj, this.o).e;
            if (equals && Q2 - longValue == 1 && Q2 == aacVar2.g(obj, this.o).d) {
                Q2--;
            }
        }
        if (!equals || longValue < Q2) {
            e67 e67Var3 = e67Var;
            wq9.D(!e67Var3.b());
            if (!equals) {
                bjcVar = bjc.d;
            } else {
                bjcVar = j2.h;
            }
            bjc bjcVar2 = bjcVar;
            if (!equals) {
                ljcVar = this.b;
            } else {
                ljcVar = j2.i;
            }
            ljc ljcVar2 = ljcVar;
            if (!equals) {
                ms5 ms5Var = qs5.b;
                list = mm9.e;
            } else {
                list = j2.j;
            }
            ly8 c2 = j2.d(e67Var3, longValue, longValue, longValue, 0L, bjcVar2, ljcVar2, list).c(e67Var3);
            c2.q = longValue;
            return c2;
        } else if (i == 0) {
            int b = aacVar.b(j2.k.a);
            if (b != -1 && aacVar.f(b, this.o, false).c == aacVar.g(e67Var.a, this.o).c) {
                return j2;
            }
            aacVar.g(e67Var.a, this.o);
            boolean b2 = e67Var.b();
            y9c y9cVar = this.o;
            if (b2) {
                j = y9cVar.a(e67Var.b, e67Var.c);
            } else {
                j = y9cVar.d;
            }
            e67 e67Var4 = e67Var;
            ly8 c3 = j2.d(e67Var4, j2.s, j2.s, j2.d, j - j2.s, j2.h, j2.i, j2.j).c(e67Var4);
            c3.q = j;
            return c3;
        } else {
            e67 e67Var5 = e67Var;
            wq9.D(!e67Var5.b());
            long max = Math.max(0L, j2.r - (longValue - Q2));
            long j3 = j2.q;
            if (j2.k.equals(j2.b)) {
                j3 = longValue + max;
            }
            ly8 d = j2.d(e67Var5, longValue, longValue, longValue, max, j2.h, j2.i, j2.j);
            d.q = j3;
            return d;
        }
    }

    public final Pair B(aac aacVar, int i, long j) {
        if (aacVar.p()) {
            this.r0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.s0 = j;
            return null;
        }
        if (i == -1 || i >= aacVar.o()) {
            i = aacVar.a(this.H);
            j = a2d.e0(aacVar.m(i, this.a, 0L).k);
        }
        return aacVar.i(this.a, this.o, i, a2d.Q(j));
    }

    public final void C(final int i, final int i2) {
        bna bnaVar = this.c0;
        if (i == bnaVar.a && i2 == bnaVar.b) {
            return;
        }
        this.c0 = new bna(i, i2);
        this.m.e(24, new or6() { // from class: xz3
            @Override // defpackage.or6
            public final void invoke(Object obj) {
                ((az8) obj).F(i, i2);
            }
        });
        J(2, new bna(i, i2), 14);
    }

    public final void D() {
        int i;
        X();
        ly8 ly8Var = this.q0;
        if (ly8Var.e != 1) {
            return;
        }
        ly8 f = ly8Var.f(null);
        if (f.a.p()) {
            i = 4;
        } else {
            i = 2;
        }
        ly8 z = z(f, i);
        this.I++;
        this.l.D.a(29).b();
        V(z, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void E(az8 az8Var) {
        boolean z;
        X();
        az8Var.getClass();
        rr6 rr6Var = this.m;
        if (rr6Var.i) {
            if (Thread.currentThread() == rr6Var.a) {
                z = true;
            } else {
                z = false;
            }
            wq9.D(z);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = rr6Var.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            qr6 qr6Var = (qr6) it.next();
            if (qr6Var.a.equals(az8Var)) {
                pr6 pr6Var = rr6Var.c;
                qr6Var.d = true;
                if (pr6Var != null && qr6Var.c) {
                    qr6Var.c = false;
                    pr6Var.b(qr6Var.a, qr6Var.b.c());
                }
                copyOnWriteArraySet.remove(qr6Var);
            }
        }
    }

    public final void F() {
        nwa nwaVar = this.Y;
        c04 c04Var = this.v;
        if (nwaVar != null) {
            c09 c = c(this.w);
            wq9.D(!c.f);
            c.c = 10000;
            wq9.D(!c.f);
            c.d = null;
            c.b();
            this.Y.a.remove(c04Var);
            this.Y = null;
        }
        TextureView textureView = this.a0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != c04Var) {
                st0.w("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.a0.setSurfaceTextureListener(null);
            }
            this.a0 = null;
        }
        SurfaceHolder surfaceHolder = this.X;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(c04Var);
            this.X = null;
        }
    }

    public final void G(long j, int i, boolean z) {
        boolean z2;
        X();
        if (i != -1) {
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            wq9.s(z2);
            aac aacVar = this.q0.a;
            if (!aacVar.p() && i >= aacVar.o()) {
                return;
            }
            ms2 ms2Var = this.r;
            if (!ms2Var.i) {
                cd I = ms2Var.I();
                ms2Var.i = true;
                ms2Var.N(I, -1, new gs2(7));
            }
            this.I++;
            if (y()) {
                st0.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                n04 n04Var = new n04(this.q0);
                n04Var.e(1);
                i04 i04Var = this.k.a;
                i04Var.j.d(new ex2(3, i04Var, n04Var));
                return;
            }
            ly8 ly8Var = this.q0;
            int i2 = ly8Var.e;
            if (i2 == 3 || (i2 == 4 && !aacVar.p())) {
                ly8Var = this.q0.h(2);
            }
            int i3 = i();
            ly8 A = A(ly8Var, aacVar, B(aacVar, i, j));
            this.l.D.b(3, new p04(aacVar, i, a2d.Q(j))).b();
            V(A, 0, true, 1, l(A), i3, z);
        }
    }

    public final void H() {
        int e;
        int e2;
        if (!m().p() && !y()) {
            aac m = m();
            if (m.p()) {
                e = -1;
            } else {
                int i = i();
                X();
                int i2 = this.G;
                if (i2 == 1) {
                    i2 = 0;
                }
                X();
                e = m.e(i, i2, this.H);
            }
            if (e != -1) {
                aac m2 = m();
                if (m2.p()) {
                    e2 = -1;
                } else {
                    int i3 = i();
                    X();
                    int i4 = this.G;
                    if (i4 == 1) {
                        i4 = 0;
                    }
                    X();
                    e2 = m2.e(i3, i4, this.H);
                }
                if (e2 == -1) {
                    X();
                    return;
                } else if (e2 == i()) {
                    G(-9223372036854775807L, i(), true);
                    return;
                } else {
                    G(-9223372036854775807L, e2, false);
                    return;
                }
            }
            if (w()) {
                aac m3 = m();
                if (!m3.p() && m3.m(i(), this.a, 0L).h) {
                    G(-9223372036854775807L, i(), false);
                    return;
                }
            }
            X();
            return;
        }
        X();
    }

    public final void I() {
        int k;
        boolean z;
        int k2;
        int k3;
        if (!m().p() && !y()) {
            aac m = m();
            if (m.p()) {
                k = -1;
            } else {
                int i = i();
                X();
                int i2 = this.G;
                if (i2 == 1) {
                    i2 = 0;
                }
                X();
                k = m.k(i, i2, this.H);
            }
            if (k != -1) {
                z = true;
            } else {
                z = false;
            }
            if (w()) {
                aac m2 = m();
                if (m2.p() || !m2.m(i(), this.a, 0L).g) {
                    if (z) {
                        aac m3 = m();
                        if (m3.p()) {
                            k3 = -1;
                        } else {
                            int i3 = i();
                            X();
                            int i4 = this.G;
                            if (i4 == 1) {
                                i4 = 0;
                            }
                            X();
                            k3 = m3.k(i3, i4, this.H);
                        }
                        if (k3 == -1) {
                            X();
                            return;
                        } else if (k3 == i()) {
                            G(-9223372036854775807L, i(), true);
                            return;
                        } else {
                            G(-9223372036854775807L, k3, false);
                            return;
                        }
                    }
                    X();
                    return;
                }
            }
            if (z) {
                long k4 = k();
                X();
                if (k4 <= this.o0) {
                    aac m4 = m();
                    if (m4.p()) {
                        k2 = -1;
                    } else {
                        int i5 = i();
                        X();
                        int i6 = this.G;
                        if (i6 == 1) {
                            i6 = 0;
                        }
                        X();
                        k2 = m4.k(i5, i6, this.H);
                    }
                    if (k2 == -1) {
                        X();
                        return;
                    } else if (k2 == i()) {
                        G(-9223372036854775807L, i(), true);
                        return;
                    } else {
                        G(-9223372036854775807L, k2, false);
                        return;
                    }
                }
            }
            G(0L, i(), false);
            return;
        }
        X();
    }

    public final void J(int i, Object obj, int i2) {
        ei0[] ei0VarArr;
        ei0[] ei0VarArr2;
        for (ei0 ei0Var : this.g) {
            if (i == -1 || ei0Var.b == i) {
                c09 c = c(ei0Var);
                wq9.D(!c.f);
                c.c = i2;
                wq9.D(!c.f);
                c.d = obj;
                c.b();
            }
        }
        for (ei0 ei0Var2 : this.h) {
            if (ei0Var2 != null && (i == -1 || ei0Var2.b == i)) {
                c09 c2 = c(ei0Var2);
                wq9.D(!c2.f);
                c2.c = i2;
                wq9.D(!c2.f);
                c2.d = obj;
                c2.b();
            }
        }
    }

    public final void K(ci0 ci0Var) {
        X();
        List singletonList = Collections.singletonList(ci0Var);
        X();
        X();
        o(this.q0);
        k();
        boolean z = true;
        this.I++;
        ArrayList arrayList = this.p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < singletonList.size(); i++) {
            t67 t67Var = new t67((ci0) singletonList.get(i), this.q);
            arrayList2.add(t67Var);
            arrayList.add(i, new e04(t67Var.b, t67Var.a));
        }
        ska skaVar = this.P;
        int size = arrayList2.size();
        skaVar.getClass();
        this.P = new ska(new Random(skaVar.a.nextLong())).a(size);
        l09 l09Var = new l09(arrayList, this.P);
        boolean p = l09Var.p();
        int i2 = l09Var.d;
        if (!p && -1 >= i2) {
            throw new bj1();
        }
        int a = l09Var.a(this.H);
        ly8 A = A(this.q0, l09Var, B(l09Var, a, -9223372036854775807L));
        int i3 = A.e;
        if (i3 == 1) {
            i3 = 1;
        } else {
            if (!l09Var.p()) {
                if (a != -1) {
                    if (a < i2) {
                        i3 = 2;
                    }
                }
            }
            i3 = 4;
        }
        ly8 z2 = z(A, i3);
        this.l.D.b(17, new m04(arrayList2, this.P, a, a2d.Q(-9223372036854775807L))).b();
        V(z2, 0, (this.q0.b.a.equals(z2.b.a) || this.q0.a.p()) ? false : false, 4, l(z2), -1, false);
    }

    public final void L(SurfaceHolder surfaceHolder) {
        this.Z = false;
        this.X = surfaceHolder;
        surfaceHolder.addCallback(this.v);
        Surface surface = this.X.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.X.getSurfaceFrame();
            C(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        C(0, 0);
    }

    public final void M(boolean z) {
        X();
        U(1, z);
    }

    public final void N(my8 my8Var) {
        X();
        if (this.q0.o.equals(my8Var)) {
            return;
        }
        ly8 g = this.q0.g(my8Var);
        this.I++;
        this.l.D.b(4, my8Var).b();
        V(g, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void O(int i) {
        X();
        if (this.G != i) {
            this.G = i;
            ggb ggbVar = this.l.D;
            ggbVar.getClass();
            fgb c = ggb.c();
            c.a = ggbVar.a.obtainMessage(11, i, 0);
            c.b();
            is2 is2Var = new is2(i, 2);
            rr6 rr6Var = this.m;
            rr6Var.c(8, is2Var);
            T();
            rr6Var.b();
        }
    }

    public final void P(kjc kjcVar) {
        kjc kjcVar2;
        X();
        ly2 ly2Var = this.i;
        ly2Var.getClass();
        kjc u = u();
        if (this.L) {
            this.M = kjcVar.w;
            ts5 ts5Var = this.N.a;
            jjc a = kjcVar.a();
            jwc it = ts5Var.iterator();
            while (it.hasNext()) {
                a.i(((Integer) it.next()).intValue(), true);
            }
            kjcVar2 = a.a();
        } else {
            kjcVar2 = kjcVar;
        }
        if (!kjcVar2.equals(ly2Var.h())) {
            ly2Var.o(kjcVar2);
        }
        if (!u.equals(kjcVar)) {
            this.m.e(19, new q6(kjcVar, 15));
        }
    }

    public final void Q(Object obj) {
        boolean z;
        long j;
        Object obj2 = this.V;
        boolean z2 = true;
        if (obj2 != null && obj2 != obj) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j = this.A;
        } else {
            j = -9223372036854775807L;
        }
        q04 q04Var = this.l;
        if (!q04Var.f0 && q04Var.F.getThread().isAlive()) {
            vy1 vy1Var = new vy1(q04Var.L);
            q04Var.D.b(30, new Pair(obj, vy1Var)).b();
            if (j != -9223372036854775807L) {
                z2 = vy1Var.b(j);
            }
        }
        if (z) {
            Object obj3 = this.V;
            Surface surface = this.W;
            if (obj3 == surface) {
                surface.release();
                this.W = null;
            }
        }
        this.V = obj;
        if (!z2) {
            S(new pz3(2, new gt1("Detaching surface timed out.", 3), 1003));
        }
    }

    public final void R(float f) {
        X();
        final float h = a2d.h(f, nae.e, 1.0f);
        if (this.e0 == h) {
            return;
        }
        this.e0 = h;
        this.l.D.b(32, Float.valueOf(h)).b();
        this.m.e(22, new or6() { // from class: vz3
            @Override // defpackage.or6
            public final void invoke(Object obj) {
                ((az8) obj).i(h);
            }
        });
    }

    public final void S(pz3 pz3Var) {
        ly8 ly8Var = this.q0;
        ly8 c = ly8Var.c(ly8Var.b);
        c.q = c.s;
        c.r = 0L;
        ly8 z = z(c, 1);
        if (pz3Var != null) {
            z = z.f(pz3Var);
        }
        this.I++;
        this.l.D.a(6).b();
        V(z, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, l97] */
    public final void T() {
        boolean z;
        int k;
        boolean z2;
        int e;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        yy8 yy8Var = this.R;
        String str = a2d.a;
        i04 i04Var = this.f;
        boolean y = i04Var.y();
        z9c z9cVar = i04Var.a;
        aac m = i04Var.m();
        boolean z11 = true;
        if (!m.p() && m.m(i04Var.i(), z9cVar, 0L).g) {
            z = true;
        } else {
            z = false;
        }
        aac m2 = i04Var.m();
        if (m2.p()) {
            k = -1;
        } else {
            int i = i04Var.i();
            i04Var.X();
            int i2 = i04Var.G;
            if (i2 == 1) {
                i2 = 0;
            }
            i04Var.X();
            k = m2.k(i, i2, i04Var.H);
        }
        if (k != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        aac m3 = i04Var.m();
        if (m3.p()) {
            e = -1;
        } else {
            int i3 = i04Var.i();
            i04Var.X();
            int i4 = i04Var.G;
            if (i4 == 1) {
                i4 = 0;
            }
            i04Var.X();
            e = m3.e(i3, i4, i04Var.H);
        }
        if (e != -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean w = i04Var.w();
        aac m4 = i04Var.m();
        if (!m4.p() && m4.m(i04Var.i(), z9cVar, 0L).h) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean p = i04Var.m().p();
        ?? obj = new Object();
        obj.a = new ih1(3);
        ih1 ih1Var = (ih1) obj.a;
        SparseBooleanArray sparseBooleanArray = this.c.a.a;
        ih1Var.getClass();
        for (int i5 = 0; i5 < sparseBooleanArray.size(); i5++) {
            wq9.w(i5, sparseBooleanArray.size());
            ih1Var.b(sparseBooleanArray.keyAt(i5));
        }
        boolean z12 = !y;
        obj.x(4, z12);
        if (z && !y) {
            z5 = true;
        } else {
            z5 = false;
        }
        obj.x(5, z5);
        if (z2 && !y) {
            z6 = true;
        } else {
            z6 = false;
        }
        obj.x(6, z6);
        if (!p && ((z2 || !w || z) && !y)) {
            z7 = true;
        } else {
            z7 = false;
        }
        obj.x(7, z7);
        if (z3 && !y) {
            z8 = true;
        } else {
            z8 = false;
        }
        obj.x(8, z8);
        if (!p && ((z3 || (w && z4)) && !y)) {
            z9 = true;
        } else {
            z9 = false;
        }
        obj.x(9, z9);
        obj.x(10, z12);
        if (z && !y) {
            z10 = true;
        } else {
            z10 = false;
        }
        obj.x(11, z10);
        obj.x(12, (!z || y) ? false : false);
        yy8 yy8Var2 = new yy8(ih1Var.c());
        this.R = yy8Var2;
        if (!yy8Var2.equals(yy8Var)) {
            this.m.c(13, new wz3(this));
        }
    }

    public final void U(int i, boolean z) {
        int i2;
        if (this.L) {
            i2 = 4;
        } else if (this.q0.n == 1 && !z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        ly8 ly8Var = this.q0;
        if (ly8Var.l == z && ly8Var.n == i2 && ly8Var.m == i) {
            return;
        }
        this.I++;
        if (ly8Var.p) {
            ly8Var = ly8Var.a();
        }
        ly8 e = ly8Var.e(i, i2, z);
        int i3 = i | (i2 << 4);
        ggb ggbVar = this.l.D;
        ggbVar.getClass();
        fgb c = ggb.c();
        c.a = ggbVar.a.obtainMessage(1, z ? 1 : 0, i3);
        c.b();
        V(e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void V(final ly8 ly8Var, final int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        final f57 f57Var;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i5;
        int i6;
        Object obj;
        f57 f57Var2;
        Object obj2;
        long j2;
        long j3;
        long j4;
        long t;
        Object obj3;
        f57 f57Var3;
        Object obj4;
        long j5;
        ly8 ly8Var2 = this.q0;
        this.q0 = ly8Var;
        boolean equals = ly8Var2.a.equals(ly8Var.a);
        z9c z9cVar = this.a;
        y9c y9cVar = this.o;
        aac aacVar = ly8Var2.a;
        e67 e67Var = ly8Var2.b;
        aac aacVar2 = ly8Var.a;
        e67 e67Var2 = ly8Var.b;
        if (aacVar2.p() && aacVar.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (aacVar2.p() != aacVar.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!aacVar.m(aacVar.g(e67Var.a, y9cVar).c, z9cVar, 0L).a.equals(aacVar2.m(aacVar2.g(e67Var2.a, y9cVar).c, z9cVar, 0L).a)) {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else if (!equals) {
                i4 = 3;
            } else {
                vm1.d();
                return;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        } else if (z && i2 == 0 && e67Var.d < e67Var2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else if (z && i2 == 1 && z2) {
            pair = new Pair(Boolean.TRUE, 2);
        } else {
            pair = new Pair(Boolean.FALSE, -1);
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            if (!ly8Var.a.p()) {
                f57Var = ly8Var.a.m(ly8Var.a.g(ly8Var.b.a, this.o).c, this.a, 0L).b;
            } else {
                f57Var = null;
            }
            this.p0 = j57.B;
        } else {
            f57Var = null;
        }
        if (booleanValue || !ly8Var2.j.equals(ly8Var.j)) {
            i57 a = this.p0.a();
            List list = ly8Var.j;
            for (int i7 = 0; i7 < list.size(); i7++) {
                tb7 tb7Var = (tb7) list.get(i7);
                int i8 = 0;
                while (true) {
                    rb7[] rb7VarArr = tb7Var.a;
                    if (i8 < rb7VarArr.length) {
                        rb7VarArr[i8].b(a);
                        i8++;
                    }
                }
            }
            this.p0 = new j57(a);
        }
        j57 a2 = a();
        boolean equals2 = a2.equals(this.S);
        this.S = a2;
        if (ly8Var2.l != ly8Var.l) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ly8Var2.e != ly8Var.e) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || z3) {
            W();
        }
        if (ly8Var2.g != ly8Var.g) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!equals) {
            this.m.c(0, new or6() { // from class: tz3
                @Override // defpackage.or6
                public final void invoke(Object obj5) {
                    switch (r3) {
                        case 0:
                            aac aacVar3 = ((ly8) ly8Var).a;
                            ((az8) obj5).s(i);
                            return;
                        default:
                            ((az8) obj5).E((f57) ly8Var, i);
                            return;
                    }
                }
            });
        }
        if (z) {
            y9c y9cVar2 = new y9c();
            if (!ly8Var2.a.p()) {
                Object obj5 = ly8Var2.b.a;
                ly8Var2.a.g(obj5, y9cVar2);
                int i9 = y9cVar2.c;
                int b = ly8Var2.a.b(obj5);
                z6 = booleanValue;
                z7 = equals2;
                z8 = z4;
                obj = ly8Var2.a.m(i9, this.a, 0L).a;
                f57Var2 = this.a.b;
                obj2 = obj5;
                i5 = i9;
                i6 = b;
            } else {
                z6 = booleanValue;
                z7 = equals2;
                z8 = z4;
                i5 = i3;
                i6 = i5;
                obj = null;
                f57Var2 = null;
                obj2 = null;
            }
            e67 e67Var3 = ly8Var2.b;
            if (i2 == 0) {
                boolean b2 = e67Var3.b();
                e67 e67Var4 = ly8Var2.b;
                if (b2) {
                    j4 = y9cVar2.a(e67Var4.b, e67Var4.c);
                    t = t(ly8Var2);
                } else if (e67Var4.e != -1) {
                    j4 = t(this.q0);
                    t = j4;
                } else {
                    j2 = y9cVar2.e;
                    j3 = y9cVar2.d;
                    j4 = j2 + j3;
                    t = j4;
                }
            } else if (e67Var3.b()) {
                j4 = ly8Var2.s;
                t = t(ly8Var2);
            } else {
                j2 = y9cVar2.e;
                j3 = ly8Var2.s;
                j4 = j2 + j3;
                t = j4;
            }
            long e0 = a2d.e0(j4);
            long e02 = a2d.e0(t);
            e67 e67Var5 = ly8Var2.b;
            bz8 bz8Var = new bz8(obj, i5, f57Var2, obj2, i6, e0, e02, e67Var5.b, e67Var5.c);
            z9c z9cVar2 = this.a;
            int i10 = i();
            int j6 = j();
            if (!this.q0.a.p()) {
                ly8 ly8Var3 = this.q0;
                Object obj6 = ly8Var3.b.a;
                ly8Var3.a.g(obj6, this.o);
                j6 = this.q0.a.b(obj6);
                Object obj7 = this.q0.a.m(i10, z9cVar2, 0L).a;
                f57Var3 = z9cVar2.b;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                f57Var3 = null;
                obj4 = null;
            }
            int i11 = j6;
            long e03 = a2d.e0(j);
            if (this.q0.b.b()) {
                j5 = a2d.e0(t(this.q0));
            } else {
                j5 = e03;
            }
            e67 e67Var6 = this.q0.b;
            this.m.c(11, new zz3(i2, bz8Var, new bz8(obj3, i10, f57Var3, obj4, i11, e03, j5, e67Var6.b, e67Var6.c)));
        } else {
            z6 = booleanValue;
            z7 = equals2;
            z8 = z4;
        }
        if (z6) {
            this.m.c(1, new or6() { // from class: tz3
                @Override // defpackage.or6
                public final void invoke(Object obj52) {
                    switch (r3) {
                        case 0:
                            aac aacVar3 = ((ly8) f57Var).a;
                            ((az8) obj52).s(intValue);
                            return;
                        default:
                            ((az8) obj52).E((f57) f57Var, intValue);
                            return;
                    }
                }
            });
        }
        if (ly8Var2.f != ly8Var.f) {
            this.m.c(10, new or6() { // from class: uz3
                @Override // defpackage.or6
                public final void invoke(Object obj8) {
                    int i12 = r2;
                    ly8 ly8Var4 = ly8Var;
                    az8 az8Var = (az8) obj8;
                    switch (i12) {
                        case 0:
                            boolean z9 = ly8Var4.g;
                            az8Var.getClass();
                            az8Var.g(ly8Var4.g);
                            return;
                        case 1:
                            az8Var.A(ly8Var4.e, ly8Var4.l);
                            return;
                        case 2:
                            az8Var.l(ly8Var4.e);
                            return;
                        case 3:
                            az8Var.h(ly8Var4.m, ly8Var4.l);
                            return;
                        case 4:
                            az8Var.b(ly8Var4.n);
                            return;
                        case 5:
                            az8Var.H(ly8Var4.m());
                            return;
                        case 6:
                            az8Var.B(ly8Var4.o);
                            return;
                        case 7:
                            az8Var.u(ly8Var4.f);
                            return;
                        case 8:
                            az8Var.w(ly8Var4.f);
                            return;
                        default:
                            az8Var.q((tjc) ly8Var4.i.d);
                            return;
                    }
                }
            });
            if (ly8Var.f != null) {
                this.m.c(10, new or6() { // from class: uz3
                    @Override // defpackage.or6
                    public final void invoke(Object obj8) {
                        int i12 = r2;
                        ly8 ly8Var4 = ly8Var;
                        az8 az8Var = (az8) obj8;
                        switch (i12) {
                            case 0:
                                boolean z9 = ly8Var4.g;
                                az8Var.getClass();
                                az8Var.g(ly8Var4.g);
                                return;
                            case 1:
                                az8Var.A(ly8Var4.e, ly8Var4.l);
                                return;
                            case 2:
                                az8Var.l(ly8Var4.e);
                                return;
                            case 3:
                                az8Var.h(ly8Var4.m, ly8Var4.l);
                                return;
                            case 4:
                                az8Var.b(ly8Var4.n);
                                return;
                            case 5:
                                az8Var.H(ly8Var4.m());
                                return;
                            case 6:
                                az8Var.B(ly8Var4.o);
                                return;
                            case 7:
                                az8Var.u(ly8Var4.f);
                                return;
                            case 8:
                                az8Var.w(ly8Var4.f);
                                return;
                            default:
                                az8Var.q((tjc) ly8Var4.i.d);
                                return;
                        }
                    }
                });
            }
        }
        ljc ljcVar = ly8Var2.i;
        ljc ljcVar2 = ly8Var.i;
        if (ljcVar != ljcVar2) {
            ly2 ly2Var = this.i;
            Object obj8 = ljcVar2.e;
            ly2Var.getClass();
            m17 m17Var = (m17) obj8;
            this.m.c(2, new or6() { // from class: uz3
                @Override // defpackage.or6
                public final void invoke(Object obj82) {
                    int i12 = r2;
                    ly8 ly8Var4 = ly8Var;
                    az8 az8Var = (az8) obj82;
                    switch (i12) {
                        case 0:
                            boolean z9 = ly8Var4.g;
                            az8Var.getClass();
                            az8Var.g(ly8Var4.g);
                            return;
                        case 1:
                            az8Var.A(ly8Var4.e, ly8Var4.l);
                            return;
                        case 2:
                            az8Var.l(ly8Var4.e);
                            return;
                        case 3:
                            az8Var.h(ly8Var4.m, ly8Var4.l);
                            return;
                        case 4:
                            az8Var.b(ly8Var4.n);
                            return;
                        case 5:
                            az8Var.H(ly8Var4.m());
                            return;
                        case 6:
                            az8Var.B(ly8Var4.o);
                            return;
                        case 7:
                            az8Var.u(ly8Var4.f);
                            return;
                        case 8:
                            az8Var.w(ly8Var4.f);
                            return;
                        default:
                            az8Var.q((tjc) ly8Var4.i.d);
                            return;
                    }
                }
            });
        }
        if (!z7) {
            this.m.c(14, new q6(this.S, 14));
        }
        if (z5) {
            this.m.c(3, new or6() { // from class: uz3
                @Override // defpackage.or6
                public final void invoke(Object obj82) {
                    int i12 = r2;
                    ly8 ly8Var4 = ly8Var;
                    az8 az8Var = (az8) obj82;
                    switch (i12) {
                        case 0:
                            boolean z9 = ly8Var4.g;
                            az8Var.getClass();
                            az8Var.g(ly8Var4.g);
                            return;
                        case 1:
                            az8Var.A(ly8Var4.e, ly8Var4.l);
                            return;
                        case 2:
                            az8Var.l(ly8Var4.e);
                            return;
                        case 3:
                            az8Var.h(ly8Var4.m, ly8Var4.l);
                            return;
                        case 4:
                            az8Var.b(ly8Var4.n);
                            return;
                        case 5:
                            az8Var.H(ly8Var4.m());
                            return;
                        case 6:
                            az8Var.B(ly8Var4.o);
                            return;
                        case 7:
                            az8Var.u(ly8Var4.f);
                            return;
                        case 8:
                            az8Var.w(ly8Var4.f);
                            return;
                        default:
                            az8Var.q((tjc) ly8Var4.i.d);
                            return;
                    }
                }
            });
        }
        if (z8 || z3) {
            this.m.c(-1, new or6() { // from class: uz3
                @Override // defpackage.or6
                public final void invoke(Object obj82) {
                    int i12 = r2;
                    ly8 ly8Var4 = ly8Var;
                    az8 az8Var = (az8) obj82;
                    switch (i12) {
                        case 0:
                            boolean z9 = ly8Var4.g;
                            az8Var.getClass();
                            az8Var.g(ly8Var4.g);
                            return;
                        case 1:
                            az8Var.A(ly8Var4.e, ly8Var4.l);
                            return;
                        case 2:
                            az8Var.l(ly8Var4.e);
                            return;
                        case 3:
                            az8Var.h(ly8Var4.m, ly8Var4.l);
                            return;
                        case 4:
                            az8Var.b(ly8Var4.n);
                            return;
                        case 5:
                            az8Var.H(ly8Var4.m());
                            return;
                        case 6:
                            az8Var.B(ly8Var4.o);
                            return;
                        case 7:
                            az8Var.u(ly8Var4.f);
                            return;
                        case 8:
                            az8Var.w(ly8Var4.f);
                            return;
                        default:
                            az8Var.q((tjc) ly8Var4.i.d);
                            return;
                    }
                }
            });
        }
        if (z8) {
            this.m.c(4, new or6() { // from class: uz3
                @Override // defpackage.or6
                public final void invoke(Object obj82) {
                    int i12 = r2;
                    ly8 ly8Var4 = ly8Var;
                    az8 az8Var = (az8) obj82;
                    switch (i12) {
                        case 0:
                            boolean z9 = ly8Var4.g;
                            az8Var.getClass();
                            az8Var.g(ly8Var4.g);
                            return;
                        case 1:
                            az8Var.A(ly8Var4.e, ly8Var4.l);
                            return;
                        case 2:
                            az8Var.l(ly8Var4.e);
                            return;
                        case 3:
                            az8Var.h(ly8Var4.m, ly8Var4.l);
                            return;
                        case 4:
                            az8Var.b(ly8Var4.n);
                            return;
                        case 5:
                            az8Var.H(ly8Var4.m());
                            return;
                        case 6:
                            az8Var.B(ly8Var4.o);
                            return;
                        case 7:
                            az8Var.u(ly8Var4.f);
                            return;
                        case 8:
                            az8Var.w(ly8Var4.f);
                            return;
                        default:
                            az8Var.q((tjc) ly8Var4.i.d);
                            return;
                    }
                }
            });
        }
        if (z3 || ly8Var2.m != ly8Var.m) {
            this.m.c(5, new or6() { // from class: uz3
                @Override // defpackage.or6
                public final void invoke(Object obj82) {
                    int i12 = r2;
                    ly8 ly8Var4 = ly8Var;
                    az8 az8Var = (az8) obj82;
                    switch (i12) {
                        case 0:
                            boolean z9 = ly8Var4.g;
                            az8Var.getClass();
                            az8Var.g(ly8Var4.g);
                            return;
                        case 1:
                            az8Var.A(ly8Var4.e, ly8Var4.l);
                            return;
                        case 2:
                            az8Var.l(ly8Var4.e);
                            return;
                        case 3:
                            az8Var.h(ly8Var4.m, ly8Var4.l);
                            return;
                        case 4:
                            az8Var.b(ly8Var4.n);
                            return;
                        case 5:
                            az8Var.H(ly8Var4.m());
                            return;
                        case 6:
                            az8Var.B(ly8Var4.o);
                            return;
                        case 7:
                            az8Var.u(ly8Var4.f);
                            return;
                        case 8:
                            az8Var.w(ly8Var4.f);
                            return;
                        default:
                            az8Var.q((tjc) ly8Var4.i.d);
                            return;
                    }
                }
            });
        }
        if (ly8Var2.n != ly8Var.n) {
            this.m.c(6, new or6() { // from class: uz3
                @Override // defpackage.or6
                public final void invoke(Object obj82) {
                    int i12 = r2;
                    ly8 ly8Var4 = ly8Var;
                    az8 az8Var = (az8) obj82;
                    switch (i12) {
                        case 0:
                            boolean z9 = ly8Var4.g;
                            az8Var.getClass();
                            az8Var.g(ly8Var4.g);
                            return;
                        case 1:
                            az8Var.A(ly8Var4.e, ly8Var4.l);
                            return;
                        case 2:
                            az8Var.l(ly8Var4.e);
                            return;
                        case 3:
                            az8Var.h(ly8Var4.m, ly8Var4.l);
                            return;
                        case 4:
                            az8Var.b(ly8Var4.n);
                            return;
                        case 5:
                            az8Var.H(ly8Var4.m());
                            return;
                        case 6:
                            az8Var.B(ly8Var4.o);
                            return;
                        case 7:
                            az8Var.u(ly8Var4.f);
                            return;
                        case 8:
                            az8Var.w(ly8Var4.f);
                            return;
                        default:
                            az8Var.q((tjc) ly8Var4.i.d);
                            return;
                    }
                }
            });
        }
        if (ly8Var2.m() != ly8Var.m()) {
            this.m.c(7, new or6() { // from class: uz3
                @Override // defpackage.or6
                public final void invoke(Object obj82) {
                    int i12 = r2;
                    ly8 ly8Var4 = ly8Var;
                    az8 az8Var = (az8) obj82;
                    switch (i12) {
                        case 0:
                            boolean z9 = ly8Var4.g;
                            az8Var.getClass();
                            az8Var.g(ly8Var4.g);
                            return;
                        case 1:
                            az8Var.A(ly8Var4.e, ly8Var4.l);
                            return;
                        case 2:
                            az8Var.l(ly8Var4.e);
                            return;
                        case 3:
                            az8Var.h(ly8Var4.m, ly8Var4.l);
                            return;
                        case 4:
                            az8Var.b(ly8Var4.n);
                            return;
                        case 5:
                            az8Var.H(ly8Var4.m());
                            return;
                        case 6:
                            az8Var.B(ly8Var4.o);
                            return;
                        case 7:
                            az8Var.u(ly8Var4.f);
                            return;
                        case 8:
                            az8Var.w(ly8Var4.f);
                            return;
                        default:
                            az8Var.q((tjc) ly8Var4.i.d);
                            return;
                    }
                }
            });
        }
        if (!ly8Var2.o.equals(ly8Var.o)) {
            this.m.c(12, new or6() { // from class: uz3
                @Override // defpackage.or6
                public final void invoke(Object obj82) {
                    int i12 = r2;
                    ly8 ly8Var4 = ly8Var;
                    az8 az8Var = (az8) obj82;
                    switch (i12) {
                        case 0:
                            boolean z9 = ly8Var4.g;
                            az8Var.getClass();
                            az8Var.g(ly8Var4.g);
                            return;
                        case 1:
                            az8Var.A(ly8Var4.e, ly8Var4.l);
                            return;
                        case 2:
                            az8Var.l(ly8Var4.e);
                            return;
                        case 3:
                            az8Var.h(ly8Var4.m, ly8Var4.l);
                            return;
                        case 4:
                            az8Var.b(ly8Var4.n);
                            return;
                        case 5:
                            az8Var.H(ly8Var4.m());
                            return;
                        case 6:
                            az8Var.B(ly8Var4.o);
                            return;
                        case 7:
                            az8Var.u(ly8Var4.f);
                            return;
                        case 8:
                            az8Var.w(ly8Var4.f);
                            return;
                        default:
                            az8Var.q((tjc) ly8Var4.i.d);
                            return;
                    }
                }
            });
        }
        T();
        this.m.b();
        if (ly8Var2.p != ly8Var.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((c04) it.next()).a.W();
            }
        }
    }

    public final void W() {
        int r = r();
        nt5 nt5Var = this.z;
        j9b j9bVar = this.y;
        boolean z = false;
        if (r != 1) {
            if (r != 2 && r != 3) {
                if (r != 4) {
                    vm1.d();
                    return;
                }
            } else {
                X();
                boolean z2 = this.q0.p;
                if (q() && !z2) {
                    z = true;
                }
                j9bVar.b(z);
                nt5Var.f(q());
                return;
            }
        }
        j9bVar.b(false);
        nt5Var.f(false);
    }

    public final void X() {
        IllegalStateException illegalStateException;
        this.d.a();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.s;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = a2d.a;
            Locale locale = Locale.US;
            String o = hl5.o("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.h0) {
                if (this.i0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                st0.x("ExoPlayerImpl", o, illegalStateException);
                this.i0 = true;
                return;
            }
            vs.k(o);
        }
    }

    public final j57 a() {
        byte[] bArr;
        aac m = m();
        if (m.p()) {
            return this.p0;
        }
        f57 f57Var = m.m(i(), this.a, 0L).b;
        i57 a = this.p0.a();
        j57 j57Var = f57Var.d;
        if (j57Var != null) {
            qs5 qs5Var = j57Var.A;
            byte[] bArr2 = j57Var.f;
            CharSequence charSequence = j57Var.a;
            if (charSequence != null) {
                a.a = charSequence;
            }
            CharSequence charSequence2 = j57Var.b;
            if (charSequence2 != null) {
                a.b = charSequence2;
            }
            CharSequence charSequence3 = j57Var.c;
            if (charSequence3 != null) {
                a.c = charSequence3;
            }
            CharSequence charSequence4 = j57Var.d;
            if (charSequence4 != null) {
                a.d = charSequence4;
            }
            CharSequence charSequence5 = j57Var.e;
            if (charSequence5 != null) {
                a.e = charSequence5;
            }
            if (bArr2 != null) {
                Integer num = j57Var.g;
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) bArr2.clone();
                }
                a.f = bArr;
                a.g = num;
                j57 j57Var2 = j57.B;
            }
            Integer num2 = j57Var.h;
            if (num2 != null) {
                a.h = num2;
            }
            Integer num3 = j57Var.i;
            if (num3 != null) {
                a.i = num3;
            }
            Integer num4 = j57Var.j;
            if (num4 != null) {
                a.j = num4;
            }
            Boolean bool = j57Var.k;
            if (bool != null) {
                a.k = bool;
            }
            Integer num5 = j57Var.l;
            if (num5 != null) {
                a.l = num5;
            }
            Integer num6 = j57Var.m;
            if (num6 != null) {
                a.l = num6;
            }
            Integer num7 = j57Var.n;
            if (num7 != null) {
                a.m = num7;
            }
            Integer num8 = j57Var.o;
            if (num8 != null) {
                a.n = num8;
            }
            Integer num9 = j57Var.p;
            if (num9 != null) {
                a.o = num9;
            }
            Integer num10 = j57Var.q;
            if (num10 != null) {
                a.p = num10;
            }
            Integer num11 = j57Var.r;
            if (num11 != null) {
                a.q = num11;
            }
            CharSequence charSequence6 = j57Var.s;
            if (charSequence6 != null) {
                a.r = charSequence6;
            }
            CharSequence charSequence7 = j57Var.t;
            if (charSequence7 != null) {
                a.s = charSequence7;
            }
            CharSequence charSequence8 = j57Var.u;
            if (charSequence8 != null) {
                a.t = charSequence8;
            }
            Integer num12 = j57Var.v;
            if (num12 != null) {
                a.u = num12;
            }
            Integer num13 = j57Var.w;
            if (num13 != null) {
                a.v = num13;
            }
            CharSequence charSequence9 = j57Var.x;
            if (charSequence9 != null) {
                a.w = charSequence9;
            }
            CharSequence charSequence10 = j57Var.y;
            if (charSequence10 != null) {
                a.x = charSequence10;
            }
            Integer num14 = j57Var.z;
            if (num14 != null) {
                a.y = num14;
            }
            if (!qs5Var.isEmpty()) {
                a.z = qs5.l(qs5Var);
            }
        }
        return new j57(a);
    }

    public final void b() {
        X();
        F();
        Q(null);
        C(0, 0);
    }

    public final c09 c(b09 b09Var) {
        int o = o(this.q0);
        aac aacVar = this.q0.a;
        if (o == -1) {
            o = 0;
        }
        q04 q04Var = this.l;
        return new c09(q04Var, b09Var, aacVar, o, q04Var.F);
    }

    public final long d() {
        X();
        if (y()) {
            ly8 ly8Var = this.q0;
            if (ly8Var.k.equals(ly8Var.b)) {
                return a2d.e0(this.q0.q);
            }
            return p();
        }
        return e();
    }

    public final long e() {
        X();
        if (this.q0.a.p()) {
            return this.s0;
        }
        ly8 ly8Var = this.q0;
        long j = 0;
        if (ly8Var.k.d != ly8Var.b.d) {
            return a2d.e0(ly8Var.a.m(i(), this.a, 0L).l);
        }
        long j2 = ly8Var.q;
        if (this.q0.k.b()) {
            ly8 ly8Var2 = this.q0;
            ly8Var2.a.g(ly8Var2.k.a, this.o).d(this.q0.k.b);
        } else {
            j = j2;
        }
        ly8 ly8Var3 = this.q0;
        aac aacVar = ly8Var3.a;
        Object obj = ly8Var3.k.a;
        y9c y9cVar = this.o;
        aacVar.g(obj, y9cVar);
        return a2d.e0(j + y9cVar.e);
    }

    public final long f(ly8 ly8Var) {
        e67 e67Var = ly8Var.b;
        long j = ly8Var.c;
        aac aacVar = ly8Var.a;
        if (e67Var.b()) {
            Object obj = ly8Var.b.a;
            y9c y9cVar = this.o;
            aacVar.g(obj, y9cVar);
            if (j == -9223372036854775807L) {
                return a2d.e0(aacVar.m(o(ly8Var), this.a, 0L).k);
            }
            return a2d.e0(j) + a2d.e0(y9cVar.e);
        }
        return a2d.e0(l(ly8Var));
    }

    public final int g() {
        X();
        if (y()) {
            return this.q0.b.b;
        }
        return -1;
    }

    public final int h() {
        X();
        if (y()) {
            return this.q0.b.c;
        }
        return -1;
    }

    public final int i() {
        X();
        int o = o(this.q0);
        if (o == -1) {
            return 0;
        }
        return o;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        X();
        return this.L;
    }

    public final int j() {
        X();
        if (this.q0.a.p()) {
            int i = this.r0;
            if (i == -1) {
                return 0;
            }
            return i;
        }
        ly8 ly8Var = this.q0;
        return ly8Var.a.b(ly8Var.b.a);
    }

    public final long k() {
        X();
        return a2d.e0(l(this.q0));
    }

    public final long l(ly8 ly8Var) {
        long j;
        if (ly8Var.a.p()) {
            return a2d.Q(this.s0);
        }
        if (ly8Var.p) {
            j = ly8Var.l();
        } else {
            j = ly8Var.s;
        }
        if (ly8Var.b.b()) {
            return j;
        }
        aac aacVar = ly8Var.a;
        Object obj = ly8Var.b.a;
        y9c y9cVar = this.o;
        aacVar.g(obj, y9cVar);
        return j + y9cVar.e;
    }

    public final aac m() {
        X();
        return this.q0.a;
    }

    public final tjc n() {
        X();
        return (tjc) this.q0.i.d;
    }

    public final int o(ly8 ly8Var) {
        if (ly8Var.a.p()) {
            return this.r0;
        }
        return ly8Var.a.g(ly8Var.b.a, this.o).c;
    }

    public final long p() {
        X();
        if (y()) {
            ly8 ly8Var = this.q0;
            e67 e67Var = ly8Var.b;
            aac aacVar = ly8Var.a;
            Object obj = e67Var.a;
            y9c y9cVar = this.o;
            aacVar.g(obj, y9cVar);
            return a2d.e0(y9cVar.a(e67Var.b, e67Var.c));
        }
        aac m = m();
        if (m.p()) {
            return -9223372036854775807L;
        }
        return a2d.e0(m.m(i(), this.a, 0L).l);
    }

    public final boolean q() {
        X();
        return this.q0.l;
    }

    public final int r() {
        X();
        return this.q0.e;
    }

    public final int s() {
        X();
        return this.q0.n;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        X();
        J(4, imageOutput, 15);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        kjc kjcVar;
        X();
        if (z == this.L) {
            return;
        }
        this.L = z;
        u3a u3aVar = this.N;
        if (!u3aVar.a.isEmpty()) {
            ly2 ly2Var = this.i;
            ly2Var.getClass();
            gy2 h = ly2Var.h();
            if (z) {
                this.M = h.w;
                ts5 ts5Var = u3aVar.a;
                jjc a = h.a();
                jwc it = ts5Var.iterator();
                while (it.hasNext()) {
                    a.i(((Integer) it.next()).intValue(), true);
                }
                kjcVar = a.a();
            } else {
                h.getClass();
                fy2 fy2Var = new fy2(h);
                fy2Var.j(this.M);
                gy2 gy2Var = new gy2(fy2Var);
                this.M = null;
                kjcVar = gy2Var;
            }
            if (!kjcVar.equals(h)) {
                ly2Var.o(kjcVar);
            }
        }
        this.l.D.b(36, Boolean.valueOf(z)).b();
        ly8 ly8Var = this.q0;
        U(ly8Var.m, ly8Var.l);
    }

    public final kjc u() {
        X();
        gy2 h = this.i.h();
        if (this.L) {
            h.getClass();
            fy2 fy2Var = new fy2(h);
            fy2Var.j(this.M);
            return new gy2(fy2Var);
        }
        return h;
    }

    public final boolean v(int i) {
        X();
        return this.R.a.a.get(i);
    }

    public final boolean w() {
        aac m = m();
        if (!m.p() && m.m(i(), this.a, 0L).a()) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        if (r() == 3 && q() && s() == 0) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        X();
        return this.q0.b.b();
    }
}
