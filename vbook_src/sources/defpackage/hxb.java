package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hxb  reason: default package */
/* loaded from: classes.dex */
public final class hxb extends ei0 implements Handler.Callback {
    public final abf O;
    public final cr2 P;
    public vd2 Q;
    public final a8b R;
    public boolean S;
    public int T;
    public y7b U;
    public e8b V;
    public ha1 W;
    public ha1 X;
    public int Y;
    public final Handler Z;
    public final c04 a0;
    public final s6f b0;
    public boolean c0;
    public boolean d0;
    public vq4 e0;
    public long f0;
    public long g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v5, types: [s6f, java.lang.Object] */
    public hxb(c04 c04Var, Looper looper) {
        super(3);
        Handler handler;
        k57 k57Var = a8b.q;
        this.a0 = c04Var;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.Z = handler;
        this.R = k57Var;
        this.O = new abf(20);
        this.P = new cr2(1);
        this.b0 = new Object();
        this.g0 = -9223372036854775807L;
        this.f0 = -9223372036854775807L;
    }

    @Override // defpackage.ei0
    public final int D(vq4 vq4Var) {
        int i;
        boolean equals = Objects.equals(vq4Var.o, "application/x-media3-cues");
        String str = vq4Var.o;
        if (!equals) {
            k57 k57Var = (k57) this.R;
            k57Var.getClass();
            if (!((abf) k57Var.b).c(vq4Var) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                if (lc7.n(str)) {
                    return ei0.f(1, 0, 0, 0);
                }
                return ei0.f(0, 0, 0, 0);
            }
        }
        if (vq4Var.P == 0) {
            i = 4;
        } else {
            i = 2;
        }
        return ei0.f(i, 0, 0, 0);
    }

    public final void G() {
        boolean z;
        if (!Objects.equals(this.e0.o, "application/cea-608") && !Objects.equals(this.e0.o, "application/x-mp4-cea-608") && !Objects.equals(this.e0.o, "application/cea-708")) {
            z = false;
        } else {
            z = true;
        }
        String str = this.e0.o;
        if (z) {
            return;
        }
        vs.k(hma.v("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final long H() {
        if (this.Y == -1) {
            return Long.MAX_VALUE;
        }
        this.W.getClass();
        if (this.Y >= this.W.g()) {
            return Long.MAX_VALUE;
        }
        return this.W.c(this.Y);
    }

    public final long I(long j) {
        boolean z;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        return j - this.G;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r3.equals("application/cea-608") == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J() {
        /*
            r7 = this;
            r0 = 1
            r7.S = r0
            vq4 r1 = r7.e0
            r1.getClass()
            a8b r2 = r7.R
            k57 r2 = (defpackage.k57) r2
            java.lang.Object r2 = r2.b
            abf r2 = (defpackage.abf) r2
            java.lang.String r3 = r1.o
            int r4 = r1.L
            if (r3 == 0) goto L50
            int r5 = r3.hashCode()
            r6 = -1
            switch(r5) {
                case 930165504: goto L34;
                case 1566015601: goto L2b;
                case 1566016562: goto L20;
                default: goto L1e;
            }
        L1e:
            r0 = r6
            goto L3e
        L20:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L29
            goto L1e
        L29:
            r0 = 2
            goto L3e
        L2b:
            java.lang.String r5 = "application/cea-608"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L3e
            goto L1e
        L34:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3d
            goto L1e
        L3d:
            r0 = 0
        L3e:
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L4a;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L50
        L42:
            fa1 r0 = new fa1
            java.util.List r1 = r1.r
            r0.<init>(r4, r1)
            goto L6d
        L4a:
            ba1 r0 = new ba1
            r0.<init>(r3, r4)
            goto L6d
        L50:
            boolean r0 = r2.c(r1)
            if (r0 == 0) goto L75
            o8b r0 = r2.f(r1)
            x03 r1 = new x03
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6d:
            r7.U = r0
            long r1 = r7.H
            r0.b(r1)
            return
        L75:
            java.lang.String r7 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r7 = defpackage.s21.m(r7, r3)
            defpackage.vs.m(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxb.J():void");
    }

    public final void K(ud2 ud2Var) {
        mm9 mm9Var = ud2Var.a;
        c04 c04Var = this.a0;
        c04Var.a.m.e(27, new hs2(mm9Var));
        i04 i04Var = c04Var.a;
        i04Var.g0 = ud2Var;
        i04Var.m.e(27, new q6(ud2Var, 16));
    }

    public final void L() {
        this.V = null;
        this.Y = -1;
        ha1 ha1Var = this.W;
        if (ha1Var != null) {
            ha1Var.o();
            this.W = null;
        }
        ha1 ha1Var2 = this.X;
        if (ha1Var2 != null) {
            ha1Var2.o();
            this.X = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            K((ud2) message.obj);
            return true;
        }
        vm1.d();
        return false;
    }

    @Override // defpackage.ei0
    public final String k() {
        return "TextRenderer";
    }

    @Override // defpackage.ei0
    public final boolean m() {
        return this.d0;
    }

    @Override // defpackage.ei0
    public final boolean o() {
        vq4 vq4Var = this.e0;
        if (vq4Var != null) {
            if (Objects.equals(vq4Var.o, "application/x-media3-cues")) {
                vd2 vd2Var = this.Q;
                vd2Var.getClass();
                if (vd2Var.a(this.f0) == Long.MIN_VALUE) {
                    try {
                        gx9 gx9Var = this.E;
                        gx9Var.getClass();
                        gx9Var.b();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else if (!this.d0) {
                if (this.c0) {
                    ha1 ha1Var = this.W;
                    long j = this.f0;
                    if (ha1Var == null || ha1Var.g() <= 0 || ha1Var.c(ha1Var.g() - 1) <= j) {
                        ha1 ha1Var2 = this.X;
                        long j2 = this.f0;
                        if ((ha1Var2 == null || ha1Var2.g() <= 0 || ha1Var2.c(ha1Var2.g() - 1) <= j2) && this.V != null) {
                            return false;
                        }
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ei0
    public final void p() {
        this.e0 = null;
        this.g0 = -9223372036854775807L;
        mm9 mm9Var = mm9.e;
        I(this.f0);
        ud2 ud2Var = new ud2(mm9Var);
        Handler handler = this.Z;
        if (handler != null) {
            handler.obtainMessage(1, ud2Var).sendToTarget();
        } else {
            K(ud2Var);
        }
        this.f0 = -9223372036854775807L;
        if (this.U != null) {
            L();
            y7b y7bVar = this.U;
            y7bVar.getClass();
            y7bVar.a();
            this.U = null;
            this.T = 0;
        }
    }

    @Override // defpackage.ei0
    public final void r(long j, boolean z, boolean z2) {
        this.f0 = j;
        vd2 vd2Var = this.Q;
        if (vd2Var != null) {
            vd2Var.clear();
        }
        mm9 mm9Var = mm9.e;
        I(this.f0);
        ud2 ud2Var = new ud2(mm9Var);
        Handler handler = this.Z;
        if (handler != null) {
            handler.obtainMessage(1, ud2Var).sendToTarget();
        } else {
            K(ud2Var);
        }
        this.c0 = false;
        this.d0 = false;
        this.g0 = -9223372036854775807L;
        vq4 vq4Var = this.e0;
        if (vq4Var != null && !Objects.equals(vq4Var.o, "application/x-media3-cues")) {
            if (this.T != 0) {
                L();
                y7b y7bVar = this.U;
                y7bVar.getClass();
                y7bVar.a();
                this.U = null;
                this.T = 0;
                J();
                return;
            }
            L();
            y7b y7bVar2 = this.U;
            y7bVar2.getClass();
            y7bVar2.flush();
            y7bVar2.b(this.H);
        }
    }

    @Override // defpackage.ei0
    public final void w(vq4[] vq4VarArr, long j, long j2, e67 e67Var) {
        vd2 l25Var;
        vq4 vq4Var = vq4VarArr[0];
        this.e0 = vq4Var;
        if (!Objects.equals(vq4Var.o, "application/x-media3-cues")) {
            G();
            if (this.U != null) {
                this.T = 1;
                return;
            } else {
                J();
                return;
            }
        }
        if (this.e0.M == 1) {
            l25Var = new u97();
        } else {
            l25Var = new l25();
        }
        this.Q = l25Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0239 A[EXC_TOP_SPLITTER, LOOP:2: B:139:0x0239->B:153:0x0239, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e9  */
    @Override // defpackage.ei0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxb.z(long, long):void");
    }
}
