package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j2c  reason: default package */
/* loaded from: classes3.dex */
public final class j2c {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;

    public j2c(int i, int i2, int i3, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public static j2c a(j2c j2cVar, boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        if ((i4 & 1) != 0) {
            z2 = j2cVar.a;
        } else {
            z2 = true;
        }
        if ((i4 & 2) != 0) {
            z = j2cVar.b;
        }
        if ((i4 & 4) != 0) {
            i = j2cVar.c;
        }
        if ((i4 & 8) != 0) {
            i2 = j2cVar.d;
        }
        if ((i4 & 16) != 0) {
            i3 = j2cVar.e;
        }
        j2cVar.getClass();
        return new j2c(i, i2, i3, z2, z);
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2c)) {
            return false;
        }
        j2c j2cVar = (j2c) obj;
        if (this.a == j2cVar.a && this.b == j2cVar.b && this.c == j2cVar.c && this.d == j2cVar.d && this.e == j2cVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + hl5.a(this.d, hl5.a(this.c, eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("TextToSpeechState(isRunning=", this.a, ", isExpand=", this.b, ", chapterIndex=");
        rs8.q(this.c, this.d, ", startIndex=", ", endIndex=", p);
        return rs8.g(this.e, ")", p);
    }

    public /* synthetic */ j2c() {
        this(0, -1, -1, false, false);
    }
}
