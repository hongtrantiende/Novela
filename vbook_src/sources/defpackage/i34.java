package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i34  reason: default package */
/* loaded from: classes.dex */
public final class i34 {
    public final Object a = new Object();
    public final hn8 b = hn8.f(ie2.s(pe4.a), "extension_cache");
    public final HashMap c = new HashMap();

    public final na3 a(String str) {
        na3 na3Var;
        synchronized (this.a) {
            try {
                HashMap hashMap = this.c;
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new na3(5242880L, hn8.f(this.b, str));
                    hashMap.put(str, obj);
                }
                na3Var = (na3) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return na3Var;
    }

    public final void b(String str) {
        str.getClass();
        ra3 ra3Var = a(str).a.b;
        synchronized (ra3Var.D) {
            try {
                ra3Var.G();
                for (oa3 oa3Var : (oa3[]) ra3Var.f.values().toArray(new oa3[0])) {
                    ra3Var.m0(oa3Var);
                }
                ra3Var.K = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
