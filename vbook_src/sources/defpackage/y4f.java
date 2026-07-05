package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y4f  reason: default package */
/* loaded from: classes.dex */
public final class y4f {
    public static final y4f b;
    public final HashMap a = new HashMap();

    static {
        vhe vheVar = new vhe(12);
        y4f y4fVar = new y4f();
        try {
            y4fVar.b(vheVar, j4f.class);
            b = y4fVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final s9e a(bfe bfeVar, Integer num) {
        s9e a;
        synchronized (this) {
            vhe vheVar = (vhe) this.a.get(bfeVar.getClass());
            if (vheVar != null) {
                a = vheVar.a(bfeVar, num);
            } else {
                String valueOf = String.valueOf(bfeVar);
                throw new GeneralSecurityException("Cannot create a new key for parameters " + valueOf + ": no key creator for this class was registered.");
            }
        }
        return a;
    }

    public final synchronized void b(vhe vheVar, Class cls) {
        try {
            vhe vheVar2 = (vhe) this.a.get(cls);
            if (vheVar2 != null && !vheVar2.equals(vheVar)) {
                String valueOf = String.valueOf(cls);
                throw new GeneralSecurityException("Different key creator for parameters class " + valueOf + " already inserted");
            }
            this.a.put(cls, vheVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
