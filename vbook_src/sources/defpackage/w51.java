package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w51  reason: default package */
/* loaded from: classes.dex */
public final class w51 extends ei0 {
    public final cr2 O;
    public final km8 P;
    public v51 Q;
    public long R;

    public w51() {
        super(6);
        this.O = new cr2(1);
        this.P = new km8();
    }

    @Override // defpackage.ei0
    public final int D(vq4 vq4Var) {
        if ("application/x-camera-motion".equals(vq4Var.o)) {
            return ei0.f(4, 0, 0, 0);
        }
        return ei0.f(0, 0, 0, 0);
    }

    @Override // defpackage.ei0, defpackage.b09
    public final void d(int i, Object obj) {
        if (i == 8) {
            this.Q = (v51) obj;
        }
    }

    @Override // defpackage.ei0
    public final String k() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.ei0
    public final boolean m() {
        return l();
    }

    @Override // defpackage.ei0
    public final boolean o() {
        return true;
    }

    @Override // defpackage.ei0
    public final void p() {
        v51 v51Var = this.Q;
        if (v51Var != null) {
            v51Var.b();
        }
    }

    @Override // defpackage.ei0
    public final void r(long j, boolean z, boolean z2) {
        this.R = Long.MIN_VALUE;
        v51 v51Var = this.Q;
        if (v51Var != null) {
            v51Var.b();
        }
    }

    @Override // defpackage.ei0
    public final void z(long j, long j2) {
        boolean z;
        float[] fArr;
        while (!l() && this.R < 100000 + j) {
            cr2 cr2Var = this.O;
            cr2Var.n();
            s6f s6fVar = this.c;
            s6fVar.k();
            if (y(s6fVar, cr2Var, 0) == -4 && !cr2Var.h(4)) {
                long j3 = cr2Var.C;
                this.R = j3;
                if (j3 < this.H) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.Q != null && !z) {
                    cr2Var.q();
                    ByteBuffer byteBuffer = cr2Var.e;
                    String str = a2d.a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        km8 km8Var = this.P;
                        km8Var.K(array, limit);
                        km8Var.M(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i = 0; i < 3; i++) {
                            fArr2[i] = Float.intBitsToFloat(km8Var.o());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.Q.a(this.R - this.G, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }
}
