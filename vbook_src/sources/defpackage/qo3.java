package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qo3  reason: default package */
/* loaded from: classes3.dex */
public final class qo3 {
    public static final qo3 j = new qo3(true, true, true, true, true, true, true, true, true);
    public static final qo3 k = new qo3(false, false, false, false, false, false, false, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public qo3(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo3)) {
            return false;
        }
        qo3 qo3Var = (qo3) obj;
        if (this.a == qo3Var.a && this.b == qo3Var.b && this.c == qo3Var.c && this.d == qo3Var.d && this.e == qo3Var.e && this.f == qo3Var.f && this.g == qo3Var.g && this.h == qo3Var.h && this.i == qo3Var.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder p = rs8.p("EditorInteractionPolicy(canEditText=", this.a, ", canEditBlockStructure=", this.b, ", canEditBlockControls=");
        rs8.z(p, this.c, ", canFormatText=", this.d, ", canEditLinks=");
        rs8.z(p, this.e, ", canUseEditorHistoryShortcuts=", this.f, ", canUseSlashCommands=");
        rs8.z(p, this.g, ", canSelectBlocks=", this.h, ", canDragBlocks=");
        return rs8.m(")", p, this.i);
    }
}
