package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oq5  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq5 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vt4 b;
    public final /* synthetic */ vt4 c;
    public final /* synthetic */ aw7 d;

    public /* synthetic */ oq5(vt4 vt4Var, vt4 vt4Var2, aw7 aw7Var, int i) {
        this.a = i;
        this.b = vt4Var;
        this.c = vt4Var2;
        this.d = aw7Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = false;
        lh9 lh9Var = ax1.a;
        aw7 aw7Var = this.d;
        vt4 vt4Var = this.c;
        vt4 vt4Var2 = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    String A = yqe.A((y3b) x2b.g0.getValue(), rv4Var);
                    boolean f = rv4Var.f(vt4Var2);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new kf3(vt4Var2, aw7Var, 3);
                        rv4Var.o0(P);
                    }
                    iue.g(A, null, null, null, null, (vt4) P, rv4Var, 0, 30);
                    String A2 = yqe.A((y3b) b3b.y.getValue(), rv4Var);
                    boolean f2 = rv4Var.f(vt4Var);
                    Object P2 = rv4Var.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new kf3(vt4Var, aw7Var, 4);
                        rv4Var.o0(P2);
                    }
                    iue.g(A2, null, null, null, null, (vt4) P2, rv4Var, 0, 30);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    String A3 = yqe.A((y3b) o3b.s0.getValue(), rv4Var2);
                    tu1 tu1Var = jsc.d;
                    boolean f3 = rv4Var2.f(vt4Var2);
                    Object P3 = rv4Var2.P();
                    if (f3 || P3 == lh9Var) {
                        P3 = new kf3(vt4Var2, aw7Var, 6);
                        rv4Var2.o0(P3);
                    }
                    iue.g(A3, null, tu1Var, null, null, (vt4) P3, rv4Var2, 384, 26);
                    String A4 = yqe.A((y3b) o3b.r0.getValue(), rv4Var2);
                    tu1 tu1Var2 = jsc.e;
                    boolean f4 = rv4Var2.f(vt4Var);
                    Object P4 = rv4Var2.P();
                    if (f4 || P4 == lh9Var) {
                        P4 = new kf3(vt4Var, aw7Var, 7);
                        rv4Var2.o0(P4);
                    }
                    iue.g(A4, null, tu1Var2, null, null, (vt4) P4, rv4Var2, 384, 26);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
