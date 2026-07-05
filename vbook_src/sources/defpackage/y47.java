package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y47  reason: default package */
/* loaded from: classes.dex */
public class y47 {
    public final long a;

    static {
        new y47(new fr2());
        a2d.K(0);
        a2d.K(1);
        a2d.K(2);
        a2d.K(3);
        a2d.K(4);
        a2d.K(5);
        a2d.K(6);
        a2d.K(7);
    }

    public y47(fr2 fr2Var) {
        String str = a2d.a;
        this.a = fr2Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y47) && this.a == ((y47) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) * 923521;
    }
}
