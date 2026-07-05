package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tn7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class tn7 implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ nq7 c;
    public final /* synthetic */ vt4 d;
    public final /* synthetic */ int e;

    public /* synthetic */ tn7(String str, vt4 vt4Var, nq7 nq7Var, int i, int i2) {
        this.b = str;
        this.e = i;
        this.c = nq7Var;
        this.d = vt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(55);
                jce.a(this.b, this.e, this.c, this.d, (rv4) obj, p);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                obe.m(xoe.p(this.e | 1), this.d, (rv4) obj, this.c, this.b);
                return pvcVar;
        }
    }

    public /* synthetic */ tn7(String str, nq7 nq7Var, vt4 vt4Var, int i) {
        this.b = str;
        this.c = nq7Var;
        this.d = vt4Var;
        this.e = i;
    }
}
