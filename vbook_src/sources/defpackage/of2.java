package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: of2  reason: default package */
/* loaded from: classes.dex */
public final class of2 extends ci0 {
    public ij1 A;
    public ys2 B;
    public IOException C;
    public Handler D;
    public Uri E;
    public final Uri F;
    public ff2 G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public int L;
    public long M;
    public int N;
    public f57 O;
    public b57 P;
    public final boolean h;
    public final gg2 i;
    public final kj j;
    public final kh5 k;
    public final fl3 l;
    public final ox9 m;
    public final oaa n;
    public final long o;
    public final long p;
    public final cl3 q;
    public final an8 r;
    public final uwd s;
    public final Object t;
    public final SparseArray u;
    public final kf2 v;
    public final kf2 w;
    public final n07 x;
    public final js6 y;
    public jg2 z;

    static {
        g57.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [kf2] */
    /* JADX WARN: Type inference failed for: r2v11, types: [kf2] */
    public of2(f57 f57Var, gg2 gg2Var, an8 an8Var, kj kjVar, kh5 kh5Var, fl3 fl3Var, ox9 ox9Var, long j, long j2) {
        this.O = f57Var;
        this.P = f57Var.c;
        c57 c57Var = f57Var.b;
        c57Var.getClass();
        Uri uri = c57Var.a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.i = gg2Var;
        this.r = an8Var;
        this.j = kjVar;
        this.l = fl3Var;
        this.m = ox9Var;
        this.o = j;
        this.p = j2;
        this.k = kh5Var;
        this.n = new oaa(4);
        this.h = false;
        this.q = a(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new n07(this, 12);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.s = new uwd(this, 14);
        this.y = new mce(this);
        this.v = new Runnable(this) { // from class: kf2
            public final /* synthetic */ of2 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i = r2;
                of2 of2Var = this.b;
                switch (i) {
                    case 0:
                        of2Var.z();
                        return;
                    default:
                        try {
                            of2Var.x(false);
                            return;
                        } catch (Exception e) {
                            of2Var.C = new IOException(e);
                            return;
                        }
                }
            }
        };
        this.w = new Runnable(this) { // from class: kf2
            public final /* synthetic */ of2 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i = r2;
                of2 of2Var = this.b;
                switch (i) {
                    case 0:
                        of2Var.z();
                        return;
                    default:
                        try {
                            of2Var.x(false);
                            return;
                        } catch (Exception e) {
                            of2Var.C = new IOException(e);
                            return;
                        }
                }
            }
        };
    }

    public static boolean t(mt8 mt8Var) {
        List list = mt8Var.c;
        for (int i = 0; i < list.size(); i++) {
            int i2 = ((g7) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ci0
    public final n57 b(e67 e67Var, ij1 ij1Var, long j) {
        int intValue = ((Integer) e67Var.a).intValue() - this.N;
        cl3 a = a(e67Var);
        cl3 cl3Var = new cl3(this.d.c, 0, e67Var);
        int i = this.N + intValue;
        ff2 ff2Var = this.G;
        ys2 ys2Var = this.B;
        long j2 = this.K;
        a09 a09Var = this.g;
        a09Var.getClass();
        jf2 jf2Var = new jf2(i, ff2Var, this.n, intValue, this.j, ys2Var, this.l, cl3Var, this.m, a, j2, this.y, ij1Var, this.k, this.x, a09Var);
        this.u.put(i, jf2Var);
        return jf2Var;
    }

    @Override // defpackage.ci0
    public final synchronized f57 h() {
        return this.O;
    }

    @Override // defpackage.ci0
    public final void j() {
        this.y.b();
    }

    @Override // defpackage.ci0
    public final void l(ys2 ys2Var) {
        this.B = ys2Var;
        Looper myLooper = Looper.myLooper();
        a09 a09Var = this.g;
        a09Var.getClass();
        fl3 fl3Var = this.l;
        fl3Var.l(myLooper, a09Var);
        fl3Var.j();
        if (this.h) {
            x(false);
            return;
        }
        this.z = this.i.h();
        this.A = new ij1("DashMediaSource");
        this.D = a2d.p(null);
        z();
    }

    @Override // defpackage.ci0
    public final void n(n57 n57Var) {
        jf2 jf2Var = (jf2) n57Var;
        yz8 yz8Var = jf2Var.I;
        yz8Var.E = true;
        yz8Var.d.removeCallbacksAndMessages(null);
        for (mh1 mh1Var : jf2Var.N) {
            mh1Var.D(jf2Var);
        }
        jf2Var.M = null;
        this.u.remove(jf2Var.a);
    }

    @Override // defpackage.ci0
    public final void p() {
        this.H = false;
        this.z = null;
        ij1 ij1Var = this.A;
        if (ij1Var != null) {
            ij1Var.S(null);
            this.A = null;
        }
        b57 b57Var = h().c;
        synchronized (this) {
            this.P = b57Var;
        }
        this.I = 0L;
        this.J = 0L;
        this.E = this.F;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.K = -9223372036854775807L;
        this.L = 0;
        this.M = -9223372036854775807L;
        this.u.clear();
        oaa oaaVar = this.n;
        ((HashMap) oaaVar.b).clear();
        ((HashMap) oaaVar.c).clear();
        ((HashMap) oaaVar.d).clear();
        this.l.a();
    }

    @Override // defpackage.ci0
    public final synchronized void s(f57 f57Var) {
        this.O = f57Var;
        this.P = f57Var.c;
    }

    public final void u() {
        boolean z;
        ij1 ij1Var = this.A;
        fz4 fz4Var = new fz4(this);
        synchronized (iwe.c) {
            z = iwe.d;
        }
        if (z) {
            fz4Var.i0();
            return;
        }
        if (ij1Var == null) {
            ij1Var = new ij1("SntpClient");
        }
        ij1Var.Z(new mp8(3), new nf2(fz4Var, 1), 1);
    }

    public final void v(bn8 bn8Var, long j, long j2) {
        long j3 = bn8Var.a;
        mg2 mg2Var = bn8Var.b;
        h0b h0bVar = bn8Var.d;
        cs6 cs6Var = new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        this.m.getClass();
        this.q.c(cs6Var, bn8Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void w(IOException iOException) {
        st0.i("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.K = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        x(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(boolean r43) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of2.x(boolean):void");
    }

    public final void y(k53 k53Var, an8 an8Var) {
        jg2 jg2Var = this.z;
        Uri parse = Uri.parse(k53Var.c);
        Map map = Collections.EMPTY_MAP;
        wq9.z(parse, "The uri must be set.");
        this.A.Z(new bn8(jg2Var, new mg2(parse, 1, null, map, 0L, -1L, null, 1), 5, an8Var), new nf2(this, 0), 1);
    }

    public final void z() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.K()) {
            return;
        }
        if (this.A.O()) {
            this.H = true;
            return;
        }
        synchronized (this.t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        wq9.z(uri, "The uri must be set.");
        bn8 bn8Var = new bn8(this.z, new mg2(uri, 1, null, map, 0L, -1L, null, 1), 4, this.r);
        uwd uwdVar = this.s;
        this.m.getClass();
        this.A.Z(bn8Var, uwdVar, 3);
    }
}
