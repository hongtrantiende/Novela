package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mq5  reason: default package */
/* loaded from: classes3.dex */
public final class mq5 {
    public final String a;
    public final String b;
    public final int c;
    public final float d;
    public final String e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final long j;

    public mq5(String str, String str2, int i, float f, String str3, int i2, boolean z, boolean z2, boolean z3, long j) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = f;
        this.e = str3;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mq5) {
                mq5 mq5Var = (mq5) obj;
                if (!c16.i(this.a, mq5Var.a) || !this.b.equals(mq5Var.b) || this.c != mq5Var.c || Float.compare(this.d, mq5Var.d) != 0 || !c16.i(this.e, mq5Var.e) || this.f != mq5Var.f || this.g != mq5Var.g || this.h != mq5Var.h || this.i != mq5Var.i || this.j != mq5Var.j) {
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
        int d = nk2.d(this.d, hl5.a(this.c, eub.j(this.a.hashCode() * 31, 31, this.b), 31), 31);
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Long.hashCode(this.j) + eub.k(eub.k(eub.k(hl5.a(this.f, hl5.a(0, (d + hashCode) * 31, 31), 31), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder y = nk2.y("ImageTocLink(id=", this.a, ", title=", this.b, ", chapterIndex=");
        y.append(this.c);
        y.append(", chapterPosition=");
        y.append(this.d);
        y.append(", parentId=");
        a82.u(this.f, this.e, ", level=0, count=", ", downloaded=", y);
        rs8.z(y, this.g, ", locked=", this.h, ", pay=");
        y.append(this.i);
        y.append(", lastRead=");
        y.append(this.j);
        y.append(")");
        return y.toString();
    }
}
