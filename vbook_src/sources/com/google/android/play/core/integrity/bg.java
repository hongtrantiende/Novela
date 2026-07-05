package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class bg extends bm {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ TaskCompletionSource d;
    final /* synthetic */ bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i, String str, long j, long j2, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.e = bnVar;
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = taskCompletionSource2;
    }

    @Override // defpackage.cud
    public final void b() {
        bud budVar;
        if (!bn.k(this.e)) {
            try {
                bn bnVar = this.e;
                Bundle a = bn.a(bnVar, this.a, this.b, this.c, 0);
                bk bkVar = new bk(this.e, this.d, this.b);
                std stdVar = (std) ((utd) bnVar.a.n);
                stdVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(stdVar.c);
                int i = qtd.a;
                obtain.writeInt(1);
                a.writeToParcel(obtain, 0);
                obtain.writeStrongBinder(bkVar);
                stdVar.a(obtain, 3);
                return;
            } catch (RemoteException e) {
                bn bnVar2 = this.e;
                String str = this.a;
                budVar = bnVar2.b;
                budVar.a(e, "requestExpressIntegrityToken(%s, %s)", str, Long.valueOf(this.b));
                this.d.trySetException(new StandardIntegrityException(-100, e));
                return;
            }
        }
        a(new StandardIntegrityException(-2, null));
    }
}
