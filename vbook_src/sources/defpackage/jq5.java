package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jq5  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jq5 implements lu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ nq7 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ jq5(int i, int i2, int i3, nq7 nq7Var) {
        this.c = i;
        this.d = i2;
        this.b = nq7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.d;
        int i3 = this.c;
        nq7 nq7Var = this.b;
        rv4 rv4Var = (rv4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                nxe.j(i3, i2, nq7Var, rv4Var, xoe.p(1));
                return pvcVar;
            default:
                jsc.c(xoe.p(i3 | 1), i2, rv4Var, nq7Var);
                return pvcVar;
        }
    }

    public /* synthetic */ jq5(nq7 nq7Var, int i, int i2) {
        this.b = nq7Var;
        this.c = i;
        this.d = i2;
    }
}
