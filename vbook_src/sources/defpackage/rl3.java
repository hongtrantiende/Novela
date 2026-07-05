package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rl3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class rl3 implements lu4 {
    public final /* synthetic */ int C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ nq7 d;
    public final /* synthetic */ vt4 e;
    public final /* synthetic */ int f;

    public /* synthetic */ rl3(ar5 ar5Var, String str, String str2, nq7 nq7Var, String str3, vt4 vt4Var, int i, int i2) {
        this.D = ar5Var;
        this.b = str;
        this.c = str2;
        this.d = nq7Var;
        this.E = str3;
        this.e = vt4Var;
        this.f = i;
        this.C = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.f;
        Object obj3 = this.E;
        Object obj4 = this.D;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                iue.g(this.b, this.c, (lu4) obj4, (Boolean) obj3, this.d, this.e, (rv4) obj, p, this.C);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                jxe.d((ar5) obj4, this.b, this.c, this.d, (String) obj3, this.e, (rv4) obj, p2, this.C);
                return pvcVar;
        }
    }

    public /* synthetic */ rl3(String str, String str2, lu4 lu4Var, Boolean bool, nq7 nq7Var, vt4 vt4Var, int i, int i2) {
        this.b = str;
        this.c = str2;
        this.D = lu4Var;
        this.E = bool;
        this.d = nq7Var;
        this.e = vt4Var;
        this.f = i;
        this.C = i2;
    }
}
