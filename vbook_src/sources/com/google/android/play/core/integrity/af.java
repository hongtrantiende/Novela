package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class af extends cud {
    final /* synthetic */ byte[] a;
    final /* synthetic */ Long b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ IntegrityTokenRequest d;
    final /* synthetic */ aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.e = ajVar;
        this.a = bArr;
        this.b = l;
        this.c = taskCompletionSource2;
        this.d = integrityTokenRequest;
    }

    @Override // defpackage.cud
    public final void a(Exception exc) {
        if (exc instanceof ktd) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // defpackage.cud
    public final void b() {
        bud budVar;
        try {
            aj ajVar = this.e;
            Bundle a = aj.a(ajVar, this.a, this.b, null);
            ai aiVar = new ai(this.e, this.c);
            wtd wtdVar = (wtd) ((ytd) ajVar.a.n);
            wtdVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(wtdVar.c);
            int i = qtd.a;
            obtain.writeInt(1);
            a.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aiVar);
            wtdVar.a(obtain, 2);
        } catch (RemoteException e) {
            aj ajVar2 = this.e;
            IntegrityTokenRequest integrityTokenRequest = this.d;
            budVar = ajVar2.b;
            budVar.a(e, "requestIntegrityToken(%s)", integrityTokenRequest);
            this.c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
