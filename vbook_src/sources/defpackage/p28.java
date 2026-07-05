package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p28  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class p28 implements rw4 {
    public static final p28 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [p28, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        descriptor = new n09("com.reader.data.community.api.NoData", obj, 0);
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        ((r28) obj).getClass();
        o9a o9aVar = descriptor;
        jbeVar.k(o9aVar).K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        int f = t.f(o9aVar);
        if (f == -1) {
            t.n(o9aVar);
            return new Object();
        }
        fb4.a(f);
        return null;
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        return new s76[0];
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
