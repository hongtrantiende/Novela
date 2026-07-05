package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k56  reason: default package */
/* loaded from: classes3.dex */
public final class k56 implements s76 {
    public static final k56 a = new Object();
    public static final q9a b = aze.o("kotlinx.serialization.json.JsonPrimitive", w59.n, new o9a[0]);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        i56 i56Var = (i56) obj;
        i56Var.getClass();
        o28.q(jbeVar);
        if (i56Var instanceof a56) {
            jbeVar.G(b56.a, a56.INSTANCE);
        } else {
            jbeVar.G(x46.a, (w46) i56Var);
        }
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        String str;
        g46 r = o28.r(yq2Var);
        k46 i = r.i();
        if (!(i instanceof i56)) {
            String str2 = "Unexpected JSON element, expected JsonPrimitive, had " + cm9.a(i.getClass());
            if (r.y().a.m) {
                str = am8.C(i.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new q46(am8.z(str2, -1, null, null, str));
        }
        return (i56) i;
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
