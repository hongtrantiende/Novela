package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xza  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xza implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0b b;
    public final /* synthetic */ wza c;

    public /* synthetic */ xza(c0b c0bVar, wza wzaVar, int i) {
        this.a = i;
        this.b = c0bVar;
        this.c = wzaVar;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z2 = false;
        c0b c0bVar = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    owe.r(c0bVar.a, this.c, rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    String A = yqe.A((y3b) o3b.R.getValue(), rv4Var2);
                    d0b d0bVar = c0bVar.b;
                    owe.i(A, d0bVar, this.c, vza.a, d0bVar.c, false, false, rv4Var2, 3072, 96);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z2 = true;
                }
                if (rv4Var3.U(intValue3 & 1, z2)) {
                    String A2 = yqe.A((y3b) o3b.t.getValue(), rv4Var3);
                    d0b d0bVar2 = c0bVar.c;
                    owe.i(A2, d0bVar2, this.c, vza.b, d0bVar2.c, false, false, rv4Var3, 3072, 96);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 3:
                rv4 rv4Var4 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z2 = true;
                }
                if (rv4Var4.U(intValue4 & 1, z2)) {
                    String A3 = yqe.A((y3b) o3b.V.getValue(), rv4Var4);
                    d0b d0bVar3 = c0bVar.d;
                    owe.i(A3, d0bVar3, this.c, vza.c, d0bVar3.c, false, true, rv4Var4, 1772544, 0);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var5 = (rv4) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z2 = true;
                }
                if (rv4Var5.U(intValue5 & 1, z2)) {
                    owe.h(c0bVar.j, c0bVar.k, c0bVar.l, this.c, rv4Var5, 0);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
        }
    }
}
