package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uad  reason: default package */
/* loaded from: classes.dex */
public final class uad {
    public static final uad d = new uad(0, 0);
    public final int a;
    public final int b;
    public final float c;

    static {
        a2d.K(0);
        a2d.K(1);
        a2d.K(3);
    }

    public uad(float f, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uad) {
            uad uadVar = (uad) obj;
            if (this.a == uadVar.a && this.b == uadVar.b && this.c == uadVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.a) * 31) + this.b) * 31);
    }

    public uad(int i, int i2) {
        this(1.0f, i, i2);
    }
}
