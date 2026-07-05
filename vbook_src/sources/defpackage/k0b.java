package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k0b  reason: default package */
/* loaded from: classes3.dex */
public final class k0b extends vh8 {
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0b(int i, int i2, String str, String str2, String str3, boolean z) {
        super("chapter_" + i, i);
        boolean z2;
        if ((i2 & 8) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        str3 = (i2 & 32) != 0 ? null : str3;
        str2.getClass();
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = z2;
        this.g = z;
        this.h = str3;
    }

    @Override // defpackage.vh8
    public final int a() {
        return this.d * 100000;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k0b) {
                k0b k0bVar = (k0b) obj;
                if (!c16.i(this.c, k0bVar.c) || this.d != k0bVar.d || !c16.i(this.e, k0bVar.e) || this.f != k0bVar.f || this.g != k0bVar.g || !c16.i(this.h, k0bVar.h)) {
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
        int k = eub.k(eub.k(eub.j(hl5.a(this.d, this.c.hashCode() * 31, 31), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return k + hashCode;
    }

    public final String toString() {
        StringBuilder s = s21.s("StatusPage(chapterName=", this.c, ", chapterIndex=", this.d, ", chapterPath=");
        rs8.y(s, this.e, ", isLoading=", this.f, ", isError=");
        s.append(this.g);
        s.append(", errorMessage=");
        s.append(this.h);
        s.append(")");
        return s.toString();
    }
}
