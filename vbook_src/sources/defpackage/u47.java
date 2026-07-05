package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u47  reason: default package */
/* loaded from: classes.dex */
public final class u47 extends k47 {
    public static final int[] X1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean Y1;
    public static boolean Z1;
    public int A1;
    public int B1;
    public long C1;
    public int D1;
    public int E1;
    public int F1;
    public u3a G1;
    public long H1;
    public boolean I1;
    public long J1;
    public int K1;
    public long L1;
    public uad M1;
    public uad N1;
    public int O1;
    public boolean P1;
    public int Q1;
    public t47 R1;
    public o8d S1;
    public long T1;
    public long U1;
    public boolean V1;
    public int W1;
    public final Context e1;
    public final boolean f1;
    public final b60 g1;
    public final int h1;
    public final boolean i1;
    public final q8d j1;
    public final od0 k1;
    public final s6f l1;
    public final long m1;
    public final r8d n1;
    public final PriorityQueue o1;
    public c4 p1;
    public boolean q1;
    public boolean r1;
    public tad s1;
    public boolean t1;
    public int u1;
    public List v1;
    public Surface w1;
    public sw8 x1;
    public bna y1;
    public boolean z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u47(defpackage.s47 r9) {
        /*
            r8 = this;
            android.content.Context r0 = r9.a
            android.content.Context r1 = r0.getApplicationContext()
            c47 r2 = r9.c
            r3 = 1106247680(0x41f00000, float:30.0)
            r4 = 2
            r8.<init>(r1, r4, r2, r3)
            android.content.Context r0 = r0.getApplicationContext()
            r8.e1 = r0
            int r1 = r9.g
            r8.h1 = r1
            r1 = 0
            r8.s1 = r1
            b60 r2 = new b60
            android.os.Handler r3 = r9.e
            c04 r4 = r9.f
            r5 = 1
            r2.<init>(r3, r4, r5)
            r8.g1 = r2
            tad r2 = r8.s1
            r3 = 0
            if (r2 != 0) goto L2e
            r2 = r5
            goto L2f
        L2e:
            r2 = r3
        L2f:
            r8.f1 = r2
            q8d r2 = new q8d
            long r6 = r9.d
            r2.<init>(r0, r8, r6)
            r8.j1 = r2
            od0 r9 = new od0
            r9.<init>()
            r8.k1 = r9
            java.lang.String r9 = "NVIDIA"
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r9 = r9.equals(r0)
            r8.i1 = r9
            bna r9 = defpackage.bna.c
            r8.y1 = r9
            r8.A1 = r5
            r8.B1 = r3
            uad r9 = defpackage.uad.d
            r8.M1 = r9
            r8.Q1 = r3
            r8.N1 = r1
            r9 = -1000(0xfffffffffffffc18, float:NaN)
            r8.O1 = r9
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.T1 = r2
            r8.U1 = r2
            s6f r9 = new s6f
            r0 = 6
            r9.<init>(r0)
            r8.l1 = r9
            java.util.PriorityQueue r9 = new java.util.PriorityQueue
            r9.<init>()
            r8.o1 = r9
            r2 = -15000(0xffffffffffffc568, double:NaN)
            r8.m1 = r2
            r8d r9 = new r8d
            r9.<init>()
            r8.n1 = r9
            r8.G1 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u47.<init>(s47):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0736, code lost:
        if (r0.equals("ELUGA_Ray_X") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x08b7, code lost:
        if (r13.equals("JSN-L21") == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean E0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u47.E0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
        if (r3.equals("video/av01") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int F0(defpackage.h47 r11, defpackage.vq4 r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u47.F0(h47, vq4):int");
    }

    public static List G0(Context context, sz0 sz0Var, vq4 vq4Var, boolean z, boolean z2) {
        List a;
        String str = vq4Var.o;
        if (str == null) {
            return mm9.e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !h50.l(context)) {
            String c = o47.c(vq4Var);
            if (c == null) {
                a = mm9.e;
            } else {
                a = sz0Var.a(c, z, z2);
            }
            if (!a.isEmpty()) {
                return a;
            }
        }
        return o47.g(sz0Var, vq4Var, z, z2);
    }

    public static int H0(h47 h47Var, vq4 vq4Var) {
        int i = vq4Var.p;
        List list = vq4Var.r;
        if (i != -1) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += ((byte[]) list.get(i3)).length;
            }
            return vq4Var.p + i2;
        }
        return F0(h47Var, vq4Var);
    }

    @Override // defpackage.k47
    public final int A0(sz0 sz0Var, vq4 vq4Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (!lc7.o(vq4Var.o)) {
            return ei0.f(0, 0, 0, 0);
        }
        if (vq4Var.s != null) {
            z = true;
        } else {
            z = false;
        }
        Context context = this.e1;
        List G0 = G0(context, sz0Var, vq4Var, z, false);
        if (z && G0.isEmpty()) {
            G0 = G0(context, sz0Var, vq4Var, false, false);
        }
        if (G0.isEmpty()) {
            return ei0.f(1, 0, 0, 0);
        }
        int i6 = vq4Var.P;
        if (i6 != 0 && i6 != 2) {
            return ei0.f(2, 0, 0, 0);
        }
        h47 h47Var = (h47) G0.get(0);
        boolean e = h47Var.e(context, vq4Var);
        if (!e) {
            for (int i7 = 1; i7 < G0.size(); i7++) {
                h47 h47Var2 = (h47) G0.get(i7);
                if (h47Var2.e(context, vq4Var)) {
                    z2 = false;
                    e = true;
                    h47Var = h47Var2;
                    break;
                }
            }
        }
        z2 = true;
        if (e) {
            i = 4;
        } else {
            i = 3;
        }
        if (h47Var.f(vq4Var)) {
            i2 = 16;
        } else {
            i2 = 8;
        }
        if (h47Var.g) {
            i3 = 64;
        } else {
            i3 = 0;
        }
        if (z2) {
            i4 = Token.CASE;
        } else {
            i4 = 0;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(vq4Var.o) && !h50.l(context)) {
            i4 = 256;
        }
        if (e) {
            List G02 = G0(context, sz0Var, vq4Var, z, true);
            if (!G02.isEmpty()) {
                HashMap hashMap = o47.a;
                ArrayList arrayList = new ArrayList(G02);
                Collections.sort(arrayList, new oo1(new iu1(7, context, vq4Var), 4));
                h47 h47Var3 = (h47) arrayList.get(0);
                if (h47Var3.e(context, vq4Var) && h47Var3.f(vq4Var)) {
                    i5 = 32;
                }
            }
        }
        return i | i2 | i5 | i3 | i4;
    }

    @Override // defpackage.k47, defpackage.ei0
    public final void C(float f, float f2) {
        super.C(f, f2);
        tad tadVar = this.s1;
        if (tadVar != null) {
            tadVar.b(f);
        } else {
            this.j1.h(f);
        }
        r8d r8dVar = this.n1;
        if (r8dVar != null) {
            r8dVar.c(f);
        }
    }

    @Override // defpackage.ei0
    public final boolean F(long j) {
        if (this.N0 == -9223372036854775807L || j < this.H1) {
            return false;
        }
        long j2 = this.V0;
        if (j2 != -9223372036854775807L && j <= j2) {
            return false;
        }
        return true;
    }

    @Override // defpackage.k47
    public final er2 I(h47 h47Var, vq4 vq4Var, vq4 vq4Var2, boolean z) {
        int i;
        int i2;
        er2 b = h47Var.b(vq4Var, vq4Var2);
        float f = vq4Var.z;
        float f2 = vq4Var2.z;
        int i3 = b.e;
        c4 c4Var = this.p1;
        c4Var.getClass();
        if (vq4Var2.v > c4Var.a || vq4Var2.w > c4Var.b) {
            i3 |= 256;
        }
        if (H0(h47Var, vq4Var2) > c4Var.c) {
            i3 |= 64;
        }
        if (this.B1 != Integer.MIN_VALUE && (i2 = Build.VERSION.SDK_INT) < 31 && ((i2 != 30 || Build.MODEL.startsWith("MiTV")) && f != -1.0f && f2 != -1.0f && (!h47Var.f || !z))) {
            float max = Math.max(f2, f) / Math.min(f2, f);
            if (Math.abs(max - Math.round(max)) > 0.01f) {
                i3 |= Parser.ARGC_LIMIT;
            }
        }
        int i4 = i3;
        String str = h47Var.a;
        if (i4 != 0) {
            i = 0;
        } else {
            i = b.d;
        }
        return new er2(str, vq4Var, vq4Var2, i, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [rw8, android.os.HandlerThread, java.lang.Thread, android.os.Handler$Callback, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.Surface I0(defpackage.h47 r6) {
        /*
            r5 = this;
            tad r0 = r5.s1
            if (r0 == 0) goto L9
            android.view.Surface r5 = r0.e()
            return r5
        L9:
            android.view.Surface r0 = r5.w1
            if (r0 == 0) goto Le
            return r0
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 0
            if (r0 < r1) goto L1a
            boolean r0 = r6.h
            if (r0 == 0) goto L1a
            return r2
        L1a:
            boolean r0 = r5.Q0(r6)
            defpackage.wq9.D(r0)
            sw8 r0 = r5.x1
            if (r0 == 0) goto L32
            boolean r1 = r0.a
            boolean r3 = r6.f
            if (r1 == r3) goto L32
            if (r0 == 0) goto L32
            r0.release()
            r5.x1 = r2
        L32:
            sw8 r0 = r5.x1
            if (r0 != 0) goto Lab
            android.content.Context r0 = r5.e1
            boolean r6 = r6.f
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L47
            boolean r0 = defpackage.sw8.b(r0)
            if (r0 == 0) goto L45
            goto L49
        L45:
            r0 = r2
            goto L4a
        L47:
            int r0 = defpackage.sw8.d
        L49:
            r0 = r1
        L4a:
            defpackage.wq9.D(r0)
            rw8 r0 = new rw8
            java.lang.String r3 = "ExoPlayer:PlaceholderSurface"
            r0.<init>(r3)
            if (r6 == 0) goto L59
            int r6 = defpackage.sw8.d
            goto L5a
        L59:
            r6 = r2
        L5a:
            r0.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r0.getLooper()
            r3.<init>(r4, r0)
            r0.b = r3
            bn3 r4 = new bn3
            r4.<init>(r3)
            r0.a = r4
            monitor-enter(r0)
            android.os.Handler r3 = r0.b     // Catch: java.lang.Throwable -> L89
            android.os.Message r6 = r3.obtainMessage(r1, r6, r2)     // Catch: java.lang.Throwable -> L89
            r6.sendToTarget()     // Catch: java.lang.Throwable -> L89
        L79:
            sw8 r6 = r0.e     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            java.lang.RuntimeException r6 = r0.d     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            java.lang.Error r6 = r0.c     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            r0.wait()     // Catch: java.lang.Throwable -> L89 java.lang.InterruptedException -> L8b
            goto L79
        L89:
            r5 = move-exception
            goto La9
        L8b:
            r2 = r1
            goto L79
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L97
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L97:
            java.lang.RuntimeException r6 = r0.d
            if (r6 != 0) goto La8
            java.lang.Error r6 = r0.c
            if (r6 != 0) goto La7
            sw8 r6 = r0.e
            r6.getClass()
            r5.x1 = r6
            goto Lab
        La7:
            throw r6
        La8:
            throw r6
        La9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            throw r5
        Lab:
            sw8 r5 = r5.x1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u47.I0(h47):android.view.Surface");
    }

    @Override // defpackage.k47
    public final g47 J(IllegalStateException illegalStateException, h47 h47Var) {
        Surface surface = this.w1;
        g47 g47Var = new g47(illegalStateException, h47Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return g47Var;
    }

    public final boolean J0(h47 h47Var) {
        if (this.s1 == null) {
            Surface surface = this.w1;
            if (surface == null || !surface.isValid()) {
                if ((Build.VERSION.SDK_INT < 35 || !h47Var.h) && !Q0(h47Var)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean K0(cr2 cr2Var) {
        if (l() || cr2Var.h(536870912)) {
            return true;
        }
        long j = this.U1;
        if (j == -9223372036854775807L || j - (cr2Var.C - this.U0.c) <= 100000) {
            return true;
        }
        return false;
    }

    public final void L0() {
        if (this.D1 > 0) {
            this.C.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.C1;
            int i = this.D1;
            b60 b60Var = this.g1;
            Handler handler = b60Var.a;
            if (handler != null) {
                handler.post(new u9d(b60Var, i, j));
            }
            this.D1 = 0;
            this.C1 = elapsedRealtime;
        }
    }

    public final void M0() {
        d47 d47Var;
        if (this.P1 && (d47Var = this.j0) != null) {
            this.R1 = new t47(this, d47Var);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                d47Var.b(bundle);
            }
        }
    }

    public final void N0(d47 d47Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        d47Var.i(i, j);
        Trace.endSection();
        this.T0.e++;
        boolean z = false;
        this.E1 = 0;
        if (this.s1 == null) {
            uad uadVar = this.M1;
            boolean equals = uadVar.equals(uad.d);
            b60 b60Var = this.g1;
            if (!equals && !uadVar.equals(this.N1)) {
                this.N1 = uadVar;
                b60Var.b(uadVar);
            }
            q8d q8dVar = this.j1;
            if (q8dVar.e != 3) {
                z = true;
            }
            q8dVar.e = 3;
            q8dVar.l.getClass();
            q8dVar.g = a2d.Q(SystemClock.elapsedRealtime());
            if (z && (surface = this.w1) != null) {
                Handler handler = b60Var.a;
                if (handler != null) {
                    handler.post(new n92(b60Var, surface, SystemClock.elapsedRealtime()));
                }
                this.z1 = true;
            }
        }
    }

    public final void O0(Object obj) {
        Surface surface;
        Handler handler;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            surface = null;
        }
        Surface surface2 = this.w1;
        b60 b60Var = this.g1;
        if (surface2 != surface) {
            this.w1 = surface;
            tad tadVar = this.s1;
            q8d q8dVar = this.j1;
            if (tadVar == null) {
                q8dVar.g(surface);
            }
            this.z1 = false;
            int i = this.D;
            d47 d47Var = this.j0;
            if (d47Var != null && this.s1 == null) {
                h47 h47Var = this.q0;
                h47Var.getClass();
                if (J0(h47Var) && !this.q1) {
                    Surface I0 = I0(h47Var);
                    if (I0 != null) {
                        d47Var.n(I0);
                    } else if (Build.VERSION.SDK_INT >= 35) {
                        d47Var.h();
                    } else {
                        vm1.d();
                        return;
                    }
                } else {
                    o0();
                    Y();
                }
            }
            if (surface != null) {
                uad uadVar = this.N1;
                if (uadVar != null) {
                    b60Var.b(uadVar);
                }
            } else {
                this.N1 = null;
                tad tadVar2 = this.s1;
                if (tadVar2 != null) {
                    tadVar2.l();
                }
            }
            if (i == 2) {
                tad tadVar3 = this.s1;
                if (tadVar3 != null) {
                    tadVar3.s(true);
                } else {
                    q8dVar.c(true);
                }
            }
            M0();
        } else if (surface != null) {
            uad uadVar2 = this.N1;
            if (uadVar2 != null) {
                b60Var.b(uadVar2);
            }
            Surface surface3 = this.w1;
            if (surface3 != null && this.z1 && (handler = b60Var.a) != null) {
                handler.post(new n92(b60Var, surface3, SystemClock.elapsedRealtime()));
            }
        }
    }

    @Override // defpackage.k47
    public final int P(cr2 cr2Var) {
        if (Build.VERSION.SDK_INT >= 34) {
            if ((this.G1 != null || this.P1) && cr2Var.C < this.H && !K0(cr2Var)) {
                return 32;
            }
            return 0;
        }
        return 0;
    }

    public final boolean P0(long j, long j2, boolean z, boolean z2) {
        if (this.s1 != null && this.f1) {
            j2 -= -this.T1;
        }
        if (j < -500000 && !z) {
            gx9 gx9Var = this.E;
            gx9Var.getClass();
            int m = gx9Var.m(j2 - this.G);
            if (m != 0) {
                this.H1 = j2;
                ar2 ar2Var = this.T0;
                PriorityQueue priorityQueue = this.o1;
                if (z2) {
                    int i = ar2Var.d + m;
                    ar2Var.d = i;
                    ar2Var.f += this.F1;
                    ar2Var.d = priorityQueue.size() + i;
                } else {
                    ar2Var.j++;
                    S0(priorityQueue.size() + m, this.F1);
                }
                if (this.j0 != null) {
                    if (y0()) {
                        o0();
                        Y();
                    } else if (w0()) {
                        N();
                    } else {
                        this.Y0 = true;
                    }
                }
                tad tadVar = this.s1;
                if (tadVar != null) {
                    tadVar.p(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.k47
    public final float Q(float f, vq4 vq4Var, vq4[] vq4VarArr) {
        float f2;
        h47 h47Var;
        float f3 = -1.0f;
        for (vq4 vq4Var2 : vq4VarArr) {
            float f4 = vq4Var2.z;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        if (f3 == -1.0f) {
            f2 = -1.0f;
        } else {
            f2 = f3 * f;
        }
        if (this.G1 != null && (h47Var = this.q0) != null) {
            int i = vq4Var.v;
            int i2 = vq4Var.w;
            float f5 = -3.4028235E38f;
            if (h47Var.i) {
                float f6 = h47Var.l;
                if (f6 != -3.4028235E38f && h47Var.j == i && h47Var.k == i2) {
                    f5 = f6;
                } else {
                    f5 = 1024.0f;
                    if (!h47Var.g(i, i2, 1024.0d)) {
                        float f7 = nae.e;
                        while (true) {
                            float f8 = f5 - f7;
                            if (Math.abs(f8) <= 5.0f) {
                                break;
                            }
                            float f9 = (f8 / 2.0f) + f7;
                            if (h47Var.g(i, i2, f9)) {
                                f7 = f9;
                            } else {
                                f5 = f9;
                            }
                        }
                        f5 = f7;
                    }
                    h47Var.l = f5;
                    h47Var.j = i;
                    h47Var.k = i2;
                }
            }
            if (f2 != -1.0f) {
                return Math.max(f2, f5);
            }
            return f5;
        }
        return f2;
    }

    public final boolean Q0(h47 h47Var) {
        if (!this.P1 && !E0(h47Var.a)) {
            if (!h47Var.f || sw8.b(this.e1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.k47
    public final ArrayList R(sz0 sz0Var, vq4 vq4Var, boolean z) {
        boolean z2 = this.P1;
        Context context = this.e1;
        List G0 = G0(context, sz0Var, vq4Var, z, z2);
        HashMap hashMap = o47.a;
        ArrayList arrayList = new ArrayList(G0);
        Collections.sort(arrayList, new oo1(new iu1(7, context, vq4Var), 4));
        return arrayList;
    }

    public final void R0(d47 d47Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        d47Var.e(i);
        Trace.endSection();
        this.T0.f++;
    }

    public final void S0(int i, int i2) {
        ar2 ar2Var = this.T0;
        ar2Var.h += i;
        int i3 = i + i2;
        ar2Var.g += i3;
        this.D1 += i3;
        int i4 = this.E1 + i3;
        this.E1 = i4;
        ar2Var.i = Math.max(i4, ar2Var.i);
        int i5 = this.h1;
        if (i5 > 0 && this.D1 >= i5) {
            L0();
        }
    }

    public final void T0(e67 e67Var) {
        aac aacVar = this.L;
        if (aacVar.p()) {
            this.U1 = -9223372036854775807L;
            return;
        }
        int b = aacVar.b(e67Var.a);
        if (b == -1) {
            this.U1 = -9223372036854775807L;
        } else {
            this.U1 = aacVar.f(b, new y9c(), false).d;
        }
    }

    @Override // defpackage.k47
    public final yv U(h47 h47Var, vq4 vq4Var, MediaCrypto mediaCrypto, float f) {
        gm1 gm1Var;
        int i;
        c4 c4Var;
        boolean z;
        int i2;
        int i3;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i4;
        int i5;
        char c;
        boolean z2;
        int i6;
        boolean z3;
        Pair b;
        int F0;
        String str = h47Var.c;
        vq4[] vq4VarArr = this.F;
        vq4VarArr.getClass();
        int i7 = vq4Var.v;
        float f2 = vq4Var.z;
        gm1 gm1Var2 = vq4Var.E;
        int i8 = vq4Var.w;
        int H0 = H0(h47Var, vq4Var);
        if (vq4VarArr.length == 1) {
            if (H0 != -1 && (F0 = F0(h47Var, vq4Var)) != -1) {
                H0 = Math.min((int) (H0 * 1.5f), F0);
            }
            c4Var = new c4(i7, i8, H0);
            gm1Var = gm1Var2;
            i = i8;
        } else {
            int length = vq4VarArr.length;
            int i9 = i7;
            int i10 = i8;
            int i11 = 0;
            boolean z4 = false;
            while (i11 < length) {
                vq4 vq4Var2 = vq4VarArr[i11];
                vq4[] vq4VarArr2 = vq4VarArr;
                if (gm1Var2 != null && vq4Var2.E == null) {
                    uq4 a = vq4Var2.a();
                    a.D = gm1Var2;
                    vq4Var2 = new vq4(a);
                }
                er2 b2 = h47Var.b(vq4Var, vq4Var2);
                int i12 = length;
                int i13 = vq4Var2.w;
                if (b2.d != 0) {
                    int i14 = vq4Var2.v;
                    i5 = i11;
                    c = 65535;
                    if (i14 != -1 && i13 != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    z4 |= z2;
                    i9 = Math.max(i9, i14);
                    i10 = Math.max(i10, i13);
                    H0 = Math.max(H0, H0(h47Var, vq4Var2));
                } else {
                    i5 = i11;
                    c = 65535;
                }
                length = i12;
                i11 = i5 + 1;
                vq4VarArr = vq4VarArr2;
            }
            if (z4) {
                st0.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i9 + "x" + i10);
                if (i8 > i7) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i2 = i8;
                } else {
                    i2 = i7;
                }
                boolean z5 = z;
                if (z) {
                    i3 = i7;
                } else {
                    i3 = i8;
                }
                float f3 = i3 / i2;
                int i15 = 0;
                while (true) {
                    gm1Var = gm1Var2;
                    if (i15 >= 9) {
                        break;
                    }
                    int i16 = X1[i15];
                    int i17 = i15;
                    int i18 = (int) (i16 * f3);
                    if (i16 <= i2 || i18 <= i3) {
                        break;
                    }
                    if (!z5) {
                        i18 = i16;
                    }
                    if (!z5) {
                        i16 = i18;
                    }
                    int i19 = i3;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = h47Var.d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i4 = i2;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i4 = i2;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(a2d.g(i18, widthAlignment) * widthAlignment, a2d.g(i16, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i = i8;
                        if (h47Var.g(point.x, point.y, f2)) {
                            break;
                        }
                    } else {
                        i = i8;
                    }
                    i15 = i17 + 1;
                    i8 = i;
                    gm1Var2 = gm1Var;
                    i3 = i19;
                    i2 = i4;
                }
                i = i8;
                point = null;
                if (point != null) {
                    i9 = Math.max(i9, point.x);
                    i10 = Math.max(i10, point.y);
                    uq4 a2 = vq4Var.a();
                    a2.u = i9;
                    a2.v = i10;
                    H0 = Math.max(H0, F0(h47Var, new vq4(a2)));
                    st0.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i9 + "x" + i10);
                }
            } else {
                gm1Var = gm1Var2;
                i = i8;
            }
            c4Var = new c4(i9, i10, H0);
        }
        this.p1 = c4Var;
        if (this.P1) {
            i6 = this.Q1;
        } else {
            i6 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i7);
        mediaFormat.setInteger("height", i);
        h9a.S(mediaFormat, vq4Var.r);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        h9a.P(mediaFormat, "rotation-degrees", vq4Var.A);
        if (gm1Var != null) {
            gm1 gm1Var3 = gm1Var;
            h9a.P(mediaFormat, "color-transfer", gm1Var3.c);
            h9a.P(mediaFormat, "color-standard", gm1Var3.a);
            h9a.P(mediaFormat, "color-range", gm1Var3.b);
            byte[] bArr = gm1Var3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(vq4Var.o) && (b = vk1.b(vq4Var)) != null) {
            h9a.P(mediaFormat, "profile", ((Integer) b.first).intValue());
        }
        mediaFormat.setInteger("max-width", c4Var.a);
        mediaFormat.setInteger("max-height", c4Var.b);
        h9a.P(mediaFormat, "max-input-size", c4Var.c);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.i1) {
            z3 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z3 = true;
        }
        if (i6 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z3);
            mediaFormat.setInteger("audio-session-id", i6);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.O1));
        }
        G(mediaFormat);
        Surface I0 = I0(h47Var);
        if (this.s1 != null && !a2d.N(this.e1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new yv(h47Var, mediaFormat, vq4Var, I0, mediaCrypto, null);
    }

    public final void U0(long j) {
        ar2 ar2Var = this.T0;
        ar2Var.k += j;
        ar2Var.l++;
        this.J1 += j;
        this.K1++;
    }

    @Override // defpackage.k47
    public final void V(cr2 cr2Var) {
        if (this.r1) {
            ByteBuffer byteBuffer = cr2Var.D;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        d47 d47Var = this.j0;
                        d47Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        d47Var.b(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.k47
    public final boolean a0(vq4 vq4Var) {
        tad tadVar = this.s1;
        if (tadVar != null && !tadVar.d()) {
            try {
                return this.s1.o(vq4Var);
            } catch (sad e) {
                throw this.g(e, vq4Var, false, 7000);
            }
        }
        return true;
    }

    @Override // defpackage.k47
    public final void b0(Exception exc) {
        st0.i("MediaCodecVideoRenderer", "Video codec error", exc);
        b60 b60Var = this.g1;
        Handler handler = b60Var.a;
        if (handler != null) {
            handler.post(new u9d(b60Var, exc, 1));
        }
    }

    @Override // defpackage.k47
    public final void c0(long j, long j2, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        b60 b60Var = this.g1;
        Handler handler = b60Var.a;
        if (handler != null) {
            str2 = str;
            handler.post(new u9d(b60Var, str2, j, j2));
        } else {
            str2 = str;
        }
        this.q1 = E0(str2);
        h47 h47Var = this.q0;
        h47Var.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(h47Var.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = h47Var.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.r1 = z;
        M0();
    }

    @Override // defpackage.k47, defpackage.ei0, defpackage.b09
    public final void d(int i, Object obj) {
        boolean z;
        boolean z2 = true;
        if (i != 1) {
            if (i != 7) {
                if (i != 10) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 13) {
                                if (i != 14) {
                                    switch (i) {
                                        case 16:
                                            obj.getClass();
                                            this.O1 = ((Integer) obj).intValue();
                                            d47 d47Var = this.j0;
                                            if (d47Var != null && Build.VERSION.SDK_INT >= 35) {
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("importance", Math.max(0, -this.O1));
                                                d47Var.b(bundle);
                                                return;
                                            }
                                            return;
                                        case 17:
                                            Surface surface = this.w1;
                                            O0(null);
                                            obj.getClass();
                                            ((u47) obj).d(1, surface);
                                            return;
                                        case 18:
                                            if (this.G1 != null) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            u3a u3aVar = (u3a) obj;
                                            this.G1 = u3aVar;
                                            if (u3aVar == null) {
                                                z2 = false;
                                            }
                                            if (z != z2) {
                                                B0(this.k0);
                                                return;
                                            }
                                            return;
                                        default:
                                            super.d(i, obj);
                                            return;
                                    }
                                }
                                obj.getClass();
                                bna bnaVar = (bna) obj;
                                if (bnaVar.a != 0 && bnaVar.b != 0) {
                                    this.y1 = bnaVar;
                                    tad tadVar = this.s1;
                                    if (tadVar != null) {
                                        Surface surface2 = this.w1;
                                        surface2.getClass();
                                        tadVar.w(surface2, bnaVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            if (list.equals(p8d.a)) {
                                tad tadVar2 = this.s1;
                                if (tadVar2 != null && tadVar2.d()) {
                                    this.s1.v();
                                    return;
                                }
                                return;
                            }
                            this.v1 = list;
                            tad tadVar3 = this.s1;
                            if (tadVar3 != null) {
                                tadVar3.q(list);
                                return;
                            }
                            return;
                        }
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        this.B1 = intValue;
                        tad tadVar4 = this.s1;
                        if (tadVar4 != null) {
                            tadVar4.k(intValue);
                            return;
                        }
                        v8d v8dVar = this.j1.b;
                        if (v8dVar.j != intValue) {
                            v8dVar.j = intValue;
                            v8dVar.d(true);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    int intValue2 = ((Integer) obj).intValue();
                    this.A1 = intValue2;
                    d47 d47Var2 = this.j0;
                    if (d47Var2 != null) {
                        d47Var2.l(intValue2);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue3 = ((Integer) obj).intValue();
                if (this.Q1 != intValue3) {
                    this.Q1 = intValue3;
                    if (this.P1) {
                        o0();
                        return;
                    }
                    return;
                }
                return;
            }
            obj.getClass();
            o8d o8dVar = (o8d) obj;
            this.S1 = o8dVar;
            tad tadVar5 = this.s1;
            if (tadVar5 != null) {
                tadVar5.u(o8dVar);
                return;
            }
            return;
        }
        O0(obj);
    }

    @Override // defpackage.k47
    public final void d0(uk1 uk1Var) {
        b60 b60Var = this.g1;
        Handler handler = b60Var.a;
        if (handler != null) {
            handler.post(new ex2(28, b60Var, uk1Var));
        }
    }

    @Override // defpackage.k47
    public final void e0(String str) {
        b60 b60Var = this.g1;
        Handler handler = b60Var.a;
        if (handler != null) {
            handler.post(new u9d(b60Var, str, 2));
        }
    }

    @Override // defpackage.k47
    public final er2 f0(s6f s6fVar) {
        er2 f0 = super.f0(s6fVar);
        vq4 vq4Var = (vq4) s6fVar.b;
        vq4Var.getClass();
        b60 b60Var = this.g1;
        Handler handler = b60Var.a;
        if (handler != null) {
            handler.post(new v9d(b60Var, vq4Var, f0));
        }
        r8d r8dVar = this.n1;
        if (r8dVar != null) {
            r8dVar.b();
        }
        return f0;
    }

    @Override // defpackage.k47
    public final void g0(vq4 vq4Var, MediaFormat mediaFormat) {
        boolean z;
        int integer;
        int integer2;
        int i;
        int i2;
        d47 d47Var = this.j0;
        if (d47Var != null) {
            d47Var.l(this.A1);
        }
        if (this.P1) {
            i2 = vq4Var.v;
            i = vq4Var.w;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i3 = integer;
            i = integer2;
            i2 = i3;
        }
        float f = vq4Var.B;
        int i4 = vq4Var.A;
        if (i4 == 90 || i4 == 270) {
            f = 1.0f / f;
            int i5 = i;
            i = i2;
            i2 = i5;
        }
        this.M1 = new uad(f, i2, i);
        tad tadVar = this.s1;
        if (tadVar != null && this.V1) {
            uq4 a = vq4Var.a();
            a.u = i2;
            a.v = i;
            a.A = f;
            vq4 vq4Var2 = new vq4(a);
            int i6 = this.u1;
            List list = this.v1;
            if (list == null) {
                ms5 ms5Var = qs5.b;
                list = mm9.e;
            }
            tadVar.h(vq4Var2, this.U0.b, i6, list);
            this.u1 = 2;
        } else {
            this.j1.f(vq4Var.z);
        }
        this.V1 = false;
    }

    @Override // defpackage.ei0
    public final void h() {
        tad tadVar = this.s1;
        if (tadVar != null) {
            int i = this.u1;
            if (i != 0 && i != 1) {
                tadVar.x();
                return;
            } else {
                this.u1 = 0;
                return;
            }
        }
        q8d q8dVar = this.j1;
        if (q8dVar.e == 0) {
            q8dVar.e = 1;
        }
    }

    @Override // defpackage.k47
    public final void i0(long j) {
        super.i0(j);
        if (!this.P1) {
            this.F1--;
        }
    }

    @Override // defpackage.k47
    public final void j0() {
        tad tadVar = this.s1;
        if (tadVar != null) {
            tadVar.j();
            if (this.T1 == -9223372036854775807L) {
                this.T1 = this.U0.b;
            }
            this.s1.i(-this.T1);
        } else {
            this.j1.e(2);
        }
        this.V1 = true;
        M0();
    }

    @Override // defpackage.ei0
    public final String k() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.k47
    public final void k0(cr2 cr2Var) {
        ByteBuffer byteBuffer;
        s6f s6fVar = this.l1;
        if (s6fVar != null) {
            h47 h47Var = this.q0;
            h47Var.getClass();
            if (h47Var.b.equals("video/av01") && cr2Var.h(1) && (byteBuffer = cr2Var.e) != null) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer2 = (ByteBuffer) s6fVar.a;
                byteBuffer2.clear();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.flip();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
        this.W1 = 0;
        int P = P(cr2Var);
        if ((Build.VERSION.SDK_INT < 34 || (P & 32) == 0) && !this.P1) {
            this.F1++;
        }
    }

    @Override // defpackage.ei0
    public final boolean m() {
        if (this.P0) {
            tad tadVar = this.s1;
            if (tadVar == null || tadVar.c()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.k47
    public final boolean m0(long j, long j2, d47 d47Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, vq4 vq4Var) {
        int i4;
        d47Var.getClass();
        long j4 = j3 - this.U0.c;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.o1;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            i5++;
            priorityQueue.poll();
        }
        S0(i5, 0);
        tad tadVar = this.s1;
        if (tadVar != null) {
            if (z && !z2) {
                R0(d47Var, i);
                return true;
            }
            return tadVar.n(j3, new r47(this, d47Var, i, j4));
        }
        int a = this.j1.a(j3, j, j2, this.U0.b, z, z2, this.k1);
        od0 od0Var = this.k1;
        r8d r8dVar = this.n1;
        if (r8dVar != null && a != 5 && a != 4) {
            r8dVar.a(j3, od0Var.b);
        }
        if (a != 0) {
            if (a != 1) {
                if (a != 2) {
                    if (a != 3) {
                        if (a != 4 && a != 5) {
                            vs.k(String.valueOf(a));
                        }
                        return false;
                    }
                    R0(d47Var, i);
                    U0(od0Var.b);
                    return true;
                }
                Trace.beginSection("dropVideoBuffer");
                d47Var.e(i);
                Trace.endSection();
                S0(0, 1);
                U0(od0Var.b);
                return true;
            }
            long j5 = od0Var.c;
            long j6 = od0Var.b;
            if (j5 == this.L1) {
                R0(d47Var, i);
            } else {
                o8d o8dVar = this.S1;
                if (o8dVar != null) {
                    i4 = i;
                    o8dVar.c(j4, j5, vq4Var, this.l0);
                } else {
                    i4 = i;
                }
                N0(d47Var, i4, j5);
            }
            U0(j6);
            this.L1 = j5;
            return true;
        }
        this.C.getClass();
        long nanoTime = System.nanoTime();
        o8d o8dVar2 = this.S1;
        if (o8dVar2 != null) {
            o8dVar2.c(j4, nanoTime, vq4Var, this.l0);
        }
        N0(d47Var, i, nanoTime);
        U0(od0Var.b);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (android.os.SystemClock.elapsedRealtime() < r6.y0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    @Override // defpackage.ei0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o() {
        /*
            r6 = this;
            vq4 r0 = r6.a0
            r1 = 1
            if (r0 == 0) goto L3a
            boolean r0 = r6.l()
            if (r0 == 0) goto Le
            boolean r0 = r6.J
            goto L17
        Le:
            gx9 r0 = r6.E
            r0.getClass()
            boolean r0 = r0.a()
        L17:
            if (r0 != 0) goto L38
            int r0 = r6.A0
            if (r0 < 0) goto L1e
            goto L38
        L1e:
            long r2 = r6.y0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L3a
            xfb r0 = r6.C
            r0.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.y0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L3a
        L38:
            r0 = r1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            tad r2 = r6.s1
            if (r2 == 0) goto L44
            boolean r6 = r2.t(r0)
            return r6
        L44:
            if (r0 == 0) goto L4f
            d47 r2 = r6.j0
            if (r2 == 0) goto L4e
            boolean r2 = r6.P1
            if (r2 == 0) goto L4f
        L4e:
            return r1
        L4f:
            q8d r6 = r6.j1
            boolean r6 = r6.b(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u47.o():boolean");
    }

    @Override // defpackage.k47, defpackage.ei0
    public final void p() {
        b60 b60Var = this.g1;
        this.N1 = null;
        this.U1 = -9223372036854775807L;
        M0();
        this.z1 = false;
        this.R1 = null;
        this.I1 = true;
        try {
            super.p();
            ar2 ar2Var = this.T0;
            b60Var.getClass();
            synchronized (ar2Var) {
            }
            Handler handler = b60Var.a;
            if (handler != null) {
                handler.post(new v9d(1, b60Var, ar2Var));
            }
            b60Var.b(uad.d);
        } catch (Throwable th) {
            ar2 ar2Var2 = this.T0;
            b60Var.getClass();
            synchronized (ar2Var2) {
                Handler handler2 = b60Var.a;
                if (handler2 != null) {
                    handler2.post(new v9d(1, b60Var, ar2Var2));
                }
                b60Var.b(uad.d);
                throw th;
            }
        }
    }

    @Override // defpackage.k47
    public final void p0() {
        tad tadVar = this.s1;
        if (tadVar != null) {
            tadVar.j();
        } else {
            long j = this.U0.f;
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [ar2, java.lang.Object] */
    @Override // defpackage.ei0
    public final void q(boolean z, boolean z2) {
        boolean z3;
        tad tadVar;
        this.T0 = new Object();
        ao9 ao9Var = this.d;
        ao9Var.getClass();
        boolean z4 = ao9Var.b;
        if (z4 && this.Q1 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        wq9.D(z3);
        if (this.P1 != z4) {
            this.P1 = z4;
            o0();
        }
        ar2 ar2Var = this.T0;
        b60 b60Var = this.g1;
        Handler handler = b60Var.a;
        if (handler != null) {
            handler.post(new u9d(b60Var, ar2Var, 5));
        }
        boolean z5 = this.t1;
        q8d q8dVar = this.j1;
        if (!z5) {
            if (this.v1 != null && this.s1 == null) {
                sy8 sy8Var = new sy8(this.e1, q8dVar);
                sy8Var.d = true;
                long j = this.m1;
                long j2 = -9223372036854775807L;
                if (j != -9223372036854775807L) {
                    j2 = -j;
                }
                sy8Var.g = j2;
                xfb xfbVar = this.C;
                xfbVar.getClass();
                sy8Var.e = xfbVar;
                wq9.D(!sy8Var.f);
                if (sy8Var.c == null) {
                    sy8Var.c = new vy8();
                }
                xy8 xy8Var = new xy8(sy8Var);
                sy8Var.f = true;
                if (1 >= xy8Var.p) {
                    xy8Var.p = 1;
                }
                SparseArray sparseArray = xy8Var.c;
                if (a2d.k(sparseArray, 0)) {
                    tadVar = (tad) sparseArray.get(0);
                } else {
                    ty8 ty8Var = new ty8(xy8Var, xy8Var.a);
                    xy8Var.g.add(ty8Var);
                    sparseArray.put(0, ty8Var);
                    tadVar = ty8Var;
                }
                this.s1 = tadVar;
            }
            this.t1 = true;
        }
        tad tadVar2 = this.s1;
        if (tadVar2 != null) {
            tadVar2.m(new q47(this));
            o8d o8dVar = this.S1;
            if (o8dVar != null) {
                this.s1.u(o8dVar);
            }
            if (this.w1 != null && !this.y1.equals(bna.c)) {
                this.s1.w(this.w1, this.y1);
            }
            this.s1.k(this.B1);
            this.s1.b(this.h0);
            List list = this.v1;
            if (list != null) {
                this.s1.q(list);
            }
            this.u1 = !z2 ? 1 : 0;
            this.X0 = true;
            return;
        }
        xfb xfbVar2 = this.C;
        xfbVar2.getClass();
        q8dVar.l = xfbVar2;
        q8dVar.e(!z2 ? 1 : 0);
    }

    @Override // defpackage.k47, defpackage.ei0
    public final void r(long j, boolean z, boolean z2) {
        tad tadVar = this.s1;
        if (tadVar != null && !z) {
            tadVar.p(true);
        }
        if (z2) {
            this.H1 = j;
        }
        super.r(j, z, z2);
        tad tadVar2 = this.s1;
        q8d q8dVar = this.j1;
        if (tadVar2 == null) {
            q8dVar.b.b();
            q8dVar.h = -9223372036854775807L;
            q8dVar.f = -9223372036854775807L;
            q8dVar.e = Math.min(q8dVar.e, 1);
            q8dVar.i = -9223372036854775807L;
            q8dVar.n = false;
        }
        r8d r8dVar = this.n1;
        if (r8dVar != null) {
            r8dVar.b();
        }
        if (z) {
            tad tadVar3 = this.s1;
            if (tadVar3 != null) {
                tadVar3.s(false);
            } else {
                q8dVar.c(false);
            }
        }
        M0();
        this.E1 = 0;
    }

    @Override // defpackage.k47
    public final void r0() {
        super.r0();
        this.o1.clear();
        this.F1 = 0;
        this.W1 = 0;
        this.I1 = false;
        s6f s6fVar = this.l1;
        if (s6fVar != null) {
            s6fVar.b = null;
            ByteBuffer byteBuffer = (ByteBuffer) s6fVar.a;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override // defpackage.ei0
    public final void s() {
        tad tadVar = this.s1;
        if (tadVar != null && this.f1) {
            tadVar.a();
        }
    }

    @Override // defpackage.ei0
    public final void t() {
        try {
            this.D0 = false;
            q0();
            o0();
            mu9 mu9Var = this.d0;
            if (mu9Var != null) {
                mu9Var.y(null);
            }
            this.d0 = null;
        } finally {
            this.t1 = false;
            this.T1 = -9223372036854775807L;
            sw8 sw8Var = this.x1;
            if (sw8Var != null) {
                sw8Var.release();
                this.x1 = null;
            }
        }
    }

    @Override // defpackage.ei0
    public final void u() {
        this.D1 = 0;
        this.C.getClass();
        this.C1 = SystemClock.elapsedRealtime();
        this.J1 = 0L;
        this.K1 = 0;
        tad tadVar = this.s1;
        if (tadVar != null) {
            tadVar.g();
        } else {
            this.j1.d();
        }
    }

    @Override // defpackage.ei0
    public final void v() {
        L0();
        int i = this.K1;
        if (i != 0) {
            long j = this.J1;
            b60 b60Var = this.g1;
            Handler handler = b60Var.a;
            if (handler != null) {
                handler.post(new u9d(b60Var, j, i));
            }
            this.J1 = 0L;
            this.K1 = 0;
        }
        tad tadVar = this.s1;
        if (tadVar != null) {
            tadVar.f();
        } else {
            q8d q8dVar = this.j1;
            q8dVar.d = false;
            q8dVar.i = -9223372036854775807L;
            v8d v8dVar = q8dVar.b;
            v8dVar.d = false;
            s8d s8dVar = v8dVar.c;
            if (s8dVar != null) {
                s8dVar.b();
            }
            v8dVar.a();
        }
        r8d r8dVar = this.n1;
        if (r8dVar != null) {
            r8dVar.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f4, code lost:
        if ((r7 + 1) < 8) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f7, code lost:
        if (r7 < 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f9, code lost:
        r2 = ((defpackage.w78) r3.get(r7)).b.limit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0106, code lost:
        r2 = r5.position();
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013e  */
    @Override // defpackage.k47
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v0(defpackage.cr2 r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u47.v0(cr2):boolean");
    }

    @Override // defpackage.k47, defpackage.ei0
    public final void w(vq4[] vq4VarArr, long j, long j2, e67 e67Var) {
        super.w(vq4VarArr, j, j2, e67Var);
        T0(e67Var);
        r8d r8dVar = this.n1;
        if (r8dVar != null) {
            r8dVar.b();
        }
    }

    @Override // defpackage.k47
    public final boolean w0() {
        boolean z;
        vq4 vq4Var = this.k0;
        long j = this.U1;
        if (j != -9223372036854775807L) {
            if (this.Z0 + 1 + j <= Long.MAX_VALUE - (this.U0.c + j)) {
                z = false;
                if (this.G1 != null && !this.I1 && !this.P1 && ((vq4Var == null || vq4Var.q <= 0) && !z && this.U0.f == -9223372036854775807L)) {
                    return false;
                }
                return true;
            }
        }
        z = true;
        if (this.G1 != null) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ei0
    public final void x() {
        e67 e67Var = this.M;
        if (e67Var != null) {
            T0(e67Var);
        }
    }

    @Override // defpackage.k47
    public final boolean x0(h47 h47Var) {
        return J0(h47Var);
    }

    @Override // defpackage.k47
    public final boolean y0() {
        h47 h47Var = this.q0;
        if (this.s1 != null && h47Var != null) {
            String str = h47Var.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.y0();
    }

    @Override // defpackage.k47, defpackage.ei0
    public final void z(long j, long j2) {
        tad tadVar = this.s1;
        if (tadVar != null) {
            try {
                tadVar.r(j, j2);
            } catch (sad e) {
                throw g(e, e.a, false, 7001);
            }
        }
        super.z(j, j2);
    }
}
