package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xrb  reason: default package */
/* loaded from: classes.dex */
public final class xrb {
    public static final xrb f = new xrb(false, 9205357640488583168L, nae.e, oq9.a, false);
    public final boolean a;
    public final long b;
    public final float c;
    public final oq9 d;
    public final boolean e;

    public xrb(boolean z, long j, float f2, oq9 oq9Var, boolean z2) {
        this.a = z;
        this.b = j;
        this.c = f2;
        this.d = oq9Var;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xrb) {
                xrb xrbVar = (xrb) obj;
                if (this.a != xrbVar.a || !y78.d(this.b, xrbVar.b) || Float.compare(this.c, xrbVar.c) != 0 || this.d != xrbVar.d || this.e != xrbVar.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int d = nk2.d(this.c, hl5.c(Boolean.hashCode(this.a) * 31, this.b, 31), 31);
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + d) * 31);
    }

    public final String toString() {
        String l = y78.l(this.b);
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(l);
        sb.append(", lineHeight=");
        sb.append(this.c);
        sb.append(", direction=");
        sb.append(this.d);
        sb.append(", handlesCrossed=");
        return rs8.m(")", sb, this.e);
    }
}
