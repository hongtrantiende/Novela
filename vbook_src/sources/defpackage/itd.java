package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: itd  reason: default package */
/* loaded from: classes.dex */
public final class itd implements ServiceConnection {
    public final /* synthetic */ jtd a;

    public /* synthetic */ itd(jtd jtdVar) {
        this.a = jtdVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        jtd jtdVar = this.a;
        jtdVar.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        jtdVar.a().post(new gtd(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        jtd jtdVar = this.a;
        jtdVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        jtdVar.a().post(new htd(this, 0));
    }
}
