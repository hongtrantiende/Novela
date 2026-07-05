package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b4a  reason: default package */
/* loaded from: classes3.dex */
public final class b4a implements a4a {
    public final ii2 a;
    public final dx b;

    static {
        r76[] r76VarArr = dx.W;
    }

    public b4a(ii2 ii2Var, dx dxVar) {
        this.a = ii2Var;
        this.b = dxVar;
    }

    public final ArrayList a(String str) {
        lm2 lm2Var = this.a.S;
        lm2Var.getClass();
        str.getClass();
        op2 op2Var = op2.a;
        List<np2> c = new gm2(lm2Var, str, 10L, new yo2(19)).c();
        ArrayList arrayList = new ArrayList(tl1.s(c, 10));
        for (np2 np2Var : c) {
            arrayList.add(np2Var.a);
        }
        return arrayList;
    }

    public final boolean b() {
        dx dxVar = this.b;
        return ((Boolean) dxVar.L.c(dx.W[36], dxVar)).booleanValue();
    }

    public final boolean c() {
        dx dxVar = this.b;
        return ((Boolean) dxVar.M.c(dx.W[37], dxVar)).booleanValue();
    }

    public final void d(String str) {
        lm2 lm2Var = this.a.S;
        lm2Var.getClass();
        str.getClass();
        ((mm) lm2Var.a).q(690331520, "DELETE FROM DbSearch\nWHERE key = ?", new ui2(str, 24));
        lm2Var.C(690331520, new yo2(20));
    }
}
