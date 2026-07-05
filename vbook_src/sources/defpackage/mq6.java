package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mq6  reason: default package */
/* loaded from: classes.dex */
public final class mq6 extends oq6 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(long j, Object obj, int i) {
        List arrayList;
        List list = (List) fxc.c.i(obj, j);
        if (list.isEmpty()) {
            if (list instanceof qk6) {
                arrayList = new pk6(i);
            } else {
                arrayList = new ArrayList(i);
            }
            fxc.o(obj, j, arrayList);
            return arrayList;
        } else if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            fxc.o(obj, j, arrayList2);
            return arrayList2;
        } else if (list instanceof mwc) {
            mwc mwcVar = (mwc) list;
            pk6 pk6Var = new pk6(mwcVar.a.size() + i);
            pk6Var.addAll(mwcVar);
            fxc.o(obj, j, pk6Var);
            return pk6Var;
        } else {
            return list;
        }
    }

    @Override // defpackage.oq6
    public final void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) fxc.c.i(obj, j);
        if (list instanceof qk6) {
            unmodifiableList = ((qk6) list).S();
        } else if (c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        fxc.o(obj, j, unmodifiableList);
    }

    @Override // defpackage.oq6
    public final void b(Object obj, long j, Object obj2) {
        List list = (List) fxc.c.i(obj2, j);
        List d = d(j, obj, list.size());
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        fxc.o(obj, j, list);
    }

    @Override // defpackage.oq6
    public final List c(Object obj, long j) {
        return d(j, obj, 10);
    }
}
