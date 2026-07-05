package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xyc  reason: default package */
/* loaded from: classes3.dex */
public final class xyc implements ul8 {
    public final vl8 a;

    public xyc(vl8 vl8Var) {
        this.a = vl8Var;
    }

    @Override // defpackage.h4b
    public final Set a() {
        return ((i4b) xoe.j(this.a)).a();
    }

    @Override // defpackage.h4b
    public final void d(String str, List list) {
        str.getClass();
        list.getClass();
        String e = xk1.e(str, false);
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            str2.getClass();
            arrayList.add(xk1.e(str2, true));
        }
        this.a.d(e, arrayList);
    }

    @Override // defpackage.h4b
    public final void h(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a.h(xk1.e(str, false), xk1.e(str2, true));
    }
}
