package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: ba8  reason: default package */
/* loaded from: classes3.dex */
public final class ba8 {
    public static final aa8 Companion = new Object();
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public /* synthetic */ ba8(int i, int i2, String str, String str2, boolean z, boolean z2, String str3) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba8)) {
            return false;
        }
        ba8 ba8Var = (ba8) obj;
        if (this.a == ba8Var.a && c16.i(this.b, ba8Var.b) && c16.i(this.c, ba8Var.c) && this.d == ba8Var.d && this.e == ba8Var.e && c16.i(this.f, ba8Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + eub.k(eub.k(eub.j(eub.j(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder r = s21.r("OldSyncChapter(index=", this.a, ", url=", this.b, ", name=");
        rs8.y(r, this.c, ", read=", this.d, ", downloaded=");
        r.append(this.e);
        r.append(", nameTrans=");
        r.append(this.f);
        r.append(")");
        return r.toString();
    }
}
