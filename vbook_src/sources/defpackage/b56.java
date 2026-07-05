package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b56  reason: default package */
/* loaded from: classes3.dex */
public final class b56 implements s76 {
    public static final b56 a = new Object();
    public static final q9a b = aze.o("kotlinx.serialization.json.JsonNull", t9a.f, new o9a[0]);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        ((a56) obj).getClass();
        o28.q(jbeVar);
        jbeVar.D();
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o28.r(yq2Var);
        if (!yq2Var.w()) {
            return a56.INSTANCE;
        }
        throw new q46(am8.z("Expected 'null' literal", -1, null, null, null));
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
