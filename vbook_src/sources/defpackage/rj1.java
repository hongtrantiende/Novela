package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rj1  reason: default package */
/* loaded from: classes.dex */
public final class rj1 implements gx9 {
    public final gx9 a;
    public boolean b;
    public final /* synthetic */ sj1 c;

    public rj1(sj1 sj1Var, gx9 gx9Var) {
        this.c = sj1Var;
        this.a = gx9Var;
    }

    @Override // defpackage.gx9
    public final boolean a() {
        if (!this.c.b() && this.a.a()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gx9
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.gx9
    public final int c(s6f s6fVar, cr2 cr2Var, int i) {
        sj1 sj1Var = this.c;
        if (sj1Var.b()) {
            return -3;
        }
        if (this.b) {
            cr2Var.b = 4;
            return -4;
        }
        long u = sj1Var.u();
        int c = this.a.c(s6fVar, cr2Var, i);
        if (sj1Var.e != -9223372036854775807L && c != -3) {
            sj1Var.e = -9223372036854775807L;
        }
        if (c == -5) {
            long j = sj1Var.f;
            long j2 = sj1Var.C;
            vq4 vq4Var = (vq4) s6fVar.b;
            vq4Var.getClass();
            int i2 = vq4Var.K;
            int i3 = vq4Var.J;
            if (i3 != 0 || i2 != 0) {
                if (j != 0) {
                    i3 = 0;
                }
                if (j2 != Long.MIN_VALUE) {
                    i2 = 0;
                }
                uq4 a = vq4Var.a();
                a.I = i3;
                a.J = i2;
                s6fVar.b = new vq4(a);
            }
            return -5;
        }
        long j3 = sj1Var.C;
        if (j3 != Long.MIN_VALUE && ((c == -4 && cr2Var.C >= j3) || (c == -3 && u == Long.MIN_VALUE && !cr2Var.f))) {
            cr2Var.n();
            cr2Var.b = 4;
            this.b = true;
            return -4;
        }
        return c;
    }

    @Override // defpackage.gx9
    public final int m(long j) {
        if (this.c.b()) {
            return -3;
        }
        return this.a.m(j);
    }
}
