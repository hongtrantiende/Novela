package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yna  reason: default package */
/* loaded from: classes.dex */
public final class yna {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    public yna(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yna) {
                yna ynaVar = (yna) obj;
                if (this.a != ynaVar.a || !this.b.equals(ynaVar.b) || this.c != ynaVar.c || this.d != ynaVar.d || this.e != ynaVar.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + hl5.a(this.d, hl5.a(this.c, eub.j(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder r = s21.r("Skeleton(index=", this.a, ", name=", this.b, ", numFrag=");
        rs8.q(this.c, this.d, ", offset=", ", length=", r);
        return rs8.g(this.e, ")", r);
    }
}
