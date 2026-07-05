package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lqe  reason: default package */
/* loaded from: classes.dex */
public final class lqe extends BroadcastReceiver {
    public final a6f a;
    public boolean b;
    public boolean c;

    public lqe(a6f a6fVar) {
        am8.s(a6fVar);
        this.a = a6fVar;
    }

    public final void a() {
        a6f a6fVar = this.a;
        a6fVar.m0();
        a6fVar.f().W();
        a6fVar.f().W();
        if (!this.b) {
            return;
        }
        a6fVar.c().J.e("Unregistering connectivity change receiver");
        this.b = false;
        this.c = false;
        try {
            a6fVar.H.a.unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            a6fVar.c().f.f(e, "Failed to unregister the network broadcast receiver");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a6f a6fVar = this.a;
        a6fVar.m0();
        String action = intent.getAction();
        a6fVar.c().J.f(action, "NetworkBroadcastReceiver received action");
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            dqe dqeVar = a6fVar.b;
            a6f.U(dqeVar);
            boolean b0 = dqeVar.b0();
            if (this.c != b0) {
                this.c = b0;
                a6fVar.f().g0(new og(this, b0));
                return;
            }
            return;
        }
        a6fVar.c().E.f(action, "NetworkBroadcastReceiver received unknown action");
    }
}
