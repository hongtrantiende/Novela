package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sp  reason: default package */
/* loaded from: classes.dex */
public final class sp {
    public final List a;
    public final ArrayList b;
    public final String c;

    public sp(List list) {
        this.a = list;
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((tp) it.next()).a);
        }
        this.b = arrayList;
        this.c = sl1.i0(arrayList, " ", null, null, new y4(15), 30);
    }
}
