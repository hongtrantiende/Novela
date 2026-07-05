package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dt8  reason: default package */
/* loaded from: classes.dex */
public final class dt8 {
    public final ied a;
    public op8 b;
    public final l97 c = new l97(this);
    public final m41 d;
    public iya e;
    public final hm8 f;
    public final em8 g;
    public final hm8 h;
    public final sj4 i;
    public final boolean j;

    public dt8(ied iedVar, pp8 pp8Var) {
        this.a = iedVar;
        m41 a = k27.a(ab3.a);
        this.d = a;
        this.f = yae.z(new Object());
        this.g = new em8(0);
        this.h = yae.z(Boolean.FALSE);
        this.i = z1d.A(new yh2(1, iedVar.d, iedVar.f, new ao0(this, null, 3)));
        lb4 lb4Var = lb4.e;
        lb4 lb4Var2 = lb4.a;
        lb4 lb4Var3 = lb4.d;
        lb4 lb4Var4 = lb4.b;
        lb4 lb4Var5 = lb4.c;
        b00.F0(new lb4[]{lb4Var2, lb4Var3, lb4Var4, lb4Var5, lb4Var});
        this.e = z87.v(a, null, null, new byb(this, pp8Var, (m42) null, 6), 3);
        z87.v(a, null, null, new ov9(this, (m42) null, 25), 3);
        this.j = true;
        b00.F0(new lb4[]{lb4Var3, lb4Var4, lb4Var5});
    }

    public final boolean a(int i, boolean z) {
        ied iedVar = this.a;
        if (iedVar.c.a()) {
            ((pga) iedVar.h.c).f(new l2a(i));
            return true;
        }
        return iedVar.g.c(i, z);
    }
}
