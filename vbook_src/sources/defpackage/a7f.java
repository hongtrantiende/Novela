package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a7f  reason: default package */
/* loaded from: classes.dex */
public final class a7f implements rwe {
    public final age a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public a7f(AppMeasurementDynamiteService appMeasurementDynamiteService, age ageVar) {
        this.b = appMeasurementDynamiteService;
        this.a = ageVar;
    }

    @Override // defpackage.rwe
    public final void a(String str, String str2, Bundle bundle, long j) {
        try {
            this.a.b(str, str2, bundle, j);
        } catch (RemoteException e) {
            lte lteVar = this.b.a;
            if (lteVar != null) {
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                ppeVar.E.f(e, "Event listener threw exception");
            }
        }
    }
}
