package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g01  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class g01 implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g01(int i, long j, String str, String str2) {
        this.c = str;
        this.d = str2;
        this.b = j;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                rh8 rh8Var = (rh8) obj4;
                mu4 mu4Var = (mu4) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    cbe.f(this.b, ((h27) rv4Var.j(j27.a)).b.m, jce.E(417635459, new ah7(12, rh8Var, mu4Var), rv4Var), rv4Var, 384);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                owe.l((String) obj4, (String) obj3, this.b, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ g01(long j, rh8 rh8Var, mu4 mu4Var) {
        this.b = j;
        this.c = rh8Var;
        this.d = mu4Var;
    }
}
