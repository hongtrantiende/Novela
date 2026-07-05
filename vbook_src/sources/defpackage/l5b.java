package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l5b  reason: default package */
/* loaded from: classes.dex */
public final class l5b {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public l5b(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        zbe.i(f < nae.e ? 0.0f : f, f2 < nae.e ? 0.0f : f2, f3 < nae.e ? 0.0f : f3, f4 < nae.e ? 0.0f : f4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5b)) {
            return false;
        }
        l5b l5bVar = (l5b) obj;
        if (Float.compare(this.a, l5bVar.a) == 0 && Float.compare(this.b, l5bVar.b) == 0 && Float.compare(this.c, l5bVar.c) == 0 && Float.compare(this.d, l5bVar.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("EdgeInsets (left = ", this.a, ", top = ", this.b, ", bottom = ");
        x.append(this.c);
        x.append(", right = ");
        x.append(this.d);
        x.append(")");
        return x.toString();
    }

    public l5b() {
        this(nae.e, nae.e, nae.e, nae.e);
    }
}
