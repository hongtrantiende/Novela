package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cgc  reason: default package */
/* loaded from: classes.dex */
public final class cgc {
    public static final yy9 e = oue.G(new tsa(17, (byte) 0), new txb(12));
    public float a;
    public final dm8 b;
    public vt4 c = new a1c(11);
    public final dm8 d;

    public cgc(float f, float f2, float f3) {
        this.a = f;
        this.b = new dm8(f3);
        this.d = new dm8(f2);
    }

    public final float a() {
        if (this.a == nae.e) {
            return nae.e;
        }
        return this.d.h() / this.a;
    }

    public final void b(float f) {
        this.d.i(dce.m(f, this.a, nae.e));
    }
}
