package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l5f  reason: default package */
/* loaded from: classes.dex */
public final class l5f {
    public static final l5f b;
    public final AtomicReference a = new AtomicReference(new c7f(new odd(17)));

    static {
        try {
            l5f l5fVar = new l5f();
            l5fVar.f(new t3f(c4f.class, new h88(28)));
            b = l5fVar;
        } catch (Exception e) {
            throw new gt1(15, e);
        }
    }

    public final s9e a(t6f t6fVar) {
        c7f c7fVar = (c7f) this.a.get();
        c7fVar.getClass();
        f7f f7fVar = new f7f(t6f.class, (hlf) t6fVar.d);
        HashMap hashMap = c7fVar.b;
        if (hashMap.containsKey(f7fVar)) {
            return ((m3f) hashMap.get(f7fVar)).b.n(t6fVar);
        }
        throw new GeneralSecurityException(hl5.n("No Key Parser for requested key type ", String.valueOf(f7fVar), " available"));
    }

    public final bfe b(s6f s6fVar) {
        c7f c7fVar = (c7f) this.a.get();
        c7fVar.getClass();
        f7f f7fVar = new f7f(s6f.class, (hlf) s6fVar.a);
        HashMap hashMap = c7fVar.d;
        if (hashMap.containsKey(f7fVar)) {
            return ((u5f) hashMap.get(f7fVar)).b.g(s6fVar);
        }
        throw new GeneralSecurityException(hl5.n("No Parameters Parser for requested key type ", String.valueOf(f7fVar), " available"));
    }

    public final d7f c(s9e s9eVar) {
        c7f c7fVar = (c7f) this.a.get();
        c7fVar.getClass();
        h7f h7fVar = new h7f(s9eVar.getClass(), t6f.class);
        HashMap hashMap = c7fVar.a;
        if (hashMap.containsKey(h7fVar)) {
            return ((t3f) hashMap.get(h7fVar)).b.k(s9eVar);
        }
        throw new GeneralSecurityException(hl5.n("No Key serializer for ", String.valueOf(h7fVar), " available"));
    }

    public final d7f d(bfe bfeVar) {
        c7f c7fVar = (c7f) this.a.get();
        c7fVar.getClass();
        h7f h7fVar = new h7f(bfeVar.getClass(), s6f.class);
        HashMap hashMap = c7fVar.c;
        if (hashMap.containsKey(h7fVar)) {
            return ((y5f) hashMap.get(h7fVar)).b.c(bfeVar);
        }
        throw new GeneralSecurityException(hl5.n("No Key Format serializer for ", String.valueOf(h7fVar), " available"));
    }

    public final synchronized void e(m3f m3fVar) {
        odd oddVar = new odd((c7f) this.a.get());
        oddVar.o(m3fVar);
        this.a.set(new c7f(oddVar));
    }

    public final synchronized void f(t3f t3fVar) {
        odd oddVar = new odd((c7f) this.a.get());
        oddVar.p(t3fVar);
        this.a.set(new c7f(oddVar));
    }

    public final synchronized void g(u5f u5fVar) {
        odd oddVar = new odd((c7f) this.a.get());
        oddVar.q(u5fVar);
        this.a.set(new c7f(oddVar));
    }

    public final synchronized void h(y5f y5fVar) {
        odd oddVar = new odd((c7f) this.a.get());
        oddVar.r(y5fVar);
        this.a.set(new c7f(oddVar));
    }
}
