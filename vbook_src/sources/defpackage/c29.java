package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c29  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class c29 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ c29(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.a;
        long j = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((qr) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    fu0.a(nmd.v(pna.c, j, lre.g), rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvc.a;
            default:
                e37 e37Var = (e37) obj;
                w27 w27Var = (w27) obj2;
                x02 x02Var = (x02) obj3;
                e37Var.getClass();
                w27Var.getClass();
                mw8 M = w27Var.M(x02.b(x02Var.a, 0, 0, 0, 0, 10));
                long j2 = x02Var.a;
                return e37Var.q0(x02.i(j2), x02.j(j2), ls3.a, new lh6(M, j, 4));
        }
    }
}
