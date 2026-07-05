package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rge  reason: default package */
/* loaded from: classes.dex */
public final class rge extends qz4 {
    @Override // defpackage.rh0
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        if (queryLocalInterface instanceof yie) {
            return (yie) queryLocalInterface;
        }
        return new yie(iBinder);
    }

    @Override // defpackage.rh0
    public final mb4[] f() {
        return nmd.e;
    }

    @Override // defpackage.rh0
    public final int i() {
        return 261200000;
    }

    @Override // defpackage.rh0
    public final String m() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override // defpackage.rh0
    public final String n() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }

    @Override // defpackage.rh0
    public final boolean s() {
        return true;
    }
}
