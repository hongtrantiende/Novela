package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pj4  reason: default package */
/* loaded from: classes.dex */
public final class pj4 implements uh6 {
    public final /* synthetic */ mj4 a;

    public pj4(mj4 mj4Var) {
        this.a = mj4Var;
    }

    @Override // defpackage.uh6
    public final c37 a(vh6 vh6Var, long j) {
        Integer valueOf;
        int i;
        ora oraVar = this.a.a;
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = oraVar.listIterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            y65 y65Var = (y65) listIterator;
            Integer num = null;
            if (y65Var.hasNext()) {
                Object next = y65Var.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    lj4 lj4Var = (lj4) next;
                    List<w27> a = vh6Var.a(i3);
                    ArrayList arrayList2 = new ArrayList(tl1.s(a, 10));
                    for (w27 w27Var : a) {
                        arrayList2.add(w27Var.M(j));
                    }
                    xl1.P(arrayList, arrayList2);
                    i3 = i4;
                } else {
                    tl1.M();
                    throw null;
                }
            } else {
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(((mw8) it.next()).a);
                    while (it.hasNext()) {
                        Integer valueOf2 = Integer.valueOf(((mw8) it.next()).a);
                        if (valueOf.compareTo(valueOf2) < 0) {
                            valueOf = valueOf2;
                        }
                    }
                }
                if (valueOf != null) {
                    i = valueOf.intValue();
                } else {
                    i = 0;
                }
                int g = y02.g(i, j);
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    Integer valueOf3 = Integer.valueOf(((mw8) it2.next()).b);
                    loop2: while (true) {
                        num = valueOf3;
                        while (it2.hasNext()) {
                            valueOf3 = Integer.valueOf(((mw8) it2.next()).b);
                            if (num.compareTo(valueOf3) < 0) {
                                break;
                            }
                        }
                    }
                }
                if (num != null) {
                    i2 = num.intValue();
                }
                return vh6Var.q0(g, y02.f(i2, j), ls3.a, new rs(2, arrayList));
            }
        }
    }
}
