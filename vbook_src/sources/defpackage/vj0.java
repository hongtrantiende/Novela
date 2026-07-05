package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vj0  reason: default package */
/* loaded from: classes.dex */
public final class vj0 extends m02 {
    public final BroadcastReceiverConstraintTracker$broadcastReceiver$1 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1] */
    public vj0(Context context, omd omdVar, int i) {
        super(context, omdVar);
        this.g = i;
        this.f = new BroadcastReceiver() { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                context2.getClass();
                intent.getClass();
                vj0 vj0Var = vj0.this;
                switch (vj0Var.g) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            r95.n().c(wj0.a, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        vj0Var.b(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        vj0Var.b(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        vj0Var.b(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        vj0Var.b(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        }
                        return;
                    case 1:
                        if (intent.getAction() != null) {
                            r95 n = r95.n();
                            String str = xj0.a;
                            n.c(str, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int hashCode = action2.hashCode();
                                if (hashCode != -1980154005) {
                                    if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        vj0Var.b(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    vj0Var.b(Boolean.TRUE);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        if (intent.getAction() != null) {
                            r95 n2 = r95.n();
                            String str2 = r0b.a;
                            n2.c(str2, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int hashCode2 = action3.hashCode();
                                if (hashCode2 != -1181163412) {
                                    if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        vj0Var.b(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    vj0Var.b(Boolean.FALSE);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r9.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L16;
     */
    @Override // defpackage.m02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a() {
        /*
            r9 = this;
            int r0 = r9.g
            java.lang.String r1 = "status"
            java.lang.String r2 = "getInitialState - null intent received"
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            r4 = -1
            r5 = 0
            android.content.Context r6 = r9.b
            r7 = 1
            r8 = 0
            switch(r0) {
                case 0: goto L86;
                case 1: goto L4c;
                default: goto L11;
            }
        L11:
            android.content.IntentFilter r9 = r9.e()
            android.content.Intent r9 = r6.registerReceiver(r5, r9)
            if (r9 == 0) goto L47
            java.lang.String r0 = r9.getAction()
            if (r0 != 0) goto L22
            goto L47
        L22:
            java.lang.String r9 = r9.getAction()
            if (r9 == 0) goto L46
            int r0 = r9.hashCode()
            r1 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r0 == r1) goto L40
            r1 = -730838620(0xffffffffd47049a4, float:-4.1281105E12)
            if (r0 == r1) goto L37
            goto L46
        L37:
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L47
            goto L46
        L40:
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r9 = r9.equals(r0)
        L46:
            r7 = r8
        L47:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            return r9
        L4c:
            android.content.IntentFilter r9 = new android.content.IntentFilter
            r9.<init>(r3)
            android.content.Intent r9 = r6.registerReceiver(r5, r9)
            if (r9 != 0) goto L63
            r95 r9 = defpackage.r95.n()
            java.lang.String r0 = defpackage.xj0.a
            r9.j(r0, r2)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto L85
        L63:
            int r0 = r9.getIntExtra(r1, r4)
            java.lang.String r1 = "level"
            int r1 = r9.getIntExtra(r1, r4)
            java.lang.String r2 = "scale"
            int r9 = r9.getIntExtra(r2, r4)
            float r1 = (float) r1
            float r9 = (float) r9
            float r1 = r1 / r9
            if (r0 == r7) goto L81
            r9 = 1041865114(0x3e19999a, float:0.15)
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 <= 0) goto L80
            goto L81
        L80:
            r7 = r8
        L81:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
        L85:
            return r9
        L86:
            android.content.IntentFilter r9 = new android.content.IntentFilter
            r9.<init>(r3)
            android.content.Intent r9 = r6.registerReceiver(r5, r9)
            if (r9 != 0) goto L9d
            r95 r9 = defpackage.r95.n()
            java.lang.String r0 = defpackage.wj0.a
            r9.j(r0, r2)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto Lad
        L9d:
            int r9 = r9.getIntExtra(r1, r4)
            r0 = 2
            if (r9 == r0) goto La9
            r0 = 5
            if (r9 != r0) goto La8
            goto La9
        La8:
            r7 = r8
        La9:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
        Lad:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj0.a():java.lang.Object");
    }

    @Override // defpackage.m02
    public final void c() {
        r95.n().c(pv0.a, getClass().getSimpleName().concat(": registering receiver"));
        this.b.registerReceiver(this.f, e());
    }

    @Override // defpackage.m02
    public final void d() {
        r95.n().c(pv0.a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.b.unregisterReceiver(this.f);
    }

    public final IntentFilter e() {
        switch (this.g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
