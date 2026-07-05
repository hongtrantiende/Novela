package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: l6c  reason: default package */
/* loaded from: classes3.dex */
public final class l6c {
    public static final k6c Companion = new Object();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ l6c(String str, String str2, int i, String str3) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = str2;
            if ((i & 4) == 0) {
                this.c = null;
                return;
            } else {
                this.c = str3;
                return;
            }
        }
        w92.x(i, 3, j6c.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6c)) {
            return false;
        }
        l6c l6cVar = (l6c) obj;
        if (c16.i(this.a, l6cVar.a) && c16.i(this.b, l6cVar.b) && c16.i(this.c, l6cVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int j = eub.j(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return j + hashCode;
    }

    public final String toString() {
        return s21.q(nk2.y("LegacyThemeColor(id=", this.a, ", color=", this.b, ", image="), this.c, ")");
    }
}
