package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i3c  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class i3c implements xt4 {
    public final /* synthetic */ aw7 C;
    public final /* synthetic */ aw7 D;
    public final /* synthetic */ aw7 E;
    public final /* synthetic */ cyb a;
    public final /* synthetic */ kj6 b;
    public final /* synthetic */ kob c;
    public final /* synthetic */ d19 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ mu4 f;

    public /* synthetic */ i3c(cyb cybVar, kj6 kj6Var, kob kobVar, d19 d19Var, int i, mu4 mu4Var, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3) {
        this.a = cybVar;
        this.b = kj6Var;
        this.c = kobVar;
        this.d = d19Var;
        this.e = i;
        this.f = mu4Var;
        this.C = aw7Var;
        this.D = aw7Var2;
        this.E = aw7Var3;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        y78 y78Var = (y78) obj;
        if (this.a.d() == p7a.a) {
            long j = y78Var.a;
            int i = (int) (j >> 32);
            float intBitsToFloat = Float.intBitsToFloat(i);
            c3c c3cVar = k3c.a;
            int i2 = (int) (j & 4294967295L);
            float intBitsToFloat2 = Float.intBitsToFloat(i2) - ((Number) this.D.getValue()).floatValue();
            int intValue = ((Number) this.E.getValue()).intValue();
            kj6 kj6Var = this.b;
            pwb b = k3c.b(intBitsToFloat - ((Number) this.C.getValue()).floatValue(), intBitsToFloat2, intValue, kj6Var.j().k, kj6Var.j().p, this.c.b);
            float intBitsToFloat3 = Float.intBitsToFloat(i);
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            d19 d19Var = this.d;
            ikb A = ctd.A(intBitsToFloat3, intBitsToFloat4, (int) (((hab) d19Var).U >> 32), (int) (((hab) d19Var).U & 4294967295L), this.e);
            float intBitsToFloat5 = Float.intBitsToFloat(i);
            this.f.c(new y78((Float.floatToRawIntBits(Float.intBitsToFloat(i2)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat5) << 32)), A, b);
        }
        return pvc.a;
    }
}
