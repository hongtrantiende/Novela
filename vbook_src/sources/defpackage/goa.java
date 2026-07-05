package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: goa  reason: default package */
/* loaded from: classes3.dex */
public final class goa {
    public static final foa Companion = new Object();
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ goa(int i, String str, String str2, boolean z) {
        if (1 == (i & 1)) {
            this.a = str;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = false;
                return;
            } else {
                this.c = z;
                return;
            }
        }
        w92.x(i, 1, eoa.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof goa)) {
            return false;
        }
        goa goaVar = (goa) obj;
        if (c16.i(this.a, goaVar.a) && c16.i(this.b, goaVar.b) && this.c == goaVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rs8.m(")", nk2.y("SkipWordRuleDto(word=", this.a, ", replace=", this.b, ", ignoreCase="), this.c);
    }

    public goa(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
