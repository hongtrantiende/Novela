package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xta  reason: default package */
/* loaded from: classes.dex */
public final class xta implements qb4 {
    public final dq5 a;
    public final String b;
    public final hg2 c;

    public xta(dq5 dq5Var, String str, hg2 hg2Var) {
        this.a = dq5Var;
        this.b = str;
        this.c = hg2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xta) {
                xta xtaVar = (xta) obj;
                if (!c16.i(this.a, xtaVar.a) || !c16.i(this.b, xtaVar.b) || this.c != xtaVar.c) {
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
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + this.c + ")";
    }
}
