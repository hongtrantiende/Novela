package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t7d  reason: default package */
/* loaded from: classes3.dex */
public final class t7d {
    public final hm8 a = yae.z(Boolean.TRUE);
    public final fm8 b = new fm8(0);
    public final fm8 c = new fm8(0);
    public final hm8 d;
    public final hm8 e;
    public final hm8 f;
    public final hm8 g;
    public iya h;
    public m82 i;
    public int j;

    public t7d() {
        Boolean bool = Boolean.FALSE;
        this.d = yae.z(bool);
        this.e = yae.z(bool);
        this.f = yae.z(bool);
        this.g = yae.z(bool);
    }

    public static /* synthetic */ void e(t7d t7dVar) {
        hq7 hq7Var = wl3.b;
        t7dVar.d(jue.O(3, am3.SECONDS));
    }

    public final boolean a() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void c() {
        int i = this.j;
        if (i > 0) {
            int i2 = i - 1;
            this.j = i2;
            if (i2 == 0 && b()) {
                e(this);
            }
        }
    }

    public final void d(long j) {
        iya iyaVar = this.h;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        if (this.j > 0) {
            return;
        }
        m82 m82Var = this.i;
        if (m82Var != null) {
            this.h = z87.v(m82Var, null, null, new ip(j, this, (m42) null, 8), 3);
        } else {
            c16.w("scope");
            throw null;
        }
    }
}
