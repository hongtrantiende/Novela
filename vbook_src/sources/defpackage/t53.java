package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t53  reason: default package */
/* loaded from: classes.dex */
public final class t53 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ v53 a;

    public t53(v53 v53Var) {
        this.a = v53Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        v53 v53Var = this.a;
        Dialog dialog = v53Var.z0;
        if (dialog != null) {
            v53Var.onDismiss(dialog);
        }
    }
}
