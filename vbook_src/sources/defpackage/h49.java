package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h49  reason: default package */
/* loaded from: classes3.dex */
public final class h49 {
    public final ng2 a;
    public final mfb b = new mfb(new u76(this, 25));

    public h49(ng2 ng2Var) {
        this.a = ng2Var;
    }

    public final Boolean a(String str) {
        str.getClass();
        sn0 d = d();
        d.getClass();
        return (Boolean) z87.C(gs3.a, new on0(d, str, null, 0));
    }

    public final Float b(String str) {
        str.getClass();
        Double a = d().a(str);
        if (a != null) {
            return Float.valueOf((float) a.doubleValue());
        }
        return null;
    }

    public final Integer c(String str) {
        str.getClass();
        Long b = d().b(str);
        if (b != null) {
            return Integer.valueOf((int) b.longValue());
        }
        return null;
    }

    public final sn0 d() {
        return (sn0) this.b.getValue();
    }

    public final String e(String str, String str2) {
        str.getClass();
        sn0 d = d();
        d.getClass();
        return (String) z87.C(gs3.a, new rn0(d, str, str2, null, 0));
    }

    public final String f(String str) {
        str.getClass();
        sn0 d = d();
        d.getClass();
        return (String) z87.C(gs3.a, new on0(d, str, null, 3));
    }

    public final void g(String str, double d) {
        str.getClass();
        sn0 d2 = d();
        d2.getClass();
        z87.B(new pn0(d2, str, d, (m42) null, 1));
    }

    public final void h(long j, String str) {
        str.getClass();
        sn0 d = d();
        d.getClass();
        z87.B(new qn0(d, str, j, null, 1));
    }

    public final void i(String str, String str2) {
        str.getClass();
        str2.getClass();
        sn0 d = d();
        d.getClass();
        z87.B(new rn0(d, str, str2, null, 1));
    }
}
