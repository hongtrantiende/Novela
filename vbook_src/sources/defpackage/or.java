package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: or  reason: default package */
/* loaded from: classes.dex */
public final class or extends fb6 implements lu4 {
    public final /* synthetic */ tu1 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ nq7 c;
    public final /* synthetic */ eu3 d;
    public final /* synthetic */ lz3 e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ or(boolean z, nq7 nq7Var, eu3 eu3Var, lz3 lz3Var, String str, tu1 tu1Var, int i, int i2, int i3) {
        super(2);
        this.a = i3;
        this.b = z;
        this.c = nq7Var;
        this.d = eu3Var;
        this.e = lz3Var;
        this.f = str;
        this.C = tu1Var;
        this.D = i;
        this.E = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.D;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int p = xoe.p(i2 | 1);
                int i3 = this.E;
                rte.c(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p, i3);
                return pvcVar;
            case 1:
                ((Number) obj2).intValue();
                int p2 = xoe.p(i2 | 1);
                int i4 = this.E;
                rte.d(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p2, i4);
                return pvcVar;
            default:
                ((Number) obj2).intValue();
                int p3 = xoe.p(i2 | 1);
                int i5 = this.E;
                rte.e(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p3, i5);
                return pvcVar;
        }
    }
}
