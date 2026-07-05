package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ai7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai7 implements xt4 {
    public final /* synthetic */ xt4 C;
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Set e;
    public final /* synthetic */ lu4 f;

    public /* synthetic */ ai7(aw7 aw7Var, aw7 aw7Var2, String str, Set set, lu4 lu4Var, xt4 xt4Var, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = aw7Var2;
        this.d = str;
        this.e = set;
        this.f = lu4Var;
        this.C = xt4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.c;
        aw7 aw7Var2 = this.b;
        ri6 ri6Var = (ri6) obj;
        switch (i) {
            case 0:
                ri6Var.getClass();
                if (((jub) aw7Var2.getValue()).a.b.length() > 0 && ((List) aw7Var.getValue()).isEmpty()) {
                    ri6.y(ri6Var, "search_empty", vye.d, 2);
                }
                List list = (List) aw7Var.getValue();
                ri6Var.z(list.size(), new y74(26, new ww6(27), list), new w74(26, list), new tu1(new ri7(0, this.C, this.f, this.d, list, this.e), true, 802480018));
                return pvcVar;
            default:
                ri6Var.getClass();
                if (((jub) aw7Var2.getValue()).a.b.length() > 0 && ((List) aw7Var.getValue()).isEmpty()) {
                    ri6.y(ri6Var, "search_empty", hc2.a, 2);
                }
                List list2 = (List) aw7Var.getValue();
                ri6Var.z(list2.size(), new oj7(3, new bo7(0), list2), new pj7(5, list2), new tu1(new ri7(1, this.C, this.f, this.d, list2, this.e), true, 802480018));
                return pvcVar;
        }
    }
}
