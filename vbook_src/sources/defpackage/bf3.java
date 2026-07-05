package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bf3  reason: default package */
/* loaded from: classes3.dex */
public final class bf3 implements s76 {
    public static final bf3 a = new Object();
    public static final y59 b = new y59("kotlin.Double", w59.i);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        jbeVar.r(((Number) obj).doubleValue());
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        return Double.valueOf(yq2Var.E());
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
