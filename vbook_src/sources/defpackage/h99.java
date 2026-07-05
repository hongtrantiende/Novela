package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h99  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h99 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ oyb c;
    public final /* synthetic */ lu4 d;
    public final /* synthetic */ int e;

    public /* synthetic */ h99(long j, oyb oybVar, lu4 lu4Var, int i, int i2) {
        this.a = i2;
        this.b = j;
        this.c = oybVar;
        this.d = lu4Var;
        this.e = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int p = xoe.p(i2 | 1);
                cbe.f(this.b, this.c, this.d, (rv4) obj, p);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                dxe.c(this.b, this.c, this.d, (rv4) obj, p2);
                return pvcVar;
        }
    }
}
