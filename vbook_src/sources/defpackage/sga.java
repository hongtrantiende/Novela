package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sga  reason: default package */
/* loaded from: classes.dex */
public final class sga {
    public final hm8 a;
    public final hm8 b;
    public final sk8 c;
    public final long d;
    public long e;
    public float f;
    public float g;
    public long h;
    public long i;
    public b5d j;

    public sga() {
        Boolean bool = Boolean.FALSE;
        this.a = yae.z(bool);
        this.b = yae.z(bool);
        this.c = new sk8(3);
        this.d = yq7.a();
        this.e = zl1.h;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = ckc.b;
        this.i = 0L;
    }

    public final boolean a() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void c(boolean z) {
        hm8 hm8Var = this.a;
        boolean booleanValue = ((Boolean) hm8Var.getValue()).booleanValue();
        hm8 hm8Var2 = this.b;
        if (booleanValue && !z) {
            hm8Var2.setValue(Boolean.TRUE);
        } else if (z) {
            hm8Var2.setValue(Boolean.FALSE);
        }
        hm8Var.setValue(Boolean.valueOf(z));
    }
}
