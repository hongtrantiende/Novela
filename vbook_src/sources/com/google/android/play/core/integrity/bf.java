package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class bf extends bm {
    final /* synthetic */ long a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ bn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i, long j, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.a = j;
        this.b = taskCompletionSource2;
    }

    @Override // defpackage.cud
    public final void b() {
        bud budVar;
        if (!bn.k(this.c)) {
            try {
                bn bnVar = this.c;
                Bundle b = bn.b(bnVar, this.a, 0);
                bl blVar = new bl(this.c, this.b);
                std stdVar = (std) ((utd) bnVar.a.n);
                stdVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(stdVar.c);
                int i = qtd.a;
                obtain.writeInt(1);
                b.writeToParcel(obtain, 0);
                obtain.writeStrongBinder(blVar);
                stdVar.a(obtain, 2);
                return;
            } catch (RemoteException e) {
                bn bnVar2 = this.c;
                long j = this.a;
                budVar = bnVar2.b;
                budVar.a(e, "warmUpIntegrityToken(%s)", Long.valueOf(j));
                this.b.trySetException(new StandardIntegrityException(-100, e));
                return;
            }
        }
        a(new StandardIntegrityException(-2, null));
    }
}
