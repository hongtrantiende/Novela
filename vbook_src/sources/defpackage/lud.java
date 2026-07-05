package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lud  reason: default package */
/* loaded from: classes.dex */
public final class lud extends qz4 {
    @Override // defpackage.rh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        if (queryLocalInterface instanceof jvd) {
            return (jvd) queryLocalInterface;
        }
        return new ftd(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", 1);
    }

    @Override // defpackage.rh0
    public final mb4[] f() {
        return c16.g;
    }

    @Override // defpackage.rh0
    public final int i() {
        return 253600000;
    }

    @Override // defpackage.rh0
    public final String m() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // defpackage.rh0
    public final String n() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // defpackage.rh0
    public final boolean o() {
        return true;
    }
}
