package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class a {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final MediaSessionCompat$Token e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, android.os.ResultReceiver] */
    public a(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        rj5 rj5Var;
        this.e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.b);
        this.a = mediaController;
        synchronized (mediaSessionCompat$Token.a) {
            rj5Var = mediaSessionCompat$Token.c;
        }
        if (rj5Var == null) {
            ?? resultReceiver = new ResultReceiver(null);
            resultReceiver.a = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, resultReceiver);
        }
    }

    public final void a() {
        rj5 rj5Var;
        ArrayList arrayList = this.c;
        MediaSessionCompat$Token mediaSessionCompat$Token = this.e;
        synchronized (mediaSessionCompat$Token.a) {
            rj5Var = mediaSessionCompat$Token.c;
        }
        if (rj5Var == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else if (it.next() != null) {
            vm1.h();
        } else {
            this.d.put(null, new v47());
            throw null;
        }
    }
}
