package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zabs extends BroadcastReceiver {
    public Context a;
    public final hvc b;

    public zabs(hvc hvcVar) {
        this.b = hvcVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            hvc hvcVar = this.b;
            jud judVar = (jud) ((bv4) hvcVar.c).c;
            judVar.b.set(null);
            ovd ovdVar = judVar.f.J;
            ovdVar.sendMessage(ovdVar.obtainMessage(3));
            AlertDialog alertDialog = (AlertDialog) hvcVar.b;
            if (alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
            synchronized (this) {
                try {
                    Context context2 = this.a;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.a = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
