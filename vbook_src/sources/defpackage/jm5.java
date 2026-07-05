package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jm5  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jm5 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ m82 d;

    public /* synthetic */ jm5(m82 m82Var, aw7 aw7Var, aw7 aw7Var2) {
        this.a = 2;
        this.d = m82Var;
        this.b = aw7Var;
        this.c = aw7Var2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        aw7 aw7Var = this.c;
        aw7 aw7Var2 = this.b;
        int i2 = 0;
        pvc pvcVar = pvc.a;
        m82 m82Var = this.d;
        switch (i) {
            case 0:
                sl5 sl5Var = (sl5) obj;
                sl5Var.getClass();
                aw7Var2.setValue(Boolean.FALSE);
                kj6 kj6Var = ((sm5) aw7Var.getValue()).a;
                int i3 = 0;
                for (Object obj2 : ((sm5) aw7Var.getValue()).b) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        vh8 vh8Var = (vh8) obj2;
                        if (vh8Var instanceof po5) {
                            po5 po5Var = (po5) vh8Var;
                            if (po5Var.c == sl5Var.c && po5Var.d == sl5Var.g) {
                                z87.v(m82Var, null, null, new qm5(kj6Var, i3, (m42) null, 0), 3);
                            }
                        }
                        i3 = i4;
                    } else {
                        tl1.M();
                        throw null;
                    }
                }
                return pvcVar;
            case 1:
                int intValue = ((Integer) obj).intValue();
                kj6 kj6Var2 = ((sm5) aw7Var2.getValue()).a;
                int i5 = ((xp5) aw7Var.getValue()).a;
                for (Object obj3 : ((sm5) aw7Var2.getValue()).b) {
                    int i6 = i2 + 1;
                    if (i2 >= 0) {
                        vh8 vh8Var2 = (vh8) obj3;
                        if (vh8Var2 instanceof po5) {
                            po5 po5Var2 = (po5) vh8Var2;
                            if (po5Var2.c == i5 && po5Var2.d == intValue - 1) {
                                z87.v(m82Var, null, null, new qm5(kj6Var2, i2, (m42) null, 1), 3);
                            }
                        }
                        i2 = i6;
                    } else {
                        tl1.M();
                        throw null;
                    }
                }
                return pvcVar;
            default:
                f76 f76Var = (f76) obj;
                f76Var.getClass();
                sw2 sw2Var = ab3.a;
                z87.v(m82Var, ru2.c, null, new ba(f76Var, this.b, this.c, (m42) null, 5), 2);
                return pvcVar;
        }
    }

    public /* synthetic */ jm5(aw7 aw7Var, aw7 aw7Var2, m82 m82Var, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = aw7Var2;
        this.d = m82Var;
    }
}
