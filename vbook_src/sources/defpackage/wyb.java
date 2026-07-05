package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wyb  reason: default package */
/* loaded from: classes3.dex */
public final class wyb {
    public final String a;
    public final String b;
    public final boolean c;

    public wyb(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyb)) {
            return false;
        }
        wyb wybVar = (wyb) obj;
        if (c16.i(this.a, wybVar.a) && c16.i(this.b, wybVar.b) && this.c == wybVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rs8.m(")", nk2.y("Voice(id=", this.a, ", name=", this.b, ", isRequireNetwork="), this.c);
    }
}
