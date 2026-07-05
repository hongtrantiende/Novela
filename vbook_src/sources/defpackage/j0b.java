package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j0b  reason: default package */
/* loaded from: classes3.dex */
public final class j0b extends wh8 {
    public final String d;
    public final int e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0b(String str, int i, String str2, boolean z, boolean z2, boolean z3, String str3) {
        super("text_" + i + "_0", str, i);
        str2.getClass();
        this.d = str;
        this.e = i;
        this.f = str2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j0b) {
                j0b j0bVar = (j0b) obj;
                if (!c16.i(this.d, j0bVar.d) || this.e != j0bVar.e || !c16.i(this.f, j0bVar.f) || this.g != j0bVar.g || this.h != j0bVar.h || this.i != j0bVar.i || !c16.i(this.j, j0bVar.j)) {
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
        int k = eub.k(eub.k(eub.k(eub.j(hl5.a(this.e, this.d.hashCode() * 31, 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return k + hashCode;
    }

    public final String toString() {
        StringBuilder s = s21.s("StatusPage(chapterName=", this.d, ", chapterIndex=", this.e, ", chapterPath=");
        rs8.y(s, this.f, ", hasPageSource=", this.g, ", isLoading=");
        rs8.z(s, this.h, ", isError=", this.i, ", errorMessage=");
        return s21.q(s, this.j, ")");
    }
}
