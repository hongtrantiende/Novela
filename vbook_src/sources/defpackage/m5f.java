package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m5f  reason: default package */
/* loaded from: classes.dex */
public final class m5f {
    public static final m5f b = new m5f();
    public final AtomicReference a;

    /* JADX WARN: Type inference failed for: r1v0, types: [c3f, java.lang.Object] */
    public m5f() {
        ?? obj = new Object();
        obj.a = new HashMap();
        obj.b = new HashMap();
        this.a = new AtomicReference(new o6f(obj));
    }

    public final synchronized void a(hhe hheVar) {
        Object obj;
        c3f c3fVar = new c3f((o6f) this.a.get());
        HashMap hashMap = c3fVar.b;
        switch (hheVar.a) {
            case 0:
                obj = sbe.class;
                break;
            case 1:
                obj = rjf.class;
                break;
            case 2:
                obj = hce.class;
                break;
            case 3:
                obj = gce.class;
                break;
            case 4:
                obj = p7f.class;
                break;
            default:
                obj = elf.class;
                break;
        }
        if (hashMap.containsKey(obj)) {
            hhe hheVar2 = (hhe) hashMap.get(obj);
            if (!hheVar2.equals(hheVar) || !hheVar.equals(hheVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(String.valueOf(obj)));
            }
        } else {
            hashMap.put(obj, hheVar);
        }
        this.a.set(new o6f(c3fVar));
    }

    public final synchronized void b(i6f i6fVar) {
        c3f c3fVar = new c3f((o6f) this.a.get());
        c3fVar.c(i6fVar);
        this.a.set(new o6f(c3fVar));
    }
}
