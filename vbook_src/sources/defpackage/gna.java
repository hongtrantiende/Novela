package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gna  reason: default package */
/* loaded from: classes.dex */
public final class gna extends fb6 implements xt4 {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ e37 d;
    public final /* synthetic */ mw8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gna(hna hnaVar, long j, int i, int i2, e37 e37Var, mw8 mw8Var) {
        super(1);
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = e37Var;
        this.e = mw8Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        float f;
        lw8 lw8Var = (lw8) obj;
        long j = (this.b << 32) | (this.c & 4294967295L);
        tc6 layoutDirection = this.d.getLayoutDirection();
        long j2 = this.a;
        float f2 = (((int) (j >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float f3 = (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f;
        if (layoutDirection == tc6.a) {
            f = -1.0f;
        } else {
            f = (-1.0f) * (-1.0f);
        }
        float f4 = (1.0f - 1.0f) * f3;
        int round = Math.round((f + 1.0f) * f2);
        lw8.t(lw8Var, this.e, (Math.round(f4) & 4294967295L) | (round << 32));
        return pvc.a;
    }
}
