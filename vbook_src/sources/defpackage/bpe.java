package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bpe  reason: default package */
/* loaded from: classes.dex */
public final class bpe extends rh0 {
    @Override // defpackage.rh0
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof lne) {
            return (lne) queryLocalInterface;
        }
        return new bne(iBinder);
    }

    @Override // defpackage.rh0
    public final int i() {
        return 12451000;
    }

    @Override // defpackage.rh0
    public final String m() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // defpackage.rh0
    public final String n() {
        return "com.google.android.gms.measurement.START";
    }
}
