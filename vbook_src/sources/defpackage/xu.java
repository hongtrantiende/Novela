package defpackage;

import android.os.PowerManager;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xu  reason: default package */
/* loaded from: classes.dex */
public final class xu {
    public static final xu a = new Object();

    public final boolean a(PowerManager powerManager) {
        if (!powerManager.isLowPowerStandbyEnabled() && !powerManager.isDeviceLightIdleMode()) {
            return false;
        }
        return true;
    }
}
