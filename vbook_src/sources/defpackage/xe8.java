package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xe8  reason: default package */
/* loaded from: classes.dex */
public final class xe8 {
    public final Context a;
    public final cna b;
    public final hz9 c;
    public final z29 d;
    public final String e;
    public final pe4 f;
    public final z41 g;
    public final z41 h;
    public final z41 i;
    public final w94 j;

    public xe8(Context context, cna cnaVar, hz9 hz9Var, z29 z29Var, String str, pe4 pe4Var, z41 z41Var, z41 z41Var2, z41 z41Var3, w94 w94Var) {
        this.a = context;
        this.b = cnaVar;
        this.c = hz9Var;
        this.d = z29Var;
        this.e = str;
        this.f = pe4Var;
        this.g = z41Var;
        this.h = z41Var2;
        this.i = z41Var3;
        this.j = w94Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe8)) {
            return false;
        }
        xe8 xe8Var = (xe8) obj;
        if (c16.i(this.a, xe8Var.a) && c16.i(this.b, xe8Var.b) && this.c == xe8Var.c && this.d == xe8Var.d && c16.i(this.e, xe8Var.e) && c16.i(this.f, xe8Var.f) && this.g == xe8Var.g && this.h == xe8Var.h && this.i == xe8Var.i && c16.i(this.j, xe8Var.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = (this.d.hashCode() + ((hashCode3 + ((hashCode2 + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = this.f.hashCode();
        int hashCode6 = this.g.hashCode();
        int hashCode7 = this.h.hashCode();
        int hashCode8 = this.i.hashCode();
        return this.j.a.hashCode() + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + hashCode) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=" + this.e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + ")";
    }
}
