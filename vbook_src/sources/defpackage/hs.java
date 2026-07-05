package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hs  reason: default package */
/* loaded from: classes.dex */
public final class hs extends js {
    public float a;
    public float b;
    public float c;

    public hs(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.js
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return nae.e;
                }
                return this.c;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.js
    public final int b() {
        return 3;
    }

    @Override // defpackage.js
    public final js c() {
        return new hs(nae.e, nae.e, nae.e);
    }

    @Override // defpackage.js
    public final void d() {
        this.a = nae.e;
        this.b = nae.e;
        this.c = nae.e;
    }

    @Override // defpackage.js
    public final void e(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.c = f;
                return;
            }
            this.b = f;
            return;
        }
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hs) {
            hs hsVar = (hs) obj;
            if (hsVar.a == this.a && hsVar.b == this.b && hsVar.c == this.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + nk2.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        StringBuilder x = nk2.x("AnimationVector3D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        x.append(f3);
        return x.toString();
    }
}
