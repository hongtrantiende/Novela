package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pwb  reason: default package */
/* loaded from: classes3.dex */
public final class pwb {
    public static final pwb d = new pwb(-1, -1);
    public final int a;
    public final int b;
    public final int c;

    public pwb(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = (i * 100000) + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwb)) {
            return false;
        }
        pwb pwbVar = (pwb) obj;
        if (this.a == pwbVar.a && this.b == pwbVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hl5.i(this.a, this.b, "TextPosition(chapterIndex=", ", charIndex=", ")");
    }
}
