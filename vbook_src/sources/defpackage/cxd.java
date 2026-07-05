package defpackage;

import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import androidx.versionedparcelable.ParcelImpl;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cxd  reason: default package */
/* loaded from: classes.dex */
public final class cxd implements Parcelable.Creator {
    public static final cxd b = new cxd(0);
    public final /* synthetic */ int a;

    public /* synthetic */ cxd(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v31, types: [ds4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, is4] */
    /* JADX WARN: Type inference failed for: r0v40, types: [zo6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [android.view.View$BaseSavedState, java.lang.Object, e18] */
    /* JADX WARN: Type inference failed for: r0v56, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createFromParcel(final android.os.Parcel r18) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxd.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new kv[i];
            case 1:
                return new z5[i];
            case 2:
                return new vf0[i];
            case 3:
                return new wf0[i];
            case 4:
                return new cv2[i];
            case 5:
                return new b73[i];
            case 6:
                return new wg3[i];
            case 7:
                return new zg3[i];
            case 8:
                return new zk3[i];
            case 9:
                return new yk3[i];
            case 10:
                return new ds4[i];
            case 11:
                return new is4[i];
            case 12:
                return new ms4[i];
            case 13:
                return new d65[i];
            case 14:
                return new ro5[i];
            case 15:
                return new cz5[i];
            case 16:
                return new b96[i];
            case 17:
                return new zo6[i];
            case 18:
                return new MediaBrowserCompat$MediaItem[i];
            case 19:
                return new MediaDescriptionCompat[i];
            case 20:
                return new MediaMetadataCompat[i];
            case 21:
                return new MediaSessionCompat$QueueItem[i];
            case 22:
                return new MediaSessionCompat$Token[i];
            case 23:
                return new e18[i];
            case 24:
                return new uk8[i];
            case 25:
                return new ParcelImpl[i];
            case 26:
                return new dm8[i];
            case 27:
                return new em8[i];
            case 28:
                return new fm8[i];
            default:
                return new ParcelableVolumeInfo[i];
        }
    }
}
