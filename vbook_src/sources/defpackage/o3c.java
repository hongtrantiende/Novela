package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o3c  reason: default package */
/* loaded from: classes3.dex */
public final class o3c {
    public final String a;
    public final String b;

    public o3c(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3c)) {
            return false;
        }
        o3c o3cVar = (o3c) obj;
        if (c16.i(this.a, o3cVar.a) && c16.i(this.b, o3cVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("TextTranslateLookup(name=", this.a, ", url=", this.b, ")");
    }
}
