package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lx3  reason: default package */
/* loaded from: classes3.dex */
public abstract class lx3 extends f82 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public rz e;

    public final void I0(wa3 wa3Var) {
        rz rzVar = this.e;
        if (rzVar == null) {
            rzVar = new rz();
            this.e = rzVar;
        }
        rzVar.addLast(wa3Var);
    }

    public final void V0(boolean z) {
        long j;
        long j2 = this.c;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        this.c = j + j2;
        if (!z) {
            this.d = true;
        }
    }

    public abstract long g1();

    @Override // defpackage.f82
    public final f82 j0(int i) {
        yte.p(i);
        return this;
    }

    public final boolean k1() {
        Object removeFirst;
        rz rzVar = this.e;
        if (rzVar != null) {
            if (rzVar.isEmpty()) {
                removeFirst = null;
            } else {
                removeFirst = rzVar.removeFirst();
            }
            wa3 wa3Var = (wa3) removeFirst;
            if (wa3Var == null) {
                return false;
            }
            wa3Var.run();
            return true;
        }
        return false;
    }

    public abstract void shutdown();

    public final void y0(boolean z) {
        long j;
        long j2 = this.c;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j3 = j2 - j;
        this.c = j3;
        if (j3 <= 0 && this.d) {
            shutdown();
        }
    }
}
