package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g52  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class g52 implements xt4 {
    public final /* synthetic */ xt4 C;
    public final /* synthetic */ nq7 D;
    public final /* synthetic */ aw7 E;
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ mu4 c;
    public final /* synthetic */ lu4 d;
    public final /* synthetic */ vt4 e;
    public final /* synthetic */ xt4 f;

    public /* synthetic */ g52(List list, mu4 mu4Var, lu4 lu4Var, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2, nq7 nq7Var, aw7 aw7Var, int i) {
        this.a = i;
        this.b = list;
        this.c = mu4Var;
        this.d = lu4Var;
        this.e = vt4Var;
        this.f = xt4Var;
        this.C = xt4Var2;
        this.D = nq7Var;
        this.E = aw7Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                ln1 ln1Var = new ln1(12);
                List list = this.b;
                ri6Var.z(list.size(), new x7(16, ln1Var, list), new y7(17, list), new tu1(new x52(list, this.c, this.d, this.e, this.f, this.C, this.D, this.E, 1), true, 802480018));
                return pvcVar;
            default:
                ri6 ri6Var2 = (ri6) obj;
                ri6Var2.getClass();
                ln1 ln1Var2 = new ln1(13);
                List list2 = this.b;
                ri6Var2.z(list2.size(), new x7(15, ln1Var2, list2), new y7(16, list2), new tu1(new x52(list2, this.c, this.d, this.e, this.f, this.C, this.D, this.E, 0), true, 802480018));
                return pvcVar;
        }
    }
}
