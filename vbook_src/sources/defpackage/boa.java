package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: boa  reason: default package */
/* loaded from: classes.dex */
public final class boa extends fb6 implements xt4 {
    public final /* synthetic */ coa a;
    public final /* synthetic */ mw8 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ e37 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boa(coa coaVar, mw8 mw8Var, long j, e37 e37Var) {
        super(1);
        this.a = coaVar;
        this.b = mw8Var;
        this.c = j;
        this.d = e37Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        long floatToRawIntBits;
        float f;
        lw8 lw8Var = (lw8) obj;
        coa coaVar = this.a;
        if (((nz9) coaVar.K.getValue()) == null) {
            lw8Var.o(this.b, 0, 0, nae.e);
        } else {
            long j = coaVar.N;
            int i = (int) (j >> 32);
            long j2 = this.c;
            if (i != 0 && ((int) (j & 4294967295L)) != 0) {
                float intBitsToFloat = Float.intBitsToFloat((int) (eg0.A(j2) >> 32)) / Float.intBitsToFloat((int) (eg0.A(j) >> 32));
                floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
                int i2 = kz9.c;
            } else {
                floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                int i3 = kz9.c;
            }
            long A = (k27.A(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) * ((int) (coaVar.N & 4294967295L))) & 4294967295L) | (k27.A(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) * ((int) (coaVar.N >> 32))) << 32);
            float f2 = (((int) (j2 >> 32)) - ((int) (A >> 32))) / 2.0f;
            float f3 = (((int) (j2 & 4294967295L)) - ((int) (A & 4294967295L))) / 2.0f;
            if (this.d.getLayoutDirection() == tc6.a) {
                f = 0.0f;
            } else {
                f = (-1.0f) * nae.e;
            }
            long round = (Math.round((1.0f + f) * f2) << 32) | (Math.round((1.0f + nae.e) * f3) & 4294967295L);
            lw8.L(lw8Var, this.b, (int) (round >> 32), (int) (round & 4294967295L), new aoa(floatToRawIntBits, 0), 4);
        }
        return pvc.a;
    }
}
