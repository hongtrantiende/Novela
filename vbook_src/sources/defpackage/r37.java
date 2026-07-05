package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r37  reason: default package */
/* loaded from: classes.dex */
public final class r37 extends MediaBrowser.ConnectionCallback {
    public final /* synthetic */ yv a;

    public r37(yv yvVar) {
        this.a = yvVar;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, qj5] */
    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        a aVar;
        rj5 rj5Var;
        MediaSessionCompat$Token mediaSessionCompat$Token;
        yv yvVar = this.a;
        s37 s37Var = (s37) yvVar.b;
        MediaSessionCompat$Token mediaSessionCompat$Token2 = null;
        if (s37Var != null) {
            q37 q37Var = s37Var.d;
            MediaBrowser mediaBrowser = s37Var.b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        Bundle bundle = s37Var.c;
                        eb5 eb5Var = new eb5(6, false);
                        eb5Var.b = new Messenger(binder);
                        eb5Var.c = bundle;
                        s37Var.f = eb5Var;
                        Messenger messenger = new Messenger(q37Var);
                        s37Var.g = messenger;
                        q37Var.getClass();
                        q37Var.b = new WeakReference(messenger);
                        try {
                            eb5 eb5Var2 = s37Var.f;
                            Context context = s37Var.a;
                            Messenger messenger2 = s37Var.g;
                            eb5Var2.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("data_package_name", context.getPackageName());
                            bundle2.putInt("data_calling_pid", Process.myPid());
                            bundle2.putBundle("data_root_hints", (Bundle) eb5Var2.c);
                            Message obtain = Message.obtain();
                            obtain.what = 6;
                            obtain.arg1 = 1;
                            obtain.setData(bundle2);
                            obtain.replyTo = messenger2;
                            ((Messenger) eb5Var2.b).send(obtain);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i = b.b;
                    if (binder2 == null) {
                        rj5Var = null;
                    } else {
                        IInterface queryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof rj5)) {
                            rj5Var = (rj5) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.a = binder2;
                            rj5Var = obj;
                        }
                    }
                    if (rj5Var != null) {
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        if (sessionToken != null) {
                            mediaSessionCompat$Token = new MediaSessionCompat$Token(sessionToken, rj5Var);
                        } else {
                            mediaSessionCompat$Token = null;
                        }
                        s37Var.h = mediaSessionCompat$Token;
                    }
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }
        Context context2 = (Context) yvVar.c;
        s37 s37Var2 = ((u37) yvVar.f).a;
        if (s37Var2.h == null) {
            MediaSession.Token sessionToken2 = s37Var2.b.getSessionToken();
            if (sessionToken2 != null) {
                mediaSessionCompat$Token2 = new MediaSessionCompat$Token(sessionToken2, null);
            }
            s37Var2.h = mediaSessionCompat$Token2;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token3 = s37Var2.h;
        if (mediaSessionCompat$Token3 != null) {
            Collections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                aVar = new a(context2, mediaSessionCompat$Token3);
            } else {
                aVar = new a(context2, mediaSessionCompat$Token3);
            }
            KeyEvent keyEvent = (KeyEvent) ((Intent) yvVar.d).getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent != null) {
                aVar.a.dispatchMediaButtonEvent(keyEvent);
                yvVar.r();
                return;
            }
            vs.m("KeyEvent may not be null");
            return;
        }
        vs.m("sessionToken must not be null");
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        this.a.r();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        yv yvVar = this.a;
        s37 s37Var = (s37) yvVar.b;
        if (s37Var != null) {
            s37Var.f = null;
            s37Var.g = null;
            s37Var.h = null;
            q37 q37Var = s37Var.d;
            q37Var.getClass();
            q37Var.b = new WeakReference(null);
        }
        yvVar.r();
    }
}
