package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gs  reason: default package */
/* loaded from: classes.dex */
public final class gs extends js {
    public float a;
    public float b;

    public gs(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.js
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                return nae.e;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.js
    public final int b() {
        return 2;
    }

    @Override // defpackage.js
    public final js c() {
        return new gs(nae.e, nae.e);
    }

    @Override // defpackage.js
    public final void d() {
        this.a = nae.e;
        this.b = nae.e;
    }

    @Override // defpackage.js
    public final void e(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.b = f;
            return;
        }
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gs) {
            gs gsVar = (gs) obj;
            if (gsVar.a == this.a && gsVar.b == this.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        return "AnimationVector2D: v1 = " + f + ", v2 = " + f2;
    }
}
