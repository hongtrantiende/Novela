package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dwb  reason: default package */
/* loaded from: classes.dex */
public final class dwb {
    public static final dwb c = new dwb(2, false);
    public static final dwb d = new dwb(1, true);
    public final int a;
    public final boolean b;

    public dwb(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwb)) {
            return false;
        }
        dwb dwbVar = (dwb) obj;
        if (this.a == dwbVar.a && this.b == dwbVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        if (equals(c)) {
            return "TextMotion.Static";
        }
        if (equals(d)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }
}
