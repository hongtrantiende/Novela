package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c3f  reason: default package */
/* loaded from: classes.dex */
public final class c3f {
    public HashMap a;
    public HashMap b;

    public c3f(o6f o6fVar) {
        this.a = new HashMap(o6fVar.a);
        this.b = new HashMap(o6fVar.b);
    }

    public hvc a() {
        return new hvc(21, Collections.unmodifiableMap(this.a), Collections.unmodifiableMap(this.b));
    }

    public void b(Enum r2, Object obj) {
        this.a.put(r2, obj);
        this.b.put(obj, r2);
    }

    public void c(i6f i6fVar) {
        HashMap hashMap = this.a;
        if (i6fVar != null) {
            p6f p6fVar = new p6f(i6fVar.a, i6fVar.b);
            if (hashMap.containsKey(p6fVar)) {
                i6f i6fVar2 = (i6f) hashMap.get(p6fVar);
                if (i6fVar2.equals(i6fVar) && i6fVar == i6fVar2) {
                    return;
                }
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(String.valueOf(p6fVar)));
            }
            hashMap.put(p6fVar, i6fVar);
            return;
        }
        xk5.k("primitive constructor must be non-null");
    }
}
