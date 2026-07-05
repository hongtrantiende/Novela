package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ac9  reason: default package */
/* loaded from: classes3.dex */
public final class ac9 {
    public final String a;
    public final String b;
    public final long c;

    public ac9(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac9)) {
            return false;
        }
        ac9 ac9Var = (ac9) obj;
        if (c16.i(this.a, ac9Var.a) && c16.i(this.b, ac9Var.b) && this.c == ac9Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return hl5.q(nk2.y("QtDictionaryEntry(word=", this.a, ", trans=", this.b, ", id="), this.c, ")");
    }
}
