package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oia  reason: default package */
/* loaded from: classes3.dex */
public final class oia {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public oia(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public static oia a(oia oiaVar, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, int i6) {
        boolean z4;
        boolean z5;
        if ((i6 & 1) != 0) {
            i = oiaVar.a;
        }
        int i7 = i;
        if ((i6 & 2) != 0) {
            i2 = oiaVar.b;
        }
        int i8 = i2;
        if ((i6 & 4) != 0) {
            i3 = oiaVar.c;
        }
        int i9 = i3;
        if ((i6 & 8) != 0) {
            i4 = oiaVar.d;
        }
        int i10 = i4;
        if ((i6 & 16) != 0) {
            i5 = oiaVar.e;
        }
        int i11 = i5;
        if ((i6 & 32) != 0) {
            z = oiaVar.f;
        }
        boolean z6 = z;
        if ((i6 & 64) != 0) {
            z4 = oiaVar.g;
        } else {
            z4 = z2;
        }
        if ((i6 & Token.CASE) != 0) {
            z5 = oiaVar.h;
        } else {
            z5 = z3;
        }
        oiaVar.getClass();
        return new oia(i7, i8, i9, i10, i11, z6, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oia)) {
            return false;
        }
        oia oiaVar = (oia) obj;
        if (this.a == oiaVar.a && this.b == oiaVar.b && this.c == oiaVar.c && this.d == oiaVar.d && this.e == oiaVar.e && this.f == oiaVar.f && this.g == oiaVar.g && this.h == oiaVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + eub.k(eub.k(hl5.a(this.e, hl5.a(this.d, hl5.a(this.c, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "ShelfConfig(filterType=", ", viewType=", ", columnSize=");
        rs8.q(this.c, this.d, ", sortBy=", ", sortOrder=", r);
        eub.w(r, this.e, ", isShowReadPercent=", this.f, ", isShowTotalChapter=");
        r.append(this.g);
        r.append(", isShowNewChapter=");
        r.append(this.h);
        r.append(")");
        return r.toString();
    }
}
