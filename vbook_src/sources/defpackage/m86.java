package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m86  reason: default package */
/* loaded from: classes.dex */
public final class m86 extends mq7 implements l86 {
    public xt4 K;
    public xt4 L;

    @Override // defpackage.l86
    public final boolean H(KeyEvent keyEvent) {
        xt4 xt4Var = this.L;
        if (xt4Var != null) {
            return ((Boolean) xt4Var.invoke(new g86(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.l86
    public final boolean g0(KeyEvent keyEvent) {
        xt4 xt4Var = this.K;
        if (xt4Var != null) {
            return ((Boolean) xt4Var.invoke(new g86(keyEvent))).booleanValue();
        }
        return false;
    }
}
