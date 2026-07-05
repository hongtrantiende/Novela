package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v40  reason: default package */
/* loaded from: classes3.dex */
public final class v40 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public v40(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v40) {
                v40 v40Var = (v40) obj;
                if (Float.compare(this.a, v40Var.a) != 0 || Float.compare(this.b, v40Var.b) != 0 || Float.compare(this.c, v40Var.c) != 0 || this.d != v40Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("EmotionProfile(volume=", this.a, ", speed=", this.b, ", pitch=");
        x.append(this.c);
        x.append(", attackTimeMs=");
        x.append(this.d);
        x.append(")");
        return x.toString();
    }
}
