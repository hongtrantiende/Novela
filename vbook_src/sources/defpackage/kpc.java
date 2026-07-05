package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kpc  reason: default package */
/* loaded from: classes3.dex */
public final class kpc {
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public kpc(String str, int i, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public static kpc a(kpc kpcVar, String str, int i, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            str = kpcVar.a;
        }
        String str3 = str;
        if ((i2 & 2) != 0) {
            i = kpcVar.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = kpcVar.c;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            z = kpcVar.d;
        }
        boolean z5 = z;
        if ((i2 & 16) != 0) {
            z2 = kpcVar.e;
        }
        boolean z6 = z2;
        if ((i2 & 32) != 0) {
            z3 = kpcVar.f;
        }
        boolean z7 = z3;
        if ((i2 & 64) != 0) {
            z4 = kpcVar.g;
        }
        kpcVar.getClass();
        str3.getClass();
        str4.getClass();
        return new kpc(str3, i3, str4, z5, z6, z7, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpc)) {
            return false;
        }
        kpc kpcVar = (kpc) obj;
        if (c16.i(this.a, kpcVar.a) && this.b == kpcVar.b && c16.i(this.c, kpcVar.c) && this.d == kpcVar.d && this.e == kpcVar.e && this.f == kpcVar.f && this.g == kpcVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + eub.k(eub.k(eub.k(eub.j(hl5.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder s = s21.s("Info(bookId=", this.a, ", chapterIndex=", this.b, ", chapterName=");
        rs8.y(s, this.c, ", isExpand=", this.d, ", isLoading=");
        rs8.z(s, this.e, ", isPlaying=", this.f, ", isError=");
        return rs8.m(")", s, this.g);
    }

    public /* synthetic */ kpc() {
        this("", 0, "", false, false, false, false);
    }
}
