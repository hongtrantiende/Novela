package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s53  reason: default package */
/* loaded from: classes.dex */
public final class s53 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ v53 a;

    public s53(v53 v53Var) {
        this.a = v53Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        v53 v53Var = this.a;
        Dialog dialog = v53Var.z0;
        if (dialog != null) {
            v53Var.onCancel(dialog);
        }
    }
}
