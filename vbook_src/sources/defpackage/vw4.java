package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vw4  reason: default package */
/* loaded from: classes.dex */
public final class vw4 implements wea {
    public final mu4 a;

    public vw4(mu4 mu4Var) {
        this.a = mu4Var;
    }

    @Override // defpackage.wea
    public final kwe a(long j, tc6 tc6Var, r13 r13Var) {
        yj a = dk.a();
        this.a.c(a, new dna(j), tc6Var);
        a.e();
        return new sf8(a);
    }

    public final boolean equals(Object obj) {
        vw4 vw4Var;
        if (this != obj) {
            mu4 mu4Var = null;
            if (obj instanceof vw4) {
                vw4Var = (vw4) obj;
            } else {
                vw4Var = null;
            }
            if (vw4Var != null) {
                mu4Var = vw4Var.a;
            }
            if (mu4Var == this.a) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
