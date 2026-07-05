package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m53  reason: default package */
/* loaded from: classes.dex */
public final class m53 {
    public static final /* synthetic */ int c = 0;
    public final int a = 0;
    public final int b = 0;

    static {
        a2d.K(0);
        a2d.K(1);
        a2d.K(2);
        a2d.K(3);
    }

    public m53(kh5 kh5Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m53) {
                m53 m53Var = (m53) obj;
                if (this.a == m53Var.a && this.b == m53Var.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.a) * 31) + this.b) * 31;
    }
}
