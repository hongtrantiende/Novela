package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vx3  reason: default package */
/* loaded from: classes.dex */
public final class vx3 implements gx9 {
    public int C;
    public final vq4 a;
    public long[] c;
    public boolean d;
    public wx3 e;
    public boolean f;
    public final s6f b = new s6f(22);
    public long D = -9223372036854775807L;

    public vx3(wx3 wx3Var, vq4 vq4Var, boolean z) {
        this.a = vq4Var;
        this.e = wx3Var;
        this.c = wx3Var.b;
        d(wx3Var, z);
    }

    @Override // defpackage.gx9
    public final boolean a() {
        return true;
    }

    @Override // defpackage.gx9
    public final int c(s6f s6fVar, cr2 cr2Var, int i) {
        boolean z;
        int i2 = this.C;
        if (i2 == this.c.length) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.d) {
            cr2Var.b = 4;
            return -4;
        } else if ((i & 2) == 0 && this.f) {
            if (z) {
                return -3;
            }
            if ((i & 1) == 0) {
                this.C = i2 + 1;
            }
            if ((i & 4) == 0) {
                byte[] F = this.b.F(this.e.a[i2]);
                cr2Var.p(F.length);
                cr2Var.e.put(F);
            }
            cr2Var.C = this.c[i2];
            cr2Var.b = 1;
            return -4;
        } else {
            s6fVar.b = this.a;
            this.f = true;
            return -5;
        }
    }

    public final void d(wx3 wx3Var, boolean z) {
        long j;
        int i = this.C;
        long j2 = -9223372036854775807L;
        if (i == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.c[i - 1];
        }
        this.d = z;
        this.e = wx3Var;
        long[] jArr = wx3Var.b;
        this.c = jArr;
        long j3 = this.D;
        if (j3 != -9223372036854775807L) {
            int b = a2d.b(jArr, j3, true);
            this.C = b;
            if (this.d && b == this.c.length) {
                j2 = j3;
            }
            this.D = j2;
        } else if (j != -9223372036854775807L) {
            this.C = a2d.b(jArr, j, false);
        }
    }

    @Override // defpackage.gx9
    public final int m(long j) {
        int max = Math.max(this.C, a2d.b(this.c, j, true));
        int i = max - this.C;
        this.C = max;
        return i;
    }

    @Override // defpackage.gx9
    public final void b() {
    }
}
