package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uke  reason: default package */
/* loaded from: classes.dex */
public final class uke extends Binder implements IInterface {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TaskCompletionSource b;

    public uke(xb4 xb4Var, TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
        Objects.requireNonNull(xb4Var);
        attachInterface(this, "com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.a;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
        if (super.onTransact(r7, r8, r9, r10) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (super.onTransact(r7, r8, r9, r10) != false) goto L6;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        /*
            r6 = this;
            int r0 = r6.a
            r1 = 0
            java.lang.String r2 = "Parcel data not fully consumed, unread size: "
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L70;
                default: goto Ld;
            }
        Ld:
            if (r7 <= r3) goto L17
            boolean r9 = super.onTransact(r7, r8, r9, r10)
            if (r9 == 0) goto L1e
        L15:
            r1 = r4
            goto L6f
        L17:
            java.lang.String r9 = r6.getInterfaceDescriptor()
            r8.enforceInterface(r9)
        L1e:
            if (r7 != r4) goto L6f
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r7 = com.google.android.gms.common.api.Status.CREATOR
            int r9 = defpackage.kde.a
            int r9 = r8.readInt()
            if (r9 != 0) goto L2c
            r7 = r5
            goto L32
        L2c:
            java.lang.Object r7 = r7.createFromParcel(r8)
            android.os.Parcelable r7 = (android.os.Parcelable) r7
        L32:
            com.google.android.gms.common.api.Status r7 = (com.google.android.gms.common.api.Status) r7
            java.lang.String r9 = r8.readString()
            android.os.Parcelable$Creator<kv> r10 = defpackage.kv.CREATOR
            int r0 = r8.readInt()
            if (r0 != 0) goto L41
            goto L48
        L41:
            java.lang.Object r10 = r10.createFromParcel(r8)
            r5 = r10
            android.os.Parcelable r5 = (android.os.Parcelable) r5
        L48:
            kv r5 = (defpackage.kv) r5
            int r8 = r8.dataAvail()
            if (r8 > 0) goto L56
            com.google.android.gms.tasks.TaskCompletionSource r6 = r6.b
            defpackage.uue.E(r7, r9, r6)
            goto L15
        L56:
            android.os.BadParcelableException r6 = new android.os.BadParcelableException
            java.lang.String r7 = java.lang.String.valueOf(r8)
            int r7 = r7.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + 45
            r9.<init>(r7)
            java.lang.String r7 = defpackage.nk2.s(r8, r2, r9)
            r6.<init>(r7)
            throw r6
        L6f:
            return r1
        L70:
            if (r7 <= r3) goto L7a
            boolean r9 = super.onTransact(r7, r8, r9, r10)
            if (r9 == 0) goto L81
        L78:
            r1 = r4
            goto Lbf
        L7a:
            java.lang.String r9 = r6.getInterfaceDescriptor()
            r8.enforceInterface(r9)
        L81:
            if (r7 != r4) goto Lbf
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r7 = com.google.android.gms.common.api.Status.CREATOR
            int r9 = defpackage.mde.a
            int r9 = r8.readInt()
            if (r9 != 0) goto L8f
            r7 = r5
            goto L95
        L8f:
            java.lang.Object r7 = r7.createFromParcel(r8)
            android.os.Parcelable r7 = (android.os.Parcelable) r7
        L95:
            com.google.android.gms.common.api.Status r7 = (com.google.android.gms.common.api.Status) r7
            android.os.Parcelable$Creator r9 = android.app.PendingIntent.CREATOR
            int r10 = r8.readInt()
            if (r10 != 0) goto La0
            goto La7
        La0:
            java.lang.Object r9 = r9.createFromParcel(r8)
            r5 = r9
            android.os.Parcelable r5 = (android.os.Parcelable) r5
        La7:
            android.app.PendingIntent r5 = (android.app.PendingIntent) r5
            int r8 = r8.dataAvail()
            if (r8 > 0) goto Lb5
            com.google.android.gms.tasks.TaskCompletionSource r6 = r6.b
            defpackage.uue.E(r7, r5, r6)
            goto L78
        Lb5:
            android.os.BadParcelableException r6 = new android.os.BadParcelableException
            java.lang.String r7 = defpackage.a82.j(r8, r2)
            r6.<init>(r7)
            throw r6
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uke.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public uke(TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }
}
