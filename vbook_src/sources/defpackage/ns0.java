package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ns0  reason: default package */
/* loaded from: classes3.dex */
public final class ns0 {
    public jj a = null;
    public sf b = null;
    public n61 c = null;
    public yj d = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ns0) {
                ns0 ns0Var = (ns0) obj;
                if (!c16.i(this.a, ns0Var.a) || !c16.i(this.b, ns0Var.b) || !c16.i(this.c, ns0Var.c) || !c16.i(this.d, ns0Var.d)) {
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
        int hashCode2;
        int hashCode3;
        jj jjVar = this.a;
        int i = 0;
        if (jjVar == null) {
            hashCode = 0;
        } else {
            hashCode = jjVar.hashCode();
        }
        int i2 = hashCode * 31;
        sf sfVar = this.b;
        if (sfVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = sfVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        n61 n61Var = this.c;
        if (n61Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = n61Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        yj yjVar = this.d;
        if (yjVar != null) {
            i = yjVar.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        jj jjVar = this.a;
        sf sfVar = this.b;
        n61 n61Var = this.c;
        yj yjVar = this.d;
        return "BorderCache(imageBitmap=" + jjVar + ", canvas=" + sfVar + ", canvasDrawScope=" + n61Var + ", borderPath=" + yjVar + ")";
    }
}
