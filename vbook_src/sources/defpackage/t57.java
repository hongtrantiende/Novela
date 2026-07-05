package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t57  reason: default package */
/* loaded from: classes.dex */
public final class t57 extends MediaSession.Callback {
    public final /* synthetic */ u57 a;

    public t57(u57 u57Var) {
        this.a = u57Var;
    }

    public static void b(v57 v57Var) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        MediaSession mediaSession = v57Var.a;
        String str = null;
        try {
            str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
        } catch (Exception e) {
            Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        v57Var.d(new z57(str, -1, -1));
    }

    public final v57 a() {
        v57 v57Var;
        u57 u57Var;
        synchronized (this.a.b) {
            v57Var = (v57) ((WeakReference) this.a.d).get();
        }
        if (v57Var != null) {
            u57 u57Var2 = this.a;
            synchronized (v57Var.d) {
                u57Var = v57Var.h;
            }
            if (u57Var2 == u57Var) {
                return v57Var;
            }
            return null;
        }
        return null;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        rj5 rj5Var;
        IBinder asBinder;
        j5d j5dVar;
        v57 a = a();
        if (a == null) {
            return;
        }
        y57.a(bundle);
        b(a);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = a.c;
                synchronized (mediaSessionCompat$Token.a) {
                    rj5Var = mediaSessionCompat$Token.c;
                }
                if (rj5Var == null) {
                    asBinder = null;
                } else {
                    asBinder = rj5Var.asBinder();
                }
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", asBinder);
                synchronized (mediaSessionCompat$Token.a) {
                    j5dVar = mediaSessionCompat$Token.d;
                }
                if (j5dVar != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("a", new ParcelImpl(j5dVar));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                MediaDescriptionCompat mediaDescriptionCompat3 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
            } else {
                str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT");
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        v57 a = a();
        if (a == null) {
            return;
        }
        y57.a(bundle);
        b(a);
        try {
            if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                y57.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
            } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    y57.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    y57.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    y57.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                    y57.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                }
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        v57 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.c();
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        v57 v57Var;
        s30 s30Var;
        KeyEvent keyEvent;
        boolean z;
        long j;
        v57 a = a();
        if (a != null) {
            b(a);
            u57 u57Var = this.a;
            if (Build.VERSION.SDK_INT < 27) {
                synchronized (u57Var.b) {
                    v57Var = (v57) ((WeakReference) u57Var.d).get();
                    s30Var = (s30) u57Var.e;
                }
                if (v57Var != null && s30Var != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                    z57 b = v57Var.b();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 79 && keyCode != 85) {
                        u57Var.b(v57Var, s30Var);
                    } else {
                        if (keyEvent.getRepeatCount() == 0) {
                            if (u57Var.a) {
                                s30Var.removeMessages(1);
                                u57Var.a = false;
                                PlaybackStateCompat playbackStateCompat = v57Var.f;
                                if (playbackStateCompat == null) {
                                    j = 0;
                                } else {
                                    j = playbackStateCompat.e;
                                }
                                if ((j & 32) != 0) {
                                    u57Var.g();
                                }
                            } else {
                                u57Var.a = true;
                                s30Var.sendMessageDelayed(s30Var.obtainMessage(1, b), ViewConfiguration.getDoubleTapTimeout());
                            }
                        } else {
                            u57Var.b(v57Var, s30Var);
                        }
                        z = true;
                        a.d(null);
                        if (!z || super.onMediaButtonEvent(intent)) {
                            return true;
                        }
                    }
                }
            }
            z = false;
            a.d(null);
            if (!z) {
            }
            return true;
        }
        return false;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        v57 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.d();
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        v57 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.e();
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        v57 a = a();
        if (a == null) {
            return;
        }
        y57.a(bundle);
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        v57 a = a();
        if (a == null) {
            return;
        }
        y57.a(bundle);
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        v57 a = a();
        if (a == null) {
            return;
        }
        y57.a(bundle);
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        v57 a = a();
        if (a == null) {
            return;
        }
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        v57 a = a();
        if (a == null) {
            return;
        }
        y57.a(bundle);
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        v57 a = a();
        if (a == null) {
            return;
        }
        y57.a(bundle);
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        v57 a = a();
        if (a == null) {
            return;
        }
        y57.a(bundle);
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        v57 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.f();
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        v57 a = a();
        if (a == null) {
            return;
        }
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        v57 a = a();
        if (a == null) {
            return;
        }
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        RatingCompat ratingCompat;
        float f;
        v57 a = a();
        if (a == null) {
            return;
        }
        b(a);
        if (rating != null) {
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                float f2 = 1.0f;
                switch (ratingStyle) {
                    case 1:
                        if (!rating.hasHeart()) {
                            f2 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(1, f2);
                        ratingCompat.getClass();
                        break;
                    case 2:
                        if (!rating.isThumbUp()) {
                            f2 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(2, f2);
                        ratingCompat.getClass();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float starRating = rating.getStarRating();
                        if (ratingStyle != 3) {
                            if (ratingStyle != 4) {
                                if (ratingStyle != 5) {
                                    Log.e("Rating", "Invalid rating style (" + ratingStyle + ") for a star rating");
                                    ratingCompat = null;
                                    ratingCompat.getClass();
                                    break;
                                } else {
                                    f = 5.0f;
                                }
                            } else {
                                f = 4.0f;
                            }
                        } else {
                            f = 3.0f;
                        }
                        if (starRating >= nae.e && starRating <= f) {
                            ratingCompat = new RatingCompat(ratingStyle, starRating);
                            ratingCompat.getClass();
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                            ratingCompat = null;
                            ratingCompat.getClass();
                        }
                        break;
                    case 6:
                        float percentRating = rating.getPercentRating();
                        if (percentRating >= nae.e && percentRating <= 100.0f) {
                            ratingCompat = new RatingCompat(6, percentRating);
                            ratingCompat.getClass();
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                            ratingCompat = null;
                            ratingCompat.getClass();
                            break;
                        }
                        break;
                }
            } else {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat = new RatingCompat(ratingStyle, -1.0f);
                        break;
                    default:
                        ratingCompat = null;
                        break;
                }
                ratingCompat.getClass();
            }
        }
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        v57 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.g();
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        v57 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.h();
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        v57 a = a();
        if (a == null) {
            return;
        }
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        v57 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.i();
        a.d(null);
    }
}
