package android.support.v4.media;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@Deprecated
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final yz c;
    public final Bundle a;
    public MediaMetadata b;

    /* JADX WARN: Type inference failed for: r0v0, types: [yz, jla] */
    static {
        ?? jlaVar = new jla(0);
        c = jlaVar;
        jlaVar.put("android.media.metadata.TITLE", 1);
        jlaVar.put("android.media.metadata.ARTIST", 1);
        jlaVar.put("android.media.metadata.DURATION", 0);
        jlaVar.put("android.media.metadata.ALBUM", 1);
        jlaVar.put("android.media.metadata.AUTHOR", 1);
        jlaVar.put("android.media.metadata.WRITER", 1);
        jlaVar.put("android.media.metadata.COMPOSER", 1);
        jlaVar.put("android.media.metadata.COMPILATION", 1);
        jlaVar.put("android.media.metadata.DATE", 1);
        jlaVar.put("android.media.metadata.YEAR", 0);
        jlaVar.put("android.media.metadata.GENRE", 1);
        jlaVar.put("android.media.metadata.TRACK_NUMBER", 0);
        jlaVar.put("android.media.metadata.NUM_TRACKS", 0);
        jlaVar.put("android.media.metadata.DISC_NUMBER", 0);
        jlaVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        jlaVar.put("android.media.metadata.ART", 2);
        jlaVar.put("android.media.metadata.ART_URI", 1);
        jlaVar.put("android.media.metadata.ALBUM_ART", 2);
        jlaVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        jlaVar.put("android.media.metadata.USER_RATING", 3);
        jlaVar.put("android.media.metadata.RATING", 3);
        jlaVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        jlaVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        jlaVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        jlaVar.put("android.media.metadata.DISPLAY_ICON", 2);
        jlaVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        jlaVar.put("android.media.metadata.MEDIA_ID", 1);
        jlaVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        jlaVar.put("android.media.metadata.MEDIA_URI", 1);
        jlaVar.put("android.media.metadata.ADVERTISEMENT", 0);
        jlaVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new cxd(20);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.a = parcel.readBundle(y57.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.a = bundle2;
        y57.a(bundle2);
    }
}
