package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sl7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class sl7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ long c;
    public final /* synthetic */ xt4 d;

    public /* synthetic */ sl7(List list, long j, xt4 xt4Var, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = j;
        this.d = xt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(1);
                xl7.a(this.b, this.c, this.d, (rv4) obj, p);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(1);
                cq7.c(this.b, this.c, this.d, (rv4) obj, p2);
                return pvcVar;
        }
    }
}
