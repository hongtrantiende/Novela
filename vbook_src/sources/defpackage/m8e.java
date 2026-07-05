package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m8e  reason: default package */
/* loaded from: classes.dex */
public final class m8e {
    public static final m8e c = new m8e();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final n07 a = new n07(1);

    public final o8e a(Class cls) {
        boolean z;
        v28 v28Var;
        o8e o;
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null) {
            n07 n07Var = this.a;
            n07Var.getClass();
            m7e.class.isAssignableFrom(cls);
            n8e zza = ((l97) n07Var.b).zza(cls);
            if ((zza.d & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                o = new j8e(zza.a);
            } else {
                if (z7e.a[a82.C(zza.a())] != 1) {
                    v28Var = h7e.a;
                } else {
                    v28Var = null;
                }
                o = h8e.o(zza, v28Var);
            }
            byte[] bArr = n7e.a;
            o8e o8eVar = (o8e) concurrentHashMap.putIfAbsent(cls, o);
            if (o8eVar != null) {
                return o8eVar;
            }
            return o;
        }
        return (o8e) obj;
    }
}
