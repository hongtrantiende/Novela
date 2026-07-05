package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: scb  reason: default package */
/* loaded from: classes3.dex */
public final class scb {
    public static final rcb Companion = new Object();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public /* synthetic */ scb(int i, String str, String str2, String str3, String str4, long j) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scb)) {
            return false;
        }
        scb scbVar = (scb) obj;
        if (c16.i(this.a, scbVar.a) && c16.i(this.b, scbVar.b) && c16.i(this.c, scbVar.c) && c16.i(this.d, scbVar.d) && this.e == scbVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder y = nk2.y("SyncExtensionSource(id=", this.a, ", path=", this.b, ", author=");
        nk2.C(y, this.c, ", description=", this.d, ", createAt=");
        return hl5.q(y, this.e, ")");
    }

    public scb(String str, String str2, String str3, String str4, long j) {
        hl5.z(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
    }
}
