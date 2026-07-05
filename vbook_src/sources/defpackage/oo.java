package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.reader.android.MainActivity;
import com.reader.data.AndroidActionReceiver;
import com.vbook.android.R;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oo  reason: default package */
/* loaded from: classes.dex */
public final class oo {
    public final Service a;
    public final y57 b;
    public final z48 c;
    public final mfb d;
    public String e;
    public String f;
    public Bitmap g;
    public boolean h;

    public oo(Service service, y57 y57Var) {
        y57Var.getClass();
        this.a = service;
        this.b = y57Var;
        z48 z48Var = new z48(service);
        this.c = z48Var;
        this.d = new mfb(new ve(this, 9));
        this.e = "";
        this.f = "";
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        NotificationChannel notificationChannel = null;
        gf gfVar = new gf(2, 9, null);
        gs3 gs3Var = gs3.a;
        CharSequence charSequence = (CharSequence) z87.C(gs3Var, gfVar);
        String str = (String) z87.C(gs3Var, new gf(2, 10, null));
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            notificationChannel = ay5.c(2, charSequence, "text_to_speech");
            ay5.y(notificationChannel, str);
            ay5.z(notificationChannel);
            ay5.C(notificationChannel, false);
            ay5.D(notificationChannel, uri, audioAttributes);
            ay5.f(notificationChannel);
            ay5.B(notificationChannel);
            ay5.E(notificationChannel);
            ay5.g(notificationChannel);
        }
        if (i >= 26) {
            ay5.d(z48Var.b, notificationChannel);
        }
    }

    public final PendingIntent a(String str) {
        Service service = this.a;
        Intent intent = new Intent(service.getApplicationContext(), AndroidActionReceiver.class);
        intent.setAction(str);
        PendingIntent broadcast = PendingIntent.getBroadcast(service, str.hashCode(), intent, 201326592);
        broadcast.getClass();
        return broadcast;
    }

    public final PendingIntent b(String str) {
        Service service = this.a;
        Context applicationContext = service.getApplicationContext();
        int i = MainActivity.V;
        Intent intent = new Intent(applicationContext, MainActivity.class);
        Uri parse = Uri.parse("vbookapp://view?screen=read&id=" + str);
        parse.getClass();
        intent.setData(parse);
        PendingIntent activity = PendingIntent.getActivity(service.getApplicationContext(), str.hashCode(), intent, 201326592);
        activity.getClass();
        return activity;
    }

    public final o48 c() {
        return (o48) this.d.getValue();
    }

    public final boolean d() {
        if (this.h) {
            return true;
        }
        try {
            Service service = this.a;
            service.startForeground(10001, new o48(service, "text_to_speech").b());
            this.h = true;
            return true;
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT >= 31 && xk5.n(e)) {
                return false;
            }
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [c3e, p48, java.lang.Object] */
    public final void e(o48 o48Var, int i) {
        RemoteCallbackList remoteCallbackList;
        o48Var.b.clear();
        gf gfVar = new gf(2, 11, null);
        gs3 gs3Var = gs3.a;
        o48Var.a(R.drawable.ic_skip_previous, (CharSequence) z87.C(gs3Var, gfVar), a("com.reader.action.tts.SKIP_TO_PREV"));
        if (i == 3) {
            o48Var.a(R.drawable.ic_pause, (CharSequence) z87.C(gs3Var, new gf(2, 12, null)), a("com.reader.action.tts.PAUSE"));
        } else {
            o48Var.a(R.drawable.ic_play_arrow, (CharSequence) z87.C(gs3Var, new gf(2, 13, null)), a("com.reader.action.tts.RESUME"));
        }
        o48Var.a(R.drawable.ic_skip_next, (CharSequence) z87.C(gs3Var, new gf(2, 14, null)), a("com.reader.action.tts.SKIP_TO_NEXT"));
        o48Var.a(R.drawable.ic_close, (CharSequence) z87.C(gs3Var, new gf(2, 15, null)), a("com.reader.action.tts.DESTROY"));
        ?? obj = new Object();
        obj.b = null;
        obj.c = this.b.a.c;
        obj.b = new int[]{0, 1, 2};
        a("com.reader.action.tts.STOP");
        o48Var.f(obj);
        y57 y57Var = this.b;
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(i, -1L, 0L, 1.0f, 630L, 0, null, SystemClock.elapsedRealtime(), new ArrayList(), -1L, null);
        v57 v57Var = y57Var.a;
        v57Var.f = playbackStateCompat;
        synchronized (v57Var.d) {
            int beginBroadcast = v57Var.e.beginBroadcast() - 1;
            while (true) {
                remoteCallbackList = v57Var.e;
                if (beginBroadcast < 0) {
                    break;
                }
                try {
                    ((pj5) remoteCallbackList.getBroadcastItem(beginBroadcast)).P(playbackStateCompat);
                } catch (RemoteException unused) {
                }
                beginBroadcast--;
            }
            remoteCallbackList.finishBroadcast();
        }
        MediaSession mediaSession = v57Var.a;
        if (playbackStateCompat.H == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(playbackStateCompat.a, playbackStateCompat.b, playbackStateCompat.d, playbackStateCompat.D);
            builder.setBufferedPosition(playbackStateCompat.c);
            builder.setActions(playbackStateCompat.e);
            builder.setErrorMessage(playbackStateCompat.C);
            ArrayList arrayList = playbackStateCompat.E;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                PlaybackStateCompat.CustomAction customAction = (PlaybackStateCompat.CustomAction) obj2;
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(customAction.a, customAction.b, customAction.c);
                builder2.setExtras(customAction.d);
                builder.addCustomAction(builder2.build());
            }
            builder.setActiveQueueItemId(playbackStateCompat.F);
            builder.setExtras(playbackStateCompat.G);
            playbackStateCompat.H = builder.build();
        }
        mediaSession.setPlaybackState(playbackStateCompat.H);
        y57 y57Var2 = this.b;
        Bitmap bitmap = this.g;
        String str = this.e;
        String str2 = this.f;
        k57 k57Var = new k57(0);
        Bundle bundle = (Bundle) k57Var.b;
        k57Var.F("android.media.metadata.TITLE", str);
        k57Var.F("android.media.metadata.ARTIST", str2);
        yz yzVar = MediaMetadataCompat.c;
        if (yzVar.containsKey("android.media.metadata.DURATION") && ((Integer) yzVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            vs.m("The android.media.metadata.DURATION key cannot be used to put a long");
            return;
        }
        bundle.putLong("android.media.metadata.DURATION", -1L);
        if (bitmap != null) {
            if (yzVar.containsKey("android.media.metadata.ART") && ((Integer) yzVar.get("android.media.metadata.ART")).intValue() != 2) {
                vs.m("The android.media.metadata.ART key cannot be used to put a Bitmap");
                return;
            }
            bundle.putParcelable("android.media.metadata.ART", bitmap);
        }
        MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat(bundle);
        v57 v57Var2 = y57Var2.a;
        v57Var2.g = mediaMetadataCompat;
        MediaSession mediaSession2 = v57Var2.a;
        Bundle bundle2 = mediaMetadataCompat.a;
        if (mediaMetadataCompat.b == null) {
            MediaMetadata.Builder builder3 = new MediaMetadata.Builder();
            for (String str3 : bundle2.keySet()) {
                Integer num = (Integer) MediaMetadataCompat.c.get(str3);
                if (num == null) {
                    num = -1;
                }
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                Object obj3 = bundle2.get(str3);
                                if (obj3 != null && !(obj3 instanceof CharSequence)) {
                                    if (obj3 instanceof Long) {
                                        builder3.putLong(str3, ((Long) obj3).longValue());
                                    } else if (obj3 instanceof Bitmap) {
                                        builder3.putBitmap(str3, (Bitmap) obj3);
                                    } else if (obj3 instanceof Rating) {
                                        builder3.putRating(str3, (Rating) obj3);
                                    }
                                } else {
                                    builder3.putText(str3, (CharSequence) obj3);
                                }
                            } else {
                                builder3.putRating(str3, (Rating) bundle2.getParcelable(str3));
                            }
                        } else {
                            builder3.putBitmap(str3, (Bitmap) bundle2.getParcelable(str3));
                        }
                    } else {
                        builder3.putText(str3, bundle2.getCharSequence(str3));
                    }
                } else {
                    builder3.putLong(str3, bundle2.getLong(str3, 0L));
                }
            }
            mediaMetadataCompat.b = builder3.build();
        }
        mediaSession2.setMetadata(mediaMetadataCompat.b);
        y57 y57Var3 = this.b;
        y57Var3.a.a.setActive(true);
        Iterator it = y57Var3.c.iterator();
        if (!it.hasNext()) {
            return;
        }
        throw rs8.f(it);
    }

    public final void f() {
        synchronized (c()) {
            e(c(), 2);
            this.c.a(10001, c().b());
        }
    }
}
