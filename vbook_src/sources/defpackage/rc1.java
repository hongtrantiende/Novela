package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rc1  reason: default package */
/* loaded from: classes3.dex */
public final class rc1 implements s76 {
    public static final rc1 a = new Object();
    public static final y59 b = new y59("kotlin.Char", w59.h);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        jbeVar.q(((Character) obj).charValue());
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        return Character.valueOf(yq2Var.c());
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
