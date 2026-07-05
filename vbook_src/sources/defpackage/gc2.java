package defpackage;

import android.content.Context;
import com.google.android.gms.net.a;
import org.chromium.net.CronetEngine;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gc2  reason: default package */
/* loaded from: classes3.dex */
public final class gc2 {
    public static final gc2 a = new Object();
    public static volatile CronetEngine b;

    public final CronetEngine a() {
        if (b != null) {
            return b;
        }
        synchronized (this) {
            if (b != null) {
                return b;
            }
            Context context = twe.e;
            context.getClass();
            a.a(context);
            Context context2 = twe.e;
            context2.getClass();
            CronetEngine build = new CronetEngine.Builder(context2).build();
            if (build instanceof gs9) {
                build = null;
            }
            b = build;
            return b;
        }
    }
}
