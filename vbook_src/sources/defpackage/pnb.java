package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pnb  reason: default package */
/* loaded from: classes3.dex */
public final class pnb {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final ps d;
    public final List e;

    public pnb(boolean z, boolean z2, String str, ps psVar, List list, int i) {
        str = (i & 4) != 0 ? null : str;
        psVar = (i & 16) != 0 ? new ps("") : psVar;
        list = (i & 32) != 0 ? ks3.a : list;
        psVar.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = psVar;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pnb) {
                pnb pnbVar = (pnb) obj;
                if (this.a != pnbVar.a || this.b != pnbVar.b || !c16.i(this.c, pnbVar.c) || !c16.i(this.d, pnbVar.d) || !c16.i(this.e, pnbVar.e)) {
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
        int k = eub.k(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = this.d.hashCode();
        return this.e.hashCode() + ((hashCode2 + ((k + hashCode) * 961)) * 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("TextContent(isLoading=", this.a, ", isError=", this.b, ", errorMessage=");
        p.append(this.c);
        p.append(", title=null, content=");
        p.append((Object) this.d);
        p.append(", boundaries=");
        return rs8.n(p, this.e, ")");
    }
}
