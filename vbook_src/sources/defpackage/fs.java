package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fs  reason: default package */
/* loaded from: classes.dex */
public final class fs extends js {
    public float a;

    public fs(float f) {
        this.a = f;
    }

    @Override // defpackage.js
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return nae.e;
    }

    @Override // defpackage.js
    public final int b() {
        return 1;
    }

    @Override // defpackage.js
    public final js c() {
        return new fs(nae.e);
    }

    @Override // defpackage.js
    public final void d() {
        this.a = nae.e;
    }

    @Override // defpackage.js
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fs) && ((fs) obj).a == this.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        float f = this.a;
        return "AnimationVector1D: value = " + f;
    }
}
