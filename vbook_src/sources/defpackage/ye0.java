package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ye0  reason: default package */
/* loaded from: classes.dex */
public final class ye0 {
    public final float a;
    public final xe0 b;
    public final float c;
    public final float d;

    public ye0(float f, xe0 xe0Var, float f2, float f3) {
        this.a = f;
        this.b = xe0Var;
        this.c = f2;
        this.d = f3;
        if (nae.e <= f && f <= 1.0f) {
            return;
        }
        vs.m("The 'progress' argument must be between 0 and 1 (both inclusive)");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ye0) {
                ye0 ye0Var = (ye0) obj;
                if (Float.compare(this.a, ye0Var.a) != 0 || this.b != ye0Var.b || Float.compare(this.c, ye0Var.c) != 0 || Float.compare(this.d, ye0Var.d) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Float.hashCode(this.d) + nk2.d(this.c, (hashCode + (Float.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "BackEvent(progress=" + this.a + ", swipeEdge=" + this.b + ", touchX=" + this.c + ", touchY=" + this.d + ")";
    }
}
