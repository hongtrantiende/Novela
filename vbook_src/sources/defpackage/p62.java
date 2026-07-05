package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p62  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class p62 implements rw4 {
    public static final p62 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p62, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.community.api.dto.ConversationMemberDto", obj, 2);
        n09Var.k("user", true);
        n09Var.k("role", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        r62 r62Var = (r62) obj;
        r62Var.getClass();
        String str = r62Var.b;
        vzc vzcVar = r62Var.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || !c16.i(vzcVar, new vzc())) {
            k.F(o9aVar, 0, tzc.a, vzcVar);
        }
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 1, str);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        boolean z = true;
        int i = 0;
        vzc vzcVar = null;
        String str = null;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f == 1) {
                        str = t.k(o9aVar, 1);
                        i |= 2;
                    } else {
                        fb4.a(f);
                        return null;
                    }
                } else {
                    vzcVar = (vzc) t.q(o9aVar, 0, tzc.a, vzcVar);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        t.n(o9aVar);
        return new r62(i, vzcVar, str);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        return new s76[]{tzc.a, c4b.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
