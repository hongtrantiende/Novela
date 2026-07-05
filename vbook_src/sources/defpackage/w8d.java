package defpackage;

import android.os.SystemClock;
import android.os.Trace;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w8d  reason: default package */
/* loaded from: classes.dex */
public final class w8d {
    public final kw5 a;
    public final q8d b;
    public final od0 c = new od0();
    public final cw d = new cw(6, (byte) 0);
    public final cw e = new cw(6, (byte) 0);
    public final lu0 f;
    public final r8d g;
    public long h;
    public long i;
    public long j;
    public uad k;
    public long l;

    public w8d(kw5 kw5Var, q8d q8dVar, r8d r8dVar) {
        this.a = kw5Var;
        this.b = q8dVar;
        this.g = r8dVar;
        lu0 lu0Var = new lu0();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        lu0Var.b = 0;
        lu0Var.c = -1;
        lu0Var.d = 0;
        lu0Var.f = new long[highestOneBit];
        lu0Var.e = highestOneBit - 1;
        this.f = lu0Var;
        this.h = -9223372036854775807L;
        this.k = uad.d;
        this.i = -9223372036854775807L;
        this.j = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        boolean z;
        long j3;
        vq4 vq4Var;
        final kw5 kw5Var = this.a;
        wy2 wy2Var = (wy2) kw5Var.c;
        while (true) {
            lu0 lu0Var = this.f;
            int i = lu0Var.d;
            if (i == 0) {
                return;
            }
            if (i != 0) {
                long j4 = ((long[]) lu0Var.f)[lu0Var.b];
                Long l = (Long) this.e.j(j4);
                q8d q8dVar = this.b;
                if (l != null && l.longValue() != this.l) {
                    this.l = l.longValue();
                    q8dVar.e(2);
                }
                long j5 = this.l;
                q8d q8dVar2 = this.b;
                od0 od0Var = this.c;
                int a = q8dVar2.a(j4, j, j2, j5, false, false, od0Var);
                if (a != 5 && a != 4) {
                    this.g.a(j4, od0Var.b);
                }
                boolean z2 = true;
                if (a != 0 && a != 1) {
                    if (a != 2 && a != 3) {
                        if (a != 4) {
                            if (a == 5) {
                                return;
                            }
                            vs.k(String.valueOf(a));
                            return;
                        }
                        this.i = j4;
                    } else {
                        this.i = j4;
                        lu0Var.e();
                        wy2Var.i.execute(new Runnable() { // from class: vy2
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2 = r2;
                                kw5 kw5Var2 = kw5Var;
                                switch (i2) {
                                    case 0:
                                        ((wy2) kw5Var2.c).h.b();
                                        return;
                                    default:
                                        ((wy2) kw5Var2.c).h.c();
                                        return;
                                }
                            }
                        });
                        r47 r47Var = (r47) wy2Var.d.remove();
                        u47 u47Var = r47Var.c;
                        d47 d47Var = r47Var.a;
                        int i2 = r47Var.b;
                        Trace.beginSection("dropVideoBuffer");
                        d47Var.e(i2);
                        Trace.endSection();
                        u47Var.S0(0, 1);
                    }
                } else {
                    this.i = j4;
                    if (a == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long e = lu0Var.e();
                    uad uadVar = (uad) this.d.j(e);
                    if (uadVar != null && !uadVar.equals(uad.d) && !uadVar.equals(this.k)) {
                        this.k = uadVar;
                        uq4 uq4Var = new uq4();
                        uq4Var.u = uadVar.a;
                        uq4Var.v = uadVar.b;
                        uq4Var.n = lc7.p("video/raw");
                        kw5Var.b = new vq4(uq4Var);
                        wy2Var.i.execute(new ex2(1, kw5Var, uadVar));
                    }
                    if (z) {
                        j3 = System.nanoTime();
                    } else {
                        j3 = od0Var.c;
                    }
                    long j6 = j3;
                    if (q8dVar.e == 3) {
                        z2 = false;
                    }
                    q8dVar.e = 3;
                    q8dVar.l.getClass();
                    q8dVar.g = a2d.Q(SystemClock.elapsedRealtime());
                    if (z2 && wy2Var.e != null) {
                        wy2Var.i.execute(new Runnable() { // from class: vy2
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i22 = r2;
                                kw5 kw5Var2 = kw5Var;
                                switch (i22) {
                                    case 0:
                                        ((wy2) kw5Var2.c).h.b();
                                        return;
                                    default:
                                        ((wy2) kw5Var2.c).h.c();
                                        return;
                                }
                            }
                        });
                    }
                    vq4 vq4Var2 = (vq4) kw5Var.b;
                    if (vq4Var2 == null) {
                        vq4Var = new vq4(new uq4());
                    } else {
                        vq4Var = vq4Var2;
                    }
                    wy2Var.j.c(e, j6, vq4Var, null);
                    r47 r47Var2 = (r47) wy2Var.d.remove();
                    r47Var2.c.N0(r47Var2.a, r47Var2.b, j6);
                }
            } else {
                xk5.g();
                return;
            }
        }
    }
}
