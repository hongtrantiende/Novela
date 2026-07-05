package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ft7  reason: default package */
/* loaded from: classes.dex */
public final class ft7 extends Binder implements uj5 {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public ft7(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
        attachInterface(this, uj5.h);
    }

    @Override // defpackage.uj5
    public final void O(int i, String[] strArr) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
        synchronized (multiInstanceInvalidationService.c) {
            String str = (String) multiInstanceInvalidationService.b.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.c.beginBroadcast();
            int i2 = 0;
            while (true) {
                gt7 gt7Var = multiInstanceInvalidationService.c;
                if (i2 < beginBroadcast) {
                    Object broadcastCookie = gt7Var.getBroadcastCookie(i2);
                    broadcastCookie.getClass();
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.b.get(num);
                    if (i != intValue && str.equals(str2)) {
                        try {
                            ((tj5) multiInstanceInvalidationService.c.getBroadcastItem(i2)).j(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                    i2++;
                } else {
                    gt7Var.finishBroadcast();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, sj5] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, sj5] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = uj5.h;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        tj5 tj5Var = null;
        tj5 tj5Var2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                O(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(tj5.g);
                if (queryLocalInterface != null && (queryLocalInterface instanceof tj5)) {
                    tj5Var2 = (tj5) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.a = readStrongBinder;
                    tj5Var2 = obj;
                }
            }
            int readInt = parcel.readInt();
            tj5Var2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
            synchronized (multiInstanceInvalidationService.c) {
                multiInstanceInvalidationService.c.unregister(tj5Var2);
                String str2 = (String) multiInstanceInvalidationService.b.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(tj5.g);
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof tj5)) {
                tj5Var = (tj5) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.a = readStrongBinder2;
                tj5Var = obj2;
            }
        }
        String readString = parcel.readString();
        tj5Var.getClass();
        int i3 = 0;
        if (readString != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.a;
            synchronized (multiInstanceInvalidationService2.c) {
                try {
                    int i4 = multiInstanceInvalidationService2.a + 1;
                    multiInstanceInvalidationService2.a = i4;
                    if (multiInstanceInvalidationService2.c.register(tj5Var, Integer.valueOf(i4))) {
                        multiInstanceInvalidationService2.b.put(Integer.valueOf(i4), readString);
                        i3 = i4;
                    } else {
                        multiInstanceInvalidationService2.a--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        parcel2.writeInt(i3);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
