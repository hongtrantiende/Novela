package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x46  reason: default package */
/* loaded from: classes3.dex */
public final class x46 implements s76 {
    public static final x46 a = new Object();
    public static final y59 b = aze.e("kotlinx.serialization.json.JsonLiteral", w59.n);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        w46 w46Var = (w46) obj;
        w46Var.getClass();
        String str = w46Var.b;
        o28.q(jbeVar);
        if (w46Var.a) {
            jbeVar.I(str);
            return;
        }
        Long U = r4b.U(str);
        if (U != null) {
            jbeVar.A(U.longValue());
            return;
        }
        stc t = pbe.t(str);
        if (t != null) {
            jbeVar.w(wtc.b).A(t.a);
            return;
        }
        Double B = q4b.B(str);
        if (B != null) {
            jbeVar.r(B.doubleValue());
            return;
        }
        Boolean M0 = k4b.M0(str);
        if (M0 != null) {
            jbeVar.n(M0.booleanValue());
        } else {
            jbeVar.I(str);
        }
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        String str;
        g46 r = o28.r(yq2Var);
        k46 i = r.i();
        if (!(i instanceof w46)) {
            String str2 = "Unexpected JSON element, expected JsonLiteral, had " + cm9.a(i.getClass());
            if (r.y().a.m) {
                str = am8.C(i.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new q46(am8.z(str2, -1, null, null, str));
        }
        return (w46) i;
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
