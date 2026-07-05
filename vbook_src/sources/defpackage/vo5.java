package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayDeque;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vo5  reason: default package */
/* loaded from: classes.dex */
public final class vo5 extends ei0 {
    public final ej O;
    public final cr2 P;
    public final ArrayDeque Q;
    public boolean R;
    public boolean S;
    public uo5 T;
    public long U;
    public long V;
    public int W;
    public int X;
    public vq4 Y;
    public ol0 Z;
    public cr2 a0;
    public ImageOutput b0;
    public k04 c0;
    public Bitmap d0;
    public boolean e0;
    public x91 f0;
    public x91 g0;
    public int h0;
    public boolean i0;

    public vo5(ej ejVar) {
        super(4);
        this.O = ejVar;
        this.b0 = ImageOutput.a;
        this.P = new cr2(0);
        this.T = uo5.c;
        this.Q = new ArrayDeque();
        this.V = -9223372036854775807L;
        this.U = -9223372036854775807L;
        this.W = 0;
        this.X = 1;
    }

    @Override // defpackage.ei0
    public final int D(vq4 vq4Var) {
        this.O.getClass();
        return ej.b(vq4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x015b, code lost:
        if (r14 == ((r0 * r1.N) - 1)) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G(long r13) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo5.G(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
        if (r2 == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010a, code lost:
        if (r2 == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0123  */
    /* JADX WARN: Type inference failed for: r3v6, types: [x91, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H(long r13) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo5.H(long):boolean");
    }

    public final void I() {
        if (!this.i0) {
            return;
        }
        vq4 vq4Var = this.Y;
        vq4Var.getClass();
        ej ejVar = this.O;
        ejVar.getClass();
        int b = ej.b(vq4Var);
        if (b != ei0.f(4, 0, 0, 0) && b != ei0.f(3, 0, 0, 0)) {
            throw g(new Exception("Provided decoder factory can't create decoder for format."), this.Y, false, 4005);
        }
        ol0 ol0Var = this.Z;
        if (ol0Var != null) {
            ol0Var.a();
        }
        this.Z = new ol0(ejVar.a);
        this.i0 = false;
    }

    public final void J() {
        this.a0 = null;
        this.W = 0;
        this.V = -9223372036854775807L;
        ol0 ol0Var = this.Z;
        if (ol0Var != null) {
            ol0Var.a();
            this.Z = null;
        }
    }

    @Override // defpackage.ei0, defpackage.b09
    public final void d(int i, Object obj) {
        ImageOutput imageOutput;
        if (i != 15) {
            if (i != 23) {
                return;
            }
            this.c0 = (k04) obj;
            return;
        }
        if (obj instanceof ImageOutput) {
            imageOutput = (ImageOutput) obj;
        } else {
            imageOutput = null;
        }
        if (imageOutput == null) {
            imageOutput = ImageOutput.a;
        }
        this.b0 = imageOutput;
    }

    @Override // defpackage.ei0
    public final String k() {
        return "ImageRenderer";
    }

    @Override // defpackage.ei0
    public final boolean m() {
        return this.S;
    }

    @Override // defpackage.ei0
    public final boolean o() {
        int i = this.X;
        if (i != 3) {
            if (i != 0 || !this.e0) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.ei0
    public final void p() {
        this.Y = null;
        this.T = uo5.c;
        this.Q.clear();
        J();
        this.b0.a();
    }

    @Override // defpackage.ei0
    public final void q(boolean z, boolean z2) {
        this.X = z2 ? 1 : 0;
    }

    @Override // defpackage.ei0
    public final void r(long j, boolean z, boolean z2) {
        this.X = Math.min(this.X, 1);
        this.S = false;
        this.R = false;
        this.d0 = null;
        this.f0 = null;
        this.g0 = null;
        this.e0 = false;
        this.a0 = null;
        ol0 ol0Var = this.Z;
        if (ol0Var != null) {
            ol0Var.flush();
        }
        this.Q.clear();
    }

    @Override // defpackage.ei0
    public final void s() {
        J();
    }

    @Override // defpackage.ei0
    public final void t() {
        J();
        this.X = Math.min(this.X, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r2 >= r6) goto L14;
     */
    @Override // defpackage.ei0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(defpackage.vq4[] r5, long r6, long r8, defpackage.e67 r10) {
        /*
            r4 = this;
            uo5 r5 = r4.T
            long r5 = r5.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.Q
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.V
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.U
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            uo5 r6 = new uo5
            long r0 = r4.V
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            uo5 r5 = new uo5
            r5.<init>(r0, r8)
            r4.T = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo5.w(vq4[], long, long, e67):void");
    }

    @Override // defpackage.ei0
    public final void z(long j, long j2) {
        if (!this.S) {
            if (this.Y == null) {
                s6f s6fVar = this.c;
                s6fVar.k();
                cr2 cr2Var = this.P;
                cr2Var.n();
                int y = y(s6fVar, cr2Var, 2);
                if (y == -5) {
                    vq4 vq4Var = (vq4) s6fVar.b;
                    vq4Var.getClass();
                    this.Y = vq4Var;
                    this.i0 = true;
                } else if (y == -4) {
                    wq9.D(cr2Var.h(4));
                    this.R = true;
                    this.S = true;
                    return;
                } else {
                    return;
                }
            }
            if (this.Z == null) {
                I();
            }
            try {
                Trace.beginSection("drainAndFeedDecoder");
                while (G(j)) {
                }
                while (H(j)) {
                }
                Trace.endSection();
            } catch (cn5 e) {
                throw g(e, null, false, 4003);
            }
        }
    }
}
