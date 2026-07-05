package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: th7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class th7 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m82 b;
    public final /* synthetic */ kj6 c;
    public final /* synthetic */ aw7 d;
    public final /* synthetic */ aw7 e;
    public final /* synthetic */ yya f;

    public /* synthetic */ th7(m82 m82Var, kj6 kj6Var, aw7 aw7Var, aw7 aw7Var2, yya yyaVar, int i) {
        this.a = i;
        this.b = m82Var;
        this.c = kj6Var;
        this.d = aw7Var;
        this.e = aw7Var2;
        this.f = yyaVar;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        kq7 kq7Var = kq7.a;
        yya yyaVar = this.f;
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
                    su9 su9Var = uu9.a;
                    nq7 k = tte.k(kq7Var, su9Var);
                    final m82 m82Var = this.b;
                    boolean h = rv4Var.h(m82Var);
                    final kj6 kj6Var = this.c;
                    boolean f = h | rv4Var.f(kj6Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        final aw7 aw7Var = this.d;
                        final aw7 aw7Var2 = this.e;
                        vt4 vt4Var = new vt4() { // from class: fi7
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i2 = r5;
                                pvc pvcVar2 = pvc.a;
                                kj6 kj6Var2 = kj6Var;
                                aw7 aw7Var3 = aw7Var2;
                                m82 m82Var2 = m82Var;
                                aw7 aw7Var4 = aw7Var;
                                switch (i2) {
                                    case 0:
                                        o28.g(m82Var2, aw7Var3, kj6Var2, ((Number) aw7Var4.getValue()).intValue());
                                        return pvcVar2;
                                    default:
                                        l0e.r(m82Var2, aw7Var3, kj6Var2, ((Number) aw7Var4.getValue()).intValue());
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var.o0(vt4Var);
                        P = vt4Var;
                    }
                    v9b.a(lbe.f(15, (vt4) P, k, null, false), su9Var, rm1.g(((h27) rv4Var.j(j27.a)).a, 6.0f), 0L, 2.0f, 6.0f, null, jce.E(339025951, new gi7(yyaVar, 0), rv4Var), rv4Var, 12804096, 72);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((qr) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    su9 su9Var2 = uu9.a;
                    nq7 k2 = tte.k(kq7Var, su9Var2);
                    final m82 m82Var2 = this.b;
                    boolean h2 = rv4Var2.h(m82Var2);
                    final kj6 kj6Var2 = this.c;
                    boolean f2 = h2 | rv4Var2.f(kj6Var2);
                    Object P2 = rv4Var2.P();
                    if (f2 || P2 == lh9Var) {
                        final aw7 aw7Var3 = this.d;
                        final aw7 aw7Var4 = this.e;
                        P2 = new vt4() { // from class: fi7
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i2 = r5;
                                pvc pvcVar2 = pvc.a;
                                kj6 kj6Var22 = kj6Var2;
                                aw7 aw7Var32 = aw7Var4;
                                m82 m82Var22 = m82Var2;
                                aw7 aw7Var42 = aw7Var3;
                                switch (i2) {
                                    case 0:
                                        o28.g(m82Var22, aw7Var32, kj6Var22, ((Number) aw7Var42.getValue()).intValue());
                                        return pvcVar2;
                                    default:
                                        l0e.r(m82Var22, aw7Var32, kj6Var22, ((Number) aw7Var42.getValue()).intValue());
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var2.o0(P2);
                    }
                    v9b.a(lbe.f(15, (vt4) P2, k2, null, false), su9Var2, rm1.g(((h27) rv4Var2.j(j27.a)).a, 6.0f), 0L, 2.0f, 6.0f, null, jce.E(366792886, new gi7(yyaVar, 1), rv4Var2), rv4Var2, 12804096, 72);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
