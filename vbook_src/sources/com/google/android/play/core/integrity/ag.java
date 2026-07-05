package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class ag extends cud {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(taskCompletionSource);
        this.e = ajVar;
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
    }

    @Override // defpackage.cud
    public final void b() {
        bud budVar;
        at atVar;
        try {
            aj ajVar = this.e;
            Bundle bundle = this.a;
            atVar = ajVar.d;
            as a = atVar.a(this.b, this.c, ajVar.a);
            wtd wtdVar = (wtd) ((ytd) ajVar.a.n);
            wtdVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(wtdVar.c);
            int i = qtd.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a);
            wtdVar.a(obtain, 3);
        } catch (RemoteException e) {
            aj ajVar2 = this.e;
            int i2 = this.d;
            budVar = ajVar2.b;
            budVar.a(e, "requestAndShowDialog(%s)", Integer.valueOf(i2));
            this.c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
