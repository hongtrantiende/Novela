package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z89  reason: default package */
/* loaded from: classes.dex */
public final class z89 {
    public static final z89 c = new z89();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final mce a = new mce(1);

    public final j0a a(Class cls) {
        boolean z;
        p74 p74Var;
        j0a w;
        p74 p74Var2;
        Class cls2;
        wz5.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        j0a j0aVar = (j0a) concurrentHashMap.get(cls);
        if (j0aVar == null) {
            mce mceVar = this.a;
            mceVar.getClass();
            Class cls3 = o0a.a;
            if (!qw4.class.isAssignableFrom(cls) && (cls2 = o0a.a) != null && !cls2.isAssignableFrom(cls)) {
                vs.m("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
            eh9 a = ((m07) mceVar.a).a(cls);
            if ((a.d & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (qw4.class.isAssignableFrom(cls)) {
                    w = new jb7(o0a.c, s74.a, a.a);
                } else {
                    ewc ewcVar = o0a.b;
                    p74 p74Var3 = s74.b;
                    if (p74Var3 != null) {
                        w = new jb7(ewcVar, p74Var3, a.a);
                    } else {
                        vs.k("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                }
            } else if (qw4.class.isAssignableFrom(cls)) {
                i28 i28Var = l28.b;
                qq6 qq6Var = sq6.b;
                ewc ewcVar2 = o0a.c;
                if (a82.C(a.a()) != 1) {
                    p74Var2 = s74.a;
                } else {
                    p74Var2 = null;
                }
                e17 e17Var = h17.b;
                if (a instanceof eh9) {
                    w = gb7.w(a, i28Var, qq6Var, ewcVar2, p74Var2, e17Var);
                } else {
                    int[] iArr = gb7.n;
                    vm1.h();
                    return null;
                }
            } else {
                i28 i28Var2 = l28.a;
                qq6 qq6Var2 = sq6.a;
                ewc ewcVar3 = o0a.b;
                if (a82.C(a.a()) != 1) {
                    p74 p74Var4 = s74.b;
                    if (p74Var4 != null) {
                        p74Var = p74Var4;
                    } else {
                        vs.k("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    p74Var = null;
                }
                e17 e17Var2 = h17.a;
                if (a instanceof eh9) {
                    w = gb7.w(a, i28Var2, qq6Var2, ewcVar3, p74Var, e17Var2);
                } else {
                    int[] iArr2 = gb7.n;
                    vm1.h();
                    return null;
                }
            }
            j0a j0aVar2 = (j0a) concurrentHashMap.putIfAbsent(cls, w);
            if (j0aVar2 != null) {
                return j0aVar2;
            }
            return w;
        }
        return j0aVar;
    }
}
