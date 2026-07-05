package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bl6  reason: default package */
/* loaded from: classes.dex */
public final class bl6 extends uq7 {
    public final oj b;
    public final ol6 c;
    public final gtb d;

    public bl6(oj ojVar, ol6 ol6Var, gtb gtbVar) {
        this.b = ojVar;
        this.c = ol6Var;
        this.d = gtbVar;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new cl6(this.b, this.c, this.d);
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        cl6 cl6Var = (cl6) mq7Var;
        if (cl6Var.J) {
            cl6Var.K.c();
            cl6Var.K.k(cl6Var);
        }
        oj ojVar = this.b;
        cl6Var.K = ojVar;
        if (cl6Var.J) {
            if (ojVar.a != null) {
                ov5.c("Expected textInputModifierNode to be null");
            }
            ojVar.a = cl6Var;
        }
        cl6Var.L = this.c;
        cl6Var.M = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bl6) {
            bl6 bl6Var = (bl6) obj;
            if (c16.i(this.b, bl6Var.b) && this.c == bl6Var.c && this.d == bl6Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        return this.d.hashCode() + ((hashCode + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.b + ", legacyTextFieldState=" + this.c + ", textFieldSelectionManager=" + this.d + ")";
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
