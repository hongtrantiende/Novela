package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v66  reason: default package */
/* loaded from: classes3.dex */
public abstract class v66 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final String a(gi1 gi1Var) {
        gi1Var.getClass();
        ConcurrentHashMap concurrentHashMap = a;
        String str = (String) concurrentHashMap.get(gi1Var);
        if (str == null) {
            String name = nmd.B(gi1Var).getName();
            concurrentHashMap.put(gi1Var, name);
            return name;
        }
        return str;
    }
}
