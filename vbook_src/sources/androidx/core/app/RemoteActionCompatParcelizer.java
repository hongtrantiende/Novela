package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.app.RemoteActionCompat, java.lang.Object] */
    public static RemoteActionCompat read(h5d h5dVar) {
        ?? obj = new Object();
        j5d j5dVar = obj.a;
        boolean z = true;
        if (h5dVar.e(1)) {
            j5dVar = h5dVar.h();
        }
        obj.a = (IconCompat) j5dVar;
        CharSequence charSequence = obj.b;
        if (h5dVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((i5d) h5dVar).e);
        }
        obj.b = charSequence;
        CharSequence charSequence2 = obj.c;
        if (h5dVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((i5d) h5dVar).e);
        }
        obj.c = charSequence2;
        obj.d = (PendingIntent) h5dVar.g(obj.d, 4);
        boolean z2 = obj.e;
        if (h5dVar.e(5)) {
            if (((i5d) h5dVar).e.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        obj.e = z2;
        boolean z3 = obj.f;
        if (!h5dVar.e(6)) {
            z = z3;
        } else if (((i5d) h5dVar).e.readInt() == 0) {
            z = false;
        }
        obj.f = z;
        return obj;
    }

    public static void write(RemoteActionCompat remoteActionCompat, h5d h5dVar) {
        h5dVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        h5dVar.i(1);
        h5dVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        h5dVar.i(2);
        Parcel parcel = ((i5d) h5dVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        h5dVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        h5dVar.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        h5dVar.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        h5dVar.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
