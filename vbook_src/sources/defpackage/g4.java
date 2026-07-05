package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g4  reason: default package */
/* loaded from: classes.dex */
public final class g4 {
    public final String a;
    public final hu4 b;

    public g4(String str, hu4 hu4Var) {
        this.a = str;
        this.b = hu4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        if (c16.i(this.a, g4Var.a) && c16.i(this.b, g4Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        hu4 hu4Var = this.b;
        if (hu4Var != null) {
            i2 = hu4Var.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ")";
    }
}
