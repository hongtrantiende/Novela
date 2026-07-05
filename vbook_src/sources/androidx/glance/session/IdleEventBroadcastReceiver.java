package androidx.glance.session;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class IdleEventBroadcastReceiver extends BroadcastReceiver {
    public static final List b;
    public static final IntentFilter c;
    public final hg a;

    static {
        List<String> B = tl1.B("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        b = B;
        IntentFilter intentFilter = new IntentFilter();
        for (String str : B) {
            intentFilter.addAction(str);
        }
        c = intentFilter;
    }

    public IdleEventBroadcastReceiver(hg hgVar) {
        this.a = hgVar;
    }

    public final void a(Context context) {
        boolean z;
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        PowerManager powerManager = (PowerManager) systemService;
        boolean a = qu.a.a(powerManager);
        if (Build.VERSION.SDK_INT >= 33) {
            if (!a && !xu.a.a(powerManager)) {
                z = false;
            } else {
                z = true;
            }
            a = z;
        }
        if (a) {
            this.a.invoke();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (sl1.W(b, intent.getAction())) {
            a(context);
        }
    }
}
