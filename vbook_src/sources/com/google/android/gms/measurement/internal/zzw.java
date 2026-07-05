package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzw extends BroadcastReceiver {
    public final lte a;

    public zzw(lte lteVar) {
        this.a = lteVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        lte lteVar = this.a;
        if (intent == null) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.E.e("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.E.e("App receiver called with null action");
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode != -1928239649) {
            if (hashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                ppe ppeVar3 = lteVar.f;
                lte.m(ppeVar3);
                ppeVar3.J.e("[sgtm] App Receiver notified batches are available");
                ete eteVar = lteVar.C;
                lte.m(eteVar);
                eteVar.g0(new og(this, 27));
                return;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            q5e.a();
            if (!lteVar.d.i0(null, yme.P0)) {
                return;
            }
            ppe ppeVar4 = lteVar.f;
            lte.m(ppeVar4);
            ppeVar4.J.e("App receiver notified triggers are available");
            ete eteVar2 = lteVar.C;
            lte.m(eteVar2);
            eteVar2.g0(new og(lteVar, 28));
            return;
        }
        ppe ppeVar5 = lteVar.f;
        lte.m(ppeVar5);
        ppeVar5.E.e("App receiver called with unknown action");
    }
}
