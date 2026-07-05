package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l6a  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class l6a implements lu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ n7a b;
    public final /* synthetic */ tu1 c;
    public final /* synthetic */ f7a d;

    public /* synthetic */ l6a(f7a f7aVar, n7a n7aVar, tu1 tu1Var) {
        this.d = f7aVar;
        this.b = n7aVar;
        this.c = tu1Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = false;
        f7a f7aVar = this.d;
        tu1 tu1Var = this.c;
        n7a n7aVar = this.b;
        rv4 rv4Var = (rv4) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    q0f.a(f7aVar, jce.E(201187952, new l6a(n7aVar, tu1Var, f7aVar), rv4Var), rv4Var, 48);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    pye.a(o7a.a.a(n7aVar), jce.E(1199015344, new oq1(tu1Var, f7aVar), rv4Var), rv4Var, 56);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ l6a(n7a n7aVar, tu1 tu1Var, f7a f7aVar) {
        this.b = n7aVar;
        this.c = tu1Var;
        this.d = f7aVar;
    }
}
