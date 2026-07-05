package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bva  reason: default package */
/* loaded from: classes3.dex */
public final class bva {
    public final int a;
    public final int b;
    public final int c;

    public bva(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bva)) {
            return false;
        }
        bva bvaVar = (bva) obj;
        if (this.a == bvaVar.a && this.b == bvaVar.b && this.c == bvaVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hl5.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return rs8.g(this.c, ")", hl5.r(this.a, this.b, "TextEdit(start=", ", deletedLength=", ", insertedLength="));
    }
}
