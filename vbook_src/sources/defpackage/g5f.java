package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g5f  reason: default package */
/* loaded from: classes.dex */
public final class g5f {
    public static final g5f b = new g5f();
    public final HashMap a = new HashMap();

    public final synchronized void a(String str, bfe bfeVar) {
        try {
            boolean containsKey = this.a.containsKey(str);
            HashMap hashMap = this.a;
            if (containsKey) {
                if (((bfe) hashMap.get(str)).equals(bfeVar)) {
                    return;
                }
                String valueOf = String.valueOf(this.a.get(str));
                String valueOf2 = String.valueOf(bfeVar);
                throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + valueOf + "), cannot insert " + valueOf2);
            }
            hashMap.put(str, bfeVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (bfe) entry.getValue());
        }
    }
}
