package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bj7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class bj7 implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ nq7 e;

    public /* synthetic */ bj7(int i, int i2, xt4 xt4Var, nq7 nq7Var, List list) {
        this.b = i;
        this.c = list;
        this.d = xt4Var;
        this.e = nq7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                am8.e(xoe.p(this.b | 1), this.d, (rv4) obj, this.e, this.c);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p = xoe.p(1);
                pye.d(this.b, p, this.d, (rv4) obj, this.e, this.c);
                return pvcVar;
        }
    }

    public /* synthetic */ bj7(List list, nq7 nq7Var, xt4 xt4Var, int i) {
        this.c = list;
        this.e = nq7Var;
        this.d = xt4Var;
        this.b = i;
    }
}
