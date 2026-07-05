package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w14  reason: default package */
/* loaded from: classes3.dex */
public final class w14 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final byte[] k;

    public w14(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, String str3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = bArr;
    }

    public final boolean a() {
        return this.d;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w14) {
                w14 w14Var = (w14) obj;
                if (this.a != w14Var.a || this.b != w14Var.b || this.c != w14Var.c || this.d != w14Var.d || this.e != w14Var.e || this.f != w14Var.f || this.g != w14Var.g || !this.h.equals(w14Var.h) || !this.i.equals(w14Var.i) || !this.j.equals(w14Var.j) || !c16.i(this.k, w14Var.k)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int j = eub.j(eub.j(eub.j(eub.k(eub.k(eub.k(eub.k(eub.k(hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        byte[] bArr = this.k;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        return j + hashCode;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.k);
        StringBuilder r = hl5.r(this.a, this.b, "ExportBookConfig(fromIndex=", ", toIndex=", ", includeTOCPage=");
        rs8.z(r, this.c, ", includeFirstPage=", this.d, ", includeTranslateContent=");
        rs8.z(r, this.e, ", includeChapterTitle=", this.f, ", mergeIntoSingleFile=");
        r.append(this.g);
        r.append(", introduction=");
        r.append(this.h);
        r.append(", customName=");
        nk2.C(r, this.i, ", customAuthor=", this.j, ", customCoverBytes=");
        return s21.q(r, arrays, ")");
    }
}
