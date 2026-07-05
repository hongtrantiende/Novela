package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s37  reason: default package */
/* loaded from: classes.dex */
public class s37 {
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final q37 d = new q37(this);
    public final yz e = new jla(0);
    public eb5 f;
    public Messenger g;
    public MediaSessionCompat$Token h;

    /* JADX WARN: Type inference failed for: r0v1, types: [yz, jla] */
    public s37(Context context, ComponentName componentName, yv yvVar) {
        this.a = context;
        Bundle bundle = new Bundle();
        this.c = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        yvVar.b = this;
        this.b = new MediaBrowser(context, componentName, (r37) yvVar.a, bundle);
    }
}
