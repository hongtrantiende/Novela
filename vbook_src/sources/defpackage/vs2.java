package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vs2  reason: default package */
/* loaded from: classes.dex */
public final class vs2 {
    public static final AtomicInteger c0 = new AtomicInteger();
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public ByteBuffer I;
    public int J;
    public ByteBuffer K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public ce0 S;
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final Context a;
    public long a0;
    public final ij1 b;
    public Handler b0;
    public final fb1 c;
    public final loc d;
    public final rac e;
    public final qac f;
    public final mm9 g;
    public final ArrayDeque h;
    public int i;
    public rs2 j;
    public final us2 k;
    public final us2 l;
    public a09 m;
    public uwd n;
    public ss2 o;
    public ss2 p;
    public u50 q;
    public s50 r;
    public ps2 s;
    public p60 t;
    public l40 u;
    public ts2 v;
    public ts2 w;
    public my8 x;
    public boolean y;
    public long z;

    /* JADX WARN: Type inference failed for: r2v0, types: [loc, java.lang.Object, eh0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [rac, eh0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [qac, eh0] */
    /* JADX WARN: Type inference failed for: r9v3, types: [fb1, java.lang.Object, eh0] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, ce0] */
    public vs2(wf2 wf2Var) {
        int deviceId;
        Context context = (Context) wf2Var.b;
        this.a = context.getApplicationContext();
        this.u = l40.b;
        this.b = (ij1) wf2Var.c;
        this.i = 0;
        this.r = (r60) wf2Var.e;
        ?? eh0Var = new eh0();
        this.c = eh0Var;
        ?? eh0Var2 = new eh0();
        eh0Var2.m = a2d.b;
        this.d = eh0Var2;
        this.e = new eh0();
        this.f = new eh0();
        this.g = qs5.s(eh0Var2, eh0Var);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new Object();
        my8 my8Var = my8.d;
        this.w = new ts2(my8Var, 0L, 0L);
        this.x = my8Var;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new us2();
        this.l = new us2();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.U = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int i(int r10, java.nio.ByteBuffer r11) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs2.i(int, java.nio.ByteBuffer):int");
    }

    public final void a(long j) {
        my8 my8Var;
        boolean z;
        boolean z2;
        boolean v = v();
        boolean z3 = false;
        ij1 ij1Var = this.b;
        if (!v) {
            if (!this.V && ss2.a(this.p)) {
                int i = this.p.a.I;
                my8Var = this.x;
                lsa lsaVar = (lsa) ij1Var.d;
                float f = my8Var.a;
                lsaVar.getClass();
                if (f > nae.e) {
                    z = true;
                } else {
                    z = false;
                }
                wq9.s(z);
                if (lsaVar.c != f) {
                    lsaVar.c = f;
                    lsaVar.i = true;
                }
                float f2 = my8Var.b;
                if (f2 > nae.e) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                wq9.s(z2);
                if (lsaVar.d != f2) {
                    lsaVar.d = f2;
                    lsaVar.i = true;
                }
            } else {
                my8Var = my8.d;
            }
            this.x = my8Var;
        } else {
            my8Var = my8.d;
        }
        my8 my8Var2 = my8Var;
        if (!this.V && ss2.a(this.p)) {
            int i2 = this.p.a.I;
            z3 = this.y;
            ((ila) ij1Var.c).o = z3;
        }
        this.y = z3;
        this.h.add(new ts2(my8Var2, Math.max(0L, j), a2d.W(this.p.e.b, j())));
        u50 u50Var = this.p.f;
        this.q = u50Var;
        u50Var.a();
        uwd uwdVar = this.n;
        if (uwdVar != null) {
            final boolean z4 = this.y;
            final b60 b60Var = ((e47) uwdVar.b).f1;
            Handler handler = b60Var.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: a60
                    @Override // java.lang.Runnable
                    public final void run() {
                        c04 c04Var = b60.this.b;
                        String str = a2d.a;
                        i04 i04Var = c04Var.a;
                        boolean z5 = i04Var.f0;
                        boolean z6 = z4;
                        if (z5 == z6) {
                            return;
                        }
                        i04Var.f0 = z6;
                        i04Var.m.e(23, new yz3(1, z6));
                    }
                });
            }
        }
    }

    public final p60 b(r50 r50Var) {
        try {
            return ((r60) this.r).a(r50Var);
        } catch (p50 e) {
            d60 d60Var = new d60(r50Var.b, r50Var.c, r50Var.a, r50Var.f, this.p.a, r50Var.e, e);
            uwd uwdVar = this.n;
            if (uwdVar != null) {
                uwdVar.q(d60Var);
            }
            throw d60Var;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [hs5, ls5] */
    public final void c(vq4 vq4Var, int[] iArr) {
        u50 u50Var;
        vq4 vq4Var2;
        int i;
        int i2;
        if (this.s == null && this.a != null) {
            ps2 ps2Var = new ps2(this);
            this.s = ps2Var;
            r60 r60Var = (r60) this.r;
            r60Var.f();
            if (r60Var.f == null) {
                r60Var.f = new rr6(Thread.currentThread());
            }
            r60Var.f.a(ps2Var);
        }
        String str = vq4Var.o;
        int i3 = vq4Var.G;
        int i4 = vq4Var.I;
        if ("audio/raw".equals(str)) {
            wq9.s(a2d.M(i4));
            int t = a2d.t(i4) * i3;
            ?? hs5Var = new hs5(4);
            hs5Var.c(this.g);
            hs5Var.b(this.e);
            hs5Var.f((y50[]) this.b.b);
            u50Var = new u50(hs5Var.g());
            if (u50Var.equals(this.q)) {
                u50Var = this.q;
            }
            int i5 = vq4Var.J;
            int i6 = vq4Var.K;
            loc locVar = this.d;
            locVar.i = i5;
            locVar.j = i6;
            this.c.i = iArr;
            v50 v50Var = new v50(vq4Var.H, i3, i4);
            try {
                qs5 qs5Var = u50Var.a;
                if (!v50Var.equals(v50.e)) {
                    for (int i7 = 0; i7 < qs5Var.size(); i7++) {
                        y50 y50Var = (y50) qs5Var.get(i7);
                        v50 g = y50Var.g(v50Var);
                        if (y50Var.isActive()) {
                            wq9.D(!g.equals(v50.e));
                            v50Var = g;
                        }
                    }
                    int i8 = v50Var.b;
                    int i9 = v50Var.c;
                    uq4 a = vq4Var.a();
                    a.H = i9;
                    a.G = v50Var.a;
                    a.F = i8;
                    vq4Var2 = new vq4(a);
                    i = t;
                    i2 = a2d.t(i9) * i8;
                } else {
                    throw new x50(v50Var);
                }
            } catch (x50 e) {
                throw new c60(e, vq4Var);
            }
        } else {
            u50Var = new u50(mm9.e);
            vq4Var2 = vq4Var;
            i = -1;
            i2 = -1;
        }
        u50 u50Var2 = u50Var;
        m50 g2 = g(vq4Var2);
        vq4 vq4Var3 = g2.a;
        try {
            r50 c = ((r60) this.r).c(g2);
            boolean z = c.e;
            if (c.a != 0) {
                if (c.c != 0) {
                    this.X = false;
                    ss2 ss2Var = new ss2(vq4Var, vq4Var2, i, i2, c, u50Var2);
                    if (n()) {
                        this.o = ss2Var;
                        return;
                    } else {
                        this.p = ss2Var;
                        return;
                    }
                }
                throw new c60("Invalid output channel config (isOffload=" + z + ")", vq4Var3);
            }
            throw new c60("Invalid output encoding (isOffload=" + z + ")", vq4Var3);
        } catch (l50 e2) {
            throw new c60(e2, vq4Var);
        }
    }

    public final void d(long j) {
        uwd uwdVar;
        l04 l04Var;
        if (this.K != null) {
            us2 us2Var = this.l;
            if (us2Var.a == null || (c0.get() <= 0 && SystemClock.elapsedRealtime() >= us2Var.c)) {
                int remaining = this.K.remaining();
                boolean z = false;
                try {
                    boolean g = this.t.g(this.J, j, this.K);
                    this.W = SystemClock.elapsedRealtime();
                    us2Var.a = null;
                    us2Var.b = -9223372036854775807L;
                    us2Var.c = -9223372036854775807L;
                    if (this.t.c()) {
                        if (this.C > 0) {
                            this.Y = false;
                        }
                        if (this.O && (uwdVar = this.n) != null && !g && !this.Y && (l04Var = ((e47) uwdVar.b).e0) != null) {
                            l04Var.a.o0 = true;
                        }
                    }
                    if (ss2.a(this.p)) {
                        this.B += remaining - this.K.remaining();
                    }
                    if (g) {
                        if (!ss2.a(this.p)) {
                            if (this.K == this.I) {
                                z = true;
                            }
                            wq9.D(z);
                            this.C = (this.D * this.J) + this.C;
                        }
                        this.K = null;
                    }
                } catch (k50 e) {
                    boolean z2 = e.b;
                    if (z2) {
                        if (j() <= 0) {
                            if (this.t.c()) {
                                if (this.p.e.e) {
                                    this.X = true;
                                }
                            }
                        }
                        z = true;
                    }
                    f60 f60Var = new f60(e.a, this.p.a, z);
                    uwd uwdVar2 = this.n;
                    if (uwdVar2 != null) {
                        uwdVar2.q(f60Var);
                    }
                    if (!z2) {
                        us2Var.a(f60Var);
                        return;
                    }
                    throw f60Var;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r6 = this;
            u50 r0 = r6.q
            boolean r0 = r0.d()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            r6.d(r1)
            java.nio.ByteBuffer r6 = r6.K
            if (r6 != 0) goto L44
            goto L43
        L14:
            u50 r0 = r6.q
            boolean r5 = r0.d()
            if (r5 == 0) goto L2e
            boolean r5 = r0.d
            if (r5 == 0) goto L21
            goto L2e
        L21:
            r0.d = r4
            java.util.ArrayList r0 = r0.b
            java.lang.Object r0 = r0.get(r3)
            y50 r0 = (defpackage.y50) r0
            r0.h()
        L2e:
            r6.q(r1)
            u50 r0 = r6.q
            boolean r0 = r0.c()
            if (r0 == 0) goto L44
            java.nio.ByteBuffer r6 = r6.K
            if (r6 == 0) goto L43
            boolean r6 = r6.hasRemaining()
            if (r6 != 0) goto L44
        L43:
            return r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs2.e():boolean");
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public final void f() {
        if (n()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.w = new ts2(this.x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.o = 0L;
            u50 u50Var = this.p.f;
            this.q = u50Var;
            u50Var.a();
            this.j = null;
            ss2 ss2Var = this.o;
            if (ss2Var != null) {
                this.p = ss2Var;
                this.o = null;
            }
            c0.incrementAndGet();
            p60 p60Var = this.t;
            if (p60Var.f.d.getPlayState() == 3) {
                p60Var.a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && p60Var.c()) {
                o60 o60Var = p60Var.i;
                o60Var.getClass();
                o60.a(o60Var);
            }
            oaa oaaVar = p60Var.e;
            if (oaaVar != null) {
                k60 k60Var = (k60) oaaVar.e;
                k60Var.getClass();
                ((AudioTrack) oaaVar.b).removeOnRoutingChangedListener(k60Var);
                oaaVar.e = null;
                p60Var.e = null;
            }
            AudioTrack audioTrack = p60Var.a;
            rr6 rr6Var = p60Var.j;
            Handler p = a2d.p(null);
            synchronized (p60.s) {
                try {
                    if (p60.t == null) {
                        p60.t = Executors.newSingleThreadScheduledExecutor(new Object());
                    }
                    p60.u++;
                    p60.t.schedule(new bn(1, audioTrack, p, rr6Var), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.t = null;
        }
        us2 us2Var = this.l;
        us2Var.a = null;
        us2Var.b = -9223372036854775807L;
        us2Var.c = -9223372036854775807L;
        us2 us2Var2 = this.k;
        us2Var2.a = null;
        us2Var2.b = -9223372036854775807L;
        us2Var2.c = -9223372036854775807L;
        this.Z = 0L;
        this.a0 = 0L;
        Handler handler = this.b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final m50 g(vq4 vq4Var) {
        boolean z;
        m50 m50Var = new m50(vq4Var);
        m50Var.b = this.u;
        if (this.i != 0) {
            z = true;
        } else {
            z = false;
        }
        m50Var.d = z;
        m50Var.c = this.T;
        m50Var.e = this.Q;
        m50Var.g = this.V;
        m50Var.h = -1;
        m50Var.f = this.U;
        return new m50(m50Var);
    }

    public final int h(vq4 vq4Var) {
        boolean z;
        if (a2d.M(vq4Var.I) && vq4Var.I != 2) {
            uq4 a = vq4Var.a();
            a.H = 2;
            vq4Var = new vq4(a);
            z = true;
        } else {
            z = false;
        }
        int i = ((r60) this.r).b(g(vq4Var)).d;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final long j() {
        if (ss2.a(this.p)) {
            long j = this.B;
            long j2 = this.p.d;
            return ((j + j2) - 1) / j2;
        }
        return this.C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (m() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f4, code lost:
        if (r5 == 0) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(int r21, long r22, java.nio.ByteBuffer r24) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs2.k(int, long, java.nio.ByteBuffer):boolean");
    }

    public final boolean l() {
        if (n()) {
            if (Build.VERSION.SDK_INT < 29 || !this.t.c() || !this.N) {
                long j = j();
                long a = this.t.a();
                p60 p60Var = this.t;
                p60Var.getClass();
                if (j > a2d.Y(a, p60Var.a.getSampleRate(), 1000000L, RoundingMode.UP)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean m() {
        int i;
        p60 b;
        kz6 kz6Var;
        us2 us2Var = this.k;
        boolean z = false;
        if (us2Var.a != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < us2Var.c)) {
            return false;
        }
        try {
            b = b(this.p.e);
        } catch (d60 e) {
            int i2 = this.p.e.f;
            while (true) {
                ss2 ss2Var = this.p;
                if (i2 > 1000000) {
                    int i3 = i2 / 2;
                    int i4 = ss2Var.d;
                    if (i4 == -1) {
                        i4 = 1;
                    }
                    int i5 = i3 % i4;
                    if (i5 != 0) {
                        i = (i4 - i5) + i3;
                    } else {
                        i = i3;
                    }
                    q50 a = ss2Var.e.a();
                    a.f = i;
                    r50 r50Var = new r50(a);
                    try {
                        b = b(r50Var);
                        ss2 ss2Var2 = this.p;
                        this.p = new ss2(ss2Var2.a, ss2Var2.b, ss2Var2.c, ss2Var2.d, r50Var, ss2Var2.f);
                        break;
                    } catch (d60 e2) {
                        e.addSuppressed(e2);
                        i2 = i;
                    }
                } else {
                    if (ss2Var.e.e) {
                        this.X = true;
                    }
                    throw e;
                }
            }
        }
        this.t = b;
        rs2 rs2Var = new rs2(this, this.p.e);
        this.j = rs2Var;
        b.j.a(rs2Var);
        if (this.t.c()) {
            ss2 ss2Var3 = this.p;
            if (ss2Var3.e.k) {
                p60 p60Var = this.t;
                vq4 vq4Var = ss2Var3.a;
                p60Var.d(vq4Var.J, vq4Var.K);
            }
        }
        a09 a09Var = this.m;
        if (a09Var != null) {
            this.t.f(a09Var);
        }
        if (n()) {
            this.t.a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.t.a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.t.a.getAudioSessionId();
        if (audioSessionId != this.Q) {
            z = true;
        }
        this.Q = audioSessionId;
        uwd uwdVar = this.n;
        if (uwdVar != null) {
            int i6 = this.p.e.a;
            zj1 zj1Var = new zj1(17);
            b60 b60Var = ((e47) uwdVar.b).f1;
            Handler handler = b60Var.a;
            if (handler != null) {
                handler.post(new z50(b60Var, zj1Var, 7));
            }
            if (z) {
                this.R = true;
                ss2 ss2Var4 = this.p;
                q50 a2 = ss2Var4.e.a();
                a2.h = this.Q;
                this.p = new ss2(ss2Var4.a, ss2Var4.b, ss2Var4.c, ss2Var4.d, new r50(a2), ss2Var4.f);
                ss2 ss2Var5 = this.o;
                if (ss2Var5 != null) {
                    q50 a3 = ss2Var5.e.a();
                    a3.h = this.Q;
                    this.o = new ss2(ss2Var5.a, ss2Var5.b, ss2Var5.c, ss2Var5.d, new r50(a3), ss2Var5.f);
                }
                uwd uwdVar2 = this.n;
                int i7 = this.Q;
                e47 e47Var = (e47) uwdVar2.b;
                if (Build.VERSION.SDK_INT >= 35 && (kz6Var = e47Var.h1) != null) {
                    kz6Var.d(i7);
                }
                b60 b60Var2 = e47Var.f1;
                Handler handler2 = b60Var2.a;
                if (handler2 != null) {
                    handler2.post(new c50(b60Var2, i7, 1));
                }
            }
        }
        return true;
    }

    public final boolean n() {
        if (this.t != null) {
            return true;
        }
        return false;
    }

    public final void o() {
        this.O = true;
        if (n()) {
            p60 p60Var = this.t;
            s60 s60Var = p60Var.f;
            if (s60Var.u != -9223372036854775807L) {
                s60Var.b.getClass();
                s60Var.u = a2d.Q(SystemClock.elapsedRealtime());
            }
            s60Var.j = a2d.W(s60Var.e, s60Var.a());
            s60Var.h.a(0);
            if (!p60Var.k || p60Var.c()) {
                p60Var.a.play();
            }
        }
    }

    public final void p() {
        if (!this.M) {
            this.M = true;
            if (this.t.c()) {
                this.N = false;
            }
            p60 p60Var = this.t;
            if (!p60Var.k) {
                p60Var.k = true;
                s60 s60Var = p60Var.f;
                long b = p60Var.b();
                s60Var.w = s60Var.a();
                s60Var.b.getClass();
                s60Var.u = a2d.Q(SystemClock.elapsedRealtime());
                s60Var.x = b;
                p60Var.a.stop();
                p60Var.p = 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        r0 = r3.I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (r0.hasRemaining() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        r0 = r3.q;
        r1 = r3.I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r0.d() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
        if (r0.d == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
        r0.e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(long r4) {
        /*
            r3 = this;
            r3.d(r4)
            java.nio.ByteBuffer r0 = r3.K
            if (r0 == 0) goto L9
            goto L7b
        L9:
            u50 r0 = r3.q
            boolean r0 = r0.d()
            if (r0 != 0) goto L1c
            java.nio.ByteBuffer r0 = r3.I
            if (r0 == 0) goto L7b
            r3.u(r0)
            r3.d(r4)
            return
        L1c:
            u50 r0 = r3.q
            boolean r0 = r0.c()
            if (r0 != 0) goto L7b
        L24:
            u50 r0 = r3.q
            boolean r1 = r0.d()
            if (r1 != 0) goto L2f
            java.nio.ByteBuffer r0 = defpackage.y50.a
            goto L4c
        L2f:
            java.nio.ByteBuffer[] r1 = r0.c
            int r2 = r0.b()
            r1 = r1[r2]
            boolean r2 = r1.hasRemaining()
            if (r2 == 0) goto L3f
            r0 = r1
            goto L4c
        L3f:
            java.nio.ByteBuffer r1 = defpackage.y50.a
            r0.e(r1)
            java.nio.ByteBuffer[] r1 = r0.c
            int r0 = r0.b()
            r0 = r1[r0]
        L4c:
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L5d
            r3.u(r0)
            r3.d(r4)
            java.nio.ByteBuffer r0 = r3.K
            if (r0 == 0) goto L24
            goto L7b
        L5d:
            java.nio.ByteBuffer r0 = r3.I
            if (r0 == 0) goto L7b
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L68
            goto L7b
        L68:
            u50 r0 = r3.q
            java.nio.ByteBuffer r1 = r3.I
            boolean r2 = r0.d()
            if (r2 == 0) goto L1c
            boolean r2 = r0.d
            if (r2 == 0) goto L77
            goto L1c
        L77:
            r0.e(r1)
            goto L1c
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs2.q(long):void");
    }

    public final void r() {
        if (this.p != null) {
            ss2 ss2Var = this.o;
            if (ss2Var != null) {
                this.p = ss2Var;
                this.o = null;
            }
            try {
                r50 c = ((r60) this.r).c(g(this.p.b));
                ss2 ss2Var2 = this.p;
                this.p = new ss2(ss2Var2.a, ss2Var2.b, ss2Var2.c, ss2Var2.d, c, ss2Var2.f);
            } catch (l50 e) {
                p1a.n(new c60(e, this.p.a));
                return;
            }
        }
        f();
    }

    public final void s() {
        f();
        ms5 listIterator = this.g.listIterator(0);
        while (listIterator.hasNext()) {
            ((y50) listIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        u50 u50Var = this.q;
        if (u50Var != null) {
            qs5 qs5Var = u50Var.a;
            for (int i = 0; i < qs5Var.size(); i++) {
                y50 y50Var = (y50) qs5Var.get(i);
                y50Var.e(w50.b);
                y50Var.reset();
            }
            u50Var.b.clear();
            u50Var.c = new ByteBuffer[0];
            v50 v50Var = v50.e;
            u50Var.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void t() {
        if (n()) {
            p60 p60Var = this.t;
            my8 my8Var = this.x;
            AudioTrack audioTrack = p60Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(a2d.h(my8Var.a, 0.1f, p60Var.c)).setPitch(a2d.h(my8Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                st0.x("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            s60 s60Var = p60Var.f;
            s60Var.i = audioTrack.getPlaybackParams().getSpeed();
            s60Var.h.a(0);
            s60Var.k = 0L;
            s60Var.t = 0;
            s60Var.s = 0;
            s60Var.l = 0L;
            s60Var.y = -9223372036854775807L;
            s60Var.z = -9223372036854775807L;
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new my8(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(java.nio.ByteBuffer r23) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs2.u(java.nio.ByteBuffer):void");
    }

    public final boolean v() {
        ss2 ss2Var = this.p;
        if (ss2Var != null && ss2Var.e.j) {
            return true;
        }
        return false;
    }
}
