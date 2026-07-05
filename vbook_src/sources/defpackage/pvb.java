package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: pvb  reason: default package */
/* loaded from: classes3.dex */
public final class pvb {
    public static final ovb Companion = new Object();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ pvb(String str, String str2, int i, String str3) {
        if (6 == (i & 6)) {
            this.a = (i & 1) == 0 ? "" : str;
            this.b = str2;
            this.c = str3;
            return;
        }
        w92.x(i, 6, nvb.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvb)) {
            return false;
        }
        pvb pvbVar = (pvb) obj;
        if (c16.i(this.a, pvbVar.a) && c16.i(this.b, pvbVar.b) && c16.i(this.c, pvbVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return s21.q(nk2.y("TextLookupDto(id=", this.a, ", name=", this.b, ", url="), this.c, ")");
    }

    public pvb(String str, String str2, String str3) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
