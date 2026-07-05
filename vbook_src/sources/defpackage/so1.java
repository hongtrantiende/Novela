package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: so1  reason: default package */
/* loaded from: classes3.dex */
public final class so1 {
    public final pta a;
    public final List b;
    public final ty5 c;

    public so1(pta ptaVar, List list, ty5 ty5Var) {
        ptaVar.getClass();
        this.a = ptaVar;
        this.b = list;
        this.c = ty5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof so1) {
                so1 so1Var = (so1) obj;
                if (!c16.i(this.a, so1Var.a) || !this.b.equals(so1Var.b) || !this.c.equals(so1Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.l(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "DownloadContext(dataFetcher=" + this.a + ", chapters=" + this.b + ", downloadRange=" + this.c + ")";
    }
}
