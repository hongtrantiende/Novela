package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a0f  reason: default package */
/* loaded from: classes.dex */
public final class a0f {
    public static final Object j = new Object();
    public static final AtomicReference k = new AtomicReference();
    public static volatile a0f l = null;
    public static final c9b m = kte.j(j0f.b);
    public final jje a = new jje();
    public final Context b;
    public final c9b c;
    public final c9b d;
    public final c9b e;
    public final c9b f;
    public final n8f g;
    public final c9b h;
    public final g7f i;

    public a0f(Context context, c9b c9bVar, c9b c9bVar2, c9b c9bVar3, c9b c9bVar4, c9b c9bVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        c9bVar.getClass();
        c9bVar2.getClass();
        c9bVar3.getClass();
        c9bVar4.getClass();
        c9bVar5.getClass();
        c9b j2 = kte.j(c9bVar);
        c9b j3 = kte.j(c9bVar2);
        c9b j4 = kte.j(new k0f(c9bVar3, 0));
        c9b j5 = kte.j(c9bVar4);
        c9b j6 = kte.j(c9bVar5);
        this.b = applicationContext;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = new n8f(applicationContext, j2, j5, j3);
        this.h = j6;
        this.i = new g7f(applicationContext, j2, j4, j3);
    }

    public static void b() {
        synchronized (w9e.f) {
        }
        if (k.get() == null && w9e.g == null) {
            w9e.g = new e60(26);
        }
    }

    public final hr7 a() {
        return (hr7) this.c.get();
    }
}
