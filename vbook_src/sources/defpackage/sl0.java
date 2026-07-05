package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sl0  reason: default package */
/* loaded from: classes.dex */
public final class sl0 extends vk8 {
    public final long C;
    public int D;
    public final long E;
    public float F;
    public em1 G;
    public final nl5 f;

    public sl0(nl5 nl5Var, long j) {
        int i;
        this.f = nl5Var;
        this.C = j;
        this.D = 1;
        int i2 = (int) (j >> 32);
        if (i2 >= 0 && (i = (int) (4294967295L & j)) >= 0) {
            jj jjVar = (jj) nl5Var;
            if (i2 <= jjVar.a.getWidth() && i <= jjVar.a.getHeight()) {
                this.E = j;
                this.F = 1.0f;
                return;
            }
        }
        vs.m("Failed requirement.");
        throw null;
    }

    @Override // defpackage.vk8
    public final boolean d(float f) {
        this.F = f;
        return true;
    }

    @Override // defpackage.vk8
    public final boolean e(em1 em1Var) {
        this.G = em1Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sl0) {
                sl0 sl0Var = (sl0) obj;
                if (c16.i(this.f, sl0Var.f) && py5.b(0L, 0L) && zy5.b(this.C, sl0Var.C) && this.D == sl0Var.D) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.vk8
    public final long h() {
        return eg0.A(this.E);
    }

    public final int hashCode() {
        return Integer.hashCode(this.D) + hl5.c(hl5.c(this.f.hashCode() * 31, 0L, 31), this.C, 31);
    }

    @Override // defpackage.vk8
    public final void i(ak3 ak3Var) {
        int round = Math.round(Float.intBitsToFloat((int) (ak3Var.b() >> 32)));
        float f = this.F;
        em1 em1Var = this.G;
        int i = this.D;
        ak3.g1(ak3Var, this.f, this.C, 0L, (round << 32) | (Math.round(Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L))) & 4294967295L), f, em1Var, i, 328);
    }

    public final String toString() {
        String e = py5.e(0L);
        String c = zy5.c(this.C);
        String a = cf4.a(this.D);
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f);
        sb.append(", srcOffset=");
        sb.append(e);
        sb.append(", srcSize=");
        return nk2.w(sb, c, ", filterQuality=", a, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sl0(defpackage.nl5 r7) {
        /*
            r6 = this;
            r0 = r7
            jj r0 = (defpackage.jj) r0
            android.graphics.Bitmap r0 = r0.a
            int r0 = r0.getWidth()
            r1 = r7
            jj r1 = (defpackage.jj) r1
            android.graphics.Bitmap r1 = r1.a
            int r1 = r1.getHeight()
            long r2 = (long) r0
            r0 = 32
            long r2 = r2 << r0
            long r0 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            r6.<init>(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl0.<init>(nl5):void");
    }
}
