package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yz5  reason: default package */
/* loaded from: classes.dex */
public final class yz5 extends wk5 {
    public final String b;
    public final String c;
    public final String d;

    public yz5(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && yz5.class == obj.getClass()) {
                yz5 yz5Var = (yz5) obj;
                if (this.c.equals(yz5Var.c) && this.b.equals(yz5Var.b) && this.d.equals(yz5Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.j(eub.j(527, 31, this.b), 31, this.c);
    }

    @Override // defpackage.wk5
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
