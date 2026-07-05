package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hp5  reason: default package */
/* loaded from: classes.dex */
public final class hp5 {
    public final d82 a;
    public final d82 b;
    public final d82 c;
    public final z41 d;
    public final z41 e;
    public final xt4 f;
    public final xt4 g;
    public final xt4 h;
    public final una i;
    public final hz9 j;
    public final z29 k;

    public hp5(d82 d82Var, d82 d82Var2, d82 d82Var3, z41 z41Var, z41 z41Var2, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, una unaVar, hz9 hz9Var, z29 z29Var) {
        this.a = d82Var;
        this.b = d82Var2;
        this.c = d82Var3;
        this.d = z41Var;
        this.e = z41Var2;
        this.f = xt4Var;
        this.g = xt4Var2;
        this.h = xt4Var3;
        this.i = unaVar;
        this.j = hz9Var;
        this.k = z29Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hp5) {
                hp5 hp5Var = (hp5) obj;
                if (!c16.i(this.a, hp5Var.a) || !c16.i(this.b, hp5Var.b) || !c16.i(this.c, hp5Var.c) || this.d != hp5Var.d || this.e != hp5Var.e || !c16.i(this.f, hp5Var.f) || !c16.i(this.g, hp5Var.g) || !c16.i(this.h, hp5Var.h) || !c16.i(this.i, hp5Var.i) || this.j != hp5Var.j || this.k != hp5Var.k) {
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
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int i = 0;
        d82 d82Var = this.a;
        if (d82Var == null) {
            hashCode = 0;
        } else {
            hashCode = d82Var.hashCode();
        }
        int i2 = hashCode * 31;
        d82 d82Var2 = this.b;
        if (d82Var2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d82Var2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        d82 d82Var3 = this.c;
        if (d82Var3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d82Var3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        z41 z41Var = this.d;
        if (z41Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = z41Var.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        z41 z41Var2 = this.e;
        if (z41Var2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = z41Var2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 961;
        xt4 xt4Var = this.f;
        if (xt4Var == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = xt4Var.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        xt4 xt4Var2 = this.g;
        if (xt4Var2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = xt4Var2.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        xt4 xt4Var3 = this.h;
        if (xt4Var3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = xt4Var3.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        una unaVar = this.i;
        if (unaVar == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = unaVar.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        hz9 hz9Var = this.j;
        if (hz9Var == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = hz9Var.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        z29 z29Var = this.k;
        if (z29Var != null) {
            i = z29Var.hashCode();
        }
        return i11 + i;
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=" + this.d + ", diskCachePolicy=" + this.e + ", networkCachePolicy=null, placeholderFactory=" + this.f + ", errorFactory=" + this.g + ", fallbackFactory=" + this.h + ", sizeResolver=" + this.i + ", scale=" + this.j + ", precision=" + this.k + ")";
    }
}
