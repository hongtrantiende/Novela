package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uy1  reason: default package */
/* loaded from: classes3.dex */
public final class uy1 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final Object a(h40 h40Var, vt4 vt4Var) {
        h40Var.getClass();
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(h40Var);
        if (obj != null) {
            return obj;
        }
        Object invoke = vt4Var.invoke();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(h40Var, invoke);
        if (putIfAbsent != null) {
            invoke = putIfAbsent;
        }
        invoke.getClass();
        return invoke;
    }

    public final boolean b(h40 h40Var) {
        h40Var.getClass();
        return d().containsKey(h40Var);
    }

    public final Object c(h40 h40Var) {
        h40Var.getClass();
        Object obj = d().get(h40Var);
        if (obj != null) {
            return obj;
        }
        cp8.t(h40Var, "No instance for key ");
        return null;
    }

    public final Map d() {
        return this.a;
    }

    public final Object e(h40 h40Var) {
        h40Var.getClass();
        return d().get(h40Var);
    }

    public final void f(h40 h40Var, Object obj) {
        h40Var.getClass();
        obj.getClass();
        d().put(h40Var, obj);
    }
}
