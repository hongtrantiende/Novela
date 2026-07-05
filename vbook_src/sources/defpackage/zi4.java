package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zi4  reason: default package */
/* loaded from: classes3.dex */
public final class zi4 implements s76 {
    public static final zi4 a = new Object();
    public static final y59 b = new y59("kotlin.Float", w59.j);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        jbeVar.u(((Number) obj).floatValue());
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        return Float.valueOf(yq2Var.C());
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
