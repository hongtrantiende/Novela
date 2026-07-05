package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nfc  reason: default package */
/* loaded from: classes.dex */
public final class nfc {
    public final lm3 a;
    public final lm3 b;
    public final double c;
    public final ofc d;
    public final boolean e;
    public final mfc f;

    public nfc(lm3 lm3Var, lm3 lm3Var2, double d, ofc ofcVar, boolean z, mfc mfcVar, int i) {
        z = (i & 16) != 0 ? true : z;
        mfcVar = (i & 32) != 0 ? mfc.a : mfcVar;
        lm3Var.getClass();
        lm3Var2.getClass();
        this.a = lm3Var;
        this.b = lm3Var2;
        this.c = d;
        this.d = ofcVar;
        this.e = z;
        this.f = mfcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfc)) {
            return false;
        }
        nfc nfcVar = (nfc) obj;
        if (c16.i(this.a, nfcVar.a) && c16.i(this.b, nfcVar.b) && Double.compare(this.c, nfcVar.c) == 0 && this.d == nfcVar.d && this.e == nfcVar.e && this.f == nfcVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = Double.hashCode(this.c);
        return this.f.hashCode() + eub.k((this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "ToneDeltaPair(roleA=" + this.a + ", roleB=" + this.b + ", delta=" + this.c + ", polarity=" + this.d + ", stayTogether=" + this.e + ", deltaConstraint=" + this.f + ")";
    }
}
