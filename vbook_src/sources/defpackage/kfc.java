package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kfc  reason: default package */
/* loaded from: classes.dex */
public final class kfc {
    public final double a;
    public final double b;
    public final i45 c;

    public kfc(double d, double d2, i45 i45Var) {
        this.a = d;
        this.b = d2;
        this.c = i45Var;
        new HashMap();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kfc) {
                kfc kfcVar = (kfc) obj;
                if (Double.compare(this.a, kfcVar.a) != 0 || Double.compare(this.b, kfcVar.b) != 0 || !this.c.equals(kfcVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((Double.hashCode(this.b) + (Double.hashCode(this.a) * 31)) * 31) + this.c.a;
    }

    public final String toString() {
        return "TonalPalette(hue=" + this.a + ", chroma=" + this.b + ", keyColor=" + this.c + ")";
    }
}
