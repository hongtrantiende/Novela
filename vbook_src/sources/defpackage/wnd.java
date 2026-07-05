package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wnd  reason: default package */
/* loaded from: classes.dex */
public final class wnd {
    public static final wnd b;
    public zd0 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wnd] */
    static {
        ?? obj = new Object();
        obj.a = null;
        b = obj;
    }

    public static zd0 a(Context context) {
        zd0 zd0Var;
        wnd wndVar = b;
        synchronized (wndVar) {
            try {
                if (wndVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    wndVar.a = new zd0(context);
                }
                zd0Var = wndVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zd0Var;
    }
}
