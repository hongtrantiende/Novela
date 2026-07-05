package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z73  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class z73 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l54 b;
    public final /* synthetic */ nq7 c;
    public final /* synthetic */ vt4 d;
    public final /* synthetic */ vt4 e;
    public final /* synthetic */ int f;

    public /* synthetic */ z73(l54 l54Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, int i, int i2) {
        this.a = i2;
        this.b = l54Var;
        this.c = nq7Var;
        this.d = vt4Var;
        this.e = vt4Var2;
        this.f = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                vqe.h(this.b, this.c, this.d, this.e, (rv4) obj, p);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                vqe.j(this.b, this.c, this.d, this.e, (rv4) obj, p2);
                return pvcVar;
        }
    }
}
