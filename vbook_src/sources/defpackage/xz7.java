package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xz7  reason: default package */
/* loaded from: classes.dex */
public final class xz7 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public xz7(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xz7.class == obj.getClass()) {
            xz7 xz7Var = (xz7) obj;
            if (this.c == xz7Var.c && this.d == xz7Var.d && this.b == xz7Var.b && this.a == xz7Var.a && this.e == xz7Var.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + hl5.a(this.a, nk2.d(this.b, nk2.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
