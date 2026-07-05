package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ty2  reason: default package */
/* loaded from: classes.dex */
public final class ty2 {
    public final String a;
    public final fz4 b;

    public ty2(Set set, fz4 fz4Var) {
        this.a = b(set);
        this.b = fz4Var;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            sc0 sc0Var = (sc0) it.next();
            sb.append(sc0Var.a);
            sb.append('/');
            sb.append(sc0Var.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        fz4 fz4Var = this.b;
        synchronized (((HashSet) fz4Var.a)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) fz4Var.a);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) fz4Var.a)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) fz4Var.a);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
