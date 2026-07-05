package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tyb  reason: default package */
/* loaded from: classes3.dex */
public final class tyb {
    public final String a;
    public final String b;

    public tyb(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyb)) {
            return false;
        }
        tyb tybVar = (tyb) obj;
        if (c16.i(this.a, tybVar.a) && c16.i(this.b, tybVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("Language(id=", this.a, ", name=", this.b, ")");
    }
}
