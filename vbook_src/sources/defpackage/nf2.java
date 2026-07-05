package defpackage;

import java.io.IOException;
import java.util.ConcurrentModificationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nf2  reason: default package */
/* loaded from: classes.dex */
public final class nf2 implements es6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ nf2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.es6
    public final void f(gs6 gs6Var, long j, long j2, boolean z) {
        switch (this.a) {
            case 0:
                ((of2) this.b).v((bn8) gs6Var, j, j2);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.es6
    public final void i(gs6 gs6Var, long j, long j2) {
        boolean z;
        switch (this.a) {
            case 0:
                bn8 bn8Var = (bn8) gs6Var;
                of2 of2Var = (of2) this.b;
                long j3 = bn8Var.a;
                mg2 mg2Var = bn8Var.b;
                h0b h0bVar = bn8Var.d;
                cs6 cs6Var = new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
                of2Var.m.getClass();
                of2Var.q.d(cs6Var, bn8Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                of2Var.K = ((Long) bn8Var.f).longValue() - j;
                of2Var.x(true);
                return;
            default:
                fz4 fz4Var = (fz4) this.b;
                synchronized (iwe.c) {
                    z = iwe.d;
                }
                if (!z) {
                    ((of2) fz4Var.a).w(new IOException(new ConcurrentModificationException()));
                    return;
                }
                fz4Var.i0();
                return;
        }
    }

    @Override // defpackage.es6
    public final cy5 w(gs6 gs6Var, long j, long j2, IOException iOException, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                bn8 bn8Var = (bn8) gs6Var;
                of2 of2Var = (of2) obj;
                cl3 cl3Var = of2Var.q;
                long j3 = bn8Var.a;
                mg2 mg2Var = bn8Var.b;
                h0b h0bVar = bn8Var.d;
                cl3Var.f(new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b), bn8Var.c, iOException, true);
                of2Var.m.getClass();
                of2Var.w(iOException);
                return ij1.G;
            default:
                ((of2) ((fz4) obj).a).w(iOException);
                return ij1.G;
        }
    }

    private final void a(gs6 gs6Var, long j, long j2, boolean z) {
    }
}
