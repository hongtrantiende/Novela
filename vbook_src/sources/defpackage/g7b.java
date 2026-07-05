package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g7b  reason: default package */
/* loaded from: classes.dex */
public final class g7b {
    public final zp5 a;
    public final wn5 b;
    public final mfb c = new mfb(new ak9(this, 26));

    public g7b(zp5 zp5Var, wn5 wn5Var) {
        this.a = zp5Var;
        this.b = wn5Var;
    }

    public final String a() {
        return (String) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g7b) {
                g7b g7bVar = (g7b) obj;
                if (!this.a.equals(g7bVar.a) || !c16.i(this.b, g7bVar.b)) {
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
        wn5 wn5Var = this.b;
        if (wn5Var == null) {
            hashCode = 0;
        } else {
            hashCode = wn5Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "SubsamplingImage(imageSource=" + this.a + ", imageInfo=" + this.b + ')';
    }
}
