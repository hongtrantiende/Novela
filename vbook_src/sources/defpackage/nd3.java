package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: nd3  reason: default package */
/* loaded from: classes3.dex */
public final class nd3 {
    public static final md3 Companion = new Object();
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ nd3(int i, String str, String str2, boolean z) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = z;
            return;
        }
        w92.x(i, 7, ld3.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd3)) {
            return false;
        }
        nd3 nd3Var = (nd3) obj;
        if (c16.i(this.a, nd3Var.a) && c16.i(this.b, nd3Var.b) && this.c == nd3Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rs8.m(")", nk2.y("DomainOverrideDto(domain=", this.a, ", replace=", this.b, ", enabled="), this.c);
    }

    public nd3(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
