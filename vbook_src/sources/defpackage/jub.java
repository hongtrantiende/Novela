package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jub  reason: default package */
/* loaded from: classes.dex */
public final class jub {
    public static final yy9 d = new yy9(new tsa(8, (byte) 0), new clb(19));
    public final ps a;
    public final long b;
    public final fxb c;

    public jub(ps psVar, long j, fxb fxbVar) {
        fxb fxbVar2;
        this.a = psVar;
        this.b = sze.d(psVar.b.length(), j);
        if (fxbVar != null) {
            fxbVar2 = new fxb(sze.d(psVar.b.length(), fxbVar.a));
        } else {
            fxbVar2 = null;
        }
        this.c = fxbVar2;
    }

    public static jub a(jub jubVar, ps psVar, long j, int i) {
        fxb fxbVar;
        if ((i & 1) != 0) {
            psVar = jubVar.a;
        }
        if ((i & 2) != 0) {
            j = jubVar.b;
        }
        if ((i & 4) != 0) {
            fxbVar = jubVar.c;
        } else {
            fxbVar = null;
        }
        jubVar.getClass();
        return new jub(psVar, j, fxbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jub)) {
            return false;
        }
        jub jubVar = (jub) obj;
        if (fxb.c(this.b, jubVar.b) && c16.i(this.c, jubVar.c) && c16.i(this.a, jubVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = fxb.c;
        int c = hl5.c(this.a.hashCode() * 31, this.b, 31);
        fxb fxbVar = this.c;
        if (fxbVar != null) {
            i = Long.hashCode(fxbVar.a);
        } else {
            i = 0;
        }
        return c + i;
    }

    public final String toString() {
        String i = fxb.i(this.b);
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + i + ", composition=" + this.c + ")";
    }

    public jub(String str, long j, int i) {
        this(new ps((i & 1) != 0 ? "" : str), (i & 2) != 0 ? fxb.b : j, (fxb) null);
    }
}
