package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i2e  reason: default package */
/* loaded from: classes.dex */
public final class i2e {
    public static final i2e c = new i2e();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final fz4 a = new fz4(2);

    public final m2e a(Class cls) {
        boolean z;
        m2e d2eVar;
        h88 h88Var;
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null) {
            fz4 fz4Var = this.a;
            fz4Var.getClass();
            zj1 zj1Var = n2e.a;
            if (!o0e.class.isAssignableFrom(cls)) {
                int i = kzd.a;
            }
            k2e zzc = ((k57) fz4Var.a).zzc(cls);
            if ((zzc.d & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int i2 = kzd.a;
                int i3 = e2e.a;
                int i4 = n1e.a;
                zj1 zj1Var2 = n2e.a;
                if (zzc.a() - 1 != 1) {
                    h88Var = i0e.a;
                } else {
                    h88Var = null;
                }
                int i5 = s1e.a;
                d2eVar = c2e.x(zzc, zj1Var2, h88Var);
            } else {
                int i6 = kzd.a;
                zj1 zj1Var3 = n2e.a;
                h88 h88Var2 = i0e.a;
                d2eVar = new d2e(zj1Var3, zzc.a);
            }
            m2e m2eVar = (m2e) concurrentHashMap.putIfAbsent(cls, d2eVar);
            if (m2eVar != null) {
                return m2eVar;
            }
            return d2eVar;
        }
        return (m2e) obj;
    }
}
