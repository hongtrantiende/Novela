package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: is  reason: default package */
/* loaded from: classes.dex */
public final class is extends js {
    public float a;
    public float b;
    public float c;
    public float d;

    public is(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.js
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return nae.e;
                    }
                    return this.d;
                }
                return this.c;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.js
    public final int b() {
        return 4;
    }

    @Override // defpackage.js
    public final js c() {
        return new is(nae.e, nae.e, nae.e, nae.e);
    }

    @Override // defpackage.js
    public final void d() {
        this.a = nae.e;
        this.b = nae.e;
        this.c = nae.e;
        this.d = nae.e;
    }

    @Override // defpackage.js
    public final void e(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.d = f;
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
        if (obj instanceof is) {
            is isVar = (is) obj;
            if (isVar.a == this.a && isVar.b == this.b && isVar.c == this.c && isVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder x = nk2.x("AnimationVector4D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        x.append(f3);
        x.append(", v4 = ");
        x.append(f4);
        return x.toString();
    }
}
