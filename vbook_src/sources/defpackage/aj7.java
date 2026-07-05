package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aj7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class aj7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ List c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ xt4 e;
    public final /* synthetic */ int f;

    public /* synthetic */ aj7(boolean z, List list, xt4 xt4Var, xt4 xt4Var2, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = list;
        this.d = xt4Var;
        this.e = xt4Var2;
        this.f = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                am8.i(this.b, this.c, this.d, this.e, (rv4) obj, p);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                am8.h(this.b, this.c, this.d, this.e, (rv4) obj, p2);
                return pvcVar;
        }
    }
}
