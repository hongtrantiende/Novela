package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pia  reason: default package */
/* loaded from: classes3.dex */
public final class pia {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public pia(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pia)) {
            return false;
        }
        pia piaVar = (pia) obj;
        if (this.a == piaVar.a && this.b == piaVar.b && this.c == piaVar.c && this.d == piaVar.d && this.e == piaVar.e && this.f == piaVar.f && this.g == piaVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + eub.k(eub.k(hl5.a(this.d, hl5.a(this.c, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "ShelfConfigState(shelfType=", ", columnSize=", ", sortBy=");
        rs8.q(this.c, this.d, ", sortOrder=", ", isShowReadPercent=", r);
        rs8.z(r, this.e, ", isShowTotalChapter=", this.f, ", isShowNewChapter=");
        return rs8.m(")", r, this.g);
    }
}
