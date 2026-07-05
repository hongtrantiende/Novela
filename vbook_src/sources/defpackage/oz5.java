package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oz5  reason: default package */
/* loaded from: classes3.dex */
public final class oz5 {
    public final m82 a;
    public final gxa b;
    public final gxa c;
    public final lq d;
    public final lq e;
    public long f;
    public final nq7 g;
    public final nq7 h;

    public oz5(m82 m82Var, lu4 lu4Var) {
        m82Var.getClass();
        this.a = m82Var;
        this.b = new gxa(0.5f, 300.0f, Float.valueOf(0.001f));
        this.c = new gxa(0.5f, 300.0f, new y78((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L)));
        this.d = tc4.a(nae.e, 0.001f);
        this.e = new lq(new y78(0L), fca.k, new y78((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L)), 8);
        this.f = 0L;
        h01 h01Var = new h01(this, 1);
        kq7 kq7Var = kq7.a;
        this.g = ote.t(kq7Var, h01Var);
        this.h = dab.b(kq7Var, m82Var, new vi(this, 3));
    }

    public /* synthetic */ oz5(m82 m82Var) {
        this(m82Var, new j35(6));
    }
}
