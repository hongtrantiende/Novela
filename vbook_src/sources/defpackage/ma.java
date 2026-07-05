package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ma  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ nq7 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ma(int i, int i2, int i3, nq7 nq7Var, String str) {
        this.a = i3;
        this.b = str;
        this.d = i;
        this.c = nq7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.d;
        nq7 nq7Var = this.c;
        String str = this.b;
        rv4 rv4Var = (rv4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                w92.l(str, i2, nq7Var, rv4Var, xoe.p(1));
                return pvcVar;
            case 1:
                fpe.a(str, nq7Var, rv4Var, xoe.p(i2 | 1));
                return pvcVar;
            case 2:
                b16.n(str, nq7Var, rv4Var, xoe.p(i2 | 1));
                return pvcVar;
            case 3:
                ese.f(str, i2, nq7Var, rv4Var, xoe.p(1));
                return pvcVar;
            case 4:
                ape.j(str, nq7Var, rv4Var, xoe.p(i2 | 1));
                return pvcVar;
            case 5:
                hma.l(str, nq7Var, rv4Var, xoe.p(i2 | 1));
                return pvcVar;
            case 6:
                ct8.a(str, nq7Var, rv4Var, xoe.p(i2 | 1));
                return pvcVar;
            default:
                zpe.b(str, nq7Var, rv4Var, xoe.p(i2 | 1));
                return pvcVar;
        }
    }

    public /* synthetic */ ma(String str, nq7 nq7Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = nq7Var;
        this.d = i;
    }
}
