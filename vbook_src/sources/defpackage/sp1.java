package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sp1  reason: default package */
/* loaded from: classes.dex */
public final class sp1 extends al6 {
    @Override // defpackage.y28
    public final Object clone() {
        return (sp1) super.clone();
    }

    @Override // defpackage.y28
    public final y28 i() {
        return (sp1) super.clone();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, al6, y28] */
    @Override // defpackage.y28
    public final y28 j() {
        Object obj = this.d;
        obj.getClass();
        ?? obj2 = new Object();
        obj2.d = (String) obj;
        return obj2;
    }

    @Override // defpackage.y28
    public final String u() {
        return "#comment";
    }

    @Override // defpackage.y28
    public final void y(bp3 bp3Var, sc3 sc3Var) {
        bp3Var.c("<!--");
        bp3Var.c(H());
        bp3Var.c("-->");
    }
}
