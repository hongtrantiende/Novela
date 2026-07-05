package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j14  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class j14 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t14 b;
    public final /* synthetic */ xt4 c;

    public /* synthetic */ j14(t14 t14Var, xt4 xt4Var, int i) {
        this.a = i;
        this.b = t14Var;
        this.c = xt4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.c;
        t14 t14Var = this.b;
        switch (i) {
            case 0:
                wj6 wj6Var = (wj6) obj;
                wj6Var.getClass();
                wj6.y(wj6Var, t14Var.f.size(), new cq2(t14Var, 22), new tu1(new l14(t14Var, xt4Var, 1), true, 202292370), 12);
                return pvcVar;
            case 1:
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                ArrayList arrayList = t14Var.f;
                ri6Var.z(arrayList.size(), null, new p14(1, arrayList), new tu1(new q14(arrayList, xt4Var, 1), true, 2039820996));
                return pvcVar;
            default:
                ri6 ri6Var2 = (ri6) obj;
                ri6Var2.getClass();
                ArrayList arrayList2 = t14Var.f;
                ri6Var2.z(arrayList2.size(), new x7(26, new dw3(15), arrayList2), new p14(0, arrayList2), new tu1(new q14(arrayList2, xt4Var, 0), true, 802480018));
                return pvcVar;
        }
    }
}
