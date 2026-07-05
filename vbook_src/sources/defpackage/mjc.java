package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mjc  reason: default package */
/* loaded from: classes3.dex */
public final class mjc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public mjc(String str, String str2, String str3, String str4) {
        hl5.z(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjc)) {
            return false;
        }
        mjc mjcVar = (mjc) obj;
        if (c16.i(this.a, mjcVar.a) && c16.i(this.b, mjcVar.b) && c16.i(this.c, mjcVar.c) && c16.i(this.d, mjcVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nk2.w(nk2.y("TrackSubtitle(data=", this.a, ", type=", this.b, ", label="), this.c, ", language=", this.d, ")");
    }
}
