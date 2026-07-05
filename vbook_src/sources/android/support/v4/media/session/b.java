package android.support.v4.media.session;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class b extends Binder implements rj5 {
    public static final /* synthetic */ int b = 0;
    public final AtomicReference a;

    public b(v57 v57Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new AtomicReference(v57Var);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, oj5] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, oj5] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        long j;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        pj5 pj5Var = null;
        PlaybackStateCompat playbackStateCompat = null;
        pj5 pj5Var2 = null;
        int i3 = -1;
        switch (i) {
            case 1:
                parcel.readString();
                Bundle bundle = (Bundle) xve.h(parcel, Bundle.CREATOR);
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = (MediaSessionCompat$ResultReceiverWrapper) xve.h(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR);
                cp8.i();
                return false;
            case 2:
                KeyEvent keyEvent = (KeyEvent) xve.h(parcel, KeyEvent.CREATOR);
                cp8.i();
                return false;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof pj5)) {
                        pj5Var = (pj5) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.a = readStrongBinder;
                        pj5Var = obj;
                    }
                }
                v57 v57Var = (v57) this.a.get();
                if (v57Var != null) {
                    v57Var.e.register(pj5Var, new z57("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                    synchronized (v57Var.d) {
                    }
                }
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof pj5)) {
                        pj5Var2 = (pj5) queryLocalInterface2;
                    } else {
                        ?? obj2 = new Object();
                        obj2.a = readStrongBinder2;
                        pj5Var2 = obj2;
                    }
                }
                v57 v57Var2 = (v57) this.a.get();
                if (v57Var2 != null) {
                    v57Var2.e.unregister(pj5Var2);
                    Binder.getCallingPid();
                    Binder.getCallingUid();
                    synchronized (v57Var2.d) {
                    }
                }
                parcel2.writeNoException();
                return true;
            case 5:
                cp8.i();
                return false;
            case 6:
                cp8.i();
                return false;
            case 7:
                cp8.i();
                return false;
            case 8:
                cp8.i();
                return false;
            case 9:
                cp8.i();
                return false;
            case 10:
                cp8.i();
                return false;
            case 11:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                cp8.i();
                return false;
            case 12:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                cp8.i();
                return false;
            case 13:
                cp8.i();
                return false;
            case 14:
                parcel.readString();
                Bundle bundle2 = (Bundle) xve.h(parcel, Bundle.CREATOR);
                cp8.i();
                return false;
            case 15:
                parcel.readString();
                Bundle bundle3 = (Bundle) xve.h(parcel, Bundle.CREATOR);
                cp8.i();
                return false;
            case 16:
                Uri uri = (Uri) xve.h(parcel, Uri.CREATOR);
                Bundle bundle4 = (Bundle) xve.h(parcel, Bundle.CREATOR);
                cp8.i();
                return false;
            case 17:
                parcel.readLong();
                cp8.i();
                return false;
            case 18:
                cp8.i();
                return false;
            case 19:
                cp8.i();
                return false;
            case 20:
                cp8.i();
                return false;
            case 21:
                cp8.i();
                return false;
            case 22:
                cp8.i();
                return false;
            case 23:
                cp8.i();
                return false;
            case 24:
                parcel.readLong();
                cp8.i();
                return false;
            case 25:
                RatingCompat ratingCompat = (RatingCompat) xve.h(parcel, RatingCompat.CREATOR);
                cp8.i();
                return false;
            case 26:
                parcel.readString();
                Bundle bundle5 = (Bundle) xve.h(parcel, Bundle.CREATOR);
                cp8.i();
                return false;
            case 27:
                cp8.i();
                return false;
            case 28:
                v57 v57Var3 = (v57) this.a.get();
                if (v57Var3 != null) {
                    playbackStateCompat = v57Var3.f;
                    MediaMetadataCompat mediaMetadataCompat = v57Var3.g;
                    if (playbackStateCompat != null) {
                        float f = playbackStateCompat.d;
                        long j2 = playbackStateCompat.D;
                        int i4 = playbackStateCompat.a;
                        long j3 = playbackStateCompat.b;
                        long j4 = -1;
                        if (j3 != -1 && ((i4 == 3 || i4 == 4 || i4 == 5) && j2 > 0)) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            long j5 = (f * ((float) (elapsedRealtime - j2))) + j3;
                            if (mediaMetadataCompat != null) {
                                Bundle bundle6 = mediaMetadataCompat.a;
                                if (bundle6.containsKey("android.media.metadata.DURATION")) {
                                    j4 = bundle6.getLong("android.media.metadata.DURATION", 0L);
                                }
                            }
                            if (j4 >= 0 && j5 > j4) {
                                j = j4;
                            } else if (j5 < 0) {
                                j = 0;
                            } else {
                                j = j5;
                            }
                            ArrayList arrayList = new ArrayList();
                            long j6 = playbackStateCompat.c;
                            long j7 = playbackStateCompat.e;
                            int i5 = playbackStateCompat.f;
                            CharSequence charSequence = playbackStateCompat.C;
                            ArrayList arrayList2 = playbackStateCompat.E;
                            if (arrayList2 != null) {
                                arrayList.addAll(arrayList2);
                            }
                            playbackStateCompat = new PlaybackStateCompat(playbackStateCompat.a, j, j6, playbackStateCompat.d, j7, i5, charSequence, elapsedRealtime, arrayList, playbackStateCompat.F, playbackStateCompat.G);
                        }
                    }
                }
                parcel2.writeNoException();
                if (playbackStateCompat != null) {
                    parcel2.writeInt(1);
                    playbackStateCompat.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                cp8.i();
                return false;
            case 31:
                cp8.i();
                return false;
            case 32:
                v57 v57Var4 = (v57) this.a.get();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Token.GETPROP /* 33 */:
                cp8.i();
                return false;
            case Token.GETPROPNOWARN /* 34 */:
                parcel.readString();
                Bundle bundle7 = (Bundle) xve.h(parcel, Bundle.CREATOR);
                cp8.i();
                return false;
            case Token.GETPROP_SUPER /* 35 */:
                parcel.readString();
                Bundle bundle8 = (Bundle) xve.h(parcel, Bundle.CREATOR);
                cp8.i();
                return false;
            case Token.GETPROPNOWARN_SUPER /* 36 */:
                Uri uri2 = (Uri) xve.h(parcel, Uri.CREATOR);
                Bundle bundle9 = (Bundle) xve.h(parcel, Bundle.CREATOR);
                cp8.i();
                return false;
            case Token.SETPROP /* 37 */:
                if (((v57) this.a.get()) != null) {
                    i3 = 0;
                }
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case Token.SETPROP_SUPER /* 38 */:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Token.GETELEM /* 39 */:
                parcel.readInt();
                cp8.i();
                return false;
            case Token.GETELEM_SUPER /* 40 */:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case Token.SETELEM /* 41 */:
                MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) xve.h(parcel, MediaDescriptionCompat.CREATOR);
                cp8.i();
                return false;
            case Token.SETELEM_SUPER /* 42 */:
                MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) xve.h(parcel, MediaDescriptionCompat.CREATOR);
                parcel.readInt();
                cp8.i();
                return false;
            case Token.CALL /* 43 */:
                MediaDescriptionCompat mediaDescriptionCompat3 = (MediaDescriptionCompat) xve.h(parcel, MediaDescriptionCompat.CREATOR);
                cp8.i();
                return false;
            case Token.NAME /* 44 */:
                parcel.readInt();
                cp8.i();
                return false;
            case Token.NUMBER /* 45 */:
                v57 v57Var5 = (v57) this.a.get();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Token.STRING /* 46 */:
                parcel.readInt();
                cp8.i();
                return false;
            case Token.NULL /* 47 */:
                if (((v57) this.a.get()) != null) {
                    i3 = 0;
                }
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case Token.THIS /* 48 */:
                parcel.readInt();
                cp8.i();
                return false;
            case Token.FALSE /* 49 */:
                parcel.readFloat();
                cp8.i();
                return false;
            case Token.TRUE /* 50 */:
                v57 v57Var6 = (v57) this.a.get();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Token.SHEQ /* 51 */:
                RatingCompat ratingCompat2 = (RatingCompat) xve.h(parcel, RatingCompat.CREATOR);
                Bundle bundle10 = (Bundle) xve.h(parcel, Bundle.CREATOR);
                cp8.i();
                return false;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
