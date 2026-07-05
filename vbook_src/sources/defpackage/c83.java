package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c83  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class c83 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;

    public /* synthetic */ c83(int i, int i2, xt4 xt4Var, List list) {
        this.a = i2;
        this.b = xt4Var;
        this.c = list;
        this.d = i;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.d;
        List list = this.c;
        xt4 xt4Var = this.b;
        switch (i) {
            case 0:
                xt4Var.invoke(list.get(i2));
                return pvcVar;
            default:
                xt4Var.invoke(((yk8) list.get(i2)).a);
                return pvcVar;
        }
    }
}
