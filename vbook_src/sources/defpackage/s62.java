package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s62  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class s62 implements rw4 {
    public static final s62 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, s62, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.community.api.dto.ConversationUnreadCountDto", obj, 1);
        n09Var.k("unread_count", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        u62 u62Var = (u62) obj;
        u62Var.getClass();
        int i = u62Var.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || i != 0) {
            k.z(0, i, o9aVar);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f == 0) {
                    i2 = t.r(o9aVar, 0);
                    i = 1;
                } else {
                    fb4.a(f);
                    return null;
                }
            } else {
                z = false;
            }
        }
        t.n(o9aVar);
        return new u62(i, i2);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        return new s76[]{xy5.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
