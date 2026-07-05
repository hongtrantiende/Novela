package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eve  reason: default package */
/* loaded from: classes.dex */
public abstract class eve extends mud implements IInterface {
    public final int b;

    public eve(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 2);
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        am8.n(z);
        this.b = Arrays.hashCode(bArr);
    }

    public static byte[] V(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            vs.j(e);
            return null;
        }
    }

    @Override // defpackage.mud
    public final boolean S(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.b);
            return true;
        }
        yj5 U = U();
        parcel2.writeNoException();
        lde.b(parcel2, U);
        return true;
    }

    public abstract byte[] T();

    public final yj5 U() {
        return new n78(T());
    }

    public final boolean equals(Object obj) {
        yj5 U;
        if (obj instanceof eve) {
            try {
                eve eveVar = (eve) obj;
                if (eveVar.b == this.b && (U = eveVar.U()) != null) {
                    return Arrays.equals(T(), (byte[]) n78.U(U));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
