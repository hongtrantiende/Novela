package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rua  reason: default package */
/* loaded from: classes3.dex */
public final class rua {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public rua(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rua)) {
            return false;
        }
        rua ruaVar = (rua) obj;
        if (c16.i(this.a, ruaVar.a) && c16.i(this.b, ruaVar.b) && c16.i(this.c, ruaVar.c) && c16.i(this.d, ruaVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nk2.w(nk2.y("SourceTrackSubtitle(data=", this.a, ", type=", this.b, ", label="), this.c, ", language=", this.d, ")");
    }
}
