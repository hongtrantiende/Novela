package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xb3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb3 implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xb3(long j, oyb oybVar, float f, lu4 lu4Var) {
        this.b = j;
        this.d = oybVar;
        this.c = f;
        this.e = lu4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((abf) obj4).k(this.b, (nq7) obj3, this.c, (rv4) obj, xoe.p(3073));
                return pvcVar;
            default:
                oyb oybVar = (oyb) obj4;
                lu4 lu4Var = (lu4) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    cbe.f(this.b, oybVar, jce.E(-1767363041, new kj4(this.c, lu4Var, 0), rv4Var), rv4Var, 384);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ xb3(abf abfVar, long j, nq7 nq7Var, float f, int i) {
        this.d = abfVar;
        this.b = j;
        this.e = nq7Var;
        this.c = f;
    }
}
