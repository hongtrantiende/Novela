package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qdd  reason: default package */
/* loaded from: classes.dex */
public final class qdd {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map y = o17.y(linkedHashMap);
        linkedHashMap.clear();
        for (gdd gddVar : y.values()) {
            gddVar.b();
        }
    }

    public final String toString() {
        String g = cm9.a(qdd.class).g();
        if (g == null) {
            g = "ViewModelStore";
        }
        int hashCode = hashCode();
        nqe.u(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        Set H0 = sl1.H0(this.a.keySet());
        return g + "@" + num + "(keys=" + H0 + ")";
    }
}
