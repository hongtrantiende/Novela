package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lka  reason: default package */
/* loaded from: classes3.dex */
public final class lka implements s76 {
    public static final lka a = new Object();
    public static final y59 b = new y59("kotlin.Short", w59.m);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        jbeVar.H(((Number) obj).shortValue());
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        return Short.valueOf(yq2Var.B());
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
