package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d69  reason: default package */
/* loaded from: classes.dex */
public abstract class d69 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(c69.a, 0);
        hashMap.put(c69.b, 1);
        hashMap.put(c69.c, 2);
        for (c69 c69Var : hashMap.keySet()) {
            a.append(((Integer) b.get(c69Var)).intValue(), c69Var);
        }
    }

    public static int a(c69 c69Var) {
        Integer num = (Integer) b.get(c69Var);
        if (num != null) {
            return num.intValue();
        }
        cp8.t(c69Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static c69 b(int i) {
        c69 c69Var = (c69) a.get(i);
        if (c69Var != null) {
            return c69Var;
        }
        vs.m(a82.j(i, "Unknown Priority for value "));
        return null;
    }
}
