package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wj7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class wj7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xt4 d;

    public /* synthetic */ wj7(int i, int i2, xt4 xt4Var, List list) {
        this.a = i2;
        this.b = list;
        this.c = i;
        this.d = xt4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.d;
        int i2 = this.c;
        List list = this.b;
        ri6 ri6Var = (ri6) obj;
        switch (i) {
            case 0:
                ri6Var.getClass();
                ri6Var.z(list.size(), new oj7(2, new j35(18), list), new pj7(2, list), new tu1(new ck7(i2, 0, xt4Var, list), true, 2039820996));
                return pvcVar;
            default:
                ri6Var.getClass();
                ri6Var.z(list.size(), null, new pj7(3, list), new tu1(new ck7(i2, 1, xt4Var, list), true, 2039820996));
                return pvcVar;
        }
    }
}
