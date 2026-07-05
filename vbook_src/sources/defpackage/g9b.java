package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g9b  reason: default package */
/* loaded from: classes.dex */
public class g9b extends v53 {
    public Dialog E0;
    public DialogInterface.OnCancelListener F0;
    public AlertDialog G0;

    @Override // defpackage.v53
    public final Dialog I() {
        ur4 ur4Var;
        Dialog dialog = this.E0;
        if (dialog == null) {
            this.v0 = false;
            if (this.G0 == null) {
                tr4 tr4Var = this.Q;
                if (tr4Var == null) {
                    ur4Var = null;
                } else {
                    ur4Var = tr4Var.d;
                }
                am8.s(ur4Var);
                this.G0 = new AlertDialog.Builder(ur4Var).create();
            }
            return this.G0;
        }
        return dialog;
    }

    @Override // defpackage.v53, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.F0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
