package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g29  reason: default package */
/* loaded from: classes.dex */
public final class g29 implements lu4 {
    public final /* synthetic */ aw7 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ tu1 d;

    public g29(aw7 aw7Var, boolean z, int i, tu1 tu1Var) {
        this.a = aw7Var;
        this.b = z;
        this.c = i;
        this.d = tu1Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        rv4 rv4Var = (rv4) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && rv4Var.E()) {
            rv4Var.X();
        } else {
            final long j = ((py5) this.a.getValue()).a;
            rv4Var.e0(1403468658);
            final float L0 = ((r13) rv4Var.j(dy1.h)).L0(8.0f);
            rv4Var.e0(5004770);
            boolean e = rv4Var.e(j);
            Object P = rv4Var.P();
            if (e || P == ax1.a) {
                P = new vw4(new mu4() { // from class: b29
                    @Override // defpackage.mu4
                    public final Object c(Object obj3, Object obj4, Object obj5) {
                        yj a;
                        yk8 yk8Var;
                        yj yjVar = (yj) obj3;
                        dna dnaVar = (dna) obj4;
                        yjVar.getClass();
                        ((tc6) obj5).getClass();
                        float c = dna.c(dnaVar.a) * 0.5f;
                        long floatToRawIntBits = (Float.floatToRawIntBits(c) << 32) | (Float.floatToRawIntBits(c) & 4294967295L);
                        long j2 = dnaVar.a;
                        rk9 n = npe.n(0L, j2);
                        float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                        yj.d(yjVar, new ou9(n.a, n.b, n.c, n.d, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits2));
                        int i = (int) (j2 >> 32);
                        float intBitsToFloat3 = Float.intBitsToFloat(i);
                        float f = L0;
                        float f2 = 2.1f * f;
                        if (intBitsToFloat3 >= f2) {
                            int i2 = (int) (j2 & 4294967295L);
                            if (Float.intBitsToFloat(i2) >= f2) {
                                long j3 = j;
                                int i3 = (int) (j3 >> 32);
                                float f3 = i3;
                                float m = dce.m(f3, f, Float.intBitsToFloat(i) - f);
                                int i4 = (int) (j3 & 4294967295L);
                                float f4 = i4;
                                float m2 = dce.m(f4, f, Float.intBitsToFloat(i2) - f);
                                if (i4 < 0) {
                                    yk8Var = new yk8(new y78((Float.floatToRawIntBits(m) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L)), new y78((Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(-1.0f) & 4294967295L)));
                                } else if (f4 > Float.intBitsToFloat(i2)) {
                                    yk8Var = new yk8(new y78((Float.floatToRawIntBits(m) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i2)) & 4294967295L)), new y78((Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L)));
                                } else if (i3 < 0) {
                                    yk8Var = new yk8(new y78((Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(m2) & 4294967295L)), new y78((Float.floatToRawIntBits(-1.0f) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L)));
                                } else if (f3 > Float.intBitsToFloat(i)) {
                                    yk8Var = new yk8(new y78((Float.floatToRawIntBits(Float.intBitsToFloat(i)) << 32) | (Float.floatToRawIntBits(m2) & 4294967295L)), new y78((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L)));
                                } else {
                                    a = dk.a();
                                    yj.b(yjVar, a);
                                }
                                long j4 = ((y78) yk8Var.a).a;
                                long j5 = ((y78) yk8Var.b).a;
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (j5 >> 32));
                                long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(-Float.intBitsToFloat((int) (j5 & 4294967295L))) << 32);
                                a = dk.a();
                                long j6 = y78.j(j4, y78.k(f, floatToRawIntBits3));
                                a.i(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)));
                                long j7 = y78.j(j4, y78.k(f, j5));
                                a.h(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
                                long i5 = y78.i(j4, y78.k(f, floatToRawIntBits3));
                                a.h(Float.intBitsToFloat((int) (i5 >> 32)), Float.intBitsToFloat((int) (i5 & 4294967295L)));
                                a.e();
                                yj.b(yjVar, a);
                            }
                        }
                        return pvc.a;
                    }
                });
                rv4Var.o0(P);
            }
            rv4Var.q(false);
            rv4Var.q(false);
            v9b.a(null, (vw4) P, 0L, 0L, nae.e, 8.0f, null, jce.E(-434990722, new f29(this.b, this.c, this.d), rv4Var), rv4Var, 12779520, 93);
        }
        return pvc.a;
    }
}
