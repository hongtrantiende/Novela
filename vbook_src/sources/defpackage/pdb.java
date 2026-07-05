package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: pdb  reason: default package */
/* loaded from: classes3.dex */
public final class pdb {
    public static final odb Companion = new Object();
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final long f;
    public final long g;

    public /* synthetic */ pdb(int i, String str, String str2, String str3, int i2, int i3, long j, long j2) {
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
            this.d = 0;
        } else {
            this.d = i2;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i3;
        }
        if ((i & 32) == 0) {
            this.f = 0L;
        } else {
            this.f = j;
        }
        if ((i & 64) == 0) {
            this.g = 0L;
        } else {
            this.g = j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdb)) {
            return false;
        }
        pdb pdbVar = (pdb) obj;
        if (c16.i(this.a, pdbVar.a) && c16.i(this.b, pdbVar.b) && c16.i(this.c, pdbVar.c) && this.d == pdbVar.d && this.e == pdbVar.e && this.f == pdbVar.f && this.g == pdbVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + hl5.c(hl5.a(this.e, hl5.a(this.d, eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("SyncQtWord(id=", this.a, ", word=", this.b, ", trans=");
        a82.u(this.d, this.c, ", type=", ", mode=", y);
        y.append(this.e);
        y.append(", createAt=");
        y.append(this.f);
        return a82.n(y, ", updateAt=", this.g, ")");
    }

    public pdb(String str, String str2, String str3, int i, int i2, long j, long j2) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = j2;
    }
}
