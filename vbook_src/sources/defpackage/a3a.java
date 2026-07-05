package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a3a  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a3a implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj8 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ nq7 d;
    public final /* synthetic */ int e;

    public /* synthetic */ a3a(rj8 rj8Var, List list, nq7 nq7Var, int i, int i2) {
        this.a = i2;
        this.b = rj8Var;
        this.c = list;
        this.d = nq7Var;
        this.e = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.e;
        nq7 nq7Var = this.d;
        List list = this.c;
        rj8 rj8Var = this.b;
        rv4 rv4Var = (rv4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                d3a.a(rj8Var, list, nq7Var, rv4Var, xoe.p(i2 | 1));
                return pvcVar;
            default:
                eg0.o(rj8Var, list, nq7Var, rv4Var, xoe.p(i2 | 1));
                return pvcVar;
        }
    }
}
