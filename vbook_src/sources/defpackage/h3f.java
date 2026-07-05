package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h3f  reason: default package */
/* loaded from: classes.dex */
public final class h3f {
    public static final Logger c = Logger.getLogger(h3f.class.getName());
    public static final h3f d;
    public ConcurrentHashMap a;
    public ConcurrentHashMap b;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, h3f] */
    static {
        ?? obj = new Object();
        obj.a = new ConcurrentHashMap();
        obj.b = new ConcurrentHashMap();
        d = obj;
    }

    public final u3f a(String str) {
        u3f u3fVar;
        synchronized (this) {
            if (this.a.containsKey(str)) {
                u3fVar = (u3f) this.a.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
            }
        }
        return u3fVar;
    }

    public final synchronized void b(u3f u3fVar, int i, boolean z) {
        boolean d2;
        if (i != 1) {
            d2 = eub.b(i);
        } else {
            d2 = eub.d(i);
        }
        if (d2) {
            d(u3fVar, z);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }

    public final synchronized void c(u3f u3fVar, boolean z) {
        b(u3fVar, 1, z);
    }

    public final synchronized void d(u3f u3fVar, boolean z) {
        try {
            String str = u3fVar.a;
            if (z && this.b.containsKey(str) && !((Boolean) this.b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            u3f u3fVar2 = (u3f) this.a.get(str);
            if (u3fVar2 != null && !u3fVar2.getClass().equals(u3fVar.getClass())) {
                c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                String name = u3fVar2.getClass().getName();
                String name2 = u3fVar.getClass().getName();
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + name + ", cannot be re-registered with " + name2);
            }
            this.a.putIfAbsent(str, u3fVar);
            this.b.put(str, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }
}
