package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    public WeakReference a;

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, qj5] */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        rj5 rj5Var;
        a aVar = (a) this.a.get();
        if (aVar != null && bundle != null) {
            synchronized (aVar.b) {
                MediaSessionCompat$Token mediaSessionCompat$Token = aVar.e;
                IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                int i2 = b.b;
                j5d j5dVar = null;
                if (binder == null) {
                    rj5Var = null;
                } else {
                    IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof rj5)) {
                        rj5Var = (rj5) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.a = binder;
                        rj5Var = obj;
                    }
                }
                synchronized (mediaSessionCompat$Token.a) {
                    mediaSessionCompat$Token.c = rj5Var;
                }
                MediaSessionCompat$Token mediaSessionCompat$Token2 = aVar.e;
                try {
                    Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                    if (bundle2 != null) {
                        bundle2.setClassLoader(am8.class.getClassLoader());
                        Parcelable parcelable = bundle2.getParcelable("a");
                        if (parcelable instanceof ParcelImpl) {
                            j5dVar = ((ParcelImpl) parcelable).a;
                        } else {
                            throw new IllegalArgumentException("Invalid parcel");
                        }
                    }
                } catch (RuntimeException unused) {
                }
                synchronized (mediaSessionCompat$Token2.a) {
                    mediaSessionCompat$Token2.d = j5dVar;
                }
                aVar.a();
            }
        }
    }
}
