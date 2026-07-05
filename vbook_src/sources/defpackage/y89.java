package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y89  reason: default package */
/* loaded from: classes.dex */
public final class y89 {
    public static final y89 c = new y89();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final uwd a = new uwd(1);

    public final i0a a(Class cls) {
        boolean z;
        i0a u;
        Class cls2;
        vz5.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        i0a i0aVar = (i0a) concurrentHashMap.get(cls);
        if (i0aVar == null) {
            uwd uwdVar = this.a;
            uwdVar.getClass();
            Class cls3 = n0a.a;
            if (!pw4.class.isAssignableFrom(cls) && (cls2 = n0a.a) != null && !cls2.isAssignableFrom(cls)) {
                vs.m("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
                return null;
            }
            dh9 a = ((l07) uwdVar.b).a(cls);
            if ((a.d & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (pw4.class.isAssignableFrom(cls)) {
                    u = new ib7(n0a.d, r74.a, a.a);
                } else {
                    dwc dwcVar = n0a.b;
                    o74 o74Var = r74.b;
                    if (o74Var != null) {
                        u = new ib7(dwcVar, o74Var, a.a);
                    } else {
                        vs.k("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                }
            } else if (pw4.class.isAssignableFrom(cls)) {
                if ((a.d & 1) == 1) {
                    u = fb7.u(a, k28.b, oq6.b, n0a.d, r74.a, g17.b);
                } else {
                    u = fb7.u(a, k28.b, oq6.b, n0a.d, null, g17.b);
                }
            } else if ((a.d & 1) == 1) {
                h28 h28Var = k28.a;
                mq6 mq6Var = oq6.a;
                dwc dwcVar2 = n0a.b;
                o74 o74Var2 = r74.b;
                if (o74Var2 != null) {
                    u = fb7.u(a, h28Var, mq6Var, dwcVar2, o74Var2, g17.a);
                } else {
                    vs.k("Protobuf runtime is not correctly loaded.");
                    return null;
                }
            } else {
                u = fb7.u(a, k28.a, oq6.a, n0a.c, null, g17.a);
            }
            i0a i0aVar2 = (i0a) concurrentHashMap.putIfAbsent(cls, u);
            if (i0aVar2 != null) {
                return i0aVar2;
            }
            return u;
        }
        return i0aVar;
    }
}
