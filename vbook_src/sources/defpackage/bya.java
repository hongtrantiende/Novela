package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bya  reason: default package */
/* loaded from: classes3.dex */
public final class bya {
    public final float a;

    public bya(float f) {
        this.a = f;
        if (rg3.a(f, nae.e) > 0) {
            return;
        }
        ov5.a("invalid minSize");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bya) {
            if (rg3.b(this.a, ((bya) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
