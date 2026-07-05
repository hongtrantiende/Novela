package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v57  reason: default package */
/* loaded from: classes.dex */
public class v57 {
    public final MediaSession a;
    public final b b;
    public final MediaSessionCompat$Token c;
    public final Object d = new Object();
    public final RemoteCallbackList e = new RemoteCallbackList();
    public PlaybackStateCompat f;
    public MediaMetadataCompat g;
    public u57 h;
    public z57 i;

    public v57(Context context) {
        MediaSession a = a(context);
        this.a = a;
        b bVar = new b(this);
        this.b = bVar;
        this.c = new MediaSessionCompat$Token(a.getSessionToken(), bVar);
        a.setFlags(3);
    }

    public MediaSession a(Context context) {
        return new MediaSession(context, "TextToSpeech");
    }

    public z57 b() {
        z57 z57Var;
        synchronized (this.d) {
            z57Var = this.i;
        }
        return z57Var;
    }

    public final void c(u57 u57Var, Handler handler) {
        t57 t57Var;
        synchronized (this.d) {
            this.h = u57Var;
            MediaSession mediaSession = this.a;
            s30 s30Var = null;
            if (u57Var == null) {
                t57Var = null;
            } else {
                t57Var = (t57) u57Var.c;
            }
            mediaSession.setCallback(t57Var, handler);
            if (u57Var != null) {
                synchronized (u57Var.b) {
                    u57Var.d = new WeakReference(this);
                    s30 s30Var2 = (s30) u57Var.e;
                    if (s30Var2 != null) {
                        s30Var2.removeCallbacksAndMessages(null);
                    }
                    if (handler != null) {
                        s30Var = new s30(u57Var, handler.getLooper(), 2);
                    }
                    u57Var.e = s30Var;
                }
            }
        }
    }

    public void d(z57 z57Var) {
        synchronized (this.d) {
            this.i = z57Var;
        }
    }
}
