package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pbc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pbc implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8a b;

    public /* synthetic */ pbc(l8a l8aVar, int i) {
        this.a = i;
        this.b = l8aVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        rbc rbcVar = rbc.b;
        rbc rbcVar2 = rbc.a;
        l8a l8aVar = this.b;
        bf4 bf4Var = (bf4) obj;
        switch (i) {
            case 0:
                Boolean a = ((bj) bf4Var).a();
                if (a != null) {
                    if (a.booleanValue()) {
                        rbcVar = rbcVar2;
                    }
                    j8a.k(l8aVar, rbcVar);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                Boolean a2 = ((bj) bf4Var).a();
                if (a2 != null) {
                    if (a2.booleanValue()) {
                        rbcVar = rbcVar2;
                    }
                    j8a.k(l8aVar, rbcVar);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
