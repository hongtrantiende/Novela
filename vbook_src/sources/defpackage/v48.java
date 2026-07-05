package defpackage;

import android.app.Notification;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v48  reason: default package */
/* loaded from: classes.dex */
public final class v48 {
    public final String a;
    public final int b;
    public final Notification c;

    public v48(String str, int i, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = notification;
    }

    public final void a(xj5 xj5Var) {
        String str = this.a;
        int i = this.b;
        Notification notification = this.c;
        vj5 vj5Var = (vj5) xj5Var;
        vj5Var.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(xj5.i);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(null);
            obtain.writeTypedObject(notification, 0);
            if (vj5Var.a.transact(1, obtain, null, 1)) {
                return;
            }
            throw new RemoteException("Method notify is unimplemented.");
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        return rs8.g(this.b, ", tag:null]", sb);
    }
}
