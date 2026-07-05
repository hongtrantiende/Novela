package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: evb  reason: default package */
/* loaded from: classes.dex */
public final class evb {
    public final ps a;
    public final oyb b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final r13 g;
    public final tc6 h;
    public final do4 i;
    public final long j;

    public evb(ps psVar, oyb oybVar, List list, int i, boolean z, int i2, r13 r13Var, tc6 tc6Var, do4 do4Var, long j) {
        this.a = psVar;
        this.b = oybVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = r13Var;
        this.h = tc6Var;
        this.i = do4Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof evb) {
                evb evbVar = (evb) obj;
                if (c16.i(this.a, evbVar.a) && c16.i(this.b, evbVar.b) && c16.i(this.c, evbVar.c) && this.d == evbVar.d && this.e == evbVar.e && this.f == evbVar.f && c16.i(this.g, evbVar.g) && this.h == evbVar.h && c16.i(this.i, evbVar.i) && x02.c(this.j, evbVar.j)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int a = hl5.a(this.f, eub.k((eub.l(eub.m(this.b, this.a.hashCode() * 31, 31), this.c, 31) + this.d) * 31, 31, this.e), 31);
        int hashCode = this.h.hashCode();
        int hashCode2 = this.i.hashCode();
        return Long.hashCode(this.j) + ((hashCode2 + ((hashCode + ((this.g.hashCode() + a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String s = vye.s(this.f);
        String m = x02.m(this.j);
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + s + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + m + ")";
    }
}
