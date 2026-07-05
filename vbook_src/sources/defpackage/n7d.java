package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n7d  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class n7d implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t7d b;
    public final /* synthetic */ vt4 c;
    public final /* synthetic */ gcd d;

    public /* synthetic */ n7d(t7d t7dVar, vt4 vt4Var, gcd gcdVar, int i) {
        this.a = i;
        this.b = t7dVar;
        this.c = vt4Var;
        this.d = gcdVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        gcd gcdVar = this.d;
        vt4 vt4Var = this.c;
        t7d t7dVar = this.b;
        switch (i) {
            case 0:
                if (t7dVar.a()) {
                    vt4Var.invoke();
                } else {
                    j9d j9dVar = gcdVar.n;
                    if (j9dVar != null) {
                        j9dVar.e();
                    }
                }
                t7d.e(t7dVar);
                return pvcVar;
            case 1:
                if (t7dVar.a()) {
                    vt4Var.invoke();
                } else {
                    j9d j9dVar2 = gcdVar.n;
                    if (j9dVar2 != null) {
                        j9dVar2.e();
                    }
                }
                t7d.e(t7dVar);
                return pvcVar;
            default:
                if (t7dVar.a()) {
                    vt4Var.invoke();
                } else {
                    j9d j9dVar3 = gcdVar.n;
                    if (j9dVar3 != null) {
                        j9dVar3.e();
                    }
                }
                t7d.e(t7dVar);
                return pvcVar;
        }
    }
}
