package defpackage;

import android.os.Handler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xz8  reason: default package */
/* loaded from: classes.dex */
public final class xz8 implements fjc {
    public final fx9 a;
    public final s6f b = new Object();
    public final vb7 c = new cr2(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ yz8 e;

    /* JADX WARN: Type inference failed for: r2v2, types: [s6f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [cr2, vb7] */
    public xz8(yz8 yz8Var, ij1 ij1Var) {
        this.e = yz8Var;
        this.a = new fx9(ij1Var, null, null);
    }

    @Override // defpackage.fjc
    public final void a(long j, int i, int i2, int i3, ejc ejcVar) {
        long i4;
        long j2;
        this.a.a(j, i, i2, i3, ejcVar);
        while (this.a.z(false)) {
            vb7 vb7Var = this.c;
            vb7Var.n();
            if (this.a.E(this.b, vb7Var, 0, false) == -4) {
                vb7Var.q();
            } else {
                vb7Var = null;
            }
            if (vb7Var != null) {
                long j3 = vb7Var.C;
                tb7 A = this.e.c.A(vb7Var);
                if (A != null) {
                    sx3 sx3Var = (sx3) A.a[0];
                    String str = sx3Var.a;
                    String str2 = sx3Var.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j2 = a2d.T(a2d.q(sx3Var.e));
                        } catch (xm8 unused) {
                            j2 = -9223372036854775807L;
                        }
                        if (j2 != -9223372036854775807L) {
                            wz8 wz8Var = new wz8(j3, j2);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, wz8Var));
                        }
                    }
                }
            }
        }
        fx9 fx9Var = this.a;
        cx9 cx9Var = fx9Var.a;
        synchronized (fx9Var) {
            int i5 = fx9Var.s;
            if (i5 == 0) {
                i4 = -1;
            } else {
                i4 = fx9Var.i(i5);
            }
        }
        cx9Var.a(i4);
    }

    @Override // defpackage.fjc
    public final void b(km8 km8Var, int i, int i2) {
        this.a.b(km8Var, i, 0);
    }

    @Override // defpackage.fjc
    public final int c(eg2 eg2Var, int i, boolean z) {
        return this.a.c(eg2Var, i, z);
    }

    @Override // defpackage.fjc
    public final void g(vq4 vq4Var) {
        this.a.g(vq4Var);
    }
}
