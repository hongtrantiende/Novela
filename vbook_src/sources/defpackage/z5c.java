package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z5c  reason: default package */
/* loaded from: classes3.dex */
public final class z5c {
    public final int a;
    public final String b;
    public final float c;

    public z5c(int i, String str, float f) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5c)) {
            return false;
        }
        z5c z5cVar = (z5c) obj;
        if (this.a == z5cVar.a && c16.i(this.b, z5cVar.b) && Float.compare(this.c, z5cVar.c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + eub.j(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder r = s21.r("ThemeBackdropState(swipeBack=", this.a, ", backgroundImage=", this.b, ", backgroundImageAlpha=");
        r.append(this.c);
        r.append(")");
        return r.toString();
    }
}
