package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vc5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vc5 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ oyb c;

    public /* synthetic */ vc5(String str, oyb oybVar, int i) {
        this.a = i;
        this.b = str;
        this.c = oybVar;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    tza tzaVar = j27.a;
                    cvb.c(this.b, zbe.z(nmd.v(pna.b(pna.c, nae.e, 20.0f, 1), zl1.b(0.12f, ((h27) rv4Var.j(tzaVar)).a.a), ((h27) rv4Var.j(tzaVar)).c.a), 6.0f, 2.0f), ((h27) rv4Var.j(tzaVar)).a.a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, this.c, rv4Var, 0, 24576, 114680);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    String m = s21.m("@", this.b);
                    tza tzaVar2 = j27.a;
                    cvb.c(m, zbe.A(nmd.v(kq7.a, zl1.b(0.2f, ((h27) rv4Var2.j(tzaVar2)).a.a), ((h27) rv4Var2.j(tzaVar2)).c.a), 4.0f, nae.e, 2), ((h27) rv4Var2.j(tzaVar2)).a.a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, this.c, rv4Var2, 0, 0, 131064);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
