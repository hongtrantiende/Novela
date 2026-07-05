package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w89  reason: default package */
/* loaded from: classes.dex */
public final class w89 {
    public static final w89 c = new w89();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final n07 a = new n07(0);

    public final h0a a(Class cls) {
        boolean z;
        n74 n74Var;
        h0a w;
        n74 n74Var2;
        Class cls2;
        uz5.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        h0a h0aVar = (h0a) concurrentHashMap.get(cls);
        if (h0aVar == null) {
            n07 n07Var = this.a;
            n07Var.getClass();
            Class cls3 = m0a.a;
            if (!ow4.class.isAssignableFrom(cls) && (cls2 = m0a.a) != null && !cls2.isAssignableFrom(cls)) {
                vs.m("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
            ch9 a = ((k07) n07Var.b).a(cls);
            if ((a.d & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (ow4.class.isAssignableFrom(cls)) {
                    w = new hb7(m0a.c, q74.a, a.a);
                } else {
                    cwc cwcVar = m0a.b;
                    n74 n74Var3 = q74.b;
                    if (n74Var3 != null) {
                        w = new hb7(cwcVar, n74Var3, a.a);
                    } else {
                        vs.k("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                }
            } else if (ow4.class.isAssignableFrom(cls)) {
                g28 g28Var = j28.b;
                pq6 pq6Var = rq6.b;
                cwc cwcVar2 = m0a.c;
                if (a82.C(a.a()) != 1) {
                    n74Var2 = q74.a;
                } else {
                    n74Var2 = null;
                }
                c17 c17Var = f17.b;
                if (a instanceof ch9) {
                    w = eb7.w(a, g28Var, pq6Var, cwcVar2, n74Var2, c17Var);
                } else {
                    int[] iArr = eb7.n;
                    vm1.h();
                    return null;
                }
            } else {
                g28 g28Var2 = j28.a;
                pq6 pq6Var2 = rq6.a;
                cwc cwcVar3 = m0a.b;
                if (a82.C(a.a()) != 1) {
                    n74 n74Var4 = q74.b;
                    if (n74Var4 != null) {
                        n74Var = n74Var4;
                    } else {
                        vs.k("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    n74Var = null;
                }
                c17 c17Var2 = f17.a;
                if (a instanceof ch9) {
                    w = eb7.w(a, g28Var2, pq6Var2, cwcVar3, n74Var, c17Var2);
                } else {
                    int[] iArr2 = eb7.n;
                    vm1.h();
                    return null;
                }
            }
            h0a h0aVar2 = (h0a) concurrentHashMap.putIfAbsent(cls, w);
            if (h0aVar2 != null) {
                return h0aVar2;
            }
            return w;
        }
        return h0aVar;
    }
}
