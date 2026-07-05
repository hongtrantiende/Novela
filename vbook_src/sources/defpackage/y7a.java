package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y7a  reason: default package */
/* loaded from: classes.dex */
public abstract class y7a {
    public static final AtomicInteger a = new AtomicInteger(0);

    public static final void a(nx5 nx5Var, u7a u7aVar) {
        c00 c00Var = nx5Var.b;
        int k = p17.k(tl1.s(u7aVar, 10));
        if (k < 16) {
            k = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k);
        Iterator it = u7aVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((k8a) entry.getKey()).a, entry.getValue());
        }
        c00Var.b(linkedHashMap, "properties");
    }

    public static final nq7 b(nq7 nq7Var, xt4 xt4Var) {
        return nq7Var.a0(new ri1(xt4Var));
    }

    public static final nq7 c(nq7 nq7Var, boolean z, xt4 xt4Var) {
        return nq7Var.a0(new iy(xt4Var, z));
    }
}
