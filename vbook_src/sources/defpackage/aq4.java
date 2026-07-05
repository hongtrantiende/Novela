package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aq4  reason: default package */
/* loaded from: classes.dex */
public final class aq4 implements yp4 {
    public final int a;

    public aq4(int i) {
        this.a = i;
    }

    @Override // defpackage.yp4
    public final String a() {
        return "wght";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aq4) && this.a == ((aq4) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 113071012 + this.a;
    }

    public final String toString() {
        return hl5.l("FontVariation.Setting(axisName='wght', value=", ")", this.a);
    }
}
