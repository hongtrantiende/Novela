package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rf7  reason: default package */
/* loaded from: classes3.dex */
public final class rf7 implements xt4 {
    public final /* synthetic */ eo3 a;
    public final /* synthetic */ int b;

    public rf7(eo3 eo3Var, int i) {
        this.a = eo3Var;
        this.b = i;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        eo3 eo3Var = this.a;
        eo3Var.getClass();
        ArrayList E0 = sl1.E0(eo3Var.c());
        ArrayList G = nmd.G(str);
        int size = G.size();
        int i = this.b;
        if (size > 1) {
            E0.remove(i);
            ArrayList arrayList = new ArrayList(tl1.s(G, 10));
            int size2 = G.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = G.get(i2);
                i2++;
                arrayList.add(eo3Var.a((String) obj2));
            }
            E0.addAll(i, arrayList);
        } else {
            E0.set(i, new nc9(((nc9) E0.get(i)).a, str));
        }
        boolean isEmpty = E0.isEmpty();
        ArrayList arrayList2 = E0;
        if (isEmpty) {
            arrayList2 = tl1.A(eo3Var.a(""));
        }
        eo3Var.f(arrayList2);
        return pvc.a;
    }
}
