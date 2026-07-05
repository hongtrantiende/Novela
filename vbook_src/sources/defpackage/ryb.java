package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ryb  reason: default package */
/* loaded from: classes3.dex */
public final class ryb {
    public final String a;
    public final String b;

    public ryb(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryb)) {
            return false;
        }
        ryb rybVar = (ryb) obj;
        if (c16.i(this.a, rybVar.a) && c16.i(this.b, rybVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("Engine(id=", this.a, ", name=", this.b, ")");
    }
}
