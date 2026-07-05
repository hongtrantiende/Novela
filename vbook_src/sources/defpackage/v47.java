package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v47  reason: default package */
/* loaded from: classes.dex */
public final class v47 extends Binder implements pj5 {
    public final WeakReference a;

    public v47() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(null);
    }

    @Override // defpackage.pj5
    public final void P(PlaybackStateCompat playbackStateCompat) {
        if (this.a.get() == null) {
            return;
        }
        vm1.h();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.readString();
                Bundle bundle = (Bundle) vve.c(parcel, Bundle.CREATOR);
                if (this.a.get() != null) {
                    vm1.h();
                    return false;
                }
                break;
            case 2:
                cp8.i();
                return false;
            case 3:
                P((PlaybackStateCompat) vve.c(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) vve.c(parcel, MediaMetadataCompat.CREATOR);
                cp8.i();
                return false;
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                cp8.i();
                return false;
            case 6:
                CharSequence charSequence = (CharSequence) vve.c(parcel, TextUtils.CHAR_SEQUENCE_CREATOR);
                cp8.i();
                return false;
            case 7:
                Bundle bundle2 = (Bundle) vve.c(parcel, Bundle.CREATOR);
                cp8.i();
                return false;
            case 8:
                ParcelableVolumeInfo parcelableVolumeInfo = (ParcelableVolumeInfo) vve.c(parcel, ParcelableVolumeInfo.CREATOR);
                cp8.i();
                return false;
            case 9:
                parcel.readInt();
                if (this.a.get() != null) {
                    vm1.h();
                    return false;
                }
                break;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                parcel.readInt();
                if (this.a.get() != null) {
                    vm1.h();
                    return false;
                }
                break;
            case 12:
                parcel.readInt();
                if (this.a.get() != null) {
                    vm1.h();
                    return false;
                }
                break;
            case 13:
                if (this.a.get() != null) {
                    vm1.h();
                    return false;
                }
                break;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
