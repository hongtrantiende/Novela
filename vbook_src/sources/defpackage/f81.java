package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f81  reason: default package */
/* loaded from: classes3.dex */
public final class f81 {
    public final oyb a;
    public final oyb b;
    public final oyb c;
    public final oyb d;
    public final oyb e;
    public final oyb f;
    public final oyb g;
    public final oyb h;
    public final oyb i;
    public final oyb j;
    public final oyb k;

    public f81(oyb oybVar, oyb oybVar2, oyb oybVar3, oyb oybVar4, oyb oybVar5, oyb oybVar6, oyb oybVar7, oyb oybVar8, oyb oybVar9, oyb oybVar10, oyb oybVar11) {
        oybVar.getClass();
        oybVar9.getClass();
        oybVar10.getClass();
        this.a = oybVar;
        this.b = oybVar2;
        this.c = oybVar3;
        this.d = oybVar4;
        this.e = oybVar5;
        this.f = oybVar6;
        this.g = oybVar7;
        this.h = oybVar8;
        this.i = oybVar9;
        this.j = oybVar10;
        this.k = oybVar11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f81) {
                f81 f81Var = (f81) obj;
                if (!c16.i(this.a, f81Var.a) || !this.b.equals(f81Var.b) || !this.c.equals(f81Var.c) || !this.d.equals(f81Var.d) || !this.e.equals(f81Var.e) || !this.f.equals(f81Var.f) || !this.g.equals(f81Var.g) || !this.h.equals(f81Var.h) || !c16.i(this.i, f81Var.i) || !c16.i(this.j, f81Var.j) || !this.k.equals(f81Var.k)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.k.hashCode() + eub.m(this.j, eub.m(this.i, eub.m(this.h, eub.m(this.g, eub.m(this.f, eub.m(this.e, eub.m(this.d, eub.m(this.c, eub.m(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "CascadeEditorTypography(body=" + this.a + ", heading1=" + this.b + ", heading2=" + this.c + ", heading3=" + this.d + ", heading4=" + this.e + ", heading5=" + this.f + ", heading6=" + this.g + ", code=" + this.h + ", slashItemTitle=" + this.i + ", slashBackButton=" + this.j + ", toolbarButton=" + this.k + ")";
    }
}
