package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w32  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class w32 implements xt4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ xt4 e;
    public final /* synthetic */ xt4 f;

    public /* synthetic */ w32(vo9 vo9Var, boolean z, xt4 xt4Var, boolean z2, xt4 xt4Var2, aw7 aw7Var, xt4 xt4Var3) {
        this.C = vo9Var;
        this.b = z;
        this.d = xt4Var;
        this.c = z2;
        this.e = xt4Var2;
        this.D = aw7Var;
        this.f = xt4Var3;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.D;
        Object obj3 = this.C;
        switch (i) {
            case 0:
                vo9 vo9Var = (vo9) obj3;
                aw7 aw7Var = (aw7) obj2;
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                ri6.y(ri6Var, "highlight", new tu1(new ew0(vo9Var, this.b, this.d, this.c, this.e), true, 1323484486), 2);
                List list = (List) aw7Var.getValue();
                ri6Var.z(list.size(), new x7(12, new tv1(24), list), new y7(15, list), new tu1(new td0(list, vo9Var, aw7Var, this.f), true, 2039820996));
                return pvcVar;
            default:
                List list2 = (List) obj3;
                ri6 ri6Var2 = (ri6) obj;
                ri6Var2.getClass();
                ww6 ww6Var = new ww6(7);
                ri6Var2.z(list2.size(), new y74(21, ww6Var, list2), new w74(17, list2), new tu1(new wa7(list2, this.c, this.d, this.e, this.f, (xt4) obj2), true, 802480018));
                if (this.b) {
                    ri6.y(ri6Var2, "load_more", cwe.a, 2);
                }
                return pvcVar;
        }
    }

    public /* synthetic */ w32(List list, boolean z, boolean z2, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4) {
        this.C = list;
        this.b = z;
        this.c = z2;
        this.d = xt4Var;
        this.e = xt4Var2;
        this.f = xt4Var3;
        this.D = xt4Var4;
    }
}
